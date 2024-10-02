package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("./TestData/TestDemo.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String URL=prop.getProperty("url");
		String FIRSTNAME=prop.getProperty("FirstName");
		String LASTNAME=prop.getProperty("LastName");
		String PASSWORD=prop.getProperty("Password");
		String EMAIL=prop.getProperty("Email");
		String CONFIRMEMAIL=prop.getProperty("ConfirmPassword");
		
		
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
