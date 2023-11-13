package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import pages.HeaderPage;
import pages.LoginPage;
import utils.Constants;
import utils.ErrorMessages;

public class LoginTests extends BaseTest {

    @Test
    public void loginPageTests() {
        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        loginPage.inputEmailAddress();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
    }

    @Test
    public void noUserNameAndNoPasswordLoginTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessageText(),
                ErrorMessages.LOGIN_ERROR_MESSAGE);
        loginPage.printErrorMessageTextColor();
        Assert.assertEquals(loginPage.getErrorMessageTextColor(), Constants.RED_COLOR);
    }

    @Test
    public void wrongUserNameCorrectPasswordLoginTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputWrongEmailAddress();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessageText(),
                ErrorMessages.LOGIN_ERROR_MESSAGE);
        loginPage.printErrorMessageTextColor();
        Assert.assertEquals(loginPage.getErrorMessageTextColor(), Constants.RED_COLOR);
    }

    @Test
    public void correctUserNameCorrectPasswordLoginTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmailAddress();
        loginPage.inputWrongPassword();
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessageText(),
                ErrorMessages.LOGIN_ERROR_MESSAGE);
        loginPage.printErrorMessageTextColor();
        Assert.assertEquals(loginPage.getErrorMessageTextColor(), Constants.RED_COLOR);
    }

    @Test
    public void noUserNameAndNoPassWordLoginTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessageText(),
                ErrorMessages.LOGIN_ERROR_MESSAGE);
        loginPage.printErrorMessageTextColor();
        Assert.assertEquals(loginPage.getErrorMessageTextColor(), Constants.RED_COLOR);
    }

    @Test
    public void correctUserNameAndNoPasswordLoginTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmailAddress();
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessageText(),
                ErrorMessages.LOGIN_ERROR_MESSAGE);
        loginPage.printErrorMessageTextColor();
        Assert.assertEquals(loginPage.getErrorMessageTextColor(), Constants.RED_COLOR);
    }
}
