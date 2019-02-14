import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class TC_17_AssertJ_Examples {
	
	
	//@Test
	public void stringValidation()
	{
		String actual="Selenium Test Practice";
		assertThat(actual).doesNotContain("Selenium");
		
	}
	
	
	// @Test	
	public void listContents()
	{
		List<String> list= new ArrayList<String>();
		list.add("test");
		list.add("Selenium");
		list.add("Automation");
		assertThat(list).hasSize(3).contains("test");
		
	}
	
	@Test
	public void fileContentsCom()
	{
		File exp= Paths.get(System.getProperty("user.dir") + "//test1.txt").toFile();
		File act= Paths.get(System.getProperty("user.dir") + "//test2.txt").toFile();
		
		assertThat(exp).hasSameContentAs(act);
	}

}
