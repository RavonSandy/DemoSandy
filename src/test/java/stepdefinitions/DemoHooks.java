package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DemoHooks {
	
	// Before -> Background -> Scenario -> After
	
	@Before("@Amazon")
	public void amazon() {
		System.out.println("setting the amazon database entries");
	}
	
	@After
	public void end() {
		System.out.println("deleting the all database entries");
	}
	
	@Before("@Flipkart")
	public void flipkart() {
		System.out.println("setting the flipkart database entries");
	}
	

}
