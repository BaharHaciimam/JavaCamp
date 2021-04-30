package homeworkDay3;

public class InstructorManager {
	public void AddCourse(Instructor instructor, String course) {
		System.out.println(instructor.getName()+"  " + course + "  adli kursu ekledi!");
	}
	
	public void DeleteCourse(Instructor instructor, String course) {
		System.out.println(instructor.getName()+"  " + course + "  adli kursu sildi!");
	}	

	public void gradeStudent(Instructor instructor, Student student, String course, int grade) {
		System.out.println("Egitmen: "+ instructor.getName() + " ogrenci: " + student.getName() +
				" Kurs: "+ course+ " verilen not : "+ grade);
	}
}
