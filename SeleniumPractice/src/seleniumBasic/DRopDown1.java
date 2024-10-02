package seleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DRopDown1 {

	public static void main(String[] args) {

		
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         
         
         driver.get("https://demowebshop.tricentis.com/books");
         
        WebElement dropdown = driver.findElement(By.id("products-orderby"));
        Select about=new Select(dropdown);
        about.selectByVisibleText("Price: Low to High");
         
         
         WebElement number = driver.findElement(By.id("products-pagesize"));
         Select num=new Select(number);
   //      num.selectByIndex(12);
       //    num.selectByValue("4");
       num.selectByVisibleText("4  ");
       
       WebElement grid = driver.findElement(By.id("products-viewmode"));  
       Select gr=new Select(grid);
       gr.selectByVisibleText("List");
         
	}

}
