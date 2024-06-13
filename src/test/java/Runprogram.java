import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runprogram {
	public static void main(String[] args) {
		// Set the path to your ChromeDriver executable (make sure to include the file
		// extension)
		System.setProperty("webdriver.chrome.driver",
				"C://Users//hartek//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open a browser and navigate to a website
		driver.get("https://worksmart.nemsys.com/DEVSetup/ticket");

		// Find a button element and click on it
		WebElement buttonElement = driver.findElement(By.xpath("//button[contains(text(), 'Show Message')]"));
		buttonElement.click();

		// Find a text input field and type something into it
		WebElement inputElement = driver.findElement(By.id("user-message"));
		inputElement.sendKeys("Hello, Selenium!");

		// Find a dropdown menu and select an option from it
		WebElement dropdownElement = driver.findElement(By.id("select-demo"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Sunday");

		// Wait for a few seconds to see the changes (for demonstration purposes)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the browser
		driver.quit();
	}
}
