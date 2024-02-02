package MyPrep;
import java.util.Random;

//Generating 10 random numbers between 15 to 20 and calculating their mean
public class RandomNumsMean {

	public static void main(String[] args) {
		Random numRand = new Random();
		
		 int min = 15;
	     int max = 20;
	     int sum =0;
		
	     System.out.println("Random numbers generated between 15 to 20 are: ");
		for( int i=0; i<5; i++) {
			int random = min+numRand.nextInt(max-min+1);
			System.out.println(random);
			sum += random;
		}
		double mean = (double)sum/5;
		System.out.println("Sum of random numbers is: "+sum);
		System.out.println("Mean of the 5 random numbers being generated is: "+mean);

	}

}
