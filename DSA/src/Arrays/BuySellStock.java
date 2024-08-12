package Arrays;

import java.util.Scanner;

public class BuySellStock {
	
	    public static int maxProfit(int[] prices) {
	        int minPrice = Integer.MAX_VALUE;
	        int maxProfit = 0;
	        
	        for (int price : prices) {
	            if (price < minPrice) {
	                minPrice = price; // Update the minimum price encountered so far
	            } else if (price - minPrice > maxProfit) {
	                maxProfit = price - minPrice; // Update the maximum profit if selling at this price is more profitable
	            }
	        } 
	        return maxProfit;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you will add into the array: ");
		int size = sc.nextInt();
		
		int stockArr[] = new int[size];
		System.out.println("Enter the price of stock for "+size+" days: ");
		for(int i=0; i<stockArr.length; i++) {
			stockArr[i] = sc.nextInt();
		}
		
		int result = maxProfit(stockArr);
		System.out.println("The maximum profit that can be obtained is: "+result);

	}

}
