package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import runner.TestRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CommonPage {

    @FindBy(xpath = "//div[2]/table")
    WebElement myTable;
    String currentDate;

    public String getDateTime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm");
        currentDate = myDateObj.format(myFormatObj);
        return currentDate;
    }

    public void verifyAmountInput(String amount){

        List<WebElement> listTr = myTable.findElements(By.tagName("tr"));
        for (int i = 1; i < listTr.size(); i++) {
            List<WebElement> listTd = listTr.get(i).findElements(By.tagName("td"));
            String tdDateTime = String.valueOf(listTd.get(0).getText());
            String tdAmount = String.valueOf(listTd.get(1).getText());
            String tdTransactionType = String.valueOf(listTd.get(2).getText());
            if (tdAmount.contains(amount) && (tdDateTime.contains(currentDate))) {
                if(tdTransactionType.equalsIgnoreCase("Credit")){
                    System.out.println("Add Credit successfully !!!");
                }
                else
                    System.out.println("Add Debit successfully !!!");
            }
        }
    }

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
