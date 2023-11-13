package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccount;
    @FindBy(xpath = "//h2[contains(text(),'My Orders')]")
    WebElement myOrders;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMyAccountTextDisplayed() {
        return myAccount.isDisplayed();
    }

    public String getMyAccountText() {
        return myAccount.getText();
    }

    public boolean isMyOrdersTextDisplayed() {
        return myOrders.isDisplayed();
    }

    public String getMyOrdersTextDisplayed() {
        return myOrders.getText();
    }
}
