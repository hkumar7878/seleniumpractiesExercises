
public class TC_11_Palindrome {
	
	
	public static void main(String[] args) {
		String str="Civic";
		
	//	isPalinDrome(str);
		if(isPalinDrome(str))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
		
	}
	
	public static boolean isPalinDrome(String str1)
	{
		String newStr=str1.replaceAll("//s", "").toLowerCase();
		char [] charArray= newStr.toCharArray();
		int forward=0;
		int backward=charArray.length-1;
		while(forward<=backward)
		{
			if(charArray[forward]!=charArray[backward])
			{
				return false;
			}
			
			forward++;
			backward--;
		}
		
		return true;
	}

}
