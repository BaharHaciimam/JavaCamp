package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses = {"C#", "Java", "Pyhton"};
		
		Instructor engin= new Instructor();
		engin.setId(1);
		engin.setName("Engin Demirog");
		engin.setMail("engin@gmail.com");
		engin.setPassword("a123");
		engin.setCvDetail("Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.");
		engin.setCoursesGiven(courses);
		
		String[] attendedCourse= {"Java", "C#"};
		Student student1 = new Student(1,attendedCourse, null);
		student1.setId(2);
		student1.setName("Bahar");
		student1.setMail("bahar@gmail.com");
		student1.setPassword("1234");
		
		UserManager userManager=new UserManager();
		userManager.login(student1);
		userManager.login(engin);
		System.out.println("--------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.AddCourse(engin, "Java");
		instructorManager.DeleteCourse(engin, "C");
		instructorManager.gradeStudent(engin, student1, "Java", 90);
		System.out.println("--------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.ShowStudent(student1);
		System.out.println("--------------------------------------------");
		studentManager.EnrollCourse(student1, "Python");
		
		

	}

}
