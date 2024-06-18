package methods;

public class Sample_10 {

	public static void main(String[] args) 
	{
		Studentname("Sanghpal");
		Studentname("Vikas");

		System.out.println("<--------------------------->");
		
		FullName("Sanghpal", "Nawghare");
		FullName("Vikas", "Padwal");
		
	}
	
	public static void Studentname(String s1)
	{
		System.out.println(s1);
	}

	public static void FullName(String firstName, String LastName)
	{
		System.out.println(firstName + " "+LastName);
	}
}
