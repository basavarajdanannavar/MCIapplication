import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		//1)largest of 2 numbers (if ...else, ternary operator)
		//2)smallest of 3 numbers (if ..else)
		//3)print week number based on week name.switch case
		
		//int person_age=56;
		/*if(person_age>=18)
		{
			System.out.println("eligibale for vote");
			
		}
		else
		{
			System.out.println("not eligible for vote");
		}*/
		
		/*if(person_age>=18)
			System.out.println("eligibale for vote");
		else
			System.out.println(" not eligibale for vote");*/
		/*

		// evenoroddnumber 
		int num =16;
		if (num%2==0)
		{
			System.out.println("even number");
		
		}
		else
		{
			System.out.println("odd number");
		}
		
		//positive and negative number 
		 
		 */
		int num =11;
		if (num>0)
		{
			System.out.println("positive number");
		
		}
		else if (num<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("zero");
		}
		
		//largestof 3 numbers
		int a=100,  b= 200,  c=300;
		if (a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if (b>c && b>a)
		{
			System.out.println("b is largest number ");
		}
		else
		{
			System.out.println("c is largest number ");
		}
		
		// headless browser
		
	/*   System.setProperty("webdriver.chrome.driver","C:\\Users\\hartek\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	
	//option.setHeadless(true);
	options.AddAgruments("--headless");
	

	WebDriver driver = new ChromeDriver(options);
	driver.get("http://demo.nopcommerce.com/");
	
	
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hartek\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com/");
		
		System.out.println("Title of the page: " + driver.getTitle());
		*/

	}
	

}
