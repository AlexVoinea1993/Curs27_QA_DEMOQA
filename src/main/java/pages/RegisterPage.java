package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class RegisterPage extends BasePage {

    @FindBy(css = "#input-firstname")
    WebElement firstName;
    @FindBy(css = "#input-lastname")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;
    @FindBy(css = "#input-telephone")
    WebElement telephone;
    @FindBy(css = "#input-password")
    WebElement password;
    @FindBy(css = "#input-confirm")
    WebElement repeatPassword;
    @FindBy(xpath = "(//input[@type='radio'])[3]")
    WebElement subscribe;
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBox;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement continueButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName() {
        firstName.sendKeys(Constants.FIRST_NAME);
    }

    public void inputLastName() {
        lastName.sendKeys(Constants.LAST_NAME);
    }

    public void inputEmail() {
        email.sendKeys(Constants.EMAIL);
    }

    public void inputTelephone() {
        telephone.sendKeys(Constants.TELEPHONE_NUMBER);
    }

    public void inputPassword() {
        password.sendKeys(Constants.PASSWORD);
    }

    public void inputRepeatPassword() {
        repeatPassword.sendKeys(Constants.PASSWORD);
    }

    public void clickSubscribe() {
        subscribe.click();
    }

    public void clickCheckBox() {
        checkBox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

}
