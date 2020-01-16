package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class DeleteCustomerPage {

    @FindBy(xpath = "//tbody/tr[1]/td[5]/button")
    WebElement deleteButton;

    @FindBy(xpath = "//div[2]/div/div/table/tbody")
    WebElement myTable;

    public void getCheckDeleteTheInformationTable(String firstName, String lastName, String postCode) throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> tableRows = myTable.findElements(By.tagName("tr"));
        for (int i = 0; i < tableRows.size() - 1; i++) {
            List<WebElement> myRow = tableRows.get(i).findElements(By.tagName("td"));
            System.out.println(myRow.get(0).getText() + myRow.get(1).getText() + myRow.get(2).getText());
            if (myRow.get(0).getText().equalsIgnoreCase(firstName)
                    && myRow.get(1).getText().equalsIgnoreCase(lastName)
                    && myRow.get(2).getText().equalsIgnoreCase(postCode)) {
                Thread.sleep(3000);
                deleteButton.click();
                System.out.println("Ok");
            } else System.out.println("NOT OK");
        }
    }

//    public void getCheckDeleteTheInformationTable(String firstName) throws InterruptedException {
//        Thread.sleep(3000);
//        List<WebElement> tableRows = myTable.findElements(By.tagName("tr"));
//        for(int i=1; i<tableRows.size(); i++){
//            WebElement listRow = tableRows.get(i);
////            System.out.println(listRow.getText());
//            List<WebElement> myRow = listRow.findElements(By.tagName("td"));
//            WebElement myTd = myRow.get(0);
////            System.out.println(myTd.getText());
//            String myAccount = myTd.getText();
//            if (myAccount.equalsIgnoreCase(firstName)){
//                System.out.println("OK");
//            }else System.out.println("not OK");
//        }
//    }

}