package OOPs;

 class Employee {

	int id;
	String name;
	double salary;
	
	void insertRecord(int i,String n,double s)
	{
		id = i;
		name = n;
		salary = s;
		
	}
	void dispalyInfo()
	{
		System.out.println(id+"  "+name+"  "+salary);
	}
 }
    class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.insertRecord(1,"Amit",500000);
		e2.insertRecord(2,"Abhijeet",400000);
		e3.insertRecord(3,"Bhagat",600000);
		e1.dispalyInfo();
		e2.dispalyInfo();
		e3.dispalyInfo();
	}
  }



