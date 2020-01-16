package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.plaf.TableHeaderUI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerWithdrawPage extends CommonPage{
    String currentDate;
    @FindBy(xpath = "//div/div[3]/button[3]")
    WebElement withdrawTab;
    @FindBy(xpath = "//div/div[4]/div/form/div/input")
    WebElement withdrawNumber;
    @FindBy(xpath = "//div/form/button")
    WebElement withdrawButton;
    @FindBy(xpath = "//div[4]/div/span")
    WebElement message;

    public void navigateToWithdrawTab() throws InterruptedException {
        Thread.sleep(3000);
        this.withdrawTab.click();
    }

    public void typeWithdrawAmount(String withdrawAmount) throws InterruptedException {
        Thread.sleep(3000);
        this.withdrawNumber.clear();
        this.withdrawNumber.sendKeys(withdrawAmount);
    }

    public void submitWithdraw() throws InterruptedException {
        Thread.sleep(3000);
        withdrawButton.click();
        currentDate = getDateTime();
    }

    public void verifyMessage() throws InterruptedException {
        Thread.sleep(3000);
        if (message.isDisplayed())
            if (message.getText().equalsIgnoreCase("Transaction successful")) {
                System.out.println(" Input Withdraw Successful");
            } else System.out.println("Input Withdraw unSuccessful");
    }
}
