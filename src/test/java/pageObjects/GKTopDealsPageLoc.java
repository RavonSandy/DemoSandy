package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GKTopDealsPageLoc {
	
			public WebDriver driver;
		
		By SearchTextBox = By.xpath("//input[@type='search']");
		By TopDealsProductText = By.xpath("//td[1]");
		
		public GKTopDealsPageLoc(WebDriver driver) {
			this.driver = driver;
		}
		
		public void SearchTextBox(String sname) {
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sname);
		}
		
		public String TopDealsProductText() {
			return driver.findElement(TopDealsProductText).getText();
		}


}
