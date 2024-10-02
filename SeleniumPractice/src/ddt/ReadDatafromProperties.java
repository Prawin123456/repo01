package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafromProperties {
	
	private void file() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./testData/testData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String URL=prop.getProperty("url");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("");
		
		

	}

}
