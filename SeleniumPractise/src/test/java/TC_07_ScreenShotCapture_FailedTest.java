import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(CustomerListeners.class)
public class TC_07_ScreenShotCapture_FailedTest extends Base{
	
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void screenShotonFailure1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void screenShotonFailure2()
	{
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void screenShotonFailure3()
	{
		Assert.assertEquals(false, true);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
