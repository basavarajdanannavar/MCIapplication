
public class Thiskeyword {


	int x,y;     //class varibles/ instance varibles
	
//	Thiskeyword(int x , int y)
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
		 //Thiskeyword th = new Thiskeyword(100,200);
		
		Thiskeyword th = new Thiskeyword();
		th.setData(100,200);
		th.display();
		
	}

}
