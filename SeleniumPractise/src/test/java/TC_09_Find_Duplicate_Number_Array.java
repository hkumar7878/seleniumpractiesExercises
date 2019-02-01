import java.util.HashSet;

public class TC_09_Find_Duplicate_Number_Array {

	public static void main(String[] args) {
		
		
		int [] numbers= new int[] {100,200,300,400,100,150,200};
	//	usingbruteForce(numbers);
		usingSortMethod(numbers);

	}
	
	
	public static void usingbruteForce(int [] nums) 
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					System.out.println("Duplicate numbers are" + nums[i]);
				}
					
			}
		}
	}
	
	
	public static void usingSortMethod(int [] num)
	{
		HashSet<Integer> set= new HashSet<>();
		
		
		for (Integer i:num)
		{
			if(!set.add(i))
			{
				System.out.println("Duplicate number is " + i);
			}
		}
	}

}
