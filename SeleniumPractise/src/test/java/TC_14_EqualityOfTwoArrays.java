
public class TC_14_EqualityOfTwoArrays {

	public static void main(String[] args) {
		int [] a= {1,3,5,9,11};
		int [] b= {1,3,5,9,15,20};
		
		boolean equalOrNot=false;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					equalOrNot=true;
			}
		}
		
		if(equalOrNot)
			System.out.println("Arrays are equal");	
		else
			System.out.println("Arrays are NOT equal");	
			
		
		

	}

}
