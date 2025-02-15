package Recursion;

public class BasicProblems {
	
	//Method to print hello 'n' number of times -- Parameterized Recursion
	public static void hello(int n) {				
		if(n==0) {
			return;
		}
		System.out.println("Hello"+n);
		hello(--n);
	}
	
	//Method to print Good Morning 'n' number of times
	public static void goodMor(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println("Good Morning"+curr);
		goodMor(curr+1, n);
	}
	
	//print numbers from 1 to N
	public static void printNum(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		printNum(curr+1,n);
		
		
	}
	
	//print 1 to N using backtracking (Functional Recursion)
	public static void printBackTrack(int curr, int n) {
		if(curr<1) {
			return;
		}
		printBackTrack(curr-1,n);
		System.out.println(curr);
	}
	
	//Print numbers from N to 1
	public static void printNum2(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNum2(n-1);
	}
	
	//Print numbers from N to 1 using backtracking
	public static void printNumBackTrack(int curr, int n) {
		if(curr>n) {
			return;
		}
		printNumBackTrack(curr+1,n);
		System.out.println(curr);
	}
	
	//Sum of numbers from 1 to N
	public static int sum(int N) {
		if(N==1) {
			return 1;
		}
		return N+sum(N-1);
	}
	
	//Sum of numbers from current to N
	public static int sum2(int curr, int N) {
	    if (curr > N) { 
	        return 0; 
	    }
	    return curr + sum2(curr + 1, N);	
	}
	
	
	//Sum of digits in a number
	public static int sumOfDigits(int N) {
		if(N==0) {
			return 0;
		}
		return (N%10)+sumOfDigits(N/10);
	}
	
	//Product of digits
	public static int productOfDigits(int num) {
        if (num % 10 == num) {
            return num;
        }
        return (num % 10) * productOfDigits(num / 10);
    }
	
	public static void main(String[] args) {
		System.out.println("Called hello function for n=3 :");
		hello(3);
		
		System.out.println("Called goodMor function for n=3 :");
		goodMor(1,3);
		
		System.out.println("Printing numbers from 1 to 5: ");
		printNum(1,5);
		
		System.out.println("Printing numbers from 5 to 1:");
		printNum2(5);
		
		System.out.println("Printing from 1 to 5 using backtracking:");
		printBackTrack(5,5);
		
		System.out.println("Printing numbers from 5 to 1 using backtracking: ");
		printNumBackTrack(1,5);
		
		System.out.println("Sum of values from 1 to 10 is: "+sum(10));
		
		System.out.println("Sum of numbers from 2 to 4 is: "+sum2(2,4));
		
		System.out.println("Sum of digits of number 1342 is: "+sumOfDigits(1342));
		
		System.out.println("Product of digits of number 1342 is: "+productOfDigits(1342));
		

	}

}
