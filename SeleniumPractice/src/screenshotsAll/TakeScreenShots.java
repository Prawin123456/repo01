package screenshotsAll;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	driver.get("https://demo.dealsdray.com/");	//To lounch browser
	driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");//pass username
	driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");//pass password
	driver.findElement(By.xpath("//button[@type='submit']")).click();//click on submit button
	
	
//	driver.switchTo().frame("_hjSafeContext_19709754");
	WebElement iframe = driver.findElement(By.xpath("//iframe[@title='_hjSafeContext']"));
	driver.switchTo().frame(iframe);
	
	driver.findElement(By.xpath("//button[@class='MuiButtonBase-root has-submenu compactNavItem open css-46up3a']")).click();//click on order dropdown
	
	driver.findElement(By.xpath("//span[@class='sidenavHoverShow MuiBox-root css-i9zxpg']")).click();//click on order
	
	//upload file demo data
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\admin\\Downloads\\demo-data.xlsx");
	
	//click on import button
	driver.findElement(By.xpath("//button[ text() ='Import']")).click();
	
	//click on vallidate button
	driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
	
	//To take screen shot of entire web page
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File src = new File("./errorShots/image.jpeg");
	FileHandler.copy(temp, src);	
	
	
	
		
	}

}
