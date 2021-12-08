package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import methods.ProductPage;
import org.junit.Assert;

public class ProductSteps extends BaseTest {
    ProductPage productPage = new ProductPage(appiumDriver);

    @Step("Urun detay sayfasi acildigi kontrol edilir.")
    public void isProductPageOpened() {
        Assert.assertTrue(productPage.checkProductPage());
        logger.info("Urun detay sayfası sorunsuz bir sekilde acildi...");
    }

    @Step("Favoriler butonuna tiklanir.")
    public void isToFavorites() throws InterruptedException {
        productPage.clickFavoritesButton();
        logger.info("Favoriler butonuna tiklandi...");
    }

    @Step("Secilen urun sepete eklenir.")
    public void isProductAddedToBasket() throws InterruptedException {
        productPage.addProductToBasket();
        logger.info("Secilen urun sepete eklendi...");
    }
}
