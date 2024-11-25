package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class NumOfRotations {
	
	public static int findKRotation(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;

        if (arr.get(low) <= arr.get(high)) {
            return 0; 
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < high && arr.get(mid) > arr.get(mid + 1)) {
                return mid + 1;
            }
            if (mid > low && arr.get(mid) < arr.get(mid - 1)) {
                return mid;
            }
            if (arr.get(mid) < arr.get(high)) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return 0; 
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        System.out.println("ArrayList: " + arrayList);
		
		int ans = findKRotation(arrayList);
		System.out.println("Number of rotations made in the list are: "+ans);
		
		scanner.close();

	}

}
