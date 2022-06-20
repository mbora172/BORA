package paageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    public WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }
    By addCart=By.cssSelector(".product-action");
    By checkoutButton= By.xpath("//button[text()='PROCEED TO CHECKOUT']");
    By promoButton=By.cssSelector(".promoBtn");
    By placeOrder=By.xpath("//button[text()='Place Order']");
    By cart=By.cssSelector("[alt='Cart']");


    public void CheckoutItem() throws InterruptedException {
        driver.findElement(cart).click();
      Thread.sleep(3000);
        driver.findElement(checkoutButton).click();
    }


    public Boolean VerifyPromobutton() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(promoButton).isDisplayed();
    }
    public Boolean VerifyPlaceorder(){
        return driver.findElement(placeOrder).isDisplayed();
    }


}
