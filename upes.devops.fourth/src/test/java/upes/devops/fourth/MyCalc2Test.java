package upes.devops.fourth;
import 
import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalc2Test {

	@Test
	public void test() {
		MyCalculator obj = new MyCalculator();
			assertEquals(25,obj.sum(20,5));
	}

}
