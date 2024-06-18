package methods;

public class Sample_09 {

	public static void main(String[] args)
	{
		add(100, 50);           
		add(500, 200);
		
		System.out.println("<--------------------------------->");
		
		Sample_09 s9=new Sample_09();
		s9.Mult(15, 4);
		s9.Mult(12, 5);

	}
	
	
	public static void add(int a, int b)                    //method with parameter
	{
		System.out.println(a+b);
	}
	
	public void Mult(int b ,int c)                          //method with parameter
	{
		System.out.println(b*c);
	}

}
