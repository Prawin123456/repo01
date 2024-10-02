package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle1 {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent = driver.getWindowHandle();
        driver.findElement(By.id("newTabBtn")).click();
        ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--notification-disabled");
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles) {
			driver.switchTo().window(handle);
			ChromeOptions etting=new ChromeOptions();
			etting.addArguments("--notification-disabled");
			driver.findElement(By.id("alertBox")).click();
		//	driver.findElement(By.id("newTabBtn")).sendKeys("ram");
			}
	      }
	 

}
