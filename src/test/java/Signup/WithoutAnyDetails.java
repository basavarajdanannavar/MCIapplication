package Signup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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

public class WithoutAnyDetails {public WebDriver driver;
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
	
	driver.findElement(By.cssSelector("[href='/signup']")).click();
	
	WebElement SignupPageDisplay = driver.findElement(By.xpath("/html/body/div[1]"));
	
	Assert.assertEquals(SignupPageDisplay.getText(), "Signup");

}
@Test(priority=2)
public void FillupSignupform() throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream(".//DataFiles//SignupData.xlsx");
    Workbook workbook = WorkbookFactory.create(file);
    @SuppressWarnings("rawtypes")
	org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("sheet1");

    // Loop through the rows and perform the login test cases
    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
        Row row = sheet.getRow(i);
        String Fullname = getCellValueAsString(row.getCell(0));
        String Email = getCellValueAsString(row.getCell(1));
        String Password = getCellValueAsString(row.getCell(2));
        String ConfirmPassword = getCellValueAsString(row.getCell(3));
        
	//Enter the Full name
	driver.findElement(By.id("fullName")).sendKeys(Fullname);
	
//Enter the E-mail
	driver.findElement(By.id("email")).sendKeys(Email);
	//Enter the password
	driver.findElement(By.id("password")).sendKeys(Password);
	//Enter the confirm password
	driver.findElement(By.id("confirm_password")).sendKeys(ConfirmPassword);
	//click on signup
	driver.findElement(By.cssSelector("[type='submit']")).click();
	

    }
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
