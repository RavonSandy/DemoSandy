package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GKCartPageLoc {
	WebDriver driver;
	String name;
	
	public GKCartPageLoc(WebDriver driver) {
		this.driver = driver;
	}
	
	By prodName = By.xpath("//p[@class='product-name']");
	By placeOrderButton = By.xpath("//button[text()='Place Order']");
	By countryDropdown = By.xpath("//select");
	By agreeCheckbox = By.xpath("//input[@class='chkAgree']");
	By proceedButton = By.xpath("//button[text()='Proceed']");
	
	
	public String getProdName() {
		name = driver.findElement(prodName).getText().split("-")[0].trim();
		return name;
				
	}
	
	public void placeOrder() throws InterruptedException {
		driver.findElement(placeOrderButton).click();
		Thread.sleep(3000);
		Select country = new Select(driver.findElement(countryDropdown));
		country.selectByValue("India");
		driver.findElement(agreeCheckbox).click();
		driver.findElement(proceedButton).click();
		//Thread.sleep(3000);
		
		}

}
