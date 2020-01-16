package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class OpenAccountTest extends PageProvider {

    @When("^I choose account as (.+) and currency as (.+)$")
    public void openAccount(String fullname, String currency) throws InterruptedException {
        getOpenAccountPage().getUserInformation(fullname);
        getOpenAccountPage().getCurrency(currency);
    }

    @And("^I click open account$")
    public void clickOpenAccount() throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickProcess();
    }

    @Then("^I verify that user is already open$")
    public void verifyUserAlreadyOpen() throws InterruptedException {
        Thread.sleep(3000);
        getCommonPage().getAccountNumber();
    }
}
