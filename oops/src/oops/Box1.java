package OOPs;

public class Box1 {
	
	double l;
	double b;
	double w;
	
	Box1()
	{
		
	}
	Box1(double l)
	{
		this.l = l;
		
	}
    Box1(double l,double b)
    {
    	this.l = l;
    	this.b = b;
    	
    }
    Box1(double l,double b,double w)
     {
    	this.l = l;
    	this.b = b;
    	this.w = w;
    }
    Box1(Box1 old)
    {
    	this.l = old.l;
    	this.b = old.b;
    	this.w = old.w;
    }
   public  void display()
    {
    System.out.println("You are in mathematical Box");	
    }
}
