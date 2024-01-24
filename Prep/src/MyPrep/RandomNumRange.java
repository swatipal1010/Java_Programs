package MyPrep;

public class RandomNumRange {
	//generating the numbers between the range 10 to 1000
	public static void main(String[] args) {
		int num = (int)(Math.random()*(1000-10+1)+1);
		System.out.println("The resulted random number is: "+num);
		
		if(num>=10 && num<=200) 
			System.out.println(num+" lies in the range 10 to 200");
		else if(num>=201 && num<=400)
			System.out.println(num+" lies in the range 201 to 400");
		
		else if(num>=401 && num<=700)
			System.out.println(num+" lies in the range 401 to 700");
		else 
			System.out.println(num+" lies in the range 701 to 1000");

	}

}
