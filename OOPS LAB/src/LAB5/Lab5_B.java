package LAB5;
/**2)	Write a program to create interface A, in this interface we have two method meth1 and meth2. 
Implements this interface in another class named MyClass.**/

import java.util.Scanner;

interface A{//declaring methods
int add(int n, int p);
int sub(int n,int p);
}


public class Lab5_B implements A {
	public int add(int n, int p){
		return n+p;
		}
		public int sub(int n,int p){
		return n-p;
		}
		public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("Enter the value of p : ");
		int p=sc.nextInt();
		Lab5_B obj =new Lab5_B();
		System.out.println(obj.add(n,p));
		System.out.println(obj.sub(n,p));
		}
}
