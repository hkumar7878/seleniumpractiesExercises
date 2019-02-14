import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_LaunchWithOutBrowserExe {
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.operadriver().setup();
		driver= new ChromeDriver();
		//driver=new FirefoxDriver();
		//driver= new OperaDriver();
		// To use specific browser (chrome) version
		
		//WebDriverManager.chromedriver().version("2.44").setup();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("http://www.google.com");
		driver.findElement(By.name(("q"))).sendKeys("Seleniumm");
		Thread.sleep(2000);
		String actual="Selenium Test Practice";
		assertThat(actual).startsWith("Selenium");
		
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}
}
