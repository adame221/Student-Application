import java.util.*;
/**
 *  Adam Ely
 *  Project 4 Part 2
 *  04/19/2015
 */
 public class Project4TestCode {
 
	public static void main(String[] args) {
		
		//Create a new elementary school student
		ElementaryStudent newElementaryStudent = new ElementaryStudent();
		newElementaryStudent.setStudentId(9993);
		newElementaryStudent.setStudentName("Joe");
		newElementaryStudent.setGradeLevel("Elementary");
		newElementaryStudent.setSchoolName("Madison");
		newElementaryStudent.setScore(44);
		newElementaryStudent.setShowAndTellItem("cards");

		//Create a new middle school student
		MiddleStudent newMiddleStudent = new MiddleStudent();
		newMiddleStudent.setStudentId(3224);
		newMiddleStudent.setStudentName("Sarah");
		newMiddleStudent.setGradeLevel("Middle");
		newMiddleStudent.setSchoolName("Milwaukee");
		newMiddleStudent.setScore(60);

		//Create a new high school student
		HighStudent newHighStudent = new HighStudent();
		newHighStudent.setStudentId(3223);
		newHighStudent.setStudentName("Pete");
		newHighStudent.setGradeLevel("High");
		newHighStudent.setSchoolName("Green Bay");
		newHighStudent.setScore(10);
		newHighStudent.setCollegeSchoolChoices("Iowa, Wisconsin");

		//Create an array list for the StudentPart2 class
		ArrayList<StudentPart2> student = new ArrayList<StudentPart2>();
		
		//Add the new students to the array list
		student.add(newElementaryStudent);		
		student.add(newMiddleStudent);	
		student.add(newHighStudent);
		
		//Loop through the array and output the progressReport method
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).progressReport());
			System.out.println("------------------------------------------------------------");
    }
	}
 }