package basic_programs;
import java.util.Scanner;

public class StudentTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numarray[] = new int[10];		//array to store marks
		String grades[] = new String[10];	//array to store grades
		
		
		//Taking marks of 10 students as input
		System.out.println("Enter the marks of all 10 students: ");
		for(int i=0;i<10;i++) {
			numarray[i] = sc.nextInt();
		}

		
		// Arranging marks in ascending order
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
			if(numarray[i]>numarray[j]) {
				int temp = numarray[j];
				numarray[j] = numarray[i];
				numarray[i] = temp;
			}
			}
		}
		
		System.out.println("Marks arranged in ascending order: ");
		for(int x : numarray) {
			System.out.print(x+" ");
		}
		System.out.println();	
		
		
		//Assigning grades to corresponding marks
		for(int i=0;i<10;i++) {
			if(numarray[i]>=40 && numarray[i]<=50)
				grades[i] = "PASS";
			else if(numarray[i]>=51 && numarray[i]<=75)
				grades[i] = "MERIT";
			else if(numarray[i]>75)
				grades[i] = "DISTINCTION";
			else
				grades[i] = "FAIL";
		}
		
		//Printing marks and respective grades
		System.out.println("Marks \t Grades");
		for(int i=0;i<10;i++) {
			System.out.println(numarray[i]+"\t"+grades[i]);
				
			}
		}
}
