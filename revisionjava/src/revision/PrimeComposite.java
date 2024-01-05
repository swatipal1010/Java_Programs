package revision;
import java.util.Scanner;

public class PrimeComposite {

	public static void main(String[] args) {
		        int count =0,i;
		        System.out.println("Enter the number: ");
		        Scanner sc = new Scanner(System.in); 
		        int num = sc.nextInt();
		        
		        for(i=2; i<num; i++){
		                if(num%i == 0)
		                {
		                        System.out.println(num +" "+ "is a composite");
		                }
		        }
		        if(i == num)
		             System.out.println(num+ " " +"is a prime number");
		       
		}

			


	}


