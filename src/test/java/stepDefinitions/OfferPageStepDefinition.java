package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import paageObjects.LandingPage;
import paageObjects.OffersPage;
import paageObjects.PageObjectManager;
import utils.TestCOntextSetup;

public class OfferPageStepDefinition {
    public WebDriver driver;
    public String landingPageProductName;
    PageObjectManager pageObjectManager;
    public String offerPageProductName;
    public WebDriverWait wait;
    TestCOntextSetup testCOntextSetup;
    public OfferPageStepDefinition(TestCOntextSetup testCOntextSetup){
        this.testCOntextSetup=testCOntextSetup;
    }


    @When("user searched with Shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) throws InterruptedException {
        testCOntextSetup.driver.findElement(By.cssSelector("[type='search']")).sendKeys(string);
        Thread.sleep(2000);
        landingPageProductName=driver.findElement(By.cssSelector("h4.product-name")).getText().split(" -")[0].trim();
//        System.out.println(landingPageProductName + " is exrtacted from home page");


    }
    @Then("^user Searched for (.+) shortname in offers page to check if product exist$")
    public void user_searched_for_shortname_in_offers_page_to_check_if_product_exist(String string) throws InterruptedException {

        switchTooffersPage();
        OffersPage offersPage=new OffersPage(testCOntextSetup.driver);
        Thread.sleep(2000);
        System.out.println(string);
        offersPage.searchItem(string);
        wait=new WebDriverWait(testCOntextSetup.driver, 3);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]")));
        offerPageProductName=offersPage.getProductName();
        System.out.println(offerPageProductName);
        System.out.println(landingPageProductName);
        System.out.println("something");
        System.out.println("anaotherth");
    }
    public void switchTooffersPage(){
//        if (testCOntextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {
         //  pageObjectManager=new PageObjectManager(testCOntextSetup.driver);
            LandingPage landingPage= testCOntextSetup.pageObjectManager.getLandingPage();
            landingPage.selectTopDealsPage();
            testCOntextSetup.genericUtils.SwitchWindowToChild();



    }
    @Then("validate product name in offers page matches with Landing Page")

    public void validate_produ(){

      Assert.assertEquals(landingPageProductName,offerPageProductName,"failed");
    }

}
