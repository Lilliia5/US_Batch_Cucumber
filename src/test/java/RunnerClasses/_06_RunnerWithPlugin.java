package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        tags = "SmokeTest",
        plugin = "html:target/site/cucumber-pretty.html"// use plugin to get the report, if you want the report you need to use the plugins
        // html:target/cucumber-reports -> generate html report
)

public class _06_RunnerWithPlugin extends AbstractTestNGCucumberTests {
}
