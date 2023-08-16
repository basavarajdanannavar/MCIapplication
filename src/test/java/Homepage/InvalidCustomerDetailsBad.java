package Homepage;

import java.awt.AWTException;
import java.awt.Robot;
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
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidCustomerDetailsBad {
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
		 FileInputStream file = new FileInputStream(".//DataFiles//TestData.xlsx");
	        Workbook workbook = WorkbookFactory.create(file);
	        @SuppressWarnings("rawtypes")
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("sheet1");

	        // Loop through the rows and perform the login test cases
	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	            Row row = sheet.getRow(i);
	            String username = getCellValueAsString(row.getCell(0));
	            String password = getCellValueAsString(row.getCell(1));
	            
	            
	            driver.get("https://mci.technovative.in/login");

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
	public void InquiryEntry() throws AWTException {
		//Enter the fullname
		driver.findElement(By.id("fullName")).sendKeys("Basu");
		//Enter the Mobile No
		driver.findElement(By.id("mobileNo")).sendKeys("843568436");
     /*Enter the DOB
		driver.findElement(By.id("dob")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"mat-datepicker-0\"]"))));
		
		String aMonth = driver.findElement(By.id("mat-calendar-button-0")).getText();
		
		while(!(aMonth.equals("JUL 2020"))) {
			driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]")).click();
			aMonth = driver.findElement(By.id("mat-calendar-button-0")).getText();
		}
		
		driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[4]/td[2]/button/div[1]")).click();
		
		*/
		driver.findElement(By.id("dob")).sendKeys("03/04/1990");
		
		Robot r=new Robot();
		r.mouseWheel(1);
		//Enter the address
		driver.findElement(By.id("address")).sendKeys("843875hdsifcw");
		//Select the state
		driver.findElement(By.cssSelector("[value='Maharashtra']")).click();
		//Enter the city
		driver.findElement(By.id("city")).sendKeys("Hubli");
		//Enter the pincode
		driver.findElement(By.id("pincode")).sendKeys("346578");
		//Enter the Adhar KYC
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[1]/div[2]/input")).sendKeys("12345756382647");
		//Enter the PAN details
		driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[2]/div[2]/input")).sendKeys("EILPD9543N");
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