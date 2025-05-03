package OOPs;

public class Student3 {
	static int id;
	static String name;
	
	public Student3()
	{
		id=1;
		name="amit";
	}
	
 static class TestStudent3{
	 
	public static void main(String[] args) {
//		creating an Object 
		Student3 s3 = new Student3();
	    Student3 s1 = new Student3();
//    intitalization of an object
	      s3.id = 11;
	    s3.name = "Amit";
	    s1.id = 12;
	    s1.name = "Ankita";
	    System.out.println(s3.id+"  "+s3.name);
	    System.out.println(s1.id+"  "+s1.name);
	    System.out.println(id +"   "+name);
	}

  }
}
