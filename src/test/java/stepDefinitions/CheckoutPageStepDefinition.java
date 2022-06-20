package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import paageObjects.CheckoutPage;
import utils.TestCOntextSetup;

public class CheckoutPageStepDefinition {
 public  WebDriver driver;
 public String landingPageProductName;
 public String offerPageProductName;
 public WebDriverWait wait;
 public CheckoutPage checkoutPage;

 TestCOntextSetup testCOntextSetup;
    public CheckoutPageStepDefinition(TestCOntextSetup testCOntextSetup){
        this.testCOntextSetup=testCOntextSetup;
        this.testCOntextSetup.pageObjectManager.checkoutPage();

    }

@Then("verify user has ability apply and palace order button are dispaled")
    public void verify_user_has_ability_apply_and_palace_order_button_are_displayed() throws InterruptedException {

 Assert.assertTrue(checkoutPage.VerifyPromobutton());
    Assert.assertTrue(checkoutPage.VerifyPlaceorder());

    }

@Then("^confirm product (.+) in page$")
    public void confirm_product_page(String string) throws InterruptedException {
        Thread.sleep(2000);
        checkoutPage=testCOntextSetup.pageObjectManager.getcheckoutPage;
        checkoutPage.CheckoutItem();
}
}
