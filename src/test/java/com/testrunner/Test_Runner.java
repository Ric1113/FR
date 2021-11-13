package com.testrunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = "C:\\Users\\richa\\eclipse-workspace\\Cucumber.Adactin_FRM\\src\\test\\java\\com\\featuref\\com\\AdactinDataDriven.feature"
				,glue = {"com.stepdefinition"}
//				,tags= {"@Smoke"}
				,dryRun = false
				,monochrome = true
				,strict = true
				,format= {"pretty","com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"})

public class Test_Runner {

	

}
