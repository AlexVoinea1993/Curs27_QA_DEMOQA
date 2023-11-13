package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductTypePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Tablets')]")
    WebElement tablets;
    @FindBy(css = ".fa-th")
    WebElement grid;
    @FindBy(css = ".fa.fa-th-list")
    WebElement list;
    @FindBy(xpath = "(//label[@class='input-group-addon'])[1]")
    WebElement sortBy;
    @FindBy(xpath = "(//label[@class= 'input-group-addon'])[2]")
    WebElement show;

    public ProductTypePage(WebDriver driver) {
        super(driver);
    }

    public void clickTabletsPageSection() {
        tablets.click();
    }

    public boolean isGridViewDisplayed() {
        return grid.isDisplayed();
    }

    public void printGridViewColor() {
        System.out.println(grid.getCssValue("color"));
    }

    public String getGridViewColor() {
        return grid.getCssValue("color");
    }

    public void clickListViewOption() {
        list.click();
    }

    public boolean isListOptionDisplayed() {
        return list.isDisplayed();
    }

    public void printListViewColor() {
        System.out.println(list.getCssValue("color"));
    }

    public String getListViewColor() {
        return list.getCssValue("color");
    }

    public boolean isSortByDisplayed() {
        return sortBy.isDisplayed();
    }

    public String getSortByTextDisplayed() {
        return sortBy.getText();
    }

    public void printSortByTextColor() {
        System.out.println(sortBy.getCssValue("color"));
    }

    public String getSortByTextColor() {
        return sortBy.getCssValue("color");
    }

    public boolean isShowDisplayed() {
        return show.isDisplayed();
    }

    public String getShowDisplayed() {
        return show.getText();
    }
    public void printShowColor(){
        System.out.println(show.getCssValue("color"));
    }
    public String getShowColor(){
        return show.getCssValue("color");
    }
}

