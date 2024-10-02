package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {

		
		FileInputStream fis=new FileInputStream("./testData/demoweb.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		String URL=workbook.getSheet("Sheet").getRow(0).getCell(0).toString();
		String FIRSTNAME=workbook.getSheet("Sheet").getRow(1).getCell(0).getStringCellValue();
		String LASTNAME=workbook.getSheet("Sheet").getRow(2).getCell(0).getStringCellValue();
		String EMAIL=workbook.getSheet("Sheet").getRow(3).getCell(0).getStringCellValue();
        String PASSWORD=workbook.getSheet("Sheet").getRow(4).getCell(0).getStringCellValue();
		String CONFIRMEMAIL=workbook.getSheet("Sheet").getRow(5).getCell(0).getStringCellValue();

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(URL);
		driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
        driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRMEMAIL);

		
	}

}
