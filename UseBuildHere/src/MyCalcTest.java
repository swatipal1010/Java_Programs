import Mypkg.*;
public class MyCalcTest {

		public static void main(String args[]) {
			MyCalc obj = new MyCalc();
			
			System.out.println(obj.sum(20,2));
			System.out.println(obj.diff(20,2));
			System.out.println(obj.mul(20,2));
			System.out.println(obj.div(20,2));
		}
}