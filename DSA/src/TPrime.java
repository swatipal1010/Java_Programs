
import java.util.*;

public class TPrime{

		    static String[] TPrime(int arr[]) {
		        String[] response = new String[arr.length];
		        for (int i = 0; i < arr.length; i++) {
		            int count = 2;										//count set to 1 because each number have 1 and number itself as its divisor
		            int j;				
		            for (j = 2; j <= Math.sqrt(arr[i]); j++) {
		                if (arr[i] % j == 0) {
		                    count++;
		                    if (count > 3) {
		                        break;
		                    }
		                }
		            }
		            if (count == 3 && Math.sqrt(arr[i]) == (int) Math.sqrt(arr[i]))  {
		                response[i] = "YES";
		            } else {
		                response[i] = "NO";
		            }
		        }
		        return response;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Enter the size of the array: ");
		        int n = sc.nextInt();
		        int arr[] = new int[n];
		        
		        System.out.println("Enter the elements in the array: ");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        String[] response = TPrime(arr);
		        
		        System.out.println("Responses collected:-");
		        for (int i = 0; i < n; i++) {
		            System.out.println(arr[i]+" : "+response[i]);
		        }
		    }
		


	}


