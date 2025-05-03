package Assignment25Octo;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import java.util.ListIterator;

public class ArrayRevers {

	public static void main(String[] args) {
		ArrayDeque<String> r = new ArrayDeque<String>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		r.add("Abhijeet");
		r.add("Ankit");
		r.add("Amit");
		r.add("Tushar");
		r.add("Aniket");
		
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(8);
		
		Iterator<String> iterator  = r.descendingIterator();
		
		System.out.println("In reverse direction");
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}
