import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_08_Test_Authentication_PopUp {

	WebDriver driver;
	
	@Test
	public void testAuthentication()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String message= driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(message);
		driver.quit();
	}
	
}
