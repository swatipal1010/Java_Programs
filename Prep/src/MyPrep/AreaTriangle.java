package MyPrep;
import java.util.Scanner;

public class AreaTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle: ");
        float s1 = sc.nextFloat();

        System.out.println("Enter the second side of the triangle: ");
        float s2 = sc.nextFloat();

        System.out.println("Enter the third side of the triangle: ");
        float s3 = sc.nextFloat();

        // Calculate the semi-perimeter with floating-point arithmetic
        float s = (s1 + s2 + s3) / 2;
        
        // Calculate the area using Heron's formula
        float num = s * (s - s1) * (s - s2) * (s - s3);
        float area = (float) Math.sqrt(num);

        System.out.println("Area of the triangle is: " + area);
    }
}
