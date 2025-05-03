package oops;

public class Anonymus1 {
      void A1(){
    	  System.out.println("I am in A");
      }
    static void  A1(int x)
      {
    	this();
    	System.out.println("I am X:"+x);
    	}
    public static void main(String[]args)
    {
    	int A=10;
          Anonymus A1 = new Anonymus();
          A1 =  A1(10);
    	
    }
}
