package Recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class DiceSum {
	
	//Method 1: Printing combinations
	public static void diceSum(String combination, int target) {
		if(target==0) {
			System.out.print(combination+" ");
			return;
		}
		for(int i=1; i<=6 && i<=target; i++) {
			diceSum(combination+i,target-i);
		}
	}
	
	
	//Method 2: Returning list of combinations
	public static ArrayList<String> diceSum2(String comb, int target){
		ArrayList<String> combination = new ArrayList<>();
		if(target==0) {
			combination.add(comb);
			return combination;
		}
		for(int i=1; i<=6 && i<=target; i++) {
			combination.addAll(diceSum2(comb+i,target-i));
		}
		return combination;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose sum you want to find: ");
		int num = sc.nextInt();
		
		diceSum(" ",num);
		
		System.out.println();
		ArrayList<String> ansList = diceSum2(" ",num);
		System.out.println("Combinations of numbers of dice that forms the sum of "+num+" are: "+ansList);

		sc.close();
	}

}
