import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;
	
	public void init() {
		
		
		//WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				//driver=new FirefoxDriver();
				
		
	}
	
	public void failed(String testMethodName) throws IOException
	{
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(scrFile, new File (System.getProperty("user.dir") + "//ScreenShots//Screenshot.png"));
		FileUtils.copyFile(scrFile, new File (System.getProperty("user.dir") + "//ScreenShots//" +testMethodName+"_" + ".jpg"));
	
	}

}
