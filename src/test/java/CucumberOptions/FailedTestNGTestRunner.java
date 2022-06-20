package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//html, xml,json,junit,extent
//@RunWith(Cucumber.class)
@CucumberOptions (features = "@target/failed_scenarios.txt",
         glue= "stepDefinitions"

,monochrome = false,plugin = {"html:target/cucumber.html",
        "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestNGTestRunner extends AbstractTestNGCucumberTests {
// @DataProvider(parallel = true)
// @Override
// public Object[][] scenarios() {
//  return super.scenarios();
// }
}
