import static org.junit.Assert.*;

import org.junit.Test;

import MyPkg3.MyCalc;

public class MyCalcTest {

	@Test
	public void test() {
		MyCalc obj = new MyCalc();
		
		assertEquals(25, obj.sum(5, 20));
		assertEquals(100, obj.mul(5, 20));
	}

}
