package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesMethod {

	public static void main(String[] args) throws IOException {

FileInputStream fis=new FileInputStream("./TestData/TestData.properties");
		//create obj of respective file type
		Properties prop=new Properties();
		//call the methods
		prop.load(fis);
       
		
		
		String URL=prop.getProperty("url");
        String USERNAME=prop.getProperty("username");
        String PASSWORD=prop.getProperty("password");

		
		//testScript
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
	}

}
