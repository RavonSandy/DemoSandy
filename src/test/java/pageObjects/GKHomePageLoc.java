package pageObjects;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GKHomePageLoc {
	
	public WebDriver driver;
	
	By SearchTextBox = By.xpath("//input[@type='search']");
	By HomeProductText = By.xpath("//h4[@class='product-name']");
	By addproductQtyButton = By.xpath("//a[text()='+']");
	By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
	By CartLink = By.xpath("//img[@alt='Cart']");
	By checkoutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public GKHomePageLoc(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SearchTextBox(String sname) {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sname);
	}
	
	public String HomeProductText() {
		return driver.findElement(HomeProductText).getText();
	}
	
	public void addproductQtyButton(int quantity) {
		
		for(int i=0;i<quantity-1;i++ ) {
			driver.findElement(addproductQtyButton).click();
		}
	}
	
	public void addToCartButton() {
		driver.findElement(addToCartButton).click();
	}
	
	public void proceedToCheckout() {
		driver.findElement(CartLink).click();
		driver.findElement(checkoutButton).click();
	}

}
