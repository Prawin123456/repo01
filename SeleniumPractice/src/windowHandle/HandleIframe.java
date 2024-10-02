package windowHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleIframe {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("rahul");
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		driver.findElement(By.id("firstName")).sendKeys("prawin");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		driver.findElement(By.id("malerb")).click();
	
//		Select select=new Select(driver.findElement(By.id("course")));
//		select.selectByVisibleText("Java");
		
		
	}

}
