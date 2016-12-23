package RunnerClasses;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/",
		glue={"CucumberImplementationPackage"},
		tags={""},
		plugin={"html:target/CucumberTestReport"}
		)
public class TestRunner {

}
  