

public class ClassVaribles {


	int x,y;     //class varibles/ instance varibles
	
//	ClassVaribles(int x , int y)
//	{
//		this.x=x;
//		this.y=y;
//	}
	
	void setData (int a , int b)
	{
		x=a;
		y=b;
	}
	
	  void display()
	  {
		  System.out.println(x);
		  System.out.println(y);
	  }
	
	public static void main(String[] args)
	{
		 //ClassVaribles th = new ClassVaribles(100,200);
		
		ClassVaribles th = new ClassVaribles();
		th.setData(100,200);
		th.display();
		
	}

}
