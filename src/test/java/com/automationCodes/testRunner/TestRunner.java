package com.automationCodes.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features="src/test/resources/features",
	    glue ="com.automationCodes.stepDefinitions",
	    monochrome=true,
	    plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)
public class TestRunner extends AbstractTestNGCucumberTests {
}