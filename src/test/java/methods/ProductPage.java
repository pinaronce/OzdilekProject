package methods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import objects.ProductPageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProductPage {
    private AppiumDriver<MobileElement> driver;
    ProductPageObject productPageObject;

    public ProductPage(AppiumDriver<MobileElement> appiumDriver) {
        this.driver = appiumDriver;
    }

    public boolean checkProductPage() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement checkFilterOption = driver.findElementById(productPageObject.checkFilterOption);
        return checkFilterOption.isDisplayed();
    }

    public void clickFavoritesButton() {
        WebElement favoritesButton = driver.findElementById(productPageObject.favoritesButton);
        favoritesButton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void addProductToBasket() {
        WebElement addBasketButton = driver.findElementById(productPageObject.addBasketButton);
        addBasketButton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
