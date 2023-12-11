package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Constants;

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
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCart;
    @FindBy(xpath = "//input[@name='option[218]']")
    WebElement smallOptionRadioButton;
    @FindBy(xpath = "(//input[@name='option[223][]'])[1]")
    WebElement checkBox3;
    @FindBy(css = "#input-option208")
    WebElement textBox;
    @FindBy(css = "#input-option217")
    WebElement selectBox;
    @FindBy(css = "#input-option209")
    WebElement textArea;
    @FindBy(css = "#input-option219")
    WebElement date;
    @FindBy(css = "#input-option221")
    WebElement time;
    @FindBy(css = "#input-option220")
    WebElement dateAndTime;
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement productQuantity;
    @FindBy(css = "#cart-total")
    WebElement checkOutButton1;
    @FindBy(xpath = "(//i[@class='fa fa-share'])[2]")
    WebElement checkOutButton2;

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

    public void printShowColor() {
        System.out.println(show.getCssValue("color"));
    }

    public String getShowColor() {
        return show.getCssValue("color");
    }

    public void clickProductAddToCart() {
        addToCart.click();
    }

    public void clickSmallRadioButton() {
        scrollToElement(smallOptionRadioButton);
        smallOptionRadioButton.click();
    }

    public void clickCheckBox() {
        checkBox3.click();
    }

    public void inputTextBox() {
        scrollToElement(textBox);
        textBox.clear();
        textBox.sendKeys(Constants.COMMENT1);
    }

    public void selectBoxSelect() {
        scrollToElement(selectBox);
        Select select = new Select(selectBox);
        select.selectByValue("4");
    }

    public void inputTextAreaBox() {
        textArea.clear();
        textArea.sendKeys(Constants.COMMENT2);
    }

    public void inputDate() {
        scrollToElement(date);
        date.clear();
        date.sendKeys(Constants.DATE);
    }

    public void inputTime() {
        scrollToElement(time);
        time.clear();
        time.sendKeys(Constants.TIME);
    }

    public void inputDateAndTime() {
        scrollToElement(dateAndTime);
        dateAndTime.clear();
        dateAndTime.sendKeys(Constants.DATE, Constants.TIME);
    }

    public void inputProductQuantity() {
        scrollToElement(productQuantity);
        productQuantity.clear();
        productQuantity.sendKeys(Constants.NUMBER_OF_PRODUCTS);
    }

    public void clickAddToCartButton() {
        scrollToElement(addToCart);
        addToCart.click();
    }

    public void clickCheckOutButton1() {
        checkOutButton1.click();
    }

    public void clickCheckOutButton2() {
        checkOutButton2.click();
    }
}

