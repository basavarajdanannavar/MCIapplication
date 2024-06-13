import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("program is started......");
        Scanner sc = new Scanner(System.in);
        
//        example 1 
//        System.out.println ("Enter a number...");
//        int num =sc.nextInt();
//        
//        System.out.println(100/num);
        
        
        //example 2
        
//        int a[]= new int [5];
//        
//        System.out.println("enter the position(0-4)");
//        
//       int pos=sc.nextInt();
//       
//      System.out.println("enter a value: ");
//      int value = sc.nextInt();
//      
//      a[pos]=value;
//      System.out.println(a[pos]);
      
      //Example3
        
//        String s ="welcome";
//        int num =Integer.parseInt(s);  //NumberFormatExeption
//        System.out.println(num);
//      
        
      //  example4 
        
        String s = null; 
        System.out.println(s.length()); //NullPOintException
        System.out.println("program is complted.");
        System.out.println("program is exited..");
	}

}
