package basic_programs;
import java.util.Scanner;
public class PermuAndCombi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of objects, n: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of objects to be selected, k: ");
		int k = sc.nextInt();
		
		int num =n-k;
		
		int factn=n, factk=k, factnum=num;
		
		for(int i=n-1;i>=1;i--) 
			factn = factn*i;
		
		for(int i=k-1;i>=1;i--) 
			factk = factk*i;
		
		for(int i=num-1;i>=1;i--)
			factnum = factnum*i;
		
		double permu = (double)(factn/factnum);
		System.out.println("Permuataion is : "+permu);
		
		double comb = (double)((factn)/(factnum*factk));
		System.out.println("Combination is: "+comb);
	}

}
