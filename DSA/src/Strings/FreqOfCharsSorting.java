package Strings;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

//Sort the characters of the string based on their decreasing order of frequency in the string

public class FreqOfCharsSorting {
	
    public static String frequencySort(String str) {
        // Get occurrence of each character of the string using HashMap where key is the character and value is the frequency of the character
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			if(map.containsKey(currentChar)) {
				map.put(currentChar, map.get(currentChar)+1);  	 
			}else {
				map.put(currentChar, 1);						
			}
		}

		// Convert map entries into a list
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        
        // Sort the list by frequency (descending order)
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        
        // Build the string of characters arranged in decreasing order of their frequency
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            // Manually repeat the character based on its frequency
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }
        
        return result.toString();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		String ans = frequencySort(str);
		System.out.println("String obtained by arranging the characters of " + "\'" + str + "\'" +" in decreasing order of their frequency is: "+ans);
	}
}
