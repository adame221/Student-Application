import java.util.*;
/**
 *  Adam Ely
 *  Project 4 Part 2
 *  04/19/2015
 */
 public class ElementaryStudent extends StudentPart2 implements TestTaker {
	
	//Declare instance variable
	protected String showAndTellItem;
	
	//Get/Set methods
	public void setShowAndTellItem(String showAndTellItem) {
		this.showAndTellItem = showAndTellItem;
	}
	
	public String getShowAndTellItem() {
		return showAndTellItem;
	}
	
	//Call the takeTest method
	public void takeTest(){}
	
	//Set information to the getTestResults method
	public String getTestResults() {
		if(score >= 60) {
			return studentName + " has passed";
		} else {
			return studentName + " has failed";
		}
	}
	
	//Set information to the progressReport method
	public String progressReport() {
		return "\nStudent name: " + studentName + "\nStudent ID: " + studentId
				+ "\nGrade level: " + gradeLevel + "\nSchool Name: " + schoolName
				+ "\nTeacher: " + teacher + "\nShow and tell item: " + showAndTellItem 
				+ "\nTest score: " + score + "\nStatus: " + getTestResults();
	}
 }