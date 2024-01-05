package arrays;
class Pupil{
	String name;
	int rollno;
	int age;
}
public class CreatingObject {

	public static void main(String[] args) {
	Pupil s1 = new Pupil();
	Pupil s2= s1;
	s1.name = "Rohan";
	s1.rollno = 15;
	s1.age = 18;
	System.out.println("Name of the student: "+s1.name);
	System.out.println("Roll no. of the student: "+s1.rollno);
	System.out.println("Age of the student: "+s1.age);
	
	System.out.println("Name of the student: "+s2.name);
	System.out.println("Roll no. of the student: "+s2.rollno);
	System.out.println("Age of the student: "+s2.age);
	
	}

}
	