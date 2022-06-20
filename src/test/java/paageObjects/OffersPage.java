package paageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//single responsibility principle
//loosely coupled
//Factory Design Pattern


public class OffersPage {
    public WebDriver driver;

    public OffersPage(WebDriver driver){
        this.driver=driver;
    }

    By search=By.cssSelector("[type='search']");
    By productName=By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]");

    public void searchItem(String string){
        driver.findElement(search).sendKeys(string);
    }
    public void getSearchText(){
        driver.findElement(search).getText();
    }
    public String getProductName(){
       return driver.findElement(productName).getText();
    }

}
