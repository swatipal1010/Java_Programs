import java.util.Scanner;

class Input{
	
	public double commCalc(double sales) {
		double commission;
		
		if(sales>5000) {
			commission = (sales-5000)*0.12;
		}else {
			commission = 0;
		}
		return commission;
	}
	
	public double renumeration(double fsal, double comm) {
		double total_renumeration = fsal+comm;
		return total_renumeration;
	}
	
}

public class RemunerationCalc {

	public static void main(String[] args) {
		double fixed_salary, sales;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fixed salary of the employee: ");
		fixed_salary = sc.nextDouble();
		
		System.out.println("Enter the sales made by the employee (in dollars): ");
		sales = sc.nextDouble();
		
		Input obj = new Input();
		
		double commission = obj.commCalc(sales);
		System.out.println("Commision earned by the employee: "+commission);
		
		
		double remuneration = obj.renumeration(fixed_salary,commission);
		System.out.println("Total remuneration for an employee is: "+remuneration);

	}

}
