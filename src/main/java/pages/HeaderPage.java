package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement login;
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountButton;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerButton;
    @FindBy(xpath = "//a[contains(text(),'Qafox.com')]")
    WebElement titleColorButton;
    @FindBy(xpath = "//input[@class='form-control input-lg']")
    WebElement searchBarColor;
    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    WebElement searchButtonColor;
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    WebElement shoppingCartColor;
    @FindBy(id = "menu")
    WebElement navigationBarColor;
    @FindBy(xpath = "(//a[contains(text(),'Components')])[1]")
    WebElement componentsTab;
    @FindBy(xpath = "//a[contains(text(),'Monitors')]")
    WebElement monitorsTab;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void printTitleColor() {
        System.out.println(titleColorButton.getCssValue("color"));
    }

    public String getTitleColor() {
        return titleColorButton.getCssValue("color");
    }

    public void printSearchBarColor() {
        System.out.println(searchBarColor.getCssValue("background-color"));
    }

    public String getSearchBarColor() {
        return searchBarColor.getCssValue("background-color");
    }

    public void printSearchButtonColor() {
        System.out.println(searchButtonColor.getCssValue("color"));
    }

    public String getSearchButtonColor() {
        return searchButtonColor.getCssValue("color");
    }

    public void printShoppingCartColor() {
        System.out.println(shoppingCartColor.getCssValue("background-color"));
    }

    public String getShoppingCartColor() {
        return shoppingCartColor.getCssValue("background-color");
    }

    public void printNavigationBarColor() {
        System.out.println(navigationBarColor.getCssValue("background-color"));
    }

    public String getNavigationBarColor() {
        return navigationBarColor.getCssValue("background-color");
    }

    public void clickLoginButton() {
        login.click();
    }

    public void clickComponentsTab() {
        componentsTab.click();
    }
    public void clickMonitorsTab(){
        monitorsTab.click();
    }
}

