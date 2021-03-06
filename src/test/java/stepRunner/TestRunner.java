package stepRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/"
        ,glue={"Sensyne_StepDef"},
//        tags={"@GetProduct"},
        plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"}
        )
public class TestRunner{
    }
