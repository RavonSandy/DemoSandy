package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public GKTopDealsPageLoc GKTopDealsPageLoc;
	public GKHomePageLoc GKHomePageLoc;
	public GKCartPageLoc GKCartPageLoc;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public GKTopDealsPageLoc getGKTopDealsPageObj() {
		GKTopDealsPageLoc = new GKTopDealsPageLoc(driver);
		return GKTopDealsPageLoc;
	}
	
	public GKHomePageLoc getGKHomePageObj() {
		GKHomePageLoc = new GKHomePageLoc(driver);
		return GKHomePageLoc;
	}
	
	public GKCartPageLoc getGKCartPageLocObj() {
		GKCartPageLoc = new GKCartPageLoc(driver);
		return GKCartPageLoc;
	}

}
