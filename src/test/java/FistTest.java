import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FistTest {

	public static void main(String[] args) throws InterruptedException {
		// Set the path to your ChromeDriver executable (make sure to include the file
		// extension)
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hartek\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open a browser and navigate to a website
		driver.get("https://worksmart.nemsys.com/DEVSetup/ticket");
		
		//click on login with otp 
		
		 driver.findElement(By.xpath("//html/body/app-root/app-landing-page/html/body/div[1]/div[1]/div[2]/span[2]/a")).click();

		 // enter username  email 
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div/div[3]/form/div[1]/input")).sendKeys("vidya.bansode@felizeek.com");
		 
		 //click on get opt
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div/div[3]/form/div[2]/input")).click();
		 
		 Thread.sleep(3000);
		 
		 //enter password/opt
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div/div[3]/form/div[2]/input")).sendKeys("hd29j");
		 
		
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div/div[3]/form/div[3]/input")).click();
	}

}
