package oops;

public class sorting_array {

	public static void main(String[] args) {
		int temp;
		int []arr = {20,19,80,25,30,40};
		
		for(int i = 0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;i++)
			{
				if(arr[i]<arr[j])
				{
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Array elements in descending order:");
	for(int i = 0; i<arr.length-1;i++)
	{
	System.out.println(arr[i]);	
	}
	}
}

