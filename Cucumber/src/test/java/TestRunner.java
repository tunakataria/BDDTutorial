import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/Feature"},glue = {"StepDefs"},plugin ="cucumber.runtime.formatter.SerenityReporter")
public class TestRunner {
}
