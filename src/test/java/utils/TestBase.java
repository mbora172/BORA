package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"//src/test//resources//global.properties");
        Properties properties=new Properties();
        properties.load(fileInputStream);
        String url=properties.getProperty("QAUrl");
        String browser_properties= properties.getProperty("browser");
        String browser_maven=System.getProperty("browser");
        String browser=browser_maven!=null?browser_maven : browser_properties;
        if (driver==null)
        {
            if (browser.equalsIgnoreCase("chrome")){
            if (properties.getProperty("browser").equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
            }}

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get(url);
        }
        return driver;
    }

}
