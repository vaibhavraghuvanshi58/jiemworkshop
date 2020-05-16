package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features/sanity.feature",
		glue="stepdef",
		dryRun = false,
		tags = {"@sanity"}
		
		)
public class TestRunner {
	
}
