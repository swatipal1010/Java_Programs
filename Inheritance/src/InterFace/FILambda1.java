package InterFace;

interface Cab2{
	void bookCab();
}

public class FILambda1 {

	public static void main(String[] args) {
		//USING LAMBDA EXPRESSION
		Cab2 cab = ()-> {				//METHOD-3 to use interface method
			System.out.println("UberX booked!! Arriving soon!!");
		};
		cab.bookCab();
	}

}
