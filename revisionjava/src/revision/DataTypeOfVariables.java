package revision;
import java.util.Scanner;

public class DataTypeOfVariables {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the age of employee: ");
	 int age = sc.nextInt();
	 sc.nextLine(); // Consume the newline character after reading the int
	 //System.out.println("");
	 
	 System.out.print("Enter the name of the employee: ");
	 String name = sc.nextLine();
	 //System.out.println("");
	 
	 System.out.print("Is the person employed: ");
	 boolean isEmployed = sc.hasNextBoolean();
	 System.out.println(isEmployed);
	 
	 /* 'Object' class is used to perform casting to ensure that the correct getClass() method is called 
	 to get the data type of each variable.*/
	 
	 System.out.println("age = "+age + " has datatype "+ ((Object)age).getClass().getSimpleName());
	 System.out.println("name= "+name + " has datatype "+ name.getClass().getSimpleName());
	 System.out.println("isEmployed= "+isEmployed+ " has datatype "+ ((Object)isEmployed).getClass().getSimpleName());
	}

}
