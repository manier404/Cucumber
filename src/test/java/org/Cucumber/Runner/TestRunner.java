package org.Cucumber.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/FileName.feature",
		glue = "src/test/java/stepdefinition", 
		tags = {"@sanity","@smoke"}, 
		plugin = "html:target",
		dryRun = true)
public class TestRunner {

}
