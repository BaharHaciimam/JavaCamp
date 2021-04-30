package homeworkDay3;

public class Instructor extends User {
	private int instructorNumber;
	private String[] coursesGiven;
	private String cvDetail;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorNumber, String[] coursesGiven, String cvDetail) {
		super();
		this.instructorNumber = instructorNumber;
		this.coursesGiven = coursesGiven;
		this.cvDetail = cvDetail;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String[] getCoursesGiven() {
		return coursesGiven;
	}

	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}

	public String getCvDetail() {
		return cvDetail;
	}

	public void setCvDetail(String cvDetail) {
		this.cvDetail = cvDetail;
	}
	
	

}
