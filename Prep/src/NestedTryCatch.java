import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		int[] marks = new int[3];
		marks[0] = 55;
		marks[1] = 68;
		marks[2] = 81;
		
		System.out.println("Enter the index whose value you want to access: ");
		Scanner sc = new Scanner(System.in);
		int ind = sc.nextInt();
		
		
		System.out.println("Enter the number by which you wany to divide the value at the selected index: ");
		int number = sc.nextInt();
		
		try {
			System.out.println("Welcome!!!");
			System.out.println("Dividing"+marks[ind]+" by "+number+" :"+marks[ind]/number);		//Error is handled by the outside try-catch block
			
			try {
				System.out.println("Value at the "+ind+" index is: "+marks[ind]);				//Error is handled by the nested try-catch block
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("You enetered the wrong index. This index doesn't exists.");
				System.out.println(e);
			}
		}catch(Exception e) {
			System.out.println("Invalid input.");
			System.out.println(e);
		}

	}

}
