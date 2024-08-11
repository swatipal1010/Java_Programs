package Strings;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static String commonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int smallestLen = Integer.MAX_VALUE;
        for (String str : strs) {
            smallestLen = Math.min(smallestLen, str.length());
        }

        char arr[] = new char[smallestLen];
        for (int i = 0; i < smallestLen; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return new String(arr, 0, i);
                }
            }
            arr[i] = ch;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements(strings) you want to store in the strings array: ");
        int size = sc.nextInt();
        
        sc.nextLine(); // Consume the leftover newline character

        String strs[] = new String[size];

        System.out.println("Enter the elements in the string array in lowercase: ");
        for (int i = 0; i < size; i++) {  
            strs[i] = sc.nextLine();
        }

        String ans = commonPrefix(strs);
        System.out.println("Longest common prefix in the given strings present in the array is: " + ans);
    }
}
