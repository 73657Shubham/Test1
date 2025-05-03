package Assignment_2;

public class LargestNumber2 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int largest = findLargest(numbers);
		System.out.println("The largest number is :"+largest);
}
	public static int findLargest(int[] array)
	{
		int largest = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > largest)
			{
				largest = array[i];
			}
		}
		return largest;
	}
}