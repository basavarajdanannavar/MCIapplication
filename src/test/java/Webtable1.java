import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","C://Users//hartek//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
	driver.findElement(By.id("textUsername")).sendKeys("Admin");
	Thread.sleep(1000);

		driver.findElement(By.id("textPassword")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("btnLogin")).click();
		

	}

}
