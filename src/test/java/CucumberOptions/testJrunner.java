package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/searchProduct.feature",
        glue= "stepDefinitions",stepNotifications = true,monochrome = true,
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})
//"not @SanityTest"//and//@SmokeTest or @RegTest

public class testJrunner {
}
