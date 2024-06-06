import java.util.Scanner;

public class TPrime3 {

    // Function to check whether the number has exactly 3 divisors
    static boolean hasExactlyThreeDivisors(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num && isPrime(sqrt);
    }

    // Function to check whether a number is prime
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

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("T-Prime numbers in the array are: ");
        for (int j = 0; j < size; j++) {
            if (hasExactlyThreeDivisors(arr[j])) {
                System.out.println(arr[j] + " : YES");
            } else {
                System.out.println(arr[j] + " : NO");
            }
        }

        sc.close();
    }
}
