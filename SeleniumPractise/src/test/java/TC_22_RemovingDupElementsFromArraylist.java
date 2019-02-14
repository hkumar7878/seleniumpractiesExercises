import java.util.ArrayList;
import java.util.HashSet;

public class TC_22_RemovingDupElementsFromArraylist {
	public static void main(String[] args) {
		
		ArrayList<String> elements= new ArrayList<String>();
		elements.add("Java");
		elements.add("Selenium");
		elements.add("Java");
		
		System.out.println("List with duplicate list" +  elements);
		
		HashSet<String> set= new HashSet<String>(elements);
		ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
		System.out.print("ArrayList After Removing Duplicate Elements :");
        System.out.println(listWithoutDuplicateElements);
		
		
	}
}
