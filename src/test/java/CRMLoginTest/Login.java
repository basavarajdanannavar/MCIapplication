package CRMLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	
	@Test(priority = 0)
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
		driver.get("https://worksmart.nemsys.com/DEVSetup/ticket");
	}
	}
	
	
	


