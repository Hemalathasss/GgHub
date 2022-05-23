import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Iterator1Colllection {
	 public static void main(String[] args) {
	HashSet<String> m=new HashSet<String>();
	//HashMap<String, Integer> people = new HashMap<String, Integer>();
	m.add("Hema");
	m.add("Hari");
	m.add( "Helena");
//	for (String string : m) {
//		System.out.println(string);
//	}
//	if(m.contains("Hari1")&& m.contains("Hema"))
//	{
//		System.out.println("Hema is  present");
//	}
//	else {
//		System.out.println("Hema is not   present");
//	}
	Iterator it= m.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}

	
}

