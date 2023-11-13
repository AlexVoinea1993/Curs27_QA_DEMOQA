package tests;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import utils.Constants;

public class HomePageTests extends BaseTest {

    @Test
    public void titlePageColorTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.printTitleColor();
        Assert.assertEquals(headerPage.getTitleColor(), (Constants.TITLE_COLOR));
    }

    @Test
    public void searchBarColorTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.printSearchBarColor();
        Assert.assertEquals(headerPage.getSearchBarColor(), Constants.SEARCH_BAR_COLOR);
    }

    @Test
    public void searchButtonColorTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.printSearchButtonColor();
        Assert.assertEquals(headerPage.getSearchButtonColor(), Constants.SEARCH_BUTTON_COLOR);
    }

    @Test
    public void shoppingCartColorTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.printShoppingCartColor();
        Assert.assertEquals(headerPage.getShoppingCartColor(), Constants.SHOPPING_CART_COLOR);
    }

    @Test
    public void navigationBarColorTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.printNavigationBarColor();
        Assert.assertEquals(headerPage.getNavigationBarColor(), Constants.NAVIGATION_BAR_COLOR);
    }
}

