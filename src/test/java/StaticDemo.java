
public class StaticDemo {
	
	static int a= 10;    //static variables
	int b= 20;           // non static varible
	
	static void m1()     //
	{
		System.out.println("This is m1 static method....");
	}
	void m2()   // non static method 
	{
		System.out.println("This is m2 static method....");
	}

	void m()  // non static method 
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {
		//1)static methods can access static stuff directly (without object)
		System.out.println(a);
	m1();
	
     //    System.out.println(b);
	//m2();  // can not access m2() is non static 
		
	//2)static methods can access non static stuff through Object.class
         StaticDemo sd= new StaticDemo();
	//	  System.out.println(b);
		  sd.m2();
		  sd.m();
		
	}

}
