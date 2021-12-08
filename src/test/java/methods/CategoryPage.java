package methods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;
import objects.CategoryPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CategoryPage {
    private AppiumDriver<MobileElement> driver;
    CategoryPageObjects categoryPageObjects;


    public CategoryPage(AppiumDriver<MobileElement> appiumDriver) {
        this.driver = appiumDriver;
    }

    public void checkCategoryPage() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue("Sayfada kategori xpathini bulamamıştır.", driver.findElementByXPath(categoryPageObjects.checkCategory).isDisplayed());
    }

    public void selectGender() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement genderButton = driver.findElementByXPath(categoryPageObjects.genderButton);
        genderButton.click();
    }

    public void selectProductCategory() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement productCategory = driver.findElementByXPath(categoryPageObjects.productCategory);
        productCategory.click();
    }

    public void scrollToBottom() {
        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.5);
        int end_y = (int) (dimension.height * 0.2);
        for (int i = 0; i < 3; i++) {
            TouchAction action =
                    new TouchAction((PerformsTouchActions) driver)
                            .press(PointOption.point(start_x, start_y))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                            .moveTo(PointOption.point(end_x, end_y))
                            .release().perform();
        }
    }

    public void selectRandom() {
        Random rand = new Random();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<MobileElement> productList = driver.findElements(By.xpath(categoryPageObjects.productXpath));
        WebElement randomElement = productList.get(rand.nextInt(productList.size()));
        randomElement.click();
    }
}

