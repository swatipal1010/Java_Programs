package BitManipulation;
import java.util.Scanner;

public class BasicPrograms {
	
	//Method to check whether given number is odd or even
	public static String checkOddEven(int num) {
		if((num&1)==1) {
			return "Odd";
		}
		return "Even";
	}
	
	//Method to find the non-duplicate number
	public static int nonDuplicate(int[] arr) {
		int num = 0;
		for(int i=1; i<arr.length; i++) {
			num = arr[i-1]^arr[i];
		}
		return num;
	}
	
	//Method to return the  ith bit of a number
	public static int checkIthBit(int num, int i) {
		if((num&(1<<(i-1)))==1) {
			return 1;
		}
		return 0;
	}
	
	//Method to set the ith bit
	public static void setBit(int num, int i) {
		int n = num&(1<<(i-1));
		if(n==1) {
			System.out.println(i+"th bit initially is 1");
		}else {
			System.out.println(i+"th bit initially is 0");
		}
		num = num|(1<<(i-1));
		if(n==1) {
			System.out.println(i+"th bit after resetting is 1");
		}else {
			System.out.println(i+"th bit after resetting is 0");
		}		
	}
	
	//Method to reversing the bit --> Perform XOR of ith bit with 1
	public static void reverseBit(int num, int i) {
		int n = num&(1<<(i-1));
		if(n==1) {
			System.out.println(i+"th bit initially is 1");
		}else {
			System.out.println(i+"th bit initially is 0");
		}
		num = num^(1<<(i-1));
		n = num&(1<<(i-1));
		if(n==1) {
			System.out.println(i+"th bit after reversing is 1");
		}else {
			System.out.println(i+"th bit after reversing is 0");
		}			
	}
	
	//Method to reset the ith bit (Make the ith bit 0)
	public static void resetBit(int num, int i) {
		int n = num&(1<<(i-1));
		if(n==1) {
			System.out.println(i+"th bit initially is 1");
		}else {
			System.out.println(i+"th bit initially is 0");
		}
		num = num&(0<<(i-1));
		n = num&(1<<(i-1));
		if(n==1) {
			System.out.println(i+"th bit after resetting is 1");
		}else {
			System.out.println(i+"th bit after resetting is 0");
		}
		
	}
	
	//Method to return the left most set bit of the given number
	public static int lefttmostSetIndex(int num) {
		int index =0;
		int i =0;
		while(num!=0) {
			int val = num&1;
			num = num>>1;
			index++;
		}
		return index;
	}
	
	//Method to return the right-most set bit of the given number
	public static int rightmostSetBit(int num) {
		int index = 0;
		int val = 0;
		while(val!=1) {
			val = num&1;
			num = num>>1;
		index++;
		}
		return index;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Index of right-most set bit of "+num+" is: "+rightmostSetBit(num));
		
	}
}
