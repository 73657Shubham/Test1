package OOPs;

public class Student4 {
	
	int rollno;
	String name;
	
	void insertRecord(int r,String n)
	{
		rollno = r;
		name = n;
		
	}
	void showInfo()
	{
		System.out.println(rollno+"  "+name);
	}
	
   static class TestStudent5{
   
	public static void main(String[] args) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
		
		s1.insertRecord(11,"Abhijeet");
		s2.insertRecord(109,"Grish");
		s1.showInfo();
		s2.showInfo();
	}

}
} 