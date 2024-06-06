import java.util.Scanner;

public class DivisorCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;

        System.out.print("Divisors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal number of divisors: " + count);

        scanner.close();
    }
}
