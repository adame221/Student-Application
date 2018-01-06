import java.util.*;
/**
 *  Adam Ely
 *  Project 4 Part 2
 *  04/18/2015
 */
 abstract class StudentPart2 {
	
	//Declare instance variables
    protected int studentId;
    protected String studentName;
	protected String gradeLevel;
    protected String schoolName;
    protected String teacher;
	protected int score;

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
	
	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	public String getGradeLevel() {
		return gradeLevel;
	}
    
    public void setSchoolName (String schoolName) {
        this.schoolName = schoolName;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
	
    public void setScore (int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
    public void setTeacher (String teacher) {
        this.teacher = teacher;
    }
    
    public String getTeacher() {
        return teacher;
    }
	
	abstract String progressReport();
 }