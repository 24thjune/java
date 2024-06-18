package methods;

public class Sample_07 
{
   public static void main(String[] args) 
   {
	   M1();
	   
	   Sample_07 s7=new Sample_07();
	   s7.M3();
	   
	   
	   Sample_08.M2();
	   
	   Sample_08 s8=new Sample_08();
	   s8.M4();
	   
   }
   
   public static void M1()
   {
	   System.out.println("Running Static method call from same class : M1");
   }
   
   public void M3()
   {
	   System.out.println("Running Non-static method call from same class :  M3");
   }
   
}
