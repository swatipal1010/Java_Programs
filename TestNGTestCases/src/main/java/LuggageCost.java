import java.util.Scanner;
class Charge{
	
	double charge(double weight) {
		double cost = 0;
		if(weight<=0) {
			cost =0;
		}
		else if(weight<=40) {
			cost= 5.75;
		}
		else if(weight>40) {
			if(weight<=500) {
				double extWeight = weight-40;
				double interval = (int)((extWeight-1)/18)+1;
				cost = 5.75+interval*3.88;
			}else {
				cost = 5.75+26*3.88+(weight-500)*0.67;
			}
		}
		return cost;
	}
	
}

public class LuggageCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Charge obj = new Charge();
		
		System.out.println("Enter the weight of your luggage: ");
		double weight = sc.nextDouble();
		
		System.out.println("Cost of the luggage is: "+obj.charge(weight));
	}
}
