package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.GKUtility;

public class GKHooks {
	
	GKUtility Utility;
	WebDriver driver;
	
	public GKHooks(GKUtility Utility) {
		this.Utility = Utility;
	}
	
@After
	public void closeApp() throws IOException {
		
		Utility.TestBase.WebDriverManager().quit();
	}

@AfterStep
public void addScreenshot(Scenario scenario) throws IOException {
	
	driver = Utility.TestBase.WebDriverManager();
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	byte [] filecontent = FileUtils.readFileToByteArray(screenshot);
	scenario.attach(filecontent, "image/png", "image");
	
} 


}
