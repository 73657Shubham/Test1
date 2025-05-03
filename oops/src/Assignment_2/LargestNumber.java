package Assignment_2;

import java.util.Arrays;

public class LargestNumber {

	public static int getLargest(int[]a,int total)
	{
		Arrays.sort(a);
		return a[total-1];
	}
	public static void main(String[] args) {

		int a[] = {1,2,34,56,89,5,6};
		int b[] = {12,13,15,26,92,69,75};
		
		System.out.println("Largest:"+getLargest(a,7));
		System.out.println("Largest:"+getLargest(b,7));
	}

}
