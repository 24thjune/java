package controlStatement;

public class Else_If_Statement {

	public static void main(String[] args) 
	{
		int marks=60;
		
		if (marks>=65) 
		{
			System.out.println("Distinction");
		}
		else if(marks >=60 & marks<=64)
		{
            System.out.println("First Class");
		}
		else if(marks>=50 & marks<=59)
		{
			System.out.println("Second Class");
		}
		else if(marks>=35 & marks<=49)
		{
			System.out.println("Pass");
		}
		else if(marks<35)
		{
			System.out.println("fail");
		}
		

	}

}
