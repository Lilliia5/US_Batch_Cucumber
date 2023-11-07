package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java",
        glue = "StepDefinitions",
        tags = "@SmokeTest"
)
public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {
}
