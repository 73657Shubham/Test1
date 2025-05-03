package OOPs;

class Test1 {
	Test1(double d)
	{
		this();
		System.out.println("double argument constructor");
	}
	Test1(int i)
	{
		this();
		System.out.println("Integer argument constructor");
	}
	Test1()
	{
		System.out.println("No argument constructor");
	}
  public static void main(String[] args)
  {
	  Test1 t1 = new Test1(11.6);
	  Test1 t2 = new Test1(10);
	  Test1 t3 = new Test1();
  }
}
