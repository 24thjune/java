package useOfStaticAndNonStatic;

public class Emp
{
   String EmpName;
   int EmpId;
//   String EmpCeoName;
   static String EmpCeoName;
   
   public void StudentName()
   {
	   System.out.println(EmpName +" : "+EmpId+" :"+EmpCeoName);
   }
}
