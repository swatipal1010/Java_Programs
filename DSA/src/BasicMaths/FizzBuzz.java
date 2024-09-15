package BasicMaths;
import java.util.*;

public class FizzBuzz {
	
	public static ArrayList fizzBuzz(int n) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ans.add(
                i % 15 == 0 ? "FizzBuzz" :
                i % 5 == 0  ? "Buzz" :
                i % 3 == 0  ? "Fizz" :
                String.valueOf(i)
            );
        }
        return ans;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		ArrayList<String> result = fizzBuzz(num);
		System.out.println(result);

	}

}
