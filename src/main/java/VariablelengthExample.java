
public class VariablelengthExample {
	
	public static int  sum(int... numbers)
	{ 
		int  total =0;
	for(int x:numbers)
	{
		total += x;
	}
	System.out.println(total);	
	return total;
		
 	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		VariablelengthExample vn= new VariablelengthExample();
		sum(2,5,8,9);
		
		
	    }

}
