package OopsLab3;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
	int marks[] = new int[10];
	System.out.print("Enter the marks of the students: ");
	
	for(int i=1; i<=10; i++) {
		Scanner input = new Scanner(System.in);
		
		int mark = input.nextInt();
		marks[i] = mark;
		System.out.println("Marks are: "+marks[i]);
	}

	}

}

