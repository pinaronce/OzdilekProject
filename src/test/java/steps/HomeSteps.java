package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import methods.HomePage;
import org.junit.Assert;

public class HomeSteps extends BaseTest {
    HomePage homePage = new HomePage(appiumDriver);

    @Step("Uygulamanin acildigi kontrol edilir.")
    public void isLogoDisplayed() throws InterruptedException {
        Assert.assertTrue(homePage.findLogo());
        logger.info("Uygulama sorunsuz bir sekilde acildi...");
    }

    @Step("Alisverise basla butonuna tiklanir.")
    public void isStartShoppingButtonSelected() {
        homePage.clickStartShoppingButton();
        logger.info("Alısverise basla butonuna tiklandi...");
    }

    @Step("Alışveris sayfasinin acildigi dogrulanir.")
    public void isMarketOpened() {
        Assert.assertTrue(homePage.checkShoppingPage());
        logger.info("Ana sayfa sorunsuz bir sekilde acildi... ");
    }

    @Step("Kategoriler sayfasi acilir.")
    public void isCategorySelected() {
        homePage.clickCategoriesButton();
        logger.info("Kategoriler sayfasi acildi...");
    }
}