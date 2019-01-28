import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.awaitility.Awaitility.*;

import static org.hamcrest.Matchers.*;


import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_04_Sync_AwaitilityWait {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
	
	}
	
	@Test
	public void testAwait()
	{
		driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		driver.findElement(By.id("downloadButton")).click();
		WebElement progress= driver.findElement(By.cssSelector("div.progress-label"));
		await("Download did not complete within 20 seconds").atMost(20, TimeUnit.SECONDS)
        .until(progress::getText, is("Complete!"));
		System.out.println("DONE!!");
		
		
	}

}
