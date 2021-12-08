package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import methods.CategoryPage;

public class CategorySteps extends BaseTest {
    CategoryPage categoryPage = new CategoryPage(appiumDriver);

    @Step("Kategoriler sayfasinin acildigi dogrulanir. ")
    public void checkPageOpened() {
        categoryPage.checkCategoryPage();
        logger.info("Kategoriler sayfasi acildi...");
    }

    @Step("Menüden kadin secenegine tiklanir.")
    public void isGenderClicked() {
        categoryPage.selectGender();
        logger.info("Menüden kadin secenegi acildi...");
    }

    @Step("Pantolon kategorisi acilir.")
    public void isCategoryClicked() {
        categoryPage.selectProductCategory();
        logger.info("Pantolon kategorisi acildi...");
    }

    @Step("Sayfanin en asagasina dogru iki kere scroll edilir.")
    public void isScrollDown() {
        categoryPage.scrollToBottom();
        logger.info("Sayfa iki defa scroll edildi...");
    }

    @Step("Urunlerden rastgele bir urun secilir.")
    public void isRandomProductSelected() throws InterruptedException {
        categoryPage.selectRandom();
        logger.info("Rastgele bir urun secildi...");
    }
}