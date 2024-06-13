
interface Shape 
{
	int Length=10;    // final and static 
	int width =20;    // final static
	
	void circle ();   //abstract method (this methods doent have implementation)
	
	default void square()   //default method
	{
	System.out.println("this is sqaure  ...");
	}
	
	static void rectangle()
	
	{
		System.out.println("this is rectangle - static method");
	}
}


public class Interfacedemo implements Shape
{
  public void circle()
{
	System.out.println("this is circle - static method");

	}
  void triangle()
  
 
  {
		System.out.println("this is triangle - static method");
  
  }
  
  int x=100,   y =200;
	public static void main(String[] args) {
		
//		Scenario 1
		Interfacedemo idobj =new Interfacedemo();
		idobj.circle(); // abstarct 
		idobj.square();  // default
		
		Shape.rectangle(); // static can be directly access from interface 
		
		idobj.triangle();
		System.out.println(idobj.x + idobj.y);
//		scenario 2 
		
		Shape sh =new Interfacedemo();
		sh.circle();
		sh.square();
		
		Shape.rectangle();
	//	sh.triangle();  //we can not access 
		
		
		System.out.println(Shape.Length * Shape.width); //accessing static varibles directly
		
		// System.out.println(sh.x + sh.y);  // can not access
	}

}
