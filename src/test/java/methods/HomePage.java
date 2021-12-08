package methods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import objects.HomePageObjects;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private AppiumDriver<MobileElement> driver;
    HomePageObjects homePageObjects;

    public HomePage(AppiumDriver<MobileElement> appiumDriver) {
        this.driver = appiumDriver;
    }

    public boolean findLogo() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement topLogo = driver.findElementById(homePageObjects.topLogo);
        return topLogo.isDisplayed();
    }

    public void clickStartShoppingButton() {
        WebElement startShoppingButton = driver.findElementById(homePageObjects.startShoppingButton);
        startShoppingButton.click();
    }

    public boolean checkShoppingPage() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement campaignsButton = driver.findElementById(homePageObjects.campaignsButton);
        return campaignsButton.isDisplayed();
    }

    public void clickCategoriesButton() {
        WebElement categoriesButton = driver.findElementById(homePageObjects.categoriesButton);
        categoriesButton.click();
    }

}

