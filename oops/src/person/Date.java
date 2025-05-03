package person;

public class Date {
		private int dd;
		private int mm;
		private int yy;
		
	static
	{
		int count = 0;
	}
	public Date()
	{
		dd = 14;
		mm = 10;
		yy = 2023;
		int count1;
	    
	}
    public void showDate()
    {
    	System.out.println(dd+"/"+mm+"/"+yy);
    }
    public void showDate(char ch)
    {
    	System.out.println(dd+""+ch+mm+""+ch+yy);
    }
    public static void showCount()
    {
    	System.out.println("Count of Object:");
    }
	}


