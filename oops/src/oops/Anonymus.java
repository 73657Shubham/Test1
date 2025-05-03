package oops;

public class Anonymus {
       void M() {
    	   System.out.println("I am in M method");
       }
       void N()
       {
    	   this.M();
    	   System.out.println("I am in N method ");
       }
       public static void main(String[]args)
       {
    	   Anonymus a=new Anonymus();
    	   a.N();
    	   a.M();
    	   
       }
	
}
