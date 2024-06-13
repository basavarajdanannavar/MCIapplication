
 final class Test1 
{
	void m()
	{
		System.out.println("this is m method from test 1 /....");
		
	}
	}
class Test2 extends Test1 // incorrect ,bz test1 is final class 
{
	void m() // incorrect bz m() is final mathods	
	{
		System.out.println("this is m method from test 2 /....");
	}
	}

public class FinalKeyword2 {

	public static void main(String[] args) {
		
		
	}

}
