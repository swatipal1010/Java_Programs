import org.testng.Assert;
import org.testng.annotations.Test;

public class LuggageChargeTest {
    Charge obj1 = new Charge();

    @Test
    public void testChargeForZeroWeight() {
        Assert.assertEquals(obj1.charge(0), 0.0, 0.001);
    }

    @Test
    public void testChargeForWeight39() {
        Assert.assertEquals(obj1.charge(39), 5.75, 0.001);
    }

    @Test
    public void testChargeForWeight40() {
        Assert.assertEquals(obj1.charge(40), 5.75, 0.001);
    }

    @Test
    public void testChargeForWeight41() {
        Assert.assertEquals(obj1.charge(41), 9.629, 0.001);
    }

    @Test
    public void testChargeForWeight499() {
        Assert.assertEquals(obj1.charge(499), 106.63, 0.001);
    }

    @Test
    public void testChargeForWeight500() {
        Assert.assertEquals(obj1.charge(500), 106.63, 0.001);
    }

    @Test
    public void testChargeForWeight501() {
        Assert.assertEquals(obj1.charge(501), 107.3, 0.001);
    }
}
