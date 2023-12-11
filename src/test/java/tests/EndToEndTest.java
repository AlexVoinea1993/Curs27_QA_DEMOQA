package tests;

import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.LoginPage;
import pages.ProductTypePage;
import pages.ShoppingCartPage;

public class EndToEndTest extends BaseTest {

    @Test
    public void buyAppleCinemaTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmailAddress();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        HeaderPage headerPage1 = new HeaderPage(driver);
        headerPage1.clickComponentsTab();
        headerPage1.clickMonitorsTab();
        ProductTypePage productTypePage = new ProductTypePage(driver);
        productTypePage.scrollDownPage();
        productTypePage.clickProductAddToCart();
        productTypePage.wait(2);
        productTypePage.clickSmallRadioButton();
        productTypePage.clickCheckBox();
        productTypePage.wait(1);
        productTypePage.inputTextBox();
        productTypePage.wait(1);
        productTypePage.selectBoxSelect();
        productTypePage.inputTextAreaBox();
        productTypePage.inputDate();
        productTypePage.inputTime();
        productTypePage.inputDateAndTime();
        productTypePage.inputProductQuantity();
        productTypePage.clickAddToCartButton();
        productTypePage.wait(1);
        productTypePage.clickCheckOutButton1();
        productTypePage.clickCheckOutButton2();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickEstimatedShippingAndTaxesTab();
        shoppingCartPage.inputCountrySelect();
        shoppingCartPage.inputRegionOrState();
        shoppingCartPage.inputPostCode();
        shoppingCartPage.clickCheckOutButton();
    }
}
