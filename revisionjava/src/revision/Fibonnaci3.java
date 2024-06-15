package revision;
import java.util.Scanner;

class MyFibonacci{
    public int fib(int num) {
        if(num <= 1) 
            return num;
        else 
            return fib(num - 2) + fib(num - 1);
    }
}

public class Fibonnaci3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of the Fibonacci series: ");
        int terms = sc.nextInt();
        
        MyFibonacci obj = new MyFibonacci();
        
        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(obj.fib(i) + " ");
        }
    }
}
