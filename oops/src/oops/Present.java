package OOPs;

 class Present {

	public static void main(String[] args) {
		int i = 0;
		int arr[]= {1,2,3,4,5,689,78,965,52,63,79,45,256};
		int c = 965;
		for(i=0 ; i<arr.length ; i++)
		{
			if(c==arr[i])
			{
				System.out.println("Request element :"+c+" array present at position :"+i);
			}
		}

	}

}
