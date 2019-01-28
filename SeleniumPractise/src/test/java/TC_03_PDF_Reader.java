import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

public class TC_03_PDF_Reader {
	
	@Test
	public void pdfReaderTest() throws MalformedURLException 
	{
		URL url= new URL("https://www.betterteam.com/downloads/employee-information-form-download-20170810.pdf");
	}

}
