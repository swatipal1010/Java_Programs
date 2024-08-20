package Stack;
import java.util.*;

public class NextGreaterElement {
	
	//METHOD-1  Naive Approach (Time complexity= O(M*N))
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {		//nums1 is subset of nums2
        HashMap<Integer, Integer> nums1Map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) {
            nums1Map.put(nums1[i], i);
        }

        int[] result = new int[nums1.length];
        
        for(int i = 0; i < nums1.length; i++) {
            result[i] = -1;
        }

        for(int i = 0; i < nums2.length; i++) {
            int curr = nums2[i];
            if(nums1Map.containsKey(curr)) {
                for(int j = i + 1; j < nums2.length; j++) {
                    if(nums2[j] > curr) {
                        result[nums1Map.get(curr)] = nums2[j];
                        break; 
                    }
                }
            }
        }
        return result;
    }
	
	
	//METHOD-2 Optimized time complexity 
    public static int[] nextGreater(int[] parent, int[] child) {
        // Creating hashmap of the elements in the child array 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < child.length; i++) {
            map.put(child[i], i);
        }

        Stack<Integer> s = new Stack<>();
        int[] result = new int[child.length];
        
        // Initialize each element with -1
        Arrays.fill(result, -1);
        
        for (int i = 0; i < parent.length; i++) {
            int curr = parent[i];
            
            while (!s.isEmpty() && curr > s.peek()) {
                int nextGrt = s.pop();
                result[map.get(nextGrt)] = curr;
            }
            
            if (map.containsKey(curr)) {
                s.push(curr);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the parent array: ");
        int sizeP = sc.nextInt();
        int[] parentArr = new int[sizeP];
        
        System.out.println("Enter the elements in the parent array:");
        for (int i = 0; i < sizeP; i++) {
            parentArr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of the subarray: ");
        int sizeC = sc.nextInt();
        int[] childArr = new int[sizeC];
        
        System.out.println("Enter the elements in the subarray:");
        for (int i = 0; i < sizeC; i++) {
            childArr[i] = sc.nextInt();
        }
        
        System.out.println("Next largest element for each element of the subarray is: ");
        int[] nextG = nextGreater(parentArr, childArr);
        
        for (int i = 0; i < nextG.length; i++) {
            System.out.print(nextG[i] + " ");
        }
    }
}
