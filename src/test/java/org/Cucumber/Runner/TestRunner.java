package org.Cucumber.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/Facebook.feature",
		glue = {"stepdefinition"}, 
		tags = {"@fb"}, 
		plugin = "html:target",
		dryRun = false)
public class TestRunner {

}
