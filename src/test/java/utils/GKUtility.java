package utils;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class GKUtility {

	public WebDriver driver;
	public String HomeProduct;
	public PageObjectManager POM;
	public TestBase TestBase;
	public GKGenericUtils GenericUtils;
	
	public GKUtility() throws IOException {
		
		TestBase = new TestBase();
		POM = new PageObjectManager(TestBase.WebDriverManager());
		GenericUtils = new GKGenericUtils(TestBase.WebDriverManager());
		
	}

	

}
