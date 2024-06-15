import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest {
    SumOfNum obj = new SumOfNum();

    //Data provider for testing the sum function
    @DataProvider(name = "testData1")
    public Object[][] testData1() {
        return new Object[][] {
            { 0, 0, 0 },					//First two are inputs, third is output
            { 0, 5, 5 },
            { 1, 1, 2 },
            { -1, 0, -1},
            { -1, -1, -2}
        };
    }
    
    //Data provider for testing the sub function
    @DataProvider(name = "testData2")
    public Object[][] testData2() {
        return new Object[][] {
            { 0, 0, 0 },
            { 0, 5, -5 },
            { 1, 1, 0 },
            { -1, 0, -1},
            { -1, -1, 0}
        };
    }
    
    //Data provider for testing mul function 
    @DataProvider(name = "testData3")
    public Object[][] testData3() {
        return new Object[][] {
            { 0, 0, 0 },
            { 0, 5, 0 },
            { 1, 1, 1 },
            { -1, 0, 0},
            { -1, -1, 1}
        };
    }
    
    

    @Test(dataProvider = "testData1")
    public void testSum(int num1, int num2, int expectedResult) {
        int result = obj.sum(num1, num2);
        Assert.assertEquals(result, expectedResult);
    }
    
    
    @Test(dataProvider = "testData2")
    public void testSub(int num1, int num2, int expectedResult) {
        int result = obj.sub(num1, num2);
        Assert.assertEquals(result, expectedResult);
    }
    
    
    @Test(dataProvider = "testData3")
    public void testMul(int num1, int num2, int expectedResult) {
        int result = obj.mul(num1, num2);
        Assert.assertEquals(result, expectedResult);
    }
}



//Without using the DataProvider Annotation
/*
 SumOfNum obj = new SumOfNum();
	
	@Test
	public void TestC1() {
		int res1 = obj.sum(0,0);
		Assert.assertEquals(res1,0);
	}
	
	@Test
	public void TestC2() {
		int res2 = obj.sum(0,5);
		Assert.assertEquals(res2,5);
	}
	
	@Test
	public void TestC3() {
		int res3 = obj.sum(1,1);
		Assert.assertEquals(res3,2);
	}
	
	@Test
	public void TestC4() {
		int res4 = obj.sum(-1,0);
		Assert.assertEquals(res4,-1);
	}
	
	@Test
	public void TestC5() {
		int res5 = obj.sum(-1,-1);
		Assert.assertEquals(res5,-2);
	}*/
