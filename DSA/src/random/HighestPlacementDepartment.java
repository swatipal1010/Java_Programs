package random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HighestPlacementDepartment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CSE placements: ");
		int cse = sc.nextInt();
		
		System.out.println("Enter the ECE placements: ");
		int ece = sc.nextInt();
		
		System.out.println("Enter the number of MECH placements: ");
		int mech = sc.nextInt();
		
		
		//Method-1
		int arr[] = new int[3];
		arr[0] = cse;
		arr[1] = ece;
		arr[2] = mech;
		
		if(ece>=0 && cse>=0 && mech>=0) {
		int maxNum = arr[0];
		for(int maxPlacement : arr) {
			if(maxPlacement>maxNum) {
				maxNum=maxPlacement;
			}
		}
		System.out.println("Maximum placements in a department: "+maxNum);
		}else {
			System.out.println("Invalid input");
		}
		
		
		
		//Method-2
		int max=0;
		if(ece>=0 && cse>=0 && mech>=0) {
		max = Math.max(cse, Math.max(ece, mech));
	
        if (cse == max && ece == max && mech == max) {
            System.out.println("None of the department has got the highest placement.");
        } else if (cse == max && ece == max) {
            System.out.println("CSE and ECE have the maximum placements.");
        } else if (cse == max && mech == max) {
            System.out.println("CSE and MECH have the maximum placements.");
        } else if (ece == max && mech == max) {
            System.out.println("ECE and MECH have the maximum placements.");
        } else if (cse == max) {
            System.out.println("CSE has the maximum placements.");
        } else if (ece == max) {
            System.out.println("ECE has the maximum placements.");
        } else if (mech == max) {
            System.out.println("MECH has the maximum placements.");
        }
		}
        else {
        	System.out.println("Invalid Input");
        }
		
		
		//Method-3
		int maxP1 = (cse > ece && cse > mech)?cse :(ece>mech?ece:mech);
		int maxP2 = cse>ece ? (cse>mech?cse:mech) : (ece>mech?ece:mech);
		int maxP3 = (cse>ece?cse:ece)>mech ? (cse>ece?cse:ece) : mech;
		System.out.println("Maximum placement record is: "+maxP1+" "+ maxP2+" "+ maxP3);
		
		
		//Method -4(print the departments along with the count of placements)
		Map<Integer, String> mapPlacement = new HashMap<>();
		mapPlacement.put(cse,"cse");
		mapPlacement.put(ece,"ece");
		mapPlacement.put(mech,"mech");
		
		int temp=0;
		 for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] < arr[j]) { // Sort in descending order
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
		System.out.println("Sorted array in descending order is: ");
		for(int x : arr) {
			System.out.println(mapPlacement.get(x)+" : "+ x);
		}
		
		
		sc.close();
}
}
