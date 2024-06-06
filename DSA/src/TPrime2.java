import java.util.Scanner;

public class TPrime2 {

    // Helper method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String[] TPrime(int arr[]) {
        String[] response = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 2; 								// Initialized to 2 since every number has at least 2 divisors: 1 and the number itself
            int j;
            for (j = 2; j * j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    if (count > 3) {
                        break; 							// If count exceeds 3, stop iterating
                    }
                }
            }

            if (count == 3 && isPrime(j) && j * j == arr[i]) {
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
            System.out.println(arr[i] + " : " + response[i]);
        }
    }
}
