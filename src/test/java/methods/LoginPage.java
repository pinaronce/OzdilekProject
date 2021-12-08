package methods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import objects.LoginPageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private AppiumDriver<MobileElement> driver;
    LoginPageObject loginPageObject;

    public LoginPage(AppiumDriver<MobileElement> appiumDriver) {
        this.driver = appiumDriver;
    }

    public boolean checkLoginPage() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement checkLoginButton = driver.findElementById(loginPageObject.checkLoginButton);
        return checkLoginButton.isDisplayed();
    }

    public void textEntryMailField() {
        WebElement mailTextField = driver.findElementById(loginPageObject.mailTextField);
        mailTextField.sendKeys("PINAR");
    }

    public void passwordEntryField() {
        WebElement passwordTextField = driver.findElementById(loginPageObject.passwordTextField);
        passwordTextField.sendKeys("abcd");
    }

    public void clickBackButton() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement backButton = driver.findElementById(loginPageObject.backButton);
        backButton.click();
    }
}

