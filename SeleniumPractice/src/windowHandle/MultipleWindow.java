package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for(String handle:handles) {
			System.out.println(handle);
			if(handle.equals(parenthandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("prawin");
				
			}
			
		}
	}

}
