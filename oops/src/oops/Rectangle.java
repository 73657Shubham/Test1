package OOPs;

class Rectangle {
   int length;
   int wedth;
   
  void insert(int l,int w)
  {
	  length = l;
	  wedth = w;
  }
  void CalculateArea()
  {
	  System.out.println(length*wedth);
  }

}
 public class TestRectangle1{
	 public static void main(String[] args)
	 {
		 Rectangle r1 = new Rectangle();
		 Rectangle r2 = new Rectangle();
		 r1.insert(15,5);
		 r2.insert(12,7);
		 r1.CalculateArea();
		 r2.CalculateArea();
	 }
 }
