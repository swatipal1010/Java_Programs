package InterFace;

interface Cab{
	void bookCab();
}

class UberX implements Cab{
	 public void bookCab() {
		System.out.println("UberX booked!! Arriving soon!!");
	}
}


public class FunctionalInterface1 {

	public static void main(String[] args) {
		Cab cab = new UberX();					// --> METHOD-1 to use interface method
		cab.bookCab();

	}

}
