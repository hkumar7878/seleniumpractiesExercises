import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+ "//src//test/resources//config.properties");
		prop.load(fi);
				
	}

}
