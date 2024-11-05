/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating Dept
        Department department = new Department("Information Systems");
        
        PersonDirectory pd = department.getPersonDirectory();
        
        //persons for teacher
        Person persont1 = pd.newPerson("0111111");
        Person persont2 = pd.newPerson("0112222");
        Person persont3 = pd.newPerson("0113333");
        Person persont4 = pd.newPerson("0114444");
        Person persont5 = pd.newPerson("0115555");
        Person persont6 = pd.newPerson("0116666");
        
        //persona for student
        
        Person personS1 = pd.newPerson("0112311");
        Person personS2 = pd.newPerson("0114422");
        Person personS3 = pd.newPerson("0115533");
        Person personS4 = pd.newPerson("0115544");
        Person personS5 = pd.newPerson("0112355");
        Person personS6 = pd.newPerson("0112366");
        Person personS7 = pd.newPerson("0114477");
        Person personS8 = pd.newPerson("0115588");
        Person personS9 = pd.newPerson("0115599");
        Person personS10 =pd.newPerson("01123100");
        
        FacultyDirectory fd=department.getFacultydirectory();
        
        FacultyProfile teach1= fd.newFacultyProfile(persont1);
        FacultyProfile teach2= fd.newFacultyProfile(persont2);
        FacultyProfile teach3= fd.newFacultyProfile(persont3);
        FacultyProfile teach4= fd.newFacultyProfile(persont4);
        FacultyProfile teach5= fd.newFacultyProfile(persont5);
        FacultyProfile teach6= fd.newFacultyProfile(persont6);
        
        StudentDirectory sd = department.getStudentDirectory();
        
        StudentProfile student1 = sd.newStudentProfile(personS1);
        StudentProfile student2 = sd.newStudentProfile(personS2);
        StudentProfile student3 = sd.newStudentProfile(personS3);
        StudentProfile student4 = sd.newStudentProfile(personS4);
        StudentProfile student5 = sd.newStudentProfile(personS5);
        StudentProfile student6 = sd.newStudentProfile(personS6);
        StudentProfile student7 = sd.newStudentProfile(personS7);
        StudentProfile student8 = sd.newStudentProfile(personS8);
        StudentProfile student9 = sd.newStudentProfile(personS9);
        StudentProfile student10 = sd.newStudentProfile(personS10);
        
        // getting course catalog
        CourseCatalog coursecatalog = department.getCourseCatalog();
        
        //adding course
        Course courseAED = coursecatalog.newCourse("AED", "info 5100", 4);
        Course courseWebDev = coursecatalog.newCourse("Web Development", "info 6500", 4);
        Course courseDataSci = coursecatalog.newCourse("Data Science", "info 4100", 4);
        Course courseDMDD = coursecatalog.newCourse("Data Management", "info 8900", 4);
        Course courseEnglish = coursecatalog.newCourse("English", "info 9400", 4);
        Course courseArt = coursecatalog.newCourse("Art", "info 7890", 4);
        
        //creating course schedule
        CourseSchedule coursescheduleFall = department.newCourseSchedule("Fall_2024");
//        CourseSchedule coursescheduleSpring = department.newCourseSchedule("Spring_2024");

        //adding courseoffer to course schedule
        CourseOffer courseofferAED = coursescheduleFall.newCourseOffer("info 5100");
        CourseOffer courseofferWebDev = coursescheduleFall.newCourseOffer("info 6500");
        CourseOffer courseofferDataSci = coursescheduleFall.newCourseOffer("info 4100");
        CourseOffer courseofferDMDD = coursescheduleFall.newCourseOffer("info 8900");
        CourseOffer courseofferEnglish = coursescheduleFall.newCourseOffer("info 9400");
        CourseOffer courseofferArt = coursescheduleFall.newCourseOffer("info 7890");
        
        // adding the course to core and electives
        Degree degree = new Degree("MSIS");
        
        degree.addCoreCourse(courseAED);
        degree.addElectiveCourse(courseWebDev);
        degree.addElectiveCourse(courseDataSci);
        degree.addElectiveCourse(courseDMDD);
        degree.addElectiveCourse(courseEnglish);
        degree.addElectiveCourse(courseArt);
        
        if(courseofferAED==null)return;
        if(courseofferWebDev==null)return;
        if(courseofferDataSci==null)return;
        if(courseofferDMDD==null)return;
        if(courseofferEnglish==null)return;
        if(courseofferArt==null)return;
        
        //courseoffer seats 
        courseofferAED.generatSeats(50);
        courseofferWebDev.generatSeats(50);
        courseofferDataSci.generatSeats(50);
        courseofferDMDD.generatSeats(50);
        courseofferEnglish.generatSeats(50);
        courseofferArt.generatSeats(50);
        
        
        //assigning teachers ot course offer
        teach1.AssignAsTeacher(courseofferAED);
        teach2.AssignAsTeacher(courseofferWebDev);
        teach3.AssignAsTeacher(courseofferDataSci);
        teach4.AssignAsTeacher(courseofferDMDD);
        teach5.AssignAsTeacher(courseofferEnglish);
        teach6.AssignAsTeacher(courseofferArt);
        
        
        CourseLoad student1Load = student1.newCourseLoad("Fall_2024");// makes object of courseLoad for student 1 for sem fall_2024
        SeatAssignment saAED=student1Load.newSeatAssignment(courseofferAED,8.5f);//registers student1 for courseofferAED
        //finds empty seat in courseoffer 
        //creates seat assignment object that links this student courseLoad to available seat
        //adds seat assignment to studen1Load's seatassignment list
        
//        student1Load.registerStudent(saAED);//ensures saAED that is seat assignment is formally associated with student course load
        //links SeatAssignment with courseLoad
        
        SeatAssignment saWeb=student1Load.newSeatAssignment(courseofferWebDev,9.0f);
        student1Load.registerStudent(saWeb);
        SeatAssignment saData=student1Load.newSeatAssignment(courseofferDataSci,7.8f);
        student1Load.registerStudent(saData);
        SeatAssignment saDMDD=student1Load.newSeatAssignment(courseofferDMDD,8.8f);
        student1Load.registerStudent(saDMDD);
        SeatAssignment saEng=student1Load.newSeatAssignment(courseofferEnglish,9.2f);
        student1Load.registerStudent(saEng);
        
       
        System.out.println(student1.getCourseLoadBySemester("Fall_2024"));
        
       
        
       
        
        
        for(SeatAssignment seatAssignment : student1Load.getSeatAssignments()){
             System.out.println("Course: " + seatAssignment.getCourseOffer().toString() +
                       ", Grade: " + seatAssignment.getGrade());
        }
        
        
        
        
//        
//        courseload.newSeatAssignment(courseoffer); //register student in class
//        
//        int total = department.calculateRevenuesBySemester("Fall2020");
//        System.out.print("Total: " + total);

        //finding course by number 
        String courseNumber="info 6500";
        Course courseFound= coursecatalog.getCourseByNumber(courseNumber);
        
        if(courseFound!=null){
            System.out.println("Course Found: " + "Name: "+courseFound.getName());
            System.out.println("Credits: "+courseFound.getCredits());
            System.out.println( "Price: "+courseFound.getCoursePrice());
            
        }else {
            System.out.println("Course with number " + courseNumber + " not found.");
        }
     
       
      
    }

}
