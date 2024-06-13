import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C://Users//hartek//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");

  
     WebDriver driver = new ChromeDriver();
  
      /*    driver.get("https://demo.guru99.com/selenium/newtours/");  //open the url
  
  System.out.println(driver.getTitle());
  
  System.out.println(driver.getCurrentUrl()); // Get url
  
  String text = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
  
  System.out.println(text);
  
  */
  
  driver.get("https://demo.automationtesting.in/Windows.html");
  
  driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
  
  Thread.sleep(2000);
  
  //  driver.close();  // close current window
  
   driver.quit();  // close multiple window
  
	}

}
