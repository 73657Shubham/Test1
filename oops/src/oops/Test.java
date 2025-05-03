package OOPs;

class Test {
	
	Test(double d)
	{
		this(10);
		System.out.println("Double constructor is call");
	}
	Test(int i)
	{
		this();
		System.out.println("Integer constructor is call");
	}
	Test()
	{
	System.out.println("No argument constructor is call");
	}
      
	public static void main(String[] args) {
		Test t1 = new Test(10.5);
		Test t2 = new Test(10);
		Test t3 = new Test();

	}

}
