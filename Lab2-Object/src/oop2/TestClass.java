package oop2;

public class TestClass {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		System.out.println(student1.getFirstName());
		System.out.println(student1.getStudentID());
		student1.setFirstName("OOP");
		System.out.println(student1.getFirstName());
		student1.setFirstName("Atom");
		student1.setStudentID(123);
		System.out.println(student1.getFirstName());
		System.out.println(student1.getStudentID());
		
		Student student2 = new Student();
		System.out.println(student2.getCourse());
		System.out.println(student2.getCourseID());
		
		Student student3 = new Student();
		student3.setFirstName("Intouch");
		student3.setStudentID(1234);
		System.out.println(student3.getFirstName());
		System.out.println(student3.getStudentID());
		System.out.print(student3.getFirstName()+" ");
		System.out.println(student3.getStudentID());
	}
}
