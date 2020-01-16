package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CustomerWithdrawTest extends PageProvider{

    @When("^I open withdraw tab$")
    public void openWithdrawTab() throws Throwable {
        Thread.sleep(2000);
       getCustomerWithdrawPage().navigateToWithdrawTab();
    }


    @When("^I type withdraw as(.*)$")
    public void chooseWithdrawAmount(String withdrawAmount) throws InterruptedException {
        Thread.sleep(2000);
        getCustomerWithdrawPage().typeWithdrawAmount(withdrawAmount);
    }

    @When("^I click withdraw submit button$")
    public void clickWithdrawSubmitButton() throws InterruptedException {
        Thread.sleep(10000);
        getCustomerWithdrawPage().submitWithdraw();
    }

    @Then("^I verify amount input of Withdraw")
    public void verifyInputWithdraw() throws InterruptedException {
        Thread.sleep(3000);
        getCustomerWithdrawPage().verifyMessage();
    }

    @Then("^I navigate to Transaction Tabw")
    public void navigateTransactionTab() throws InterruptedException {
        Thread.sleep(3000);
        getTransactionPage().navigateTransactionTab();
    }


    @Then("^I verify that customer withdraw successfully as(.*)$")
    public void verifyWithdrawSuccesfully(String withdraw) throws InterruptedException {
        Thread.sleep(5000);
        getCommonPage().verifyAmountInput(withdraw);

    }

    @Then("^I verify that customer withdraw unsuccessfully as (.*)$")
    public void verifyWithdrawunSuccesfully(String withdraw) throws InterruptedException {
        Thread.sleep(3000);
        getCommonPage().verifyAmountInput(withdraw);

    }

}
