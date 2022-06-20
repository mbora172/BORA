package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Set;

public class GenericUtils {
    public WebDriver driver;

    public GenericUtils(WebDriver driver){
        this.driver=driver;
    }

    public void SwitchWindowToChild(){
        Set<String> window = driver.getWindowHandles();
        ArrayList<String> windowList = new ArrayList<>();
        for (String each : window) {windowList.add(each);}
        driver.switchTo().window(windowList.get(1));
    }
}
