package InterFace;

interface CabA{
	void bookCab(String source, String destination);
}


public class FILambdaPrmtzd1 {

	public static void main(String[] args) {
		CabA cab = (source, destination) -> {		//PARAMETRIZED LAMBDA EXPRESSION
			System.out.println("UberX booked from "+ source + " to " + destination+ "!! Arriving soon!!");
		};
		cab.bookCab("Premnagar", "ClockTower");

	}

}
