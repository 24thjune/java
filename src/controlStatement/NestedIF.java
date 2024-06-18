package controlStatement;

public class NestedIF {

	public static void main(String[] args) 
	{ 
		int pre=150; 
		int mains=250;
		
		if (pre>=100) 
		{
			System.out.println("pass");
			
			if (mains>=300)
			{
				System.out.println("Got Selected");
			}
			else
			{
				System.out.println("Rejected for mains");
			}
		}
		else
		
		System.out.println("Not Eligible for mains exam marks<=300");

	}

}
