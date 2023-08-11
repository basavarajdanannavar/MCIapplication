package LoginPage;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyForgotPasswordFunctionality {
	public WebDriver driver;
	public Workbook workbook;
	

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setUp() {
		// Set the path to ChromeDriver based on your system configuration
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

	 	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}
	@Test(priority=0)
	public void checkLoginLink() {
	 driver.get("https://mci.technovative.in/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//click on Home Link
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		//verify the Login link
		
		driver.findElement(By.cssSelector("[href='/login']")).click();
		
}
	@Test(priority=1)
	public void checkSignupLink() {
	 driver.get("https://mci.technovative.in/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//click on Home Link
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		//verify the Login link
		
		driver.findElement(By.cssSelector("[href='/reset-password']")).click();
		
		//Enter the mailID
		driver.findElement(By.id("email")).sendKeys("basavarajdaanu@gmail.com");
		//click on reset password
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[2]/input")).click();
		
		//Get the operation successfull message
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/form/p"));
		
	System.out.println(email.getText());
	
	Assert.assertEquals(email.getText(), "Sign in");
	
		
}

}
