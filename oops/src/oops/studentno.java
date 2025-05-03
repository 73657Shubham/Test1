package OOPs;

public class studentno {
	  int rollNo;
	  String name;
	  
	  studentno(String name,int rollno)
	  {
		  this.name=name;
		  this.rollNo=rollno;
		  
	  }

	  
	public static void main(String[] args) {
	     studentno s1 = new studentno("ankush",1);
	     studentno s2 = new studentno("abhijeet",2);
	     
   System.out.println(s1.rollNo+" "+s1.name);
   System.out.println(s2.rollNo+" "+s2.name);
	}

}
