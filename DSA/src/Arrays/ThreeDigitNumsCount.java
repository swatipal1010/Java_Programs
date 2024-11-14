package Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ThreeDigitNumsCount {

	public static int[] countNums(int[] nums) {
		int freqMap[] = new int[10];
		List<Integer> list = new ArrayList<>();
		
		//Count the frequency of each digit in the array
		for(int i=0; i<nums.length; i++) {
			freqMap[nums[i]]++;
		}
		
		
		int countDigFreq[] = new int[10];
		for(int i=100; i<1000; i+=2) {
			Arrays.fill(countDigFreq, 0);
			
			int temp =i;
			while(temp>0) {
				int index = temp%10;
				countDigFreq[index]++;
				temp = temp/10;
			}
			
			boolean numPossible = isNumPossible(countDigFreq, freqMap);
			if(numPossible) {
				list.add(i);
			}
		}
		
		int ans[] = new int[list.size()];
		for(int i=0; i<ans.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
	
	
	public static boolean isNumPossible(int[] countDigFreq, int[] freqMap) {
		for(int i=0; i<10; i++) {
			if(countDigFreq[i]>freqMap[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements array will have: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements as single digits in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array of digits is: "+Arrays.toString(arr));
		
		int ansArray[] = countNums(arr);
		System.out.println("Three digit number formed using "+Arrays.toString(arr)+" are: "+Arrays.toString(ansArray));
	}

}
