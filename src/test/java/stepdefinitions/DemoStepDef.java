package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef {

	@Given("launch the application")
	public void launch_the_application() {
	   System.out.println("1");
	}
	
		
	@When("^login with username (.+) and password (.+)$")
	public void login_with_user(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	@When("enter the login details")
	public void enter_the_login_details(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}
	@Then("Home will be displayed")
	public void home_will_be_displayed() {
		System.out.println("3");
	}
	
	@Given("setting the database entries")
	public void setting_the_database_entries() {
		System.out.println("***********************");
		System.out.println("Given-Background");
	}
	@When("launch browser from config variables")
	public void launch_browser_from_config_variables() {
		System.out.println("When-Background");
	}
	@Then("expected result")
	public void expected_result() {
		System.out.println("Then");
	}

}
