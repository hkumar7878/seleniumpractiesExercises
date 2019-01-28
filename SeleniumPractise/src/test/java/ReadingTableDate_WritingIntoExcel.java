import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingTableDate_WritingIntoExcel {
	
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void readTableData()
	{
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement myTable=driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows_table=myTable.findElements(By.tagName("tr"));
		int noOfrows=rows_table.size();
		
		String path=System.getProperty("user.dir") + "//src//test//resources//TableData.xlsx";
		
		ExcelReader reader= new ExcelReader(path);
		reader.addSheet("WebTableData");
		reader.addColumn("WebTableData", "Company Name");
		reader.addColumn("WebTableData", "Contract Name");
		reader.addColumn("WebTableData", "Country");
		
		
		int k=1;
		
		for (int i = 1; i < noOfrows; i++)

		{
			int counter=1;
			List<WebElement> row_cols = rows_table.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < row_cols.size(); j++) {
				
				String colName = null;
				if (counter == 1) {
					colName = "Company Name";
					
				} else if (counter == 2) {
					colName = "Contract Name";
					
				}
				else {
					colName="Country";
					
				}
				String cellText = row_cols.get(j).getText();
				System.out.println(cellText);

				reader.setCellData("WebTableData", colName, k + 1, cellText);
				
				counter++;

			}
			k++;

			

			System.out.println("----------------------");
		}

	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
