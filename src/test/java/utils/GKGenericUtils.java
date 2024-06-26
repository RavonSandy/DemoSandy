package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GKGenericUtils {
	
	public WebDriver driver;

	public GKGenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void switchFromHomeToTopDealPage() {

		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		String parentWindow = iterate.next();
		String childWindow = iterate.next();
		driver.switchTo().window(childWindow);
	}
}
