package BasicMaths;
import java.util.Scanner;

public class GCD {
	
	//BRUTE FORCE APPROACH - Method to find the GCD of given numbers
	public static int gcd1(int num1, int num2) {
		int smallNum = num1>num2?num1:num2;
		
		int gcd = 1;
		for(int i=1; i<smallNum; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = Math.max(i, gcd);
			}
		}
		return gcd;
	}
	
	//BETTER SOLUTION - Rather than moving from 1 to min(num1, num2), we can move from min(num1, num2) to 1 to reduce no. of iterations
	public static int gcd2(int num1, int num2) {
		int smallNum = num1>num2?num1:num2;
		
		int gcd = 1;
		for(int i=smallNum; i>=1; i--) {
			if(num1%i==0 && num2%i==0) {
				gcd = Math.max(i, gcd);
			}
		}
		return gcd;
	}
	
	//OPTIMAL APPROACH - EUCLIDEAN ALGORITHM
	static int gcd3(int num1, int num2)
    {
        if (num1 == 0)
            return num2;
        if (num2 == 0)
            return num1;
        if (num1 == num2)
            return num1;
        if (num1 > num2)
            return gcd3(num1 - num2, num2);
        return gcd3(num1, num2 - num1);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd1(num1, num2));
		System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd2(num1, num2));
		System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd3(num1, num2));
	}
}
