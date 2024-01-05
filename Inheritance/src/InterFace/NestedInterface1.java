package InterFace;

class Student{
	//Nested Interface
	interface Grades{
		void marks(int n);
	}
}

class Info implements Student.Grades{
	public void marks(int n) {
		System.out.println("Student has received " + n + " marks");
	}
}


public class NestedInterface1 {

	public static void main(String[] args) {
		Student.Grades std = new Info();
		std.marks(88);;

	}

}
