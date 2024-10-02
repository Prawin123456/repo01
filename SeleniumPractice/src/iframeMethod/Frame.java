package iframeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         
         //first method
         driver.get("https://www.dream11.com/");
         driver.switchTo().frame("send-sms-iframe");
         
         
         //second method
   //      WebElement fr = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
  //       driver.switchTo().frame(fr);
         
         driver.findElement(By.id("regEmail")).sendKeys("8757104019");

	}

}
