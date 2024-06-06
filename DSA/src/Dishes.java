import java.util.*;
public class Dishes {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int t = scanner.nextInt();
		        for (int i = 0; i < t; i++) {
		            int n = scanner.nextInt();
		            int k = scanner.nextInt();
		            int[] a = new int[n];
		            for (int j = 0; j < n; j++) {
		                a[j] = scanner.nextInt();
		            }
		            Arrays.sort(a);
		            int min = Integer.MAX_VALUE;
		            for (int j = 0; j < n; j++) {
		                int count = 0;
		                for (int l = j + 1; l < n; l++) {
		                    if (Math.abs(a[l] - a[j]) > k) {
		                        count++;
		                    }
		                }
		                min = Math.min(min, count);
		            }
		            System.out.println(min);
		        }
		   }
}

