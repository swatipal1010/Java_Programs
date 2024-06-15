import java.util.Scanner;

class SumOfNum{
	int sum(int a ,int b) {
		return a+b;
	}
	
	int sub(int a ,int b) {
		return a-b;
	}
	
	int mul(int a ,int b) {
		return a*b;
	}
}

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
	    SumOfNum obj = new SumOfNum();
	    int result = obj.sum(num1, num2);
	    System.out.println("Result is: "+result);

	}

}
