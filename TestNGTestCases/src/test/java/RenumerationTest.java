import org.testng.Assert;
import org.testng.annotations.Test;

public class RenumerationTest {

	 @Test 
	    public void testCommCalc() {
	        Input input = new Input();
	        
	        // Test case 1: Sales > 5000
	        double commission1 = input.commCalc(6000);
	        Assert.assertEquals(commission1, 120.0);
	        
	        // Test case 2: Sales <= 5000
	        double commission2 = input.commCalc(4000);
	        Assert.assertEquals(commission2, 0.0);
	    }
	 
	  @Test
	    public void testRemunerationCalc() {
	        Input obj = new Input();
	        
	        // Test case 1: Commission earned when sales > 5000
	        double commission1 = obj.commCalc(6000);
	        double totalRemuneration1 = obj.renumeration(1000, commission1);
	        Assert.assertEquals(totalRemuneration1, 1120.0);
	        
	        // Test case 2: Commission earned when sales <= 5000
	        double totalRemuneration2 = obj.renumeration(1000, 4000);
	        Assert.assertEquals(totalRemuneration2, 1000.0);
	    }
	    
}
