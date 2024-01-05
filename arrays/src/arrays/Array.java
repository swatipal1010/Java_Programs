package arrays;

public class Array {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollno = 10;
		s1.name = "Swati";
		s1.marks = 88;
		System.out.println("Name of the student: "+s1.name);
		System.out.println("Marks: "+s1.marks);
		System.out.println("Roll number: "+s1.rollno);
		
		
		
		
	}
}
		//Create a class
		//For every single student: roll no, name, marks
	class Student{
		int rollno;
		String name;
		float marks;
	
	}


