package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenOfWEBELEMENT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://upsc.gov.in/");
		
		File temp=driver.findElement(By.xpath("//img[@alt='digital india']")).getScreenshotAs(OutputType.FILE);
		File src=new File("./errorShots/image2.png");
		FileHandler.copy(temp, src);
		
		
	}

}
