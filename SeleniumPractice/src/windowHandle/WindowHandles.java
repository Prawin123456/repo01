package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
		String parenthandle = driver.getWindowHandle();
	//	System.out.println("parenthandle"+parenthandle);
	
		driver.findElement(By.id("newWindowBtn")).click();
	
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
		//	System.out.println(handle);
			if(!handle.equals(parenthandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("prawin");
				driver.close(); 
			}
			
		}
		
		driver.switchTo().window(parenthandle);
		driver.findElement(By.id("name")).sendKeys("radhe");
		Thread.sleep(2000);
		
		
		
		
	}

}
