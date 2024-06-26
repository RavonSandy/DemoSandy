package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//dryRun=true -> it will not run the scenarios, it is only compiling(checking the all step definitions are correctly added for respective scenario steps in feature file)
//monochrome=true -> it is used for showing the results in simple format without adding any colours
//plugin -> it helps to generating execution report
//pretty -> it makes report colourful

@CucumberOptions(features = "C:\\Users\\manir\\eclipse-workspace\\Demo\\Features\\", glue = "stepdefinitions", dryRun=false, tags = "@Checkout or @productSearch", plugin = {
		"pretty", "html:target\\cucumber.html", "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunnerClass extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}

}
