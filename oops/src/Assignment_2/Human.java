package Assignment_2;

public class Human {
	String name;
	int age;
	String gender;
	boolean married;
	int salary;

	Human(String name,int age,String gender,boolean married,int salary)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.married=married;
		this.salary=salary;
		
	}
	void dispaly()
	{
		System.out.println(name+" "+age+" "+gender+" "+married+" "+salary);
	}
}
