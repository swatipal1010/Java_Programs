package BasicMaths;
import java.util.Scanner;

public class PowerOfThree {
	
	//Method-1
	public static boolean isPowerOfThree1(int n) {
		if(n<=0){
			return false;
	    }
	    if(n==1){
	        return true;
	    }
	    while(0<n){
	        if(n%3!=0){
	        	return false;
	        }
	        n/=3;
	        if(n==1){
	            return true;
	        }
	    }
	    return false;
	}
	
	//Method-2
	public static boolean isPowerOfThree2(int n) {
        if(n==1){
            return true;
        }
        if(n==0 || n%3!=0){
            return false;
        }
        return isPowerOfThree2(n/3);
    }
	
	
	//Method-3
	public static boolean isPowerOfThree3(int n) {
        for (int i = 0; i < 31; i++) {
            double pow = Math.pow(3, i);
            if (pow == n) {
                return true;
            }
        }
        return false;
    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Is "+num+" a power of 3 number? "+isPowerOfThree1(num));
		System.out.println("Is "+num+" a power of 3 number? "+isPowerOfThree2(num));
		System.out.println("Is "+num+" a power of 3 number? "+isPowerOfThree3(num));

	}

}
