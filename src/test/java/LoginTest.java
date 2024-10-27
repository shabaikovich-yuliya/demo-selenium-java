import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
