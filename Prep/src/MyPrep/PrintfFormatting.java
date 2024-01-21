package MyPrep;

public class PrintfFormatting {

	public static void main(String[] args) {
		int num = 10;
		float f = 10.25f;
		double d = 10.2558;
		String s = "Namaste";
		
		//Displaying using printf()
		System.out.printf("%d %f %f %s \n",num, f, d, s);
		
		//Converting a decimal number to hexadecimal
		System.out.printf("%x \n",num);
		
		//Converting a number to octal number
		System.out.printf("%o \n", num);
		
		//Formating of integers
		int p =73;
		
		System.out.printf("|%20d| \n",p);
		System.out.printf("|%-20d| \n",p);
		System.out.printf("|%20d| \n",-p);
		
		//Formatting of float numbers
		float q = 10.99999f;
		System.out.printf("|%15f| \n",q);
		System.out.printf("|%-15f| \n", q);
		System.out.printf("|%.2f| \n",q);
		System.out.printf("|%15.2f| \n",q);
		System.out.printf("|%-15.2f| \n",q);
		System.out.printf("|%15.1f| \n",-q);
		System.out.printf("%e \n",q);            //default exponential format
		System.out.printf("%A \n", q);           //Hexadecimal representation of float number

		
		//Formatting of string
		String str = "Greetings to all";
		System.out.printf("%.11s \n",str);
		System.out.printf("|%15.3s| \n",str);
		System.out.printf("|%-15.3s| \n",str);
	}

}
