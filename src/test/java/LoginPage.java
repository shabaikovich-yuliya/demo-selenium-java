import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeysInputUserLogin(String login) {
        By inputUserLoginBy = By.xpath(LoginXpath.INPUT_USER_LOGIN_XPATH);
        WebElement inputUserLoginWebElement = driver.findElement(inputUserLoginBy);
        inputUserLoginWebElement.sendKeys(login);
    }

    public void sendKeysInputUPassword(String password) {
        By inputPasswordBy = By.xpath(LoginXpath.INPUT_PASSWORD_XPATH);
        WebElement inputPasswordWebElement = driver.findElement(inputPasswordBy);
        inputPasswordWebElement.sendKeys(password);
    }

    public void clickButtonSignin() {
        By buttonSigninBy = By.xpath(LoginXpath.BUTTON_SIGNIN_XPATH);
        WebElement buttonSigninWebElement = driver.findElement(buttonSigninBy);
        buttonSigninWebElement.click();
    }

    public String getErrorMessageInvalidLogin() {
        By errorMessageInvalidLoginBy = By.xpath(LoginXpath.ERROR_MESSAGE_INVALID_LOGIN);
        WebElement errorMessageInvalidLoginWebElement = driver.findElement(errorMessageInvalidLoginBy);
        return errorMessageInvalidLoginWebElement.getText();
    }

    public String getErrorMessageInvalidPassword() {
        By errorMessageInvalidPasswordBy = By.xpath(LoginXpath.ERROR_MESSAGE_INVALID_PASSWORD);
        WebElement errorMessageInvalidPasswordWebElement = driver.findElement(errorMessageInvalidPasswordBy);
        return errorMessageInvalidPasswordWebElement.getText();
    }

    public String getErrorMessageUnregisteredUser() {
        By errorMessageUnregisteredUserBy = By.xpath(LoginXpath.ERROR_MESSAGE_UNREGISTERED_USER);
        WebElement errorMessageUnregisteredUserWebElement = driver.findElement(errorMessageUnregisteredUserBy);
        return errorMessageUnregisteredUserWebElement.getText();
    }
}
