package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GKHomePageLoc;
import pageObjects.PageObjectManager;
import utils.GKUtility;

public class GKHomePage {

	public WebDriver driver;
	public String HomeProduct;
	GKUtility Utility;
	PageObjectManager POM;

	public GKHomePage(GKUtility Utility) {
		this.Utility = Utility;
	}

	@Given("launch the browser and hit the url")
	public void launch_the_browser_and_hit_the_url() {

		/*
		 * Utility.driver = new ChromeDriver();
		 * Utility.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 */
	}

	@When("^search the product with (.+) and get the product name in home page$")
	public void search_the_product_with_and_get_the_product_name_in_home_page(String sname)throws InterruptedException {
		
		
		
		GKHomePageLoc GKHomePageLoc = Utility.POM.getGKHomePageObj();
		GKHomePageLoc.SearchTextBox(sname);
		
		
		
		//Utility.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(sname);
		Thread.sleep(1000);
		
		Utility.HomeProduct = GKHomePageLoc.HomeProductText().split("-")[0].trim();
		System.out.println("HomeProduct : " + Utility.HomeProduct);

	}
	
	@When("^select the product (.+) and add to the cart$")
	public void select_the_product_and_add_to_the_cart(int quantity) {
		GKHomePageLoc GKHomePageLoc = Utility.POM.getGKHomePageObj();
		GKHomePageLoc.addproductQtyButton(quantity);
		GKHomePageLoc.addToCartButton();
	}
	
	@Then("navigate to checkout page")
	public void navigate_to_checkout_page() throws InterruptedException {
		GKHomePageLoc GKHomePageLoc = Utility.POM.getGKHomePageObj();
		GKHomePageLoc.proceedToCheckout();
		Thread.sleep(2000);
	}
	
}


