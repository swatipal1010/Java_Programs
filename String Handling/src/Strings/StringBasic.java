package Strings;
import java.util.Scanner;
public class StringBasic {
	public static void main(String args[]) {
		//Declaring a string
		String firstName = "Swati";
		String lastName = "Pal";
		String fullName = "This is Swati Pal";
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(fullName);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstname1 = sc.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastname2 = sc.nextLine();
		
		System.out.print("Print your full name with a message: ");
		String fullname2 = sc.nextLine();
		
		System.out.println(fullname2);
	}
}
