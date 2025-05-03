package Assignment25Octo;

import java.util.*;

public class Odd {

	public static void main(String[] args) {
		
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		
		s1.add(13);
		s1.add(12);
		s1.add(18);
		s1.add(40);
		
		System.out.println(s1);

		s1.removeIf(n-> n % 2 != 0);
		
		System.out.println("The remaining even numbers are :" +s1);

	}

}
