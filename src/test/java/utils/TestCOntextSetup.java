package utils;

import org.openqa.selenium.WebDriver;
import paageObjects.PageObjectManager;

import java.io.IOException;

public class TestCOntextSetup {
    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TestCOntextSetup() throws IOException {
        testBase= new TestBase();
        pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
        genericUtils=new GenericUtils(testBase.WebDriverManager());

    }
}

