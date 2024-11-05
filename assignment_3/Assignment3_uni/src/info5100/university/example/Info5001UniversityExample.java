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
        
        // Persons for teacher and their names
        Person persont1 = pd.newPerson("0111111"); persont1.setName("Alice Johnson");
        Person persont2 = pd.newPerson("0112222"); persont2.setName("Bob Smith");
        Person persont3 = pd.newPerson("0113333"); persont3.setName("Carol Williams");
        Person persont4 = pd.newPerson("0114444"); persont4.setName("David Brown");
        Person persont5 = pd.newPerson("0115555"); persont5.setName("Emma Jones");
        Person persont6 = pd.newPerson("0116666"); persont6.setName("Frank Taylor");

        // Persons for students, and their names
        Person personS1 = pd.newPerson("0112311"); personS1.setName("George Anderson");
        Person personS2 = pd.newPerson("0114422"); personS2.setName("Hannah Martinez");
        Person personS3 = pd.newPerson("0115533"); personS3.setName("Ivy Wilson");
        Person personS4 = pd.newPerson("0115544"); personS4.setName("Jack Thomas");
        Person personS5 = pd.newPerson("0112355"); personS5.setName("Katie White");
        Person personS6 = pd.newPerson("0112366"); personS6.setName("Liam Harris");
        Person personS7 = pd.newPerson("0114477"); personS7.setName("Mia Lewis");
        Person personS8 = pd.newPerson("0115588"); personS8.setName("Noah Robinson");
        Person personS9 = pd.newPerson("0115599"); personS9.setName("Olivia Walker");
        Person personS10 = pd.newPerson("01123100"); personS10.setName("Peter Hall");

        //making faculty profile for teacher person object
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
        
        Course courseCyberSec = coursecatalog.newCourse("Cybersecurity Fundamentals", "info 7200", 4);
        Course courseAI = coursecatalog.newCourse("Artificial Intelligence", "info 7400", 4);
        Course courseMachineLearning = coursecatalog.newCourse("Machine Learning", "info 7500", 4);
        Course courseCloudComputing = coursecatalog.newCourse("Cloud Computing", "info 7600", 4);
        Course courseDevOps = coursecatalog.newCourse("DevOps Practices", "info 7700", 4);
        Course courseDataVisualization = coursecatalog.newCourse("Data Visualization", "info 7800", 4);
        
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
        
        // Assuming coursescheduleFall is an instance of CourseSchedule where courses are offered
        CourseOffer courseofferCyberSec = coursescheduleFall.newCourseOffer("info 7200");
        CourseOffer courseofferAI = coursescheduleFall.newCourseOffer("info 7400");
        CourseOffer courseofferMachineLearning = coursescheduleFall.newCourseOffer("info 7500");
        CourseOffer courseofferCloudComputing = coursescheduleFall.newCourseOffer("info 7600");
        CourseOffer courseofferDevOps = coursescheduleFall.newCourseOffer("info 7700");
        CourseOffer courseofferDataVisualization = coursescheduleFall.newCourseOffer("info 7800");

        
        // adding the course to core and electives
        Degree degree = new Degree("MSIS");
        
        degree.addCoreCourse(courseAED);// only one core
        degree.addElectiveCourse(courseWebDev);
        degree.addElectiveCourse(courseDataSci);
        degree.addElectiveCourse(courseDMDD);
        degree.addElectiveCourse(courseEnglish);
        degree.addElectiveCourse(courseArt);
        
        degree.addElectiveCourse(courseCyberSec);
        degree.addElectiveCourse(courseAI);
        degree.addElectiveCourse(courseMachineLearning);
        degree.addElectiveCourse(courseCloudComputing);
        degree.addElectiveCourse(courseDevOps);
        degree.addElectiveCourse(courseDataVisualization);
        
        //checking if the course is null or not
        if(courseofferAED==null)return;
        if(courseofferWebDev==null)return;
        if(courseofferDataSci==null)return;
        if(courseofferDMDD==null)return;
        if(courseofferEnglish==null)return;
        if(courseofferArt==null)return;
        
        if (courseofferCyberSec == null) return;
        if (courseofferAI == null) return;
        if (courseofferMachineLearning == null) return;
        if (courseofferCloudComputing == null) return;
        if (courseofferDevOps == null) return;
        if (courseofferDataVisualization == null) return;
        
        //generating course offer seats
        courseofferAED.generatSeats(50);
        courseofferWebDev.generatSeats(50);
        courseofferDataSci.generatSeats(50);
        courseofferDMDD.generatSeats(50);
        courseofferEnglish.generatSeats(50);
        courseofferArt.generatSeats(50);
        courseofferCyberSec.generatSeats(50);
        courseofferAI.generatSeats(50);
        courseofferMachineLearning.generatSeats(50);
        courseofferCloudComputing.generatSeats(50);
        courseofferDevOps.generatSeats(50);
        courseofferDataVisualization.generatSeats(50);

        
        //assigning teachers ot course offer
        teach1.AssignAsTeacher(courseofferAED);
        teach2.AssignAsTeacher(courseofferWebDev);
        teach4.AssignAsTeacher(courseofferDataSci);
        teach4.AssignAsTeacher(courseofferDMDD);
        teach2.AssignAsTeacher(courseofferEnglish);
        teach6.AssignAsTeacher(courseofferArt);        
        teach1.AssignAsTeacher(courseofferCyberSec);      // Cybersecurity Fundamentals
        teach5.AssignAsTeacher(courseofferAI);            // Artificial Intelligence
        teach3.AssignAsTeacher(courseofferMachineLearning); // Machine Learning
        teach1.AssignAsTeacher(courseofferCloudComputing); // Cloud Computing
        teach5.AssignAsTeacher(courseofferDevOps);        // DevOps Practices
        teach3.AssignAsTeacher(courseofferDataVisualization);
        
        //finds empty seat in courseoffer 
        //creates seat assignment object that links this student courseLoad to available seat
        //adds seat assignment to studen1Load's seatassignment list
        CourseLoad student1Load = student1.newCourseLoad("Fall_2024");// makes object of courseLoad for student 1 for sem fall_2024
        SeatAssignment saAED=student1Load.newSeatAssignment(courseofferAED,8.5f);//registers student1 for courseofferAED
        student1Load.registerStudent(saAED);//ensures saAED that is seat assignment is formally associated with student course load  //links SeatAssignment with courseLoad
        SeatAssignment saWeb=student1Load.newSeatAssignment(courseofferWebDev,9.0f);
        student1Load.registerStudent(saWeb);        
        SeatAssignment saData=student1Load.newSeatAssignment(courseofferDataSci,7.8f);
        student1Load.registerStudent(saData);
        SeatAssignment saDMDD=student1Load.newSeatAssignment(courseofferDMDD,8.8f);
        student1Load.registerStudent(saDMDD);        
        SeatAssignment saEng=student1Load.newSeatAssignment(courseofferEnglish,9.2f);
        student1Load.registerStudent(saEng);
        SeatAssignment sa1Cyb = student1Load.newSeatAssignment(courseofferCyberSec, 5.0f);
        student1Load.registerStudent(sa1Cyb);
        
        //student 2
        
       // Create a new course load for student 2 for the Fall 2024 semester
        CourseLoad student2Load = student2.newCourseLoad("Fall_2024");

    // Register student 2 for the core course AED with a grade of 7.4
        SeatAssignment sa2AED = student2Load.newSeatAssignment(courseofferAED, 7.4f);
        student2Load.registerStudent(sa2AED);      
        SeatAssignment sa2Cyb = student2Load.newSeatAssignment(courseofferCyberSec, 5.0f);
        student2Load.registerStudent(sa2Cyb); 
        SeatAssignment sa2AI = student2Load.newSeatAssignment(courseofferAI, 4.7f);
        student2Load.registerStudent(sa2AI); 
        SeatAssignment sa2ML = student2Load.newSeatAssignment(courseofferMachineLearning, 3.0f);
        student2Load.registerStudent(sa2ML);
        SeatAssignment sa2Cloud = student2Load.newSeatAssignment(courseofferCloudComputing, 9.2f);
        student2Load.registerStudent(sa2Cloud);
        SeatAssignment sa2DevOps = student2Load.newSeatAssignment(courseofferDevOps, 7.9f);
        student2Load.registerStudent(sa2DevOps); 

        //student 3
        CourseLoad student3Load = student3.newCourseLoad("Fall_2024");
        SeatAssignment sa3AED = student3Load.newSeatAssignment(courseofferAED, 5.5f);
        student3Load.registerStudent(sa3AED);
        SeatAssignment sa3Web = student3Load.newSeatAssignment(courseofferWebDev, 4.0f);
        student3Load.registerStudent(sa3Web);
        SeatAssignment sa3Data = student3Load.newSeatAssignment(courseofferDataSci, 8.8f);
        student3Load.registerStudent(sa3Data);
        SeatAssignment sa3DMDD = student3Load.newSeatAssignment(courseofferDMDD, 6.8f);
        student3Load.registerStudent(sa3DMDD);
        SeatAssignment sa3Eng = student3Load.newSeatAssignment(courseofferEnglish, 8.2f);
        student3Load.registerStudent(sa3Eng);
        SeatAssignment sa3AI = student3Load.newSeatAssignment(courseofferAI, 4.7f);
        student3Load.registerStudent(sa3AI);

        
       //student 4
        CourseLoad student4Load = student4.newCourseLoad("Fall_2024");
        SeatAssignment sa4AED = student4Load.newSeatAssignment(courseofferAED, 7.4f);
        student4Load.registerStudent(sa4AED);
        SeatAssignment sa4Cyb = student4Load.newSeatAssignment(courseofferCyberSec, 5.0f);
        student4Load.registerStudent(sa4Cyb);
        SeatAssignment sa4AI = student4Load.newSeatAssignment(courseofferAI, 4.7f);
        student4Load.registerStudent(sa4AI);
        SeatAssignment sa4ML = student4Load.newSeatAssignment(courseofferMachineLearning, 3.0f);
        student4Load.registerStudent(sa4ML);
        SeatAssignment sa4Cloud = student4Load.newSeatAssignment(courseofferCloudComputing, 9.2f);
        student4Load.registerStudent(sa4Cloud);
        SeatAssignment sa4DevOps = student4Load.newSeatAssignment(courseofferDevOps, 7.9f);
        student4Load.registerStudent(sa4DevOps);
        
        
        //student 6
        CourseLoad student6Load = student6.newCourseLoad("Fall_2024");
        SeatAssignment sa6AED = student6Load.newSeatAssignment(courseofferAED, 7.4f);
        student6Load.registerStudent(sa6AED);
        SeatAssignment sa6Cyb = student6Load.newSeatAssignment(courseofferCyberSec, 5.0f);
        student6Load.registerStudent(sa6Cyb);
        SeatAssignment sa6AI = student6Load.newSeatAssignment(courseofferAI, 4.7f);
        student6Load.registerStudent(sa6AI);
        SeatAssignment sa6ML = student6Load.newSeatAssignment(courseofferMachineLearning, 3.0f);
        student6Load.registerStudent(sa6ML);
        SeatAssignment sa6Cloud = student6Load.newSeatAssignment(courseofferCloudComputing, 9.2f);
        student6Load.registerStudent(sa6Cloud);
        SeatAssignment sa6DevOps = student6Load.newSeatAssignment(courseofferDevOps, 7.9f);
        student6Load.registerStudent(sa6DevOps);
        
        
        //student 8
        CourseLoad student8Load = student8.newCourseLoad("Fall_2024");
        SeatAssignment sa8AED = student8Load.newSeatAssignment(courseofferAED, 7.4f);
        student8Load.registerStudent(sa8AED);
        SeatAssignment sa8Cyb = student8Load.newSeatAssignment(courseofferCyberSec, 5.0f);
        student8Load.registerStudent(sa8Cyb);
        SeatAssignment sa8AI = student8Load.newSeatAssignment(courseofferAI, 4.7f);
        student8Load.registerStudent(sa8AI);
        SeatAssignment sa8ML = student8Load.newSeatAssignment(courseofferMachineLearning, 3.0f);
        student8Load.registerStudent(sa8ML);
        SeatAssignment sa8Cloud = student8Load.newSeatAssignment(courseofferCloudComputing, 9.2f);
        student8Load.registerStudent(sa8Cloud);
        SeatAssignment sa8DevOps = student8Load.newSeatAssignment(courseofferDevOps, 7.9f);
        student8Load.registerStudent(sa8DevOps);

        //student 10
        CourseLoad student10Load = student10.newCourseLoad("Fall_2024");
        SeatAssignment sa10AED = student10Load.newSeatAssignment(courseofferAED, 7.4f);
        student10Load.registerStudent(sa10AED);
        SeatAssignment sa10Cyb = student10Load.newSeatAssignment(courseofferCyberSec, 5.0f);
        student10Load.registerStudent(sa10Cyb);
        SeatAssignment sa10AI = student10Load.newSeatAssignment(courseofferAI, 4.7f);
        student10Load.registerStudent(sa10AI);
        SeatAssignment sa10ML = student10Load.newSeatAssignment(courseofferMachineLearning, 3.0f);
        student10Load.registerStudent(sa10ML);
        SeatAssignment sa10Cloud = student10Load.newSeatAssignment(courseofferCloudComputing, 9.2f);
        student10Load.registerStudent(sa10Cloud);
        SeatAssignment sa10DevOps = student10Load.newSeatAssignment(courseofferDevOps, 7.9f);
        student10Load.registerStudent(sa10DevOps);

        //student 5
       CourseLoad student5Load = student5.newCourseLoad("Fall_2024");
        SeatAssignment sa5AED = student5Load.newSeatAssignment(courseofferAED, 8.5f);
        student5Load.registerStudent(sa5AED);
        SeatAssignment sa5Web = student5Load.newSeatAssignment(courseofferWebDev, 9.0f);
        student5Load.registerStudent(sa5Web);
        SeatAssignment sa5Data = student5Load.newSeatAssignment(courseofferDataSci, 7.8f);
        student5Load.registerStudent(sa5Data);
        SeatAssignment sa5DMDD = student5Load.newSeatAssignment(courseofferDMDD, 8.8f);
        student5Load.registerStudent(sa5DMDD);
        SeatAssignment sa5Eng = student5Load.newSeatAssignment(courseofferEnglish, 9.2f);
        student5Load.registerStudent(sa5Eng);
        SeatAssignment sa5DevOps = student5Load.newSeatAssignment(courseofferDevOps, 7.9f);
        student5Load.registerStudent(sa5DevOps);

        //student 7
        CourseLoad student7Load = student7.newCourseLoad("Fall_2024");
        SeatAssignment sa7AED = student7Load.newSeatAssignment(courseofferAED, 8.5f);
        student7Load.registerStudent(sa7AED);
        SeatAssignment sa7Web = student7Load.newSeatAssignment(courseofferWebDev, 9.0f);
        student7Load.registerStudent(sa7Web);
        SeatAssignment sa7Data = student7Load.newSeatAssignment(courseofferDataSci, 7.8f);
        student7Load.registerStudent(sa7Data);
        SeatAssignment sa7DMDD = student7Load.newSeatAssignment(courseofferDMDD, 8.8f);
        student7Load.registerStudent(sa7DMDD);
        SeatAssignment sa7Eng = student7Load.newSeatAssignment(courseofferEnglish, 9.2f);
        student7Load.registerStudent(sa7Eng);
        SeatAssignment sa7ML = student7Load.newSeatAssignment(courseofferMachineLearning, 3.0f);
        student7Load.registerStudent(sa7ML);

        //student 9
        CourseLoad student9Load = student9.newCourseLoad("Fall_2024");
        SeatAssignment sa9AED = student9Load.newSeatAssignment(courseofferAED, 8.5f);
        student9Load.registerStudent(sa9AED);
        SeatAssignment sa9Web = student9Load.newSeatAssignment(courseofferWebDev, 9.0f);
        student9Load.registerStudent(sa9Web);
        SeatAssignment sa9Data = student9Load.newSeatAssignment(courseofferDataSci, 7.8f);
        student9Load.registerStudent(sa9Data);
        SeatAssignment sa9DMDD = student9Load.newSeatAssignment(courseofferDMDD, 8.8f);
        student9Load.registerStudent(sa9DMDD);
        SeatAssignment sa9Eng = student9Load.newSeatAssignment(courseofferEnglish, 9.2f);
        student9Load.registerStudent(sa9Eng);
        SeatAssignment sa9Cyb = student9Load.newSeatAssignment(courseofferCyberSec, 5.0f);
        student9Load.registerStudent(sa9Cyb);

        
       
        
        

        
        
        
        
//        
         //register student in class
//        
        int total = department.calculateRevenuesBySemester("Fall_2024");
        System.out.println("Total: " + total);

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
        
        department.displayStudentRegistrations("Fall_2024", department);
     
       
      
    }

}
