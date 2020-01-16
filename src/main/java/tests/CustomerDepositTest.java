package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.lang.Thread.sleep;


public class CustomerDepositTest extends PageProvider{

    @When("^I click deposit tab$")
    public void clickDepositTab() throws InterruptedException {
        sleep(3000);
        getCustomerDepositPage().navigateToDepositTab();
    }

    @When("^I type the deposit as (.*)$")
    public void chooseDepositAmount(String depositAmount) throws InterruptedException {
        sleep(3000);
        getCustomerDepositPage().typeDepositAmount(depositAmount);

    }

    @When("^I click deposit submit button$")
    public void clickDepositSubmitButton() throws InterruptedException {
        sleep(3000);
        getCustomerDepositPage().submitDeposit();
    }

    @Then("^I verify amount input of Deposit")
    public void verifyMessageSuccesfully() throws InterruptedException {
        sleep(3000);
        getCustomerDepositPage().verifyMessageSuccessfully();
    }

    @Then("^I navigate to Transaction Tab")
    public void navigateTransactionTab() throws InterruptedException {
        sleep(3000);
        getTransactionPage().navigateTransactionTab();
    }

    @Then("^I verify that customer deposit successfully as (.*)$")
    public void verifyDepositSuccesfully(String deposit) throws InterruptedException {
        sleep(3000);
        getCustomerDepositPage().verifyAmountInput(deposit);
    }

    @Then("^I verify that customer deposit unsuccessfully as (.*)$")
    public void verifyDepositunSuccesfully(String deposit) throws InterruptedException {
        sleep(3000);
        getCommonPage().verifyAmountInput(deposit);
    }

}
