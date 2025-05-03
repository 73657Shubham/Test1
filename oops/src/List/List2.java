package List;

import java.util.*;

public class List2 {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<Integer> a2 = new ArrayList<Integer>(); 

		a1.add("Amba");
		a1.add("papyi");
		a1.add("kela");
		System.out.println(a1);
		a1.remove("kela");
		
	Iterator it = a1.iterator();
	//Traversing through array
	while(it.hasNext())
	{
		System.out.println(it.next());
		if(it.next()=="papyi")
		{
			System.err.println("Mhotha papyi");
		}
	}
	Collections.sort(a1);
	System.out.println(a1);
	a1.add("Kiwi");
	System.err.println(a1);
	
	List2 Lt =(List2)it.next();
	System.out.println(Lt);
	
	}

}
