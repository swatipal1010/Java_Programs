package InterFace;

interface Cab1{
	void bookCab();
}


public class FunctionalInterface2 {

	public static void main(String[] args) {
		// ANONYMOUS CLASS
		Cab1 cab = new Cab1() {			// METHOD-2 to use interface method
			public void bookCab() {
				System.out.println("UberX booked!! Arriving soon!!");
			}
		};
		
		cab.bookCab();

	}

}
