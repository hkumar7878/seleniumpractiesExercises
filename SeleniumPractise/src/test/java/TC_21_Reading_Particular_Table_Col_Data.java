
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_21_Reading_Particular_Table_Col_Data {

	WebDriver driver;
	@Test
	public void readColData()
	{
		List<String> colData= new ArrayList<String>();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();		
		WebElement myTable=driver.findElement(By.xpath("//table[@id='customers']"));
		colData=getColData1("Company",myTable);
		System.out.println("Specific col data is " + colData);
		System.out.println("Specific col data " +getColData1("Contact",myTable));
		
	
	}
	
	public List<String> getColData1(String colName,WebElement table)
	{
		List<WebElement> tb_rows=table.findElements(By.tagName("tr"));
		List<WebElement> headers=table.findElements(By.tagName("th"));
		List<String> colDetails=new ArrayList<String>();
		int hd_size=headers.size();
		for(int i=0;i<hd_size;i++)
		{
			String headerTxt=headers.get(i).getText();
			if(headerTxt.equalsIgnoreCase(colName))
			{
				for(int j=1;j<tb_rows.size();j++)
				{
					List<WebElement> row_cols = tb_rows.get(j).findElements(By.tagName("td"));
					for(int k=0;k<tb_rows.size();k++)
					{
						String str=row_cols.get(k).getText();
						System.out.println(str);
						colDetails.add(str);
						break;
						
					}
				}
			}
		}
		
		return colDetails;
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
