package contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\priya\\eclipse-workspace\\vtiger\\src\\test\\resources\\Testdata\\orgdata.properties");
		//// to read the data from physical file ie.property file
		// so to read that we use fileinputstream class
		Properties pobj = new Properties();
		pobj.load(fis);// to load key we use load method
		String Browsername = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
          // random number
		Random random = new Random();
		int randomint = random.nextInt(1000);

		// read test script data from excel file
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\priya\\eclipse-workspace\\vtiger\\src\\test\\resources\\Testdata\\orgdatainEXCEL.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("contact");
		Row row = sh.getRow(1);
		String lastname = row.getCell(3).toString() + randomint;

		WebDriver driver = null;

		if (Browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browsername.equals("edge")) {
			driver = new EdgeDriver();
		}

		else if (Browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		// step1: login to app
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// step2 navigate contacts module

		driver.findElement(By.linkText("Contacts")).click();

		// step3: click on create contact button
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();

		// step4: enter all the details and create new organization
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		//step 5: verigy header message expected result
		String actlastName= driver.findElement(By.id("dtlview_Last Name")).getText();
		if(actlastName.equals(lastname)) {
			System.out.println(lastname+"is created==PASS");
		}
		else {
			System.out.println(lastname+"is not created==FAIL");
		}
				//step6
	driver.quit();
	}

}


	


