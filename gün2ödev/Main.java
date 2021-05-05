package kodlamaIo;

public class Main {
	public static void main(String []args) {
		Course course1= new Course("JAVA REACT");

		 Course course2 = new Course("Programlamaya Giris icin Temel Kurs");

		 Course course3= new Course("C# + ANGULAR");

		 Course[] courses = {course1 , course2 , course3};
		 for (Course courses2 : courses) {
			System.out.println(course1.courseName + "\n" +course2.courseName +  "\n" +course3.courseName);
		}
	courseManager course = new courseManager();
	course.addToCart(course1);
	course.addToCourse(course2);
	course.deleteCourse(course3);


	}
}

