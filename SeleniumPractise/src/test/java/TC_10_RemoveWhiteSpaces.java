import java.util.Arrays;
import java.util.List;

public class TC_10_RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		String inputString="This is to remove white spaces";
		String withOutSpaces=inputString.replaceAll("\\s", "");
		
		System.out.println("String without spaces is" + withOutSpaces);
		
		String [] data= new String [] {""};
		List<String> data1= Arrays.asList("","");
	}

}
