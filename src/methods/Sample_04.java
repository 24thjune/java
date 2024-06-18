package methods;

public class Sample_04 {

	public static void main(String[] args)
	{
		Sample_04 s4=new Sample_04();          //Non-Static method 
		s4.M5();
		s4.M6();
        
	}
	
	
	public void M5()
	{
		System.out.println("Running Non-static method call from same class : M5");
	}
	
	public void M6()
	{
		System.out.println("Running Non-static method call from same class : M6");
	}

}
