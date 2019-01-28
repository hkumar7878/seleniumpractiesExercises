import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TC_05_HeadlessBrowser {
	
	WebDriver driver;
	
	
	@Test
	public void headLessBrowser()
	{
		FirefoxBinary fb= new FirefoxBinary();
		fb.addCommandLineOptions("--headless");
		//DriverFactory.setChromeDriverExePath(System.getProperty("user.dir") + "//Browser Exes//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//Browser Exes//geckodriver.exe");
		
		FirefoxOptions op= new FirefoxOptions();
		op.setBinary(fb);
		WebDriver driver= new FirefoxDriver(op);
		driver.get("http://www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
	}

}
