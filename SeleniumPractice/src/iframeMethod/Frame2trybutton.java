package iframeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2trybutton {

	public static void main(String[] args) {

		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         
         driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
         
        driver.switchTo().frame("iframeResult");
        
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        
        
	}

}
