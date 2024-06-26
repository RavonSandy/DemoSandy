package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	WebDriver driver;
	String file;
	
	
	
	public WebDriver WebDriverManager() throws IOException {
		file = System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties";
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("dUrl");
		String Browser = prop.getProperty("browser");
		
		if(driver==null) {
			if(Browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if(Browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
			}
		return driver;
	}
	

}
