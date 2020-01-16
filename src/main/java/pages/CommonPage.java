package pages;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import runner.TestRunner;

public class CommonPage {

    public void closeAlertPopup() {
        TestRunner.driver.switchTo().alert().accept();
    }

    public String getAndCloseAlertPopup() {
        Alert alert = TestRunner.driver.switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        return alertMessage;
    }

    public void getAddSuccessfully(){
        String alertText = getAndCloseAlertPopup();
        String addSuccessfully = "";

        for (int i = 0; i < alertText.length() - 3; i++) {
            addSuccessfully += alertText.charAt(i);
        }
        Assert.assertEquals(addSuccessfully, "Customer added successfully with customer id");
    }

    public void getAccountNumber() {
        String alertText = getAndCloseAlertPopup();
        String accountNumber = "";

        for (int i = 0; i < alertText.length() - 6; i++) {
            accountNumber += alertText.charAt(i);
        }
        Assert.assertEquals(accountNumber, "Account created successfully with account Number");
    }
}
