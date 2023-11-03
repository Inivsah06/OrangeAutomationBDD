package com.dhl.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(
			features = {"src/test/resources/login.feature"}
			,glue = {"com.dhl.steps"}
			,publish = false
		    ,plugin = {"html:target/cucumber-report.html","json:target/cucumber-report.json"}
			,dryRun = false
			)
	
public class RunnerTest extends AbstractTestNGCucumberTests
{
		
}
		
