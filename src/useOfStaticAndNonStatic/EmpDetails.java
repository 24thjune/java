package useOfStaticAndNonStatic;

public class EmpDetails {

	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		e1.EmpName="Sanghpal";
		e1.EmpId=101;
		e1.EmpCeoName="Harshwardhan";
		
		
		Emp e2=new Emp();
		e2.EmpName="Vikas";
		e2.EmpId=102;
		e2.EmpCeoName="Harshwardhan";
		
		Emp e3=new Emp();
		e3.EmpName="akash";
		e3.EmpId=103;
		e3.EmpCeoName="Vaishali";
		
		e1.StudentName();
		e2.StudentName();
		e2.StudentName();
		
		

	}

}
