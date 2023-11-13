package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.LoginPage;
import pages.MyAccountPage;

public class MyAccountPageTests extends BaseTest {

    @Test
    public void myAccountPageTextTest() {
        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        loginPage.inputEmailAddress();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.isMyAccountTextDisplayed());
        Assert.assertEquals(myAccountPage.getMyAccountText(), "My Account");
        Assert.assertTrue(myAccountPage.isMyOrdersTextDisplayed());
        Assert.assertEquals(myAccountPage.getMyOrdersTextDisplayed(), "My Orders");
    }
}
