package BasicMaths;
import java.util.*;

public class RomanToInt {
	
	public static int romanToInt(String roman) {
		if(roman.equals(0)) {
			return 0;
		}
		
		HashMap<Character, Integer> myMap = new HashMap<>();
		myMap.put('I',1);
		myMap.put('V', 5);
		myMap.put('X',10);
		myMap.put('L', 50);
		myMap.put('C',100);
		myMap.put('D',500);
		myMap.put('M',1000);
		
		int prev = 0;
		int sum = 0;
		for(int i=roman.length()-1; i>=0;i--) {
			int currVal = myMap.get(roman.charAt(i));
			if(currVal<prev) {
				currVal = prev-currVal;
				sum =currVal;	
				prev = currVal;
			}else {
				sum+=currVal;
				prev = currVal;
			}
		}
		return sum;	
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman number in capitalised format: ");
		String romanNum = sc.nextLine();
		
		System.out.println("The equivalent decimal number of "+romanNum+" is: ");
		int deci = romanToInt(romanNum);
		System.out.print(deci);

	}

}
