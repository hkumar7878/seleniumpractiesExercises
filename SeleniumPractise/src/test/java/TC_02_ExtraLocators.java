import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_ExtraLocators {
	
WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
	
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("http://www.google.com");
		//driver.findElement(By.name(("q"))).sendKeys("Seleniumm");
		
		
		// Implicit wait is used to know its purpose. E.g here the implicit wait will first wait for element locator i.e. by.name ("q") and if it is not found then it will
		// wait for By.xpath("//input[@class='gLFyf gsfi']") and so on.
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		// ByAll is a new locator and purpose of it to locate the web element on the basis of OR condition. That means , first it will try to find element
		// by "By.name("q"), if element is found then it will not consider other locators such as "By.xpath()". If element is not found on the basis of
		//first locator then it will try to find element on next locator strategy and so on...
		
		driver.findElement(new ByAll(By.name("q"), By.xpath("//input[@class='gLFyf gsfi']"))).sendKeys("Selenium test");
		
		
		// Following "ByIdOrName" will try to search either name or id 
		
		driver.findElement(new ByIdOrName("q")).sendKeys("Selenium Test");;
		
		
		// Following is a ByChained where child element of parent can be located.
		
	driver.findElement(new ByChained(By.id("Parent 1"),By.name("Child1 of parent 1"), By.xpath("Child of child1"))).sendKeys("Selenium Test");
		
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}

}
