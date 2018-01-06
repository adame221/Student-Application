import java.util.*;
/**
 *  Adam Ely
 *  Project 4 Part 2
 *  04/20/2015
 */
 public class StudentPart2TestDrive {
	
	public static void main(String[] args) {
		
		//Declare instance variables
		String studentIdString = "";
		String scoreString = "";
		String moreClients = "";
		int studentId = 0;
		String studentName ="";
		String gradeLevel = "";
		String schoolName = "";
		String teacher = "";
		int score = 0;
		String showAndTellItem = "";
		String collegeSchoolChoices = "";
		InputHelper input = new InputHelper();
		ArrayList<StudentPart2> students = new ArrayList<StudentPart2>();
		
		//Loop through and ask the user to enter input
		while(true) {
			studentIdString = input.getUserInput("\nEnter the students id: ");
			studentId = Integer.parseInt(studentIdString);
			studentName = input.getUserInput("Enter the students name: ");
			gradeLevel = input.getUserInput("Enter the students grade level. (Ex.Elementary,Middle,High): ");
			schoolName = input.getUserInput("Enter the students school name: ");
			teacher = input.getUserInput("Enter the students teacher: ");
			scoreString = input.getUserInput("Enter the students score: ");
			score = Integer.parseInt(scoreString);
			if(gradeLevel.equals("Elementary") || gradeLevel.equals("elementary")) {
				showAndTellItem = input.getUserInput("Enter the students show and tell item: ");
				ElementaryStudent newElementaryStudent = new ElementaryStudent();
				newElementaryStudent.setStudentId(studentId);
				newElementaryStudent.setStudentName(studentName);
				newElementaryStudent.setGradeLevel(gradeLevel);
				newElementaryStudent.setSchoolName(schoolName);
				newElementaryStudent.setScore(score);
				newElementaryStudent.setTeacher(teacher);
				newElementaryStudent.setShowAndTellItem(showAndTellItem);
				students.add(newElementaryStudent);
			} else if(gradeLevel.equals("Middle") || gradeLevel.equals("middle")) {
				MiddleStudent newMiddleStudent = new MiddleStudent();
				newMiddleStudent.setStudentId(studentId);
				newMiddleStudent.setStudentName(studentName);
				newMiddleStudent.setGradeLevel(gradeLevel);
				newMiddleStudent.setSchoolName(schoolName);
				newMiddleStudent.setScore(score);
				newMiddleStudent.setTeacher(teacher);
				students.add(newMiddleStudent);			
			} else {
				collegeSchoolChoices = input.getUserInput("Enter the students college choices: ");
				HighStudent newHighStudent = new HighStudent();
				newHighStudent.setStudentId(studentId);
				newHighStudent.setStudentName(studentName);
				newHighStudent.setGradeLevel(gradeLevel);
				newHighStudent.setSchoolName(schoolName);
				newHighStudent.setScore(score);
				newHighStudent.setTeacher(teacher);
				newHighStudent.setCollegeSchoolChoices(collegeSchoolChoices);
				students.add(newHighStudent);				
			}
			moreClients = input.getUserInput(
						"Would you like to enter another student? (Y or y for yes and N or n for no)");
			if (!moreClients.equals("y")) {
				break;
			}
		}
		
		//Loop through the array of students and output the progressReport method
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).progressReport());
			System.out.println("-----------------------------------------------------------------------");
		}
	}
 }