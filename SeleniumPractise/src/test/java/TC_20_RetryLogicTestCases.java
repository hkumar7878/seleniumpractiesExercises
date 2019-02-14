

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_20_RetryLogicTestCases {

	
	
	@Test(retryAnalyzer=Analyzer.CustomRetryAnalyzer.class)
	public void test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, false);
	}
}
