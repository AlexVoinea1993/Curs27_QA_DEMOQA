package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountCreationNotificationPage;
import pages.HeaderPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void creatingAccountTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickRegisterButton();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmail();
        registerPage.inputTelephone();
        registerPage.inputPassword();
        registerPage.inputRepeatPassword();
        registerPage.scrollDownPage();
        registerPage.clickSubscribe();
        registerPage.clickCheckBox();
        registerPage.clickContinueButton();
        AccountCreationNotificationPage accountCreationNotificationPage = new AccountCreationNotificationPage(driver);
        accountCreationNotificationPage.clickContinueButton();
    }
}
