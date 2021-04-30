package homeworkDay3;


public class StudentManager {
	public void ShowStudent(Student student) {
		System.out.println("Name: " + student.getName());
		System.out.println("Mail: " + student.getMail());
		System.out.println("Katildigi kurslar:");
		for(String course:student.getAttendedCourses()) {
			System.out.println(course);
		}
	}
	
	public void EnrollCourse(Student student, String course) {
		System.out.println(student.getName() +"  "+ course+ " kursuna kayit oldu!");
	}

}
