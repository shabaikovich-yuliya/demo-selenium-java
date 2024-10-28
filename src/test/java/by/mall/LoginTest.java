package by.mall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void emptyPhone() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.sendKeysInputPassword("Password123!");
        loginPage.clickButtonSignin();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Assertions.assertEquals(LoginMessages.EMPTY_PHONE, loginPage.getErrorMessage());
    }

    @Test
    public void emptyPassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.sendKeysInputPhone("291234567");
        loginPage.clickButtonSignin();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Assertions.assertEquals(LoginMessages.EMPTY_PASSWORD, loginPage.getErrorMessage());
    }



}
