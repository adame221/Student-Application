import java.util.*;
/**
 *  Adam Ely
 *  Project 4 Part 1
 *  04/17/2015
 */
public class StudentPart1 {

	//Declare instance variables
    protected int studentId;
    protected String studentName;
    protected String schoolName;
	protected String extracurricularActivities;
    protected String teacher;

	//Getters/Setters
   public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
 
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentName (String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setSchoolName (String schoolName) {
        this.schoolName = schoolName;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
	
	public void setExtracurricularActivities (String extracurricularActivities) {
		this.extracurricularActivities = extracurricularActivities;
	}
	
	public String getExtracurricularActivities() {
		return extracurricularActivities;
	}
    
       public void setTeacher (String teacher) {
        this.teacher = teacher;
    }
    
    public String getTeacher() {
        return teacher;
    }
	
	//This method will convert the entered information into a string
    public String toString() {
        return "StudentID: " + studentId
        + "\nStudentName: " + studentName + "\nSchoolName: "
        + schoolName + "\nExtracurricular Activities: " + extracurricularActivities
		+ "\nTeacher: " + teacher;
     }
}