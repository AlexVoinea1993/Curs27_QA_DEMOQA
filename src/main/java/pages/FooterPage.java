package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends BasePage {

    @FindBy(tagName = "footer")
    WebElement footer;
    @FindBy(xpath = "//h5[contains(text(),'Information')]")
    WebElement informationTitle;
    @FindBy(xpath = "//a[contains(text(),'About Us')]")
    WebElement aboutUs;
    @FindBy(xpath = "//a[contains(text(),'Information')]")
    WebElement deliveryInformation;
    @FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
    WebElement privacyPolicy;
    @FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
    WebElement termsAndConditions;
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    WebElement contactUs;
    @FindBy(xpath = "//a[contains(text(),'Returns')]")
    WebElement returns;
    @FindBy(xpath = "//a[contains(text(),'Site Map')]")
    WebElement siteMap;
    @FindBy(xpath = "//a[contains(text(),'Brands')]")
    WebElement brands;
    @FindBy(xpath = "//a[contains(text(),'Gift Certificates')]")
    WebElement giftCertificates;
    @FindBy(xpath = "//a[contains(text(),'Affiliate')]")
    WebElement affiliate;
    @FindBy(xpath = "//a[contains(text(),'Specials')]")
    WebElement specials;

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public void printFooterColor() {
        System.out.println(footer.getCssValue("background-color"));
    }

    public String getFooterColor() {
        return footer.getCssValue("background-color");
    }

    public boolean isInformationTitleDisplayed() {
        return informationTitle.isDisplayed();
    }

    public String getInformationTitleText() {
        return informationTitle.getText();
    }

    public void printInformationColor() {
        System.out.println(informationTitle.getCssValue("color"));
    }

    public String getInformationColor() {
        return informationTitle.getCssValue("color");
    }

    public boolean isAboutUsDisplayed() {
        return aboutUs.isDisplayed();
    }

    public String getAboutUsText() {
        return aboutUs.getText();
    }

    public void printAboutUsColor() {
        System.out.println(aboutUs.getCssValue("color"));
    }

    public String getAboutUsColor() {
        return aboutUs.getCssValue("color");
    }

    public boolean isDeliveryInformationDisplayed() {
        return deliveryInformation.isDisplayed();
    }

    public String getDeliveryInformationText() {
        return deliveryInformation.getText();
    }

    public void printDeliveryInformationColor() {
        System.out.println(deliveryInformation.getCssValue("color"));
    }

    public String getDeliveryInformationColor() {
        return deliveryInformation.getCssValue("color");
    }

    public boolean isPrivacyPolicyDisplayed() {
        return privacyPolicy.isDisplayed();
    }

    public String getPrivacyPolicyText() {
        return privacyPolicy.getText();
    }

    public void printPrivacyPolicyColor() {
        System.out.println(privacyPolicy.getCssValue("color"));
    }

    public String getPrivacyPolicyColor() {
        return privacyPolicy.getCssValue("color");
    }

    public boolean isTermsAndConditionsDisplayed() {
        return termsAndConditions.isDisplayed();
    }

    public String getTermsAndConditionsText() {
        return termsAndConditions.getText();
    }

    public void printTermsAndConditionsColor() {
        System.out.println(termsAndConditions.getCssValue("color"));
    }

    public String getTermsAndConditionsColor() {
        return termsAndConditions.getCssValue("color");
    }

    public boolean isContactUsDisplayed() {
        return contactUs.isDisplayed();
    }

    public String getContactUsText() {
        return contactUs.getText();
    }

    public void printContactUsColor() {
        System.out.println(contactUs.getCssValue("color"));
    }

    public String getContactUsColor() {
        return contactUs.getCssValue("color");
    }

    public boolean isReturnsDisplayed() {
        return returns.isDisplayed();
    }

    public String getReturnsText() {
        return returns.getText();
    }

    public void printReturnsColor() {
        System.out.println(returns.getCssValue("color"));
    }

    public String getReturnsColor() {
        return returns.getCssValue("color");
    }

    public boolean isSiteMapDisplayed() {
        return siteMap.isDisplayed();
    }

    public String getSiteMapText() {
        return siteMap.getText();
    }

    public void printSiteMapColor() {
        System.out.println(siteMap.getCssValue("color"));
    }

    public String getSiteMapColor() {
        return siteMap.getCssValue("color");
    }

    public boolean isBrandsDisplayed() {
        return brands.isDisplayed();
    }

    public String getBrandsDisplayed() {
        return brands.getText();
    }

    public void printBrandsColor() {
        System.out.println(brands.getCssValue("color"));
    }

    public String getBrandsColor() {
        return brands.getCssValue("color");
    }

    public boolean isGiftCertificatesDisplayed() {
        return giftCertificates.isDisplayed();
    }

    public String getGiftCertificatesDisplayed() {
        return giftCertificates.getText();
    }

    public void printGiftCertificatesColor() {
        System.out.println(giftCertificates.getCssValue("color"));
    }

    public String getGiftCertificatesColor() {
        return giftCertificates.getCssValue("color");
    }

    public boolean isAffiliateDisplayed() {
        return affiliate.isDisplayed();
    }

    public String getAffiliateDisplayed() {
        return affiliate.getText();
    }

    public void printAffiliateColor() {
        System.out.println(affiliate.getCssValue("color"));
    }

    public String getAffiliateColor() {
        return affiliate.getCssValue("color");
    }

    public boolean isSpecialsDisplayed() {
        return specials.isDisplayed();
    }

    public String getSpecialsDisplayed() {
        return specials.getText();
    }

    public void printSpecialsColor() {
        System.out.println(specials.getCssValue("color"));
    }

    public String getSpecialsColor() {
        return specials.getCssValue("color");
    }
}





