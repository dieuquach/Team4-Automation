package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getSearchCustomerPage;

public class SearchCustomerTest {
    @When("^I type some text (.+) into the search box$")
    public void searchCustomerInformation(String fullName) throws InterruptedException {
        Thread.sleep(3000);
        getSearchCustomerPage().setSearchUserInformation(fullName);
    }

    @Then("^I verify the search results (.+)$")
    public void searchVerifyCustomer(String keyword) throws InterruptedException {
        Thread.sleep(3000);
        getSearchCustomerPage().getSearchResultTableInformation(keyword);
    }
}
