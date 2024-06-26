package stepdefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.GKTopDealsPageLoc;
import utils.GKUtility;
import pageObjects.PageObjectManager;

public class GKTopDealsPage {

	public String TopDealProduct;
	GKUtility Utility;
	public PageObjectManager POM;
	
	

	public GKTopDealsPage(GKUtility Utility) {
		this.Utility = Utility;
	}

	@Then("^search the product with (.+) and get the product name in top deals page$")
	public void search_the_product_with_and_get_the_product_name_in_top_deals_page(String sname) {
		
		
		GKTopDealsPageLoc GKTopDealsPageLoc = Utility.POM.getGKTopDealsPageObj();
		Utility.GenericUtils.switchFromHomeToTopDealPage();
		GKTopDealsPageLoc.SearchTextBox(sname);
		TopDealProduct = GKTopDealsPageLoc.TopDealsProductText();
		System.out.println("TopDealProduct : " + TopDealProduct);

	}

	@Then("validate the product name of home page and top deals page")
	public void validate_the_product_name_of_home_page_and_top_deals_page() {
		System.out.println("HomeProduct : " + Utility.HomeProduct + "/ TopDealProduct : " + TopDealProduct);
		Assert.assertEquals(Utility.HomeProduct, TopDealProduct);
		
		
	}

}
