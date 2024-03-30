package Arrays;
import java.util.Scanner;

//grid 'mXn' where [i][j] represents the wealth of the ith person in jth bank account. Return wealth of richest customer.
public class RichestCustomer {

	static int maxAmount(int arr[][]) {
		int greatest=0;
		for(int[] x: arr) {
			int sum =0;
			for(int y: x) {
				sum += y;
			}
			if(sum>greatest)
				greatest= sum;
		}
		return greatest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of customers: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the number of accounts that each customer have in the bank: ");
		int n = sc.nextInt();
		
		int[][] accounts = new int[m][n];
		
		System.out.println("Enter the amount in each bank account of each customer");
		for(int i=0; i<m; i++) {
			System.out.println("Enter the amount for customer "+(i+1)+" bank accounts: ");
			for(int j=0; j<n;j++) {
				System.out.print("Bank Account "+(j+1)+" : ");
				accounts[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		int amount = maxAmount(accounts);
		System.out.println("Richest customer has wealth equal to : "+amount);

	}

}
