package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class LoginPage extends BasePage {

    @FindBy(css = "#input-email")
    WebElement emailAddress;
    @FindBy(css = "#input-password")
    WebElement password;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmailAddress() {
        emailAddress.sendKeys(Constants.USED_EMAIL);
    }

    public void inputPassword() {
        password.sendKeys(Constants.PASSWORD);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
    public boolean isErrorMessageDisplayed(){
        return errorMessage.isDisplayed();
    }
    public String getErrorMessageText(){
        return errorMessage.getText();
    }
    public void printErrorMessageTextColor(){
        System.out.println(errorMessage.getCssValue("color"));
    }
    public String getErrorMessageTextColor(){
        return errorMessage.getCssValue("color");
    }
    public void inputWrongEmailAddress(){
        emailAddress.sendKeys(Constants.WRONG_EMAIL_ADDRESS);
    }
    public void inputWrongPassword(){
        password.sendKeys(Constants.WRONG_PASSWORD);
    }
}
