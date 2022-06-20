package study.rahul.cucumberOptions;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/study/rahul/features/Login.feature",
        glue ="study/rahul/stepDefinitions")
public class TestNgTestRunner extends AbstractTestNGCucumberTests{


}
