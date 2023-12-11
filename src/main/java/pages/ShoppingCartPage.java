package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Constants;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "(//i[@class='fa fa-caret-down'])[3]")
    WebElement estimatedShippingAndTaxes;
    @FindBy(css = "#input-country")
    WebElement country;
    @FindBy(css = "#input-zone")
    WebElement regionOrState;
    @FindBy(css = "#input-postcode")
    WebElement inputPostCode;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOut;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void clickEstimatedShippingAndTaxesTab() {
        scrollToElement(estimatedShippingAndTaxes);
        estimatedShippingAndTaxes.click();
    }

    public void inputCountrySelect() {
        country.click();
        Select select = new Select(country);
        select.selectByValue("175");
        country.click();
    }

    public void inputRegionOrState() {
        regionOrState.click();
        Select select = new Select(regionOrState);
        select.selectByValue("2688");
    }

    public void inputPostCode() {
        inputPostCode.sendKeys(Constants.POSTCODE);
    }

    public void clickCheckOutButton() {
        scrollToElement(checkOut);
        checkOut.click();
    }
}
