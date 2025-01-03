package revision;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        int freq[] = new int[str.length()];
        char arr[] = str.toCharArray();
        
        for(int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for(int j = i + 1; j < str.length(); j++) {
                if(arr[i] == arr[j] && arr[i] != '0') {
                    freq[i]++;
                    arr[j] = '0'; 								// To mark visited characters as '0'
                }
            }
        }
        
        System.out.println("Characters with their frequency: ");
        for(int i = 0; i < str.length(); i++) {
            if(arr[i] != ' ' && arr[i] != '0') {
                System.out.println(arr[i] + ":" + freq[i]);
            }
        }
    }
}


