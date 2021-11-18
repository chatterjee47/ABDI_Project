package com.gmail.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",				
		glue = "testcases_stepDefinitions",
		monochrome=true,
		dryRun=false
		)

public class Runner {

}
