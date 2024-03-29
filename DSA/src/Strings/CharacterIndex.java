package Strings;
import java.util.Scanner;

public class CharacterIndex {
	public static int checkChar(String str, char ch) {
		int len = str.length();
		int i =0;
		while(i<=len-1) {
			if(str.charAt(i)==ch)
				return i;
			i++;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		System.out.println("Enter the target character of the string: ");
		char ch = sc.next().charAt(0);										//To take character input
		
		int index = checkChar(str, ch);
		
		if(index!=-1) {
			System.out.println("Target character "+"\'"+ch+"\'"+" is found at index "+index);
		}else {
			System.out.println("Character not found.");
		}

	}

}
