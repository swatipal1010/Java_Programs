package Strings;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;

public class FrequencyOfChars {
	
	//METHOD:1 Using HashMap
	public static HashMap<Character, Integer> countChars(String str){
		HashMap<Character, Integer> ans = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			if(ans.containsKey(currentChar)) {
				ans.put(currentChar, ans.get(currentChar)+1);  	 //If key already exists in the HashMap, increase it's value by 1
			}else {
				ans.put(currentChar, 1);						//If it's a new key(character), insert it with its value as 1
			}
		}
		return ans;
	}
	
	//METHOD:2 Using arrays
	public static int[] countChars2(char[] arr) {
		int freq[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]==arr[i] && arr[i]!='0') {
					count++;
					arr[j]='0';
				}
			}
			freq[i]=count;
		}
		return freq;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> ans = countChars(str.toLowerCase());
		
		for (Map.Entry<Character, Integer> entry : ans.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
		
		char arr2[] = str.toCharArray();
		int[] ansArray = countChars2(arr2);
		
		System.out.println("Frequencies of each character in the string "+str+" is: ");
		int j = 0;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]!='0') {
				System.out.println(arr2[i] +" : "+ansArray[j++]);
			}
		}
	}

}
