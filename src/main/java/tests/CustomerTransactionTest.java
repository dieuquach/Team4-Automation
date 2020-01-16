package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

import static java.lang.Thread.sleep;

public class CustomerTransactionTest extends PageProvider {

    @When("^I click transaction tab$")
    public void clickTransactionTab() throws InterruptedException {
        Thread.sleep(3000);
        getTransactionPage().navigateTransactionTab();
    }

    @Then("^I verify user input (.*) and (.*) Successfully$")
    public void verifyDepositAndWithdrawSuccessfully(String deposit, String withdraw)throws InterruptedException {
        Thread.sleep(3000);
        getCustomerDepositPage().verifyAmountInput(deposit);
        getCustomerWithdrawPage().verifyAmountInput(withdraw);
    }

    @When("^I click reset button$")
    public void clickResetButton() throws InterruptedException {
        Thread.sleep(3000);
        getTransactionPage().resetTableTransaction();
    }

    @Then("^I verify the data of transaction is clear$")
    public void verifyDataReseted() throws InterruptedException {
        Thread.sleep(3000);
        getTransactionPage().verifyResetButtonSuccess();
    }

    @When("^I click back button$")
    public void clickBackButton() throws InterruptedException {
        Thread.sleep(3000);
        getTransactionPage().backButtonAtTransaction();
    }


    @Then("^I verify page transaction backed$")
    public void verifyPageBack() throws InterruptedException {
        Thread.sleep(3000);
        getTransactionPage().verifyBackButtonSuccess();
    }

    @Then("^I verify user navigate to login page$")
    public void verifyDataCorrect() throws InterruptedException {
        Thread.sleep(3000);
      getTransactionPage().verifyBackButtonSuccess();
    }














}
