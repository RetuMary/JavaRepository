package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "IslahiArtBDDCucumber/src/test/java/feature", // Path to your feature files
		glue = { "runner" }, // Package containing step definitions
		plugin = { "pretty", "html:target/cucumber-reports.html" },

		monochrome = true)

public class TestRunner {

}
