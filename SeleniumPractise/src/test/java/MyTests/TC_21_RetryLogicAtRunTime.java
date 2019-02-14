package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_21_RetryLogicAtRunTime {
	

	WebDriver driver;
	//WebDriver driver1;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}	
	
	@Test(priority=1)
	public void test1()
	{
		
		
		
		Assert.assertEquals(false, true);
		//driver.findElement(by)
	}
	
	@Test(priority=2)
	public void test2()
	{
		
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
