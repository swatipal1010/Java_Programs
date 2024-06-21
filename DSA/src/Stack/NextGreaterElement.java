package Stack;
import java.util.*;

public class NextGreaterElement {

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
