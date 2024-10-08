package basic_programs;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		//System.out.println("For addition, select + \nFor subtraction, select - \nFor multiplication, select * \nFor division, select /");
		//System.out.println();
		
		char operators[] = {'+', '-', '*', '/'};
		System.out.println("Operators you can choose from are: ");
		for(char x:operators) {
			System.out.println(x);
		}
		
		System.out.print("Select the operator: ");
		char oper = sc.next().charAt(0);
		
		switch(oper) {
		case '+':
			int sum = num1+num2;
			System.out.println("Sum of "+num1+"+"+num2+" is: "+sum);
			break;
		case '-':
			int subtr = num1-num2;
			if(num1-num2<0) 
				System.out.println("For postive integer result you must have entered num1>num2");
			else
				System.out.println("Subtraction of "+num1+"-"+num2+" is:"+subtr);
			break;
		case '*':
			int mul = num1*num2;
			System.out.println("Multiplication of "+num1+"*"+num2+" is: "+mul);
			break;
		case '/':
			//double div = (double)(num1/num2);
			if(num2==0) { 
				System.out.println("Alert!!Denominator cannot be zero.");
				System.out.println("You cannot perform this operation.");
			}
			else {
				double div = (double)(num1/num2);
				System.out.println("Division of "+num1+"/"+num2+" is: "+div);
			}
			break;
		default:
			System.out.println("You entered a wrong operator!!!");
		
		}
	}

}
