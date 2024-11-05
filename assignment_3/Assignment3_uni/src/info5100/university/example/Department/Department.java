/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    EmployerDirectory employerdirectory;
    Degree degree;

    HashMap<String, CourseSchedule> mastercoursecatalog;
    
     public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        facultydirectory = new FacultyDirectory(this);
        persondirectory = new PersonDirectory();
        degree = new Degree("MSIS");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public void setFacultydirectory(FacultyDirectory facultydirectory) {
        this.facultydirectory = facultydirectory;
    }

    public EmployerDirectory getEmployerdirectory() {
        return employerdirectory;
    }

    public void setEmployerdirectory(EmployerDirectory employerdirectory) {
        this.employerdirectory = employerdirectory;
    }
    

   
    public void addCoreCourse(Course c){
        degree.addCoreCourse(c);
        
    }
    public void addElectiveCourse(Course c){
        degree.addElectiveCourse(c);
        
    }
    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public StudentDirectory getStudentDirectory() {
    return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester,float grade) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl,grade);

    }
    
    public void displayStudentRegistrations(String semester, Department department) {
    System.out.println("Student Registrations for Semester: " + semester);
    System.out.println("---------------------------------------------------");

    StudentDirectory studentDirectory = department.getStudentDirectory();
    CourseSchedule courseSchedule = department.getCourseSchedule(semester); // Adjust if course schedule retrieval differs

    // Iterate over all students in the department
    for (StudentProfile student : studentDirectory.getStudentList()) {
        CourseLoad courseLoad = student.getCourseLoadBySemester(semester);

        if (courseLoad != null) {
            System.out.println("Student ID: " + student.getPerson().getPersonId());
            System.out.println("Name: " + student.getPerson().getName());

            double totalCredits = 0.0;
            double totalGradePoints = 0.0;

            // Iterate through each seat assignment in the student's course load
            for (SeatAssignment seatAssignment : courseLoad.getSeatAssignments()) {
                CourseOffer courseOffer = seatAssignment.getCourseOffer();
                FacultyProfile faculty = courseOffer.getFacultyProfile(); // Assigned teacher

                System.out.println(" - Course: " + courseOffer.getSubjectCourse().getName());
                System.out.println("   Course Number: " + courseOffer.getSubjectCourse().getCOurseNumber());
                System.out.println("   Credits: " + courseOffer.getSubjectCourse().getCredits());
                System.out.println("   Assigned Teacher: " + (faculty != null ? faculty.getPerson().getName() : "Not assigned"));
                System.out.println("   Grade: " + seatAssignment.getGrade());

                // Calculating total credits and grade points for GPA calculation
                double courseCredits = courseOffer.getSubjectCourse().getCredits();
                totalCredits += courseCredits;
                totalGradePoints += seatAssignment.getGrade() * courseCredits;
            }

            // Calculate GPA for the semester
            double gpa = totalCredits == 0 ? 0 : totalGradePoints / totalCredits;
            System.out.printf("CGPA for %s: %.2f%n", semester, gpa);

            // Tuition calculation (assuming $1000 per credit)
            double tuitionFees = totalCredits * 1000;
            System.out.printf("Total Tuition Fees: $%.2f%n", tuitionFees);
            System.out.println("---------------------------------------------------");
        }
    }
}

}
