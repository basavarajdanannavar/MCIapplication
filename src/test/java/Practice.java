
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Practice {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
		
	// Set the path to your ChromeDriver executable (make sure to include the file
			// extension)
			System.setProperty("webdriver.chrome.driver",
					"C://Users//hartek//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");

			
			
			// Create a new instance of the ChromeDriver
			
			//options.AddAgruments("--headless");
			
		
			ChromeOptions options = new ChromeOptions();
			
		
			options.setHeadless(true);
			
			WebDriver driver =new ChromeDriver(options);
			
			driver.get("http://demo.nopcommerce.com/");
			
				
				System.out.println("Title of the page: " + driver.getTitle());
		}
		
		}


