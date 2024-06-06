package MyPrep;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		Map<Character, Integer> keyValueMap = new HashMap<>();
		keyValueMap.put('1',1);
		keyValueMap.put('2',2);
		keyValueMap.put('3',3);
		keyValueMap.put('4',4);
		keyValueMap.put('5',5);
		keyValueMap.put('6',6);
		keyValueMap.put('7',7);
		keyValueMap.put('8',8);
		keyValueMap.put('9',9);
		keyValueMap.put('A',10);
		keyValueMap.put('B',11);
		keyValueMap.put('C',12);
		keyValueMap.put('D',13);
		keyValueMap.put('E',14);
		keyValueMap.put('F',15);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hexadecimal number: ");
		String str = sc.nextLine();
		str = str.toUpperCase();
		//char chrs[] = str.toCharArray();
		int num = str.length();
		
		
		int sum=0;
		System.out.print("The corresonding decimal value is: ");
		for(int i=0; i<num;i++) {
			int decNum = keyValueMap.get(str.charAt(i));          //Considering the decimal numbers from L to R
			sum +=decNum*Math.pow(16, num-1-i);		  // Multiplying with decimal no.s with power of 16 from L to R
		}
		System.out.print(sum);
		
		
		

	}

}
