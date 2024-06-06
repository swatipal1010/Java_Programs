import java.util.Scanner;

public class FourDivisors {

	static int smallestA(int d) {
	    int num = d + 1;

	    int[] divisors = new int[4];
        int count = 0;

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (count < 4) {
                    divisors[count++] = i;
                }
                if (i != num / i && count < 4) {
                    divisors[count++] = num / i;
                }
            }
            if(count==4) {
            	break;
            }
        }
	        
	        if(count==4) {
	        	boolean valid = true;
	        	for(int j=0; j<=divisors.length-2; j++) {
	        		if(divisors[j+1]-divisors[j]<d) {
	        			valid = false;
	        		}
	        		if(valid)
	        			return num;
	        	}
	        }
	        
	        return smallestA(++num);
	       
	}


	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of d: ");
		int d = sc.nextInt();
		
		int result = smallestA(d);
		System.out.println("Smallest value being returned: "+result);

	}

}
