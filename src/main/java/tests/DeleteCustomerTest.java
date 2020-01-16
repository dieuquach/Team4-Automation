package tests;

import cucumber.api.java.en.Then;

import static tests.PageProvider.getDeleteCustomerPage;

public class DeleteCustomerTest {

    @Then("^I verify that system is already delete customer (.+) as (.+) as (.+)")
    public void deleteCustomerSuccessfully(String firstName, String lastName, String postCode) throws InterruptedException {
        Thread.sleep(3000);
        getDeleteCustomerPage().getCheckDeleteTheInformationTable(firstName, lastName, postCode);
    }
}
