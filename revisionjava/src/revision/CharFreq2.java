package revision;
import java.util.Scanner;


public class CharFreq2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str = sc.nextLine();
	        
	        int len = str.length();
	        char arr[] = str.toCharArray();
	        int freq[] = new int[len];
	        
	        //To count the characters
	        for(int i=0; i<len; i++){
	            int count = 1;
	            for(int j=i+1; j<len; j++){
	                if(arr[j]==arr[i]){
	                    count++;
	                    arr[j]='0';
	                }
	                freq[i]=count;
	            }
	        }
	        
	        //To print the frequency of each character
	        for(int i=0; i<len; i++){
	            if(arr[i]==' ' || arr[i]=='0'){
	                continue;
	            }else
	            	System.out.println(arr[i]+":"+freq[i]);
	        }
	    
	}
}
