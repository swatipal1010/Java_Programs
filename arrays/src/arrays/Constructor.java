package arrays;

public class Constructor {

	public static void main(String[] args) {
	Learner s1 = new Learner();
	System.out.println(s1.rollno);
	System.out.println(s1.marks);
	System.out.println(s1.name);

	}

}

	class Learner{
		int rollno;
		float marks;
		String name;
		
		Learner() {
			this.rollno = 44;
			this.marks = 89;
			this.name = "Swati";
			
		}
}