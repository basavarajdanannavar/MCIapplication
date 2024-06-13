import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//hartek//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php/");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"u_0_g_PO\"]"));
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
		
		if(email.isDisplayed() && email.isEnabled())
			
		{
			email.sendKeys("pavan@gmail");
		}
		if(password.isDisplayed() && password.isEnabled())
			
		{
			password.sendKeys("vidya@123");
		}
		
		//male
		System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_4_7S\"]")).isSelected()); //false
		
		//female
		System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_5_PV\"]")).isSelected()); //false

		
		//select female readio button 
		if(driver.findElement(By.xpath("//*[@id=\\\"u_0_4_7S\\\"]")).isSelected()==false)
			
			driver.findElement(By.xpath("//*[@id=\\\"u_0_4_7S\\\"]")).click();
	}

}
