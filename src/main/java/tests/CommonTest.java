package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import runner.TestRunner;

import static java.lang.Thread.sleep;
import static tests.PageProvider.*;

public class CommonTest {

    @Given("Open website (.*)$")
    public void user_already_on_home_page(String website) throws InterruptedException {
        sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
    }

    @When("^I login successfully with username as (.*)$")
    public void loginBeforeWithdraw(String usernameSelected) throws InterruptedException {
        sleep(2000);
        getCustomerLoginPage().selectUserName(usernameSelected);
        getCustomerLoginPage().clickLoginButton();
        sleep(5000);
    }


    @When("^I type deposit successfully with deposit as (.*)$")
    public void alreadyDepositBeforeWithdrawl(String depositAmount) throws Throwable {
        getCustomerDepositPage().navigateToDepositTab();
        sleep(2000);
        getCustomerDepositPage().typeDepositAmount(depositAmount);
        sleep(2000);
        getCustomerDepositPage().submitDeposit();

    }
    @When ("^I verify user input Deposit successful with (.*)$")
    public void verifyDeposit(String deposit) throws InterruptedException {
        sleep(2000);
        getCustomerDepositPage().navigateToDepositTab();
        getCustomerDepositPage().typeDepositAmount(deposit);
        getCustomerDepositPage().submitDeposit();
    }

    @When ("^I verify user input Withdraw successful with (.*)$")
    public void verifyWithdraw(String withdraw) throws InterruptedException {
        sleep(2000);
        getCustomerWithdrawPage().navigateToWithdrawTab();
        getCustomerWithdrawPage().typeWithdrawAmount(withdraw);
        getCustomerWithdrawPage().submitWithdraw();
    }

}


