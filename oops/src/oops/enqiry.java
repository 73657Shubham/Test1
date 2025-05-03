package OOPs;

class enqiry {
      

	enqiry(String name,String Address,int phone,String course,int fee )
	{
		System.out.println("details are printed");	
	}
	void display(String name, String Address,double i, String course, double j)
	{
		System.out.println(name+" "+Address+" "+i+" "+course+" "+j);
	}
	enqiry(String school,int age)
	{
		System.out.println("school and age ");
	}
	private void display(String school, int age)
	{
       System.out.println(school+" "+age);
	}
	enqiry(String father,String surname)
	{
		System.out.println("family detials");
	}
	
	
	public static void main(String []args) {
	
		enqiry e1 = new enqiry("Ankush","Mumbai",85794456,"DBDA",124567);
		enqiry e2 = new enqiry("centalloysis school",24);
		enqiry e3 = new enqiry("Abhir","Gupta");
		
	    e1.display("Ankush","mumbai",87995762,"DBDA",124562);
	    e2.display("Cent alloysis school",24);
	}
	}


