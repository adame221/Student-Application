import java.util.*;
/**
 *  Adam Ely
 *  Project 4 Part 1
 *  04/17/2015
 */
public class KindergardenPart1 extends StudentPart1 {
	
	//Declare instance varaiables
    private String showAndTellItem;
    
	//Getters/Setters
    public void setShowAndTellItem (String showAndTellItem) {
        this.showAndTellItem = showAndTellItem;
    }
    public String getShowAndTellItem() {
        return showAndTellItem;
    }
    
	//This method will convert the entered information into a string
    public String toString() {
        return "StudentID: " + studentId
        + "\nStudentName: " + studentName + "\nSchoolName: "
        + schoolName + "\nExtracurricular Activities: " + extracurricularActivities
		+ "\nTeacher: " + teacher
		+ "\n\nA Kindergarden Student.\nShow And Tell Item: "
        + showAndTellItem;
    }
}