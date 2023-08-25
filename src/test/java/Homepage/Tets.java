package Homepage;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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

public class Tets {
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

	@Test(priority = 0)
	public void RememberMe() throws InterruptedException, IOException {
		FileInputStream file = new FileInputStream(".//DataFiles//Login.xlsx");
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

			WebElement HomepageDisplay = driver.findElement(By.xpath("/html/body/div[1]/h1"));

			Assert.assertEquals(HomepageDisplay.getText(), "Inquiry");

			Thread.sleep(1000);
		}
	}

	@Test(priority = 1)
	public void InquiryEntry() throws AWTException, EncryptedDocumentException, IOException, InterruptedException {
		


			

			// Enter the fullname
			driver.findElement(By.id("fullName")).sendKeys("SHAHIN SAYYED");
			Thread.sleep(1000);
			// Enter the Mobile No
			
			driver.findElement(By.id("dob")).sendKeys("01.01.1975");
			Thread.sleep(1000);
			Robot r = new Robot();
			r.mouseWheel(1);
			driver.findElement(By.id("mobileNo")).sendKeys("7721008330");
			Thread.sleep(1000);
			// Enter the address
			driver.findElement(By.id("address")).sendKeys("MAHDA COLONY SIRASWADU ROAD JALNA 431203");
			Thread.sleep(1000);
			// Select the state
			driver.findElement(By.cssSelector("[value='Maharashtra']")).click();
			Thread.sleep(1000);
			// Enter the city
			driver.findElement(By.id("city")).sendKeys("JALNA");
			Thread.sleep(1000);
			// Enter the pincode
			driver.findElement(By.id("pincode")).sendKeys("431203");
			Thread.sleep(1000);
			// Enter the Adhar KYC
			driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[1]/div[2]/input")).sendKeys("547454776410");
			Thread.sleep(1000);
			// Enter the PAN details
			driver.findElement(By.xpath("//*[@id=\"kycSections\"]/div[2]/div[2]/input")).sendKeys("QEKPS1142M");
			Thread.sleep(1000);

	//		driver.findElement(By.cssSelector("[type='submit']")).submit();
			
			Thread.sleep(500);
		//	driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[2]/a")).click();
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
