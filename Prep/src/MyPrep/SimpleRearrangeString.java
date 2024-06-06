package MyPrep;

import java.util.Arrays;

public class SimpleRearrangeString {

    public static String rearrangeString(String str) {
        int[] charCount = new int[26]; // Assuming input contains only lowercase English letters

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Sort the characters based on their frequency
        int n = str.length();
        char[] result = new char[n];
        int index = 0;

        for (int i = 0; i < 26; i++) {
            while (charCount[i] > 0) {
                result[index] = (char) (i + 'a');
                index += 2;
                if (index >= n) {
                    index = 1;
                }
                charCount[i]--;
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String input = "aabbb";
        String result = rearrangeString(input);
        System.out.println("Rearranged String: " + result);
    }
}

