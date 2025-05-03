package oops;

public class Max {

	public static void main(String[] args) {
		{
			int a[]=new int [5];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
			a[4]=5;
			int b[]={1,2,3,4,5};
			int max =a[0];
			System.out.println(a.length);
			 for(int i=0; i<b.length-1;i++)
			 {
				 if(a[i]>max)
				 {
					 max = b[i];
					 
				 }
			 }
			 System.out.println(b[max]);
			
		}

	}

}
