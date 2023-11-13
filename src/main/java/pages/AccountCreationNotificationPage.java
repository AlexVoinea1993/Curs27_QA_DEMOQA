package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationNotificationPage extends BasePage {

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement continueButton;

    public AccountCreationNotificationPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
