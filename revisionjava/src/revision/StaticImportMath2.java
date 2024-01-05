package revision;
import static java.lang.Math.*;

public class StaticImportMath2 {

	public static void main(String[] args) {
		int a =10;
		int b = 100;
		
		System.out.println("Cosine of 30 degrees is = "+ cos(30*3.14159/180));
		System.out.println("Cosine of 60 degrees is = "+ cos(60*3.14159/180));
		System.out.println("log10 of 100 = "+ log10(100));
		
		System.out.println("Cube root of (a*b) = "+ cbrt(a*b));
		System.out.println("Square root of 100 = "+ sqrt(100));
	}

}
