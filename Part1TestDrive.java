import java.util.*;
/**
 *  Adam Ely
 *  Project 4 Part 1
 *  04/17/2015
 */
public class Part1TestDrive {

    public static void main(String[] args) {
    
    //Create new students
	KindergardenPart1 student1 = new KindergardenPart1();
    student1.setStudentName("John");
    student1.setStudentId(4532);
    student1.setSchoolName("Madison");
    student1.setTeacher("Mr. Johnson");
	student1.setExtracurricularActivities("Reading club");
	student1.setShowAndTellItem("Aaron Rodgers autographed football.");
	
	StudentPart1 student2 = new StudentPart1();
    student2.setStudentName("Ally");
    student2.setStudentId(4536);
    student2.setSchoolName("Milwaukee");
	student2.setExtracurricularActivities("basesball and hockey");
    student2.setTeacher("Mr. Smith");
	
	KindergardenPart1 student3 = new KindergardenPart1();
	student3.setStudentName("Rick");
	student3.setStudentId(3343);
	student3.setSchoolName("Green Bay");
	student3.setExtracurricularActivities("Drawing club");
	student3.setTeacher("Ms. Jones");
	student3.setShowAndTellItem("trading cards");
	
	StudentPart1 student4 = new StudentPart1();
	student4.setStudentName("Joe");
	student4.setStudentId(2433);
	student4.setSchoolName("La Crosse");
	student4.setExtracurricularActivities("basesball,basketball, football");
	student4.setTeacher("Mr. Crawford");
    
	ArrayList<StudentPart1> student = new ArrayList<StudentPart1>();
	student.add(student1);
	student.add(student2);
	student.add(student3);
	student.add(student4);
    
	//Loop through the array of students
    for (int i = 0; i < student.size(); i++) {
		System.out.println(student.get(i).toString());
		System.out.println("------------------------------------------------------------");
    }
    }
}