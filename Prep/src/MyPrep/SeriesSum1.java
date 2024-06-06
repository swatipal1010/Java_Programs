package MyPrep;

//Sum of the series of type 1+ 1/2! + 1/3! + 1/4! + 1/5! + 1/6! + .......

public class SeriesSum1 {

	public static void main(String[] args) {
		double precision = 0.0001;
		double sum = 0;
		double term = 1.0;
		int num =1;
		
		while(term>precision) {
			term = 1/fact(num);
			sum = sum+term;
			num++;
		}

		System.out.println("Sum of series upto precision 0.0001 is: "+sum);
	}
	public static int fact(int a) {
		int fact =1;
		while(a>0) {
		   fact = fact*a;
		   a--;
		}
		return fact;
	}

}
