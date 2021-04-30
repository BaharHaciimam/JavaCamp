package homeworkDay3;

public class Student extends User{
	
	private int studentNumber;
	private String[] attendedCourses;
	private String[] completedCourses;
	
	public Student() {
		
	}
	
	public Student(int studentNumber, String[] attendedCourses, String[] completedCourses) {
		super( );
		this.studentNumber = studentNumber;
		this.attendedCourses = attendedCourses;
		this.completedCourses = completedCourses;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String[] getAttendedCourses() {
		return attendedCourses;
	}

	public void setAttendedCourses(String[] attendedCourses) {
		this.attendedCourses = attendedCourses;
	}

	public String[] getCompletedCourses() {
		return completedCourses;
	}

	public void setCompletedCourses(String[] completedCourses) {
		this.completedCourses = completedCourses;
	}
	
	
}
