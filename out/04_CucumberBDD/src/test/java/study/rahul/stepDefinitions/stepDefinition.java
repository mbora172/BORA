package study.rahul.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

import static org.bouncycastle.cms.RecipientId.password;

@RunWith(Cucumber.class)
public class stepDefinition {
    @Given("validate the browser")
    public void validate_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("deciding the browser to open");
    }
    @When("Browser is triggered")
    public void browser_is_triggered() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Browser is triggered");
    }
    @Then("check if browser is started")
    public void check_if_browser_is_started() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Browser is started");
    }
    @Given("^User is on NetBanking langing page$")
    public void user_is_on_netbanking_langing_page() {

        System.out.println("navigated to login urldaDCDaddsafsfd;");

    }


    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("logged in successfully");

    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("validated home page");
    }
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
        System.out.println(string2);
    }
    @When("^User login in to2 application with (.+) and (.+)$")
    public void user_login_in_to2_application_with_and(String username, String password) throws Throwable {



        System.out.println(username);
        System.out.println(password);
    }

    @When("User sign up with following details")
    public void user_sign_up_with_following_details(DataTable dataTable) {
        List<List<String>> obj = dataTable.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }


    @And("Cards are displayed are {string}")
    public void cards_are_displayed_are(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Card displayed is  "+string);
    }


//    @Given("User is on NetBanking langing page")
//    public void user_is_on_net_banking_langing_page() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("working");
//    }
//    @When("User login into application with username and password")
//    public void user_login_into_application_with_username_and_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Home page is populated")
//    public void home_page_is_populated() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Cards are displayed")
//    public void cards_are_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


}
