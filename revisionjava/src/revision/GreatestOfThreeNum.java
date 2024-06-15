package revision;
import java.util.Scanner;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		int p = sc.nextInt();
		
		
		//METHOD-1
		int max1 = (n>m?n:m)>p ? (n>m?n:m) : p ;
		int max2 = (m>n) ? (m>p?m:p) : (n>p?n:p) ;
		System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ max1); 
		System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ max2); 
		
		//METHOD-2
		int maxNum;
		if(m>n) {
			if(m>p) {
				maxNum = m;
				System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ maxNum);
			}
			else {
				maxNum = p;
				System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ maxNum);
			}
		}
		else {
			if(n>p) {
				maxNum=n;
				System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ maxNum);
			}	
			else {
				maxNum=p;
				System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ maxNum);
			}		
		}
		
		//Method-3
		int max3;
		if(m>n && m>p) {
			max3 = m;
			System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ max3);
		}
		else if(n>m && n>p){
			max3 = n;
			System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ max3);
		}else {
			max3 = p;
			System.out.println("The greatest number among "+ m +",  "+ n +" " + "and " +p+ " is: "+ max3);
		}
		

	}

}
