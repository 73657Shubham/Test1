package Assignment25Octo;

import java.util.*;

public class PersonArrayLinkedList {

	public static void main(String[] args) {
	
		Person p1 = new Person("Ritesh",26,"Mumbai west bandra","25648795");
		Person p2 = new Person("Rupesh",25,"Babulgao ","2465846659");
		ArrayList<Person> a1 = new ArrayList<Person>();
		  a1.add(p1);
		  a1.add(p2);

	Iterator it = a1.iterator();
	
	while(it.hasNext())
			{
		Person p = (Person)it.next();
		System.out.println(p.name+" "+p.age+" "+p.address+" "+p.phone);
			}
	
	}

}
