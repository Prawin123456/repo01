package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreeShotsMethod {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://upsc.gov.in/");
		
		TakesScreenshot st=(TakesScreenshot) driver;
		File temp=st.getScreenshotAs(OutputType.FILE);
		File src=new File("./errorShots/image.jpeg");
		FileHandler.copy(temp, src);
		
		
	}

}
