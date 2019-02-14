
public class TC_19_Find_Second_Largest_Number {

	public static void main(String[] args) {

		int [] number= {6,22,7,10,5};
		System.out.println("Second largest number is -->" + secondLargest(number));
		

	}
	
	static int secondLargest(int [] input)
	{
		int firstLargest = 0;
		int secondLargest=0;
		
		if(input[0]>input[1])
		{
			firstLargest=input[0];
			secondLargest=input[1];
		}
		else
		{
			firstLargest=input[1];
			secondLargest=input[0];
		}
		
		for(int i=2;i<input.length;i++)
		{
			if(input[i]>firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest=input[i];
			}
			
			else if(input [i]<firstLargest && input[i]>secondLargest) 
			{
				secondLargest=input[i];
			}
		}
		
		
	
			
		return secondLargest;
	}

}
