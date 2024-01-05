package LAB6_Another;

import java.util.Arrays;
import LAB6.*;

public class Lab6_A_SubPack {
	public static void main(String[] args) {
		Lab6_A obj =new Lab6_A();
        obj.msg();
        int Arr[]={2,4,1,5,6};
        Arrays.sort(Arr);
 System.out.println("Integer Array: "
                           + Arrays.toString(Arr)); 
        Lab6_A obj1=new Lab6_A();//using the balance package
        System.out.println(obj1.display_balance(100));
 
    } 
}
