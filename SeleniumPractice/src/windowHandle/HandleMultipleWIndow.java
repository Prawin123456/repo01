package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWIndow {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.id("newWindowsBtn")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println(handle);
			if(handle.equals(parent)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("prawin");
				Thread.sleep(2000);
				driver.quit();
			}
		}
	}

}
