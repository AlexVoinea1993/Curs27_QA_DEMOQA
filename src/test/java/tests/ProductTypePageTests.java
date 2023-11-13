package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductTypePage;
import utils.Constants;
import utils.DisplayedTexts;

public class ProductTypePageTests extends BaseTest {

    @Test
    public void tabletsPageSectionTest() {
        ProductTypePage productTypePage = new ProductTypePage(driver);
        productTypePage.clickTabletsPageSection();
        Assert.assertTrue(productTypePage.isGridViewDisplayed());
        productTypePage.printGridViewColor();
        Assert.assertEquals(productTypePage.getGridViewColor(), Constants.BLACK_COLOR1);
        productTypePage.clickListViewOption();
        Assert.assertTrue(productTypePage.isListOptionDisplayed());
        productTypePage.printListViewColor();
        Assert.assertEquals(productTypePage.getListViewColor(), Constants.BLACK_COLOR1);
        Assert.assertTrue(productTypePage.isSortByDisplayed());
        Assert.assertEquals(productTypePage.getSortByTextDisplayed(), DisplayedTexts.SORT_BY);
        productTypePage.printSortByTextColor();
        Assert.assertEquals(productTypePage.getSortByTextColor(), Constants.BLACK_COLOR2);
        Assert.assertTrue(productTypePage.isShowDisplayed());
        Assert.assertEquals(productTypePage.getShowDisplayed(), DisplayedTexts.SHOW);
        productTypePage.printShowColor();
        Assert.assertEquals(productTypePage.getShowColor(), Constants.BLACK_COLOR2);
    }
}

