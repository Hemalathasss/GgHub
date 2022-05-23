
public class PolymorExample {
	
	
public static void main(String[] args) {
	
	
	/*Polymorphism in Java is a concept by which we
	 *  can perform a single action in different ways.   
	 *    So polymorphism means many forms.
	     There are two types of polymorphism in Java: 
		 compile-time polymorphism and runtime polymorphism. 
		 We can perform polymorphism in java by
		  method overloading and 
		   method overriding.
If you overload a static method in Java, 
it is the example of compile time polymorphism. 

Here, we will focus on runtime polymorphism in java.
Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an
 overridden method is resolved at runtime rather than compile-time.

	  
		float getRateOfInterest()
		{
			return 0;
		 
		}
		}  
		class SBI extends  PolymorExample
		{  
		float getRateOfInterest()
		{
			return 8.4f;
		}  
		}  
		class ICICI extends  PolymorExample
		{  
		float getRateOfInterest()
		{
			return 7.3f;
	    }  
		}  
		class AXIS extends PolymorExample
		{  
		float getRateOfInterest()
		{
		return 9.7f;
		}  
		}
		}  
		class TestPolymorphism{  
		public static void main(String args[]){  
		PolymorExample b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  */
	

} 
}