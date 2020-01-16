package pages;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.sleep;

public class CustomerDepositPage extends CommonPage{
    String currentDate;
    @FindBy(xpath = "//div[3]/button[2]")
    WebElement depositTab;
    @FindBy(xpath = "//div[4]/div/form/div/input")
    WebElement depositNumber;
    @FindBy(xpath = "//form/button")
    WebElement depositButton;
    @FindBy(xpath = "//div[4]/div/span")
    WebElement messageLabel;

    public void navigateToDepositTab() throws InterruptedException {
        Thread.sleep(3000);
        depositTab.click();
    }

    public void typeDepositAmount(String depositAmount) throws InterruptedException {
        sleep(3000);
        depositNumber.clear();
        depositNumber.sendKeys(depositAmount);

    }

    public void submitDeposit() throws InterruptedException {
        sleep(3000);
        depositButton.click();
        currentDate = getDateTime();
    }

    public void verifyMessageSuccessfully() throws InterruptedException {
        if (messageLabel.isDisplayed()) {
            if (messageLabel.getText().equalsIgnoreCase("Deposit Successful")) {
                System.out.println("Label message of Deposit is display!");
            } else {
                System.out.println("Label message of Deposit is not display!");
            }
        }
    }

}



