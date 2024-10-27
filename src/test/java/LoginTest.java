import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void emptyUserLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.netflix.com/pl-en/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.sendKeysInputUPassword("this_is_password");
        loginPage.clickButtonSignin();

        Assertions.assertEquals(LoginMessage.INVALID_LOGIN, loginPage.getErrorMessageInvalidLogin());
    }

    @Test
    public void emptyPassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.netflix.com/pl-en/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.sendKeysInputUserLogin("login@login.com");
        loginPage.clickButtonSignin();

        Assertions.assertEquals(LoginMessage.INVALID_PASSWORD, loginPage.getErrorMessageInvalidPassword());
    }

    @Test
    public void unregisteredUser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/pl-en/login");
        LoginPage loginPage = new LoginPage(driver);

        String userLogin = "login@login.com";
        loginPage.sendKeysInputUserLogin(userLogin);
        loginPage.sendKeysInputUPassword("Password123!");
        loginPage.clickButtonSignin();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Assertions.assertEquals(LoginMessage.UNREGISTERED_USER + userLogin, loginPage.getErrorMessageUnregisteredUser());
    }

}
