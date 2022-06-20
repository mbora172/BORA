package paageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public LandingPage landingPage;
    public OffersPage offersPage;
    public WebDriver driver;
    public CheckoutPage getcheckoutPage;
    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }


    public LandingPage getLandingPage(){
    landingPage=  new LandingPage(driver);
    return landingPage;
    }
    public OffersPage OffersPage(){
        offersPage=new OffersPage(driver);
        return offersPage;
    }
    public CheckoutPage checkoutPage(){
        getcheckoutPage=new CheckoutPage(driver);
        return getcheckoutPage;
    }

}
