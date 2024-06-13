
public class DataConversionMethods {

	public static void main(String[] args) {
		
		//String --->int 
		//String s="welcome"; // can not convert to int
		
		String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		String --->double
		String s1= "10.9";
		String s2 ="20.5";
		
		System.out.println(Double.parseDouble(s1)+ Double.parseDouble(s2));
		
		String s= "true";  //other than true , if you pass any string that will return false.
		
		System.out.println(Boolean.parseBoolean(s));
		
	   int ,double,bool,char ------>string 
	   
	   int a=10;
	   double d=10.9;
	   char c= 'A';
	   boolean bool =true;
	   
	   String s= String.valueOf(a);
	   System.out.println(s);
	   
	   String s= String.valueOf(d);
	   System.out.println(s);
	   
	   
	   
	}

}
