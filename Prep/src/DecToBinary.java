import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        

        System.out.println("Binary equivalent of "+n+" is: ");
        while(n>=1){
            int temp =n;
            temp = temp%2;
            System.out.print(temp);
            n = n/2;
        }
       sc.close();
    }
}
