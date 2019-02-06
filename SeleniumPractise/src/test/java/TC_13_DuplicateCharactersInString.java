import java.util.HashMap;
import java.util.Set;

public class TC_13_DuplicateCharactersInString {

	public static void main(String[] args) {
		String duplicate="JavaJ2EE";
		duplicate(duplicate);

	}
	
	public static void duplicate(String str1)
	{
		
		
		char [] strArray = str1.toCharArray();
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		
		
		for(char c: strArray)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);// Here map.get(c) will get integer value corresponding to key
				//System.out.println(map.get(c)); 
			}
			
			else
				map.put(c, 1);
		}
		
		//Getting a Set containing all keys of charCountMap
		
		Set<Character> charInString= map.keySet();
		
		System.out.println("Duplicate Characters In " + charInString);
		
		for (Character ch : charInString)
        {
            if(map.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
                System.out.println(ch +" : "+ map.get(ch));
            }
        }
	}

}
