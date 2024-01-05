package LAB3;
import java.util.Scanner;

public class Lab3_C {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] array = new int[10]; 
			int n = array.length;
			
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{     
			array[i]=sc.nextInt();  
			}  
			
			System.out.println("Array elements are: ");  
		  
			for (int i=0; i<n; i++)   
			{  
			System.out.print(array[i]); 
			System.out.println(" ");
			} 
			
			for(int i=0; i<n; i++)
			{
				int square = array[i]*array[i];
				System.out.print("Square of "+ array[i] + " is: ");
				array[i] =  square;
				System.out.println(square );
			}
			
			int sum = 0; 
			for(int i=0; i<n; i++)
			{
				sum = sum+array[i];
			}
			System.out.print("Sum of entered values' square: ");
			System.out.println(sum);
			
		}
}
