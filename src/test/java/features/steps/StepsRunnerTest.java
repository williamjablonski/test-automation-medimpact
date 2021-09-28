package features.steps;

import org.junit.runner.RunWith;

import utils.DriverTestInstance;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
    features = "src/test/java/features",
    		tags = {"~@ignore"},
            glue = "com.ntconsult",
    monochrome = true)

public class StepsRunnerTest extends DriverTestInstance {

}

