package MyPrep;
import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        
        // Assuming maximum number of bits required for binary representation
        int[] arr = new int[32];
        
        int index = 0;
        int originalN = n;
        
        // Convert decimal to binary
        while (n > 0) {
            arr[index++] = n % 2;
            n = n / 2;
        }
        
        // Print binary equivalent
        System.out.println("Binary equivalent of " + originalN + " is: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        
        sc.close();
    }
}
