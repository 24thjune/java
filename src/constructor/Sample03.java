package constructor;

public class Sample03 
{
   int num1;
   int num2;
   
   public Sample03() 
   {
	  num1=50;
	  num2=60;
   }
   
   public void add()
   {
	   System.out.println(num1+num2);
   }
   
   public void Mult()
   {
	   System.out.println(num1*num2);
   }
   
   public static void main(String[] args)
   {
	   //user defined constructor call from same class 
	   Sample03 s3=new Sample03();
	   s3.add();
	   s3.Mult();
	   
	   System.out.println("<------------------------------>");
	   
	   //user defined constructor call from another class
	   Sample04 s4=new Sample04();
	   s4.Sub();
   }
}
