package Homepage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InquiryFormSubmissionwithoutanyInput {
	public WebDriver driver;
	public Workbook workbook;
	public Sheet sheet;

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
	public void RememberMe() throws InterruptedException,IOException {
		 FileInputStream file = new FileInputStream(".//DataFiles//Login.xlsx");
	        Workbook workbook = WorkbookFactory.create(file);
	        @SuppressWarnings("rawtypes")
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("sheet1");

	        // Loop through the rows and perform the login test cases
	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	            Row row = sheet.getRow(i);
	            String username = getCellValueAsString(row.getCell(0));
	            String password = getCellValueAsString(row.getCell(1));
	            
	            
	        driver.get("https://mci.technovative.in/");    
	            

	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    		// Enter username and password
	    		WebElement usernameField = driver.findElement(By.id("email"));
	    		WebElement passwordField = driver.findElement(By.id("password"));
	    		usernameField.sendKeys(username);
	    		passwordField.sendKeys(password);

	    		// Submit the form
	    		WebElement loginButton = driver.findElement(By.cssSelector("[type='submit']"));
	    		loginButton.click();
	    		
	    		
	    			WebElement HomepageDisplay= driver.findElement(By.xpath("/html/body/div[1]/h1"));
	    			
	    			Assert.assertEquals(HomepageDisplay.getText(), "Inquiry");
	    			

            Thread.sleep(1000);	 }         
}
	
	@Test(priority=1)
	public void InquiryEntry() throws AWTException, InterruptedException {
		Robot r=new Robot();
		
		r.mouseWheel(4);
		Thread.sleep(300);
		r.mouseWheel(2);
		r.mouseWheel(1);
		Thread.sleep(300);
		r.mouseWheel(1);
		r.mouseWheel(1);
		Thread.sleep(300);
		r.mouseWheel(1);
		Thread.sleep(300);
		r.mouseWheel(2);
		Thread.sleep(300);
		r.mouseWheel(2);  

		Actions action = new Actions(driver);
		//click on Plus Icon(addKYC Doucment
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[1]")).click();
		Thread.sleep(1000);
		r.mouseWheel(2);
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[1]")).click();
		Thread.sleep(1000);
		r.mouseWheel(1);
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[1]")).click();
		Thread.sleep(1000);
		r.mouseWheel(1);
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[1]")).click();
		Thread.sleep(1000);
		r.mouseWheel(1);
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[1]")).click();
		Thread.sleep(1000);
		r.mouseWheel(1);
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[1]")).click();
		Thread.sleep(1000);
		r.mouseWheel(1);
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[1]")).click();
		
		//Delete added KYC Document Options
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[7]/div[1]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[6]/div[1]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[5]/div[1]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[4]/div[1]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[3]/div[1]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[2]/div[1]/div/button")).click();
	Thread.sleep(1000);
		
		
	
		//click on submit
		driver.findElement(By.xpath("//*[@id=\"inquiryForm\"]/button[2]")).click();
		
    	
    	  		
		Assert.assertEquals(driver.getTitle(), "Inquiry Page");
		Thread.sleep(3000);
	}
	        private static String getCellValueAsString(Cell cell) {
		        if (cell == null) {
		            return "";
		        }

		        if (cell.getCellType() == CellType.STRING) {
		            return cell.getStringCellValue();
		        } else if (cell.getCellType() == CellType.NUMERIC) {
		            return String.valueOf((int) cell.getNumericCellValue());
		        } else {
		            return "";
		        }   
}
}