package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utils.Constants;

public class FooterTest extends BaseTest {

    @Test
    public void validateFooterColor() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.printFooterColor();
        Assert.assertEquals(footerPage.getFooterColor(), Constants.FOOTER_COLOR);
    }

    @Test
    public void validateInformationDisplayed() throws InterruptedException {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.scrollDownPage();
        Assert.assertTrue(footerPage.isInformationTitleDisplayed());
        Assert.assertEquals(footerPage.getInformationTitleText(), "Information");
        footerPage.printInformationColor();
        Assert.assertEquals(footerPage.getInformationColor(), Constants.INFORMATION_COLOR);
        Assert.assertTrue(footerPage.isAboutUsDisplayed());
        Assert.assertEquals(footerPage.getAboutUsText(), "About Us");
        footerPage.printAboutUsColor();
        Assert.assertEquals(footerPage.getAboutUsColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isDeliveryInformationDisplayed());
        Assert.assertEquals(footerPage.getDeliveryInformationText(), "Delivery Information");
        footerPage.printDeliveryInformationColor();
        Assert.assertEquals(footerPage.getDeliveryInformationColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isPrivacyPolicyDisplayed());
        Assert.assertEquals(footerPage.getPrivacyPolicyText(), "Privacy Policy");
        footerPage.printPrivacyPolicyColor();
        Assert.assertEquals(footerPage.getPrivacyPolicyColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isTermsAndConditionsDisplayed());
        Assert.assertEquals(footerPage.getTermsAndConditionsText(), "Terms & Conditions");
        footerPage.printTermsAndConditionsColor();
        Assert.assertEquals(footerPage.getTermsAndConditionsColor(), Constants.GREY_COLOR);
    }

    @Test
    public void validateCustomerServiceDisplayed() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.scrollDownPage();
        Assert.assertTrue(footerPage.isContactUsDisplayed());
        Assert.assertEquals(footerPage.getContactUsText(), "Contact Us");
        footerPage.printContactUsColor();
        Assert.assertEquals(footerPage.getContactUsColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isReturnsDisplayed());
        Assert.assertEquals(footerPage.getReturnsText(), "Returns");
        footerPage.printReturnsColor();
        Assert.assertEquals(footerPage.getReturnsColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isSiteMapDisplayed());
        Assert.assertEquals(footerPage.getSiteMapText(), "Site Map");
        footerPage.printSiteMapColor();
        Assert.assertEquals(footerPage.getSiteMapColor(), Constants.GREY_COLOR);
    }

    @Test
    public void validateExtrasDisplayed() {
        FooterPage footerPage = new FooterPage(driver);
        Assert.assertTrue(footerPage.isBrandsDisplayed());
        Assert.assertEquals(footerPage.getBrandsDisplayed(), "Brands");
        footerPage.printBrandsColor();
        footerPage.scrollDownPage();
        Assert.assertEquals(footerPage.getBrandsColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isGiftCertificatesDisplayed());
        Assert.assertEquals(footerPage.getGiftCertificatesDisplayed(), "Gift Certificates");
        footerPage.printGiftCertificatesColor();
        Assert.assertEquals(footerPage.getGiftCertificatesColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isAffiliateDisplayed());
        Assert.assertEquals(footerPage.getAffiliateDisplayed(), "Affiliate");
        footerPage.printAffiliateColor();
        Assert.assertEquals(footerPage.getAffiliateColor(), Constants.GREY_COLOR);
        Assert.assertTrue(footerPage.isSpecialsDisplayed());
        Assert.assertEquals(footerPage.getSpecialsDisplayed(), "Specials");
        footerPage.printSpecialsColor();
        Assert.assertEquals(footerPage.getSpecialsColor(), Constants.GREY_COLOR);
    }
}
