package revision;
import java.util.Scanner;

public class ArrayStudentSubj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();									//Input for number of students
		
		int rollno[] = new int[n];
		int sub1[] = new int[n];
		int sub2[] = new int[n];
		int sub3[] = new int[n];
		double total[] = new double[n];
		double avg[] = new double[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the details of "+ (i+1) + "student: ");
			System.out.print("Roll number: ");
			rollno[i] = sc.nextInt();
			
			System.out.print("Subject 1 marks: ");
			sub1[i] = sc.nextInt();
			
			
			System.out.print("Subject 2 marks: ");
			sub2[i] = sc.nextInt();
			
			System.out.print("Subject 3 marks: ");
			sub3[i] = sc.nextInt();
			
			total[i] = (sub1[i]+sub2[i]+sub3[i]);
			
			avg[i] = total[i]/3.0;
		}
		
		System.out.println("Rollno \t Total marks \t Average marks");
		for(int j=0; j<n; j++) {
			System.out.println(rollno[j] + "\t" + total[j] + "\t" + "\t" + avg[j]);
		}
	}

}
