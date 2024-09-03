package Strings;
import java.util.*;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapST.containsKey(charS)) {
                if (mapST.get(charS) != charT) {
                    return false;
                }
            } else {
                mapST.put(charS, charT);
            }

            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) {
                    return false;
                }
            } else {
                mapTS.put(charT, charS);
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s = sc.nextLine();
		
		System.out.println("Enter the second string: ");
		String t = sc.nextLine();
		
		boolean result = isIsomorphic(s,t);
		System.out.println("Are "+s+" and "+t+" isomorphic? "+result);

	}

}
