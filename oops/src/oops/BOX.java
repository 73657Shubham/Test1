package oops;

public class BOX {
   public void circle(){
          double pi = 3.14;
          int r = 5;
          double c1=pi*r*r;
          System.out.println("The area of circle:"+(pi*r*r));          
       };
  public void  cube() 
     {  
         int a=10;
         int c2 = 6*a*a;
         System.out.println("The area of cube :"+(c2 = 6*a*a));
         
     }
  public void rectangle()
     {
      int leangth = 5;
      int weadth  = 8;
      double rectangle = leangth*weadth;
      System.out.println("The area of rectangle:"+(rectangle = leangth*weadth ));
     
     }

	public static void main(String[] args) {
		
		 BOX b1=new BOX();
		 
        b1.circle();
        b1.cube();       
        b1.rectangle();
        

	}

}
