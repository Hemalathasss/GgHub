import java.util.Arrays;

public class StringAnagram1 {
	 public void areAnagram()
	{
//		 str1.toCharArray() - converts the string into a char array
//		 Arrays.sort() - sorts both the char arrays
//		 Arrays.equal() - checks if the sorted char array are equal
		 
		 String  s11="LISOEN";
			String  s21="SILENT";
			int n1= s11.length();
			int  n2=s21.length();
			char [] a=s11.toCharArray();
			 
			char [] b=s21.toCharArray();
			if (n1==n2)
			{
		
			Arrays.sort(a);
			Arrays.sort(b);
			boolean result =Arrays.equals(a, b);
			if(result ==true)
			{
				System.out.println("anagram");
			}
			else {
			
				System.out.println(" not a anagram");
				
			}
			}
			else {
				
				System.out.println(" not a anagram");
				
			}
			
			 
			
			
	}
				
				
	
	
			
			
				
	public static void main(String[] args) {
		StringAnagram1 s= new StringAnagram1();
		s.areAnagram();
		
	}
		
}


	 
