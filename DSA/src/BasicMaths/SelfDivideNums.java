package BasicMaths;
import java.util.*;

public class SelfDivideNums {

	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDivideNums = new ArrayList<>();

        for(int i=left; i<=right; i++){
            int temp = i;
            boolean isSelfDividing = true;
            while(temp!=0){
                int val = temp%10;
                if( val==0 || i%val!=0){
                    isSelfDividing = false;
                    break;
                }
                temp = temp/10;
            }
            if(isSelfDividing){
                selfDivideNums.add(i);
            }
        }

        return selfDivideNums;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the left(first) value of the range: ");
		int left = sc.nextInt();
		
		System.out.println("Enter the right(last) value of the range: ");
		int right = sc.nextInt();
		
		int arr[] = new int[right-left+1];
		
		int j = 0;
		for(int i=left; i<=right; i++) {
			arr[j++] = i;
		}

		System.out.println("Values between "+left+ " and "+right+" are: "+Arrays.toString(arr));
		
		List<Integer> result = selfDividingNumbers(left,right);
		
		System.out.println("Self diving numbers between "+left+" and "+right+" are: "+result);

	}

}
