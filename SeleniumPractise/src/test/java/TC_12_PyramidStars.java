
public class TC_12_PyramidStars {
	
	
	public static void main(String[] args) {
		
		
		
		int noOfRows=5;
		int rowCount=1;
		
		
		for(int i=noOfRows;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(" ");
			}
			
			for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
		}
	}

}
