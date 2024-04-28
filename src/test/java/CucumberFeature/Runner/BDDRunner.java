package CucumberFeature.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/CucumberFeature/feature/login.feature",
        glue = "src/test/java/CucumberFeature/StepDefination/LoginClassStepDefination.java"
)
public class BDDRunner {

}
