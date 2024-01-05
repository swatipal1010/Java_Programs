package OopsLab3;

public class SumDiv {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=40; i<=250; i++ ) {
			if(i%5 ==0)
				sum = sum+i;
		}
		System.out.println("Sum of numbers between 40 and 250 which are divisible by 5: "+sum);
	}

}
