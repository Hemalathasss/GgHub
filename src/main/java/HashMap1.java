import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String > m =new HashMap <Integer,String>();
		//HashMap<String, Integer> people = new HashMap<String, Integer>();
		m.put(1,"Hema");
		m.put(2,"Hari");
		m.put(3, "Helena");
		System.out.println(m.get(1));
		for (Integer i :m.keySet()) {
			  System.out.println("key:" +i+"values:"+m.get(i));
			}
		
	}
}
