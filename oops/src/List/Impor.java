package List;

import java.util.*;

public class Impor {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();

		a1.add("Apple");
		a1.add("Mango");
		a1.add("Kiwi");
		a1.add("banana");
		a2.add("1");
		a2.add("2");
		a2.add("3");

		Iterator it = a1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			if (it.next() == "Apple") {
				System.out.println("Printing mango");
			}
		}

	}

}
