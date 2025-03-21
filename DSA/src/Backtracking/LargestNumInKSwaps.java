package Backtracking;
import java.util.Scanner;

public class LargestNumInKSwaps {

    public static void swap(char[] charArr, int i, int index) {
        char temp = charArr[index];
        charArr[index] = charArr[i];
        charArr[i] = temp;
    }

    public static char maxDigit(char[] numArr, int start, int end) {
        char maxDigit = numArr[start];
        for (int i = start + 1; i <= end; i++) {
            if (numArr[i] > maxDigit) {
                maxDigit = numArr[i];
            }
        }
        return maxDigit;
    }

    public static void largestNum(char[] charArr, int k, int index, String[] result) {
        if (k == 0 || index == charArr.length - 1) {
            return;
        }

        char maxChar = maxDigit(charArr, index, charArr.length - 1);

        if (maxChar != charArr[index]) {
            for (int i = index + 1; i < charArr.length; i++) {
                if (charArr[i] == maxChar) {
                    swap(charArr, i, index);
                    
                    String currentNum = new String(charArr);
                    if (currentNum.compareTo(result[0]) > 0) {
                        result[0] = currentNum;
                    }

                    largestNum(charArr, k - 1, index + 1, result);
                    swap(charArr, i, index);
                }
            }
        } else {
            largestNum(charArr, k, index + 1, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = sc.nextLine();

        System.out.println("Enter the number of swaps: ");
        int k = sc.nextInt();

        char[] charArr = str.toCharArray();
        String[] result = { str }; 

        largestNum(charArr, k, 0, result);
        System.out.println("Largest number made out of " + str + " after " + k + " swaps is: " + result[0]);

        sc.close();
    }
}
