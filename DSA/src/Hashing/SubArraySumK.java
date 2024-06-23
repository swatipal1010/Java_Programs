package Hashing;

public class SubArraySumK {
	//Method-1
	public static int subArraySum(int[] arr, int k) {
		int count =0;
		
		for(int i=0; i<arr.length;i++) {
			int sum =0;
			for(int j=i;j<arr.length; j++) {
				sum += arr[j];
				if(sum==k) {
					count++;
				}
			}
		}
		return count;
	}
	
	//Method-2 Using prefix sum
	public static int subArrayPrefix(int arr[], int k) {
		int prefixArr[] = new int[arr.length];
		int n = arr.length;
		
		//Creating prefix array
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			prefixArr[i] = sum;
		}
		
		
		int count =0;
        // Check all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Sum of subarray nums[start...end]
                int subarraySum = prefixArr[end];
                if (start > 0) {
                    subarraySum -= prefixArr[start - 1];
                }
                if (subarraySum == k) {
                    count++;
                }
            }
        }

        return count;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,1,1};
		int k = 2;
		int count1 = subArraySum(arr,k);
		System.out.println("Number of subarrays having sum equal to 2 are: "+count1);
		
		int count2 = subArrayPrefix(arr,k);
		System.out.println("Number of subarrays having sum equal to 2 (using prefix sumarray) are: "+count2);

	}

}
