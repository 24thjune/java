package constructor;

public class Sample01 
{
   //1 : Example of default constructor
	//default  constructor provided by compiler
	// use to copy all object into object
	
//	public Sample01() 
//	{
//		
//	}
	
	
	
	public void M1()
	{
		System.out.println("Running non static method M1");
	}
	
	public void M2()
	{
       System.out.println("Running non static method M2");
	}
	
	
	public static void main(String[] args) 
	{
	    Sample01 s1=new Sample01();
	    s1.M1();
	    s1.M2();
	    
	    System.out.println("<-------------------------------------->");
	    
	    Sample02 s2=new Sample02();
	    s2.M3();
	    
	}
}
