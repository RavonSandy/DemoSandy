package stepdefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pageObjects.GKCartPageLoc;
import utils.GKUtility;

public class GKCartPage {
	
	public GKUtility Utility;
	public GKCartPageLoc GKCartPageLoc;
	 
		
	public GKCartPage(GKUtility Utility) {
		this.Utility = Utility;
		this.GKCartPageLoc = Utility.POM.getGKCartPageLocObj();
	}
	
	@Then("validate the products in the cart")
	public void validate_the_products_in_the_cart() {
		
		String name = GKCartPageLoc.getProdName();	
		System.out.println("HomeProduct : " + Utility.HomeProduct + "/ CheckoutPage : " + name);
		Assert.assertEquals(Utility.HomeProduct, name);
	}
	
	@Then("place order the product")
	public void place_order_the_product() throws InterruptedException {
		
		GKCartPageLoc.placeOrder();
	}
	

}
