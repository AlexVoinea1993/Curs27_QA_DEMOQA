package tests;

import org.testng.annotations.BeforeMethod;
import utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
    }
}

