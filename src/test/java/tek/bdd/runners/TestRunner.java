package tek.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//public class TestRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
           features = "classpath:features",
            glue = "tek.bdd.steps",
            dryRun = false,
            tags="@smoke1"
    )
    public class TestRunner{

    }

