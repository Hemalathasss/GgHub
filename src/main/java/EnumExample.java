import java.util.EnumSet;

public class EnumExample {
	
	//Enumis used when  we want to use group of constants
	// in our project
	//An enum can, just like a class , have attributes and methods. 
	//The only difference is that enum constants are public ,
	//static and final (unchangeable - cannot be overridden). An enum cannot be used to create objects, 
	//and it cannot extend other classes (but it can implement interfaces).
	
	//Use enums when you have values that you know aren't going to change, 
	//like month days, days, colors, deck of cards, etc.
	enum Day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY;
	}
	 
	public static void main(String[] args) {
		
		//Day d=Day.MONDAY;
		//System.out.println(d);
		//		for( Day d:Day.values())
		for( Day d:EnumSet.range(Day.SUNDAY,Day. TUESDAY))
		{
			System.out.println(d);
		}
	}
}
