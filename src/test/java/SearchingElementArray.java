
public class SearchingElementArray {

	public static void main(String[] args) {
		
		int a []= {10,20,30,30,30,40,50,90};
		int search_element=90;
		
		boolean status=false;   //not found true
		
		/*  for(int i=0; i<a.length; i++)
			
		{
			if(a[i]==search_element)
		
		{
			System.out.println("element found");
			status=true;
			break;
		}
}
		if(status==false)
		{
		System.out.println("Element not found");
		}
		*/ 
		
		for(int x:a)
		{
			if (x==search_element)
			{
				System.out.println("element found");
				status=true;
				break;
			}
		}
		
		if(status==false)
		{
			System.out.println("Element not found");
		}
}}