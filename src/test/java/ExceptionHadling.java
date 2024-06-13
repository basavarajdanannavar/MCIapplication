import java.util.Scanner;

public class ExceptionHadling {

	public static void main(String[] args) {
		System.out.println("program is started......");
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("Enter a number...");
        int num =sc.nextInt();
        
        try 
        {
        System.out.println(100/num);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("data is invalid.");
        }
        
        
        System.out.println("program is complted.");
        System.out.println("program is exited..");
	}

}
