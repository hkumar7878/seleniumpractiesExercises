package HashMapInSelenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_FetchingHashMapData_Example {
	
	WebDriver driver;
	public String credentials;
	public String [] credentialsinfo;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("");
	}
	
	@Test
	public void testAdminCredentails()
	{
		
		//1st Approach to store hashmap object data by creating an object of hashmap
		
		//HashMap<String,String> map= new HashMap<String,String>();
		//map=HashMapSelenium.userdata();
		
		//2nd Approach to store hashmap object data by without creating an object of hashmap
		
		credentials=HashMapSelenium.userdata().get("customer");
		credentialsinfo=credentials.split("_");
		driver.findElement(By.xpath("username")).sendKeys(credentialsinfo[0]);
		driver.findElement(By.xpath("password")).sendKeys(credentialsinfo[1]);		
	}
	
	@Test
	public void testCustomerCredentials()
	{
		credentials=HashMapSelenium.userdata().get("admin");
		credentialsinfo=credentials.split("_");
		driver.findElement(By.xpath("username")).sendKeys(credentialsinfo[0]);
		driver.findElement(By.xpath("password")).sendKeys(credentialsinfo[1]);		
	}

}
