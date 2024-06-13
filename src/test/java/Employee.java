
public class Employee {
    //Variables 
	
	int eid;
	String ename;
	String job;
	int sal;
	
	//methods
	
	void display()     //void means no written value
	
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	public static void main(String[] args) {
		
		Employee emp1 =new Employee();
		emp1.eid=101;
		emp1.ename="john";
		emp1.job="manager";
		emp1.sal=6000;
		
		emp1.display();
		
		//System.out.println(emp1.eid);
		
		
		Employee emp2 =new Employee();
		emp2.eid=102;
		emp2.ename="david";
		emp2.job="Engineer";
		emp2.sal=9000;
		emp2.display();
	}

}
