package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerTest extends PageProvider {

    @When("^I type first name as (.+), last name as (.+), post code as (.+)$")
    public void inputUserInformation(String firstname, String lastname, String postcode) throws InterruptedException {
        Thread.sleep(3000);
        getAddCustomerPage().setUserInformation(firstname, lastname, postcode);
    }

    @And("^I click submit$")
    public void clickSubmit() throws InterruptedException {
        getAddCustomerPage().clickSubmit();
    }

    @Then("^I verify that system is already added customer as (.+) successfully$")
    public void verifyCustomerAddSuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickOpenAccountTab();
        getOpenAccountPage().clickCheckUserName();
        getOpenAccountPage().checkUserInformation(fullname, true);
    }

    @Then("^I verify that user is already add$")
    public void verifyAlertAdd() throws InterruptedException {
        Thread.sleep(3000);
        getCommonPage().getAddSuccessfully();
    }

    @Then("^I verify that system is already added customer as (.+) unsuccessfully")
    public void verifyCustomerAddUnSuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickOpenAccountTab();
        getOpenAccountPage().checkUserInformation(fullname, false);
    }
}
