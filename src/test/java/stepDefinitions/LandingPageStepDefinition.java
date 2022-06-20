package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import paageObjects.LandingPage;
import utils.TestCOntextSetup;

public class LandingPageStepDefinition {
 public  WebDriver driver;
 public String landingPageProductName;
 public String offerPageProductName;
 public WebDriverWait wait;
    LandingPage landingPage;
 TestCOntextSetup testCOntextSetup;
    public LandingPageStepDefinition(TestCOntextSetup testCOntextSetup){
        this.testCOntextSetup=testCOntextSetup;
      this.landingPage=testCOntextSetup.pageObjectManager.getLandingPage();
    }
    @Given("User is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() {

        Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
    }
    @When("^user searched with Shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) throws InterruptedException {

        landingPage.searchItem(string);
       Thread.sleep(2000);
        testCOntextSetup.landingPageProductName=landingPage.getProductName().split(" -")[0].trim();
        System.out.println(landingPageProductName + " is exrtacted from home page");


    }
    @When("add {string} item in your cart")
    public void adbjlkm(String string) throws InterruptedException {
        landingPage.incrementQuantity(Integer.parseInt(string));
        landingPage.addToCart();
        Thread.sleep(2000);
        System.out.println("adddcart");

    }


}
