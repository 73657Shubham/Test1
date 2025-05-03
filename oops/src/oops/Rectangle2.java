package OOPs;

public class Rectangle2 {
   int length;
   int width;
  
   void insrt(int l, int w)
   {
	   length = l;
	   width = w;
   }
   void CalculateArea()
   {
	   System.out.println(length*width);
   }

   static class TestRectangle2
   {
	public static void main(String[] args) 
	{
     Rectangle r1 = new Rectangle();
     Rectangle r2 = new Rectangle();
     r1.insert(5, 9);
     r2.insert(8, 4);
     r1.CalculateArea();
     r2.CalculateArea();

	}

}
}
