package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import methods.LoginPage;

public class LoginSteps extends BaseTest {
    LoginPage loginPage = new LoginPage(appiumDriver);

    @Step("Giris yapma sayfasinin acildigi dogrulanır.")
    public void isLoginPageOpened() {
        loginPage.checkLoginPage();
        logger.info("Giris yapma sayfası sorunsuz bir sekilde acildi...");
    }

    @Step("Kullanici adi alanina text bilgisi girilir.")
    public void mailEntered() {
        loginPage.textEntryMailField();
        logger.info("Kullanici adi alanina text bilgisi girildi...");
    }

    @Step("Password alanina sifre yazilir.")
    public void passwordEntered() {
        loginPage.passwordEntryField();
        logger.info("Password alanina sifre yazildi...");
    }

    @Step("Geri butonuna tiklanir.")
    public void backClicked() {
        loginPage.clickBackButton();
        logger.info("Geri butonuna tiklandi...");
    }
}
