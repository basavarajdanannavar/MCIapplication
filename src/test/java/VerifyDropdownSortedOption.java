import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdownSortedOption {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users//hartek//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
			WebElement element=driver.findElement(By.id("RESULT_RadioButton-3"));
			Select se = new Select(element);
			List originalList=new ArrayList();
			List <WebElement>options=se.getOptions();
			
			for(WebElement e:options)
			{
				originalList.add(e.getText());
			}
			
			     System.out.println(originalList);
	}

}
