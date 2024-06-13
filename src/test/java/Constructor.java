
public class Constructor {
	
	int x,y;
	Constructor() //default 	Constructor
	
	{
		x=100;
		y=200;
		
	}
	Constructor(int a,int b) // paramaetrized Constructor
	 {
		
        x=a;
        y=b;
	}
    void sum ()
    {
    	System.out.println(x+y);
    }
    public static void main(String[]args)
    {
    	//Constructor cd =new Constructor(); // involk default Constructor
    	
    	Constructor cd =new Constructor(10,20);  //paramaetrized Constructor cd =new Constructor();
    	cd.sum();
    }
}
