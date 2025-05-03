package Assignment_2;

public class Student1 {

	int rollno;
	String name;
	static String college = "ITC";
	
	static void change()
	{
		college = "IBPS";
		
	}
	
	Student1(int r,String n)
	{
		rollno = r;
		name = n;
		
	}
	void dispaly()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
