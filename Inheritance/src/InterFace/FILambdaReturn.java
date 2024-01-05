package InterFace;

interface CabB{
	double bookCab(String source, String destination);
}


public class FILambdaReturn {

	public static void main(String[] args) {
		CabB cab = (source, destination) -> {
			System.out.println("UberX booked from "+ source+ " to "+ destination+ "!! Arriving soon!!");
			return 830.56;		//Return statement mentioned
		};
		double fare = cab.bookCab("PremNagar", "ClockTower");
		System.out.println("Fare shall be : "+fare);
	}

}
