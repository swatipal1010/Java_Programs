package LAB7;
//2)	Write a Java program to enable the user to handle any chance of divide by zero exception.
public class Lab7_B {
	public static void main(String[] args) {
        try{
            int data=100/0;
        }catch(ArithmeticException e){System.out.println(e);}
        System.out.println("rest of the code");
        }
}
