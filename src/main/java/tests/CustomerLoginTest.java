package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;

import static tests.PageProvider.getCustomerLoginPage;

public class CustomerLoginTest {

    @When("^I select username as (.*)$")
    public void selectUserName(String usernameSelected) throws InterruptedException {
        Thread.sleep(3000);
        getCustomerLoginPage().selectUserName(usernameSelected);
    }

    @When("^I click login button$")
    public void clickLogin() throws InterruptedException {
        Thread.sleep(3000);
        getCustomerLoginPage().clickLoginButton();
    }

    @Then("^I verify that user as (.*) login successfully$")
    public void verifyLoginSuccessfully(String user) throws InterruptedException {
        Thread.sleep(3000);
        getCustomerLoginPage().verifyCustomerLoginSuccessfully(user);
    }
}
