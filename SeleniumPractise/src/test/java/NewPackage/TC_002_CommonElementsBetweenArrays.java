package NewPackage;

import java.util.HashSet;

import org.testng.annotations.Test;

public class TC_002_CommonElementsBetweenArrays {
	
	@Test
	public void findCommonElements()
	{
		String [] s1= {"one","two","three","four"};
		String [] s2= {"four","second","two","first"};
		
		HashSet<String> set= new HashSet<String>();
		
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i].equals(s2[j]))
				{
					set.add(s1[i]);
				}
			}
		}
		
		System.out.println(set);
		
	}

}
