package revision;
import java.util.Scanner;

public class ElementFreqInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        int occurrences[] = new int[size];
        boolean visited[] = new boolean[size]; 				// To keep track of visited elements
        
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            visited[i] = false; 							// Initialize all elements as not visited
        }
        System.out.println();
        
        System.out.println("Elements in the array are: ");
        for(int j = 0; j < size; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        
        for(int i = 0; i < size; i++) {
            if(!visited[i]) { 								// Check if the element has been visited before
                int count = 1;
                for(int j = i + 1; j < size; j++) {
                    if(array[i] == array[j]) {
                        count++;
                        visited[j] = true; 					// Mark the visited element
                    }
                }
                occurrences[i] = count;
            }
        }
        
        for(int i = 0; i < size; i++) {
            if(!visited[i]) { 								// Only print if the element is not visited
                System.out.println("Frequency of " + array[i] + " : " + occurrences[i]);
            }
        }
    }
}
