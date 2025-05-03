package OOPs;


public class P			//parent class
 {  
	public void s()
	{
		System.out.println( "inside parent class");
	}
	public static void main(String[] args) {
	
		C c = new C();
		c.m1();
		c.s();

	}

}
