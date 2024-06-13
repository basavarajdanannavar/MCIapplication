import java.util.Arrays;

public class StringsMethods {

	public static void main(String[] args) {
		
		//String s= "welcome";
		//String s = new String ("welcome");
		
		//length() - return length of a string (number of charactores
		//System.out.println(s);
		String s= "welcome";
		s.length();
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//concat() - joining strings
		String s1 ="welcome";
		String s2 ="to java";
		String s3 ="Automation";
		
		System.out.println(s1+s2); //welcome to java
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2+s3);
		System.out.println("welcome"  + "to java");
		
		//trim() - remove spaces right and left side
		s="    welcome   ";
		
		
		System.out.println(s);  //along with spaces
		System.out.println("Before trimming :" + s.length());
		
		System.out.println (s.trim());
		System.out.println ("After trimmed:" + s.trim().strip().length());
		
		//CharAt() - return a character from a string based on index
		
		s ="welcome";
		System.out.println (s.charAt(3)); //c
		
		System.out.println (s.charAt(0));
		
		//contains() - return true or false 
		//Check string is part of main string or not 
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		System.out.println(s.contains("Wel"));
		
		//equal() , equalsIsgnoreCase() - compare string
		
		s1="welcome";
		s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		
		//Replace () - replce single /multiple (sequence) of char in string
		
		s="welcome to selenium java selenium python selenium c#";
		
		System.out.println(s.replace('e', 'x'));
		
		System.out.println(s.replace("selenium", "playwrite"));
		
		//substring () extract substring from the main string 
		//Starting index - 0 
		//ending index -1 
		s="selenium";
		System.out.println(s.substring(1,5)); //elen
		System.out.println(s.substring(0,3)); // Sel
		
		//toUpperCase()  toLowerCase()
		s="Welcome";
		System.out.println(s.toUpperCase()); 
		System.out.println(s.toLowerCase());
		
		//split() - split the string into multiple parts based on delimeter
		
		s="abo@gmail.com";
		//System.out.println(s.substring(0,3));
		 
		 String a []= s.split("@");
		 System.out.println(a[0]); //abc
		 System.out.println(a[1]); //gmail.com
		 
		 System.out.println(Arrays.toString(a));
		 
		 //ex1 
		 String amount= "$15,20,55"; //152055
		 System.out.println(amount.replace("$"," "));
		 System.out.println(amount.replace("$"," ").replace(",","" ));
		 
		 //ex2
		 
		 s="abc ,123@xyz"; //abc 123 xyz
		 
		 String arr1[]=s.split(","); //abc 123@xyz
		
		System.out.println(Arrays.toString(arr1));
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		//ex3
		s="abc 123";
		String ar[]= s.split(" ");
		System.out.println(Arrays.toString(ar)); //[abc, 123]
		
		// * % & () you can not use as delimetre
		
		//ex4
		String name = "John Kenedy";
		//System.out.println(name.contains("john"));//false
		
		System.out.println(name.replace('J', 'j').contains("john"));
// true 
		
		System.out.println(name.toLowerCase().contains("john"));
		
		
		
		
		
		}

}
