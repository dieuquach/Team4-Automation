package tests;

import org.openqa.selenium.support.PageFactory;
import pages.*;
import runner.TestRunner;

public class PageProvider {

    private static AddCustomerPage addCustomerPage;
    private static OpenAccountPage openAccountPage;
    private static CommonPage commonPage;
    private static SearchCustomerPage searchCustomerPage;
    private static DeleteCustomerPage deleteCustomerPage;

    public static AddCustomerPage getAddCustomerPage() {
        if (addCustomerPage == null) {
            addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
        }
        return addCustomerPage;
    }

    public static OpenAccountPage getOpenAccountPage() {
        if (openAccountPage == null) {
            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
        }
        return openAccountPage;
    }

    public static CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
        }
        return commonPage;
    }

    public static SearchCustomerPage getSearchCustomerPage() {
        if (searchCustomerPage == null) {
            searchCustomerPage = PageFactory.initElements(TestRunner.driver, SearchCustomerPage.class);
        }
        return searchCustomerPage;
    }

    public static DeleteCustomerPage getDeleteCustomerPage() {
        if (deleteCustomerPage == null) {
            deleteCustomerPage = PageFactory.initElements(TestRunner.driver, DeleteCustomerPage.class);
        }
        return deleteCustomerPage;
    }

}
