package by.mall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeysInputPhone(String phone) {
        By inputPhoneBy = By.xpath(LoginXpath.INPUT_PHONE_XPATH);
        WebElement inputPhoneWebElement = driver.findElement(inputPhoneBy);
        inputPhoneWebElement.sendKeys(phone);
    }

    public void sendKeysInputPassword(String password) {
        By inputPasswordBy = By.xpath(LoginXpath.INPUT_PASSWORD_XPATH);
        WebElement inputPasswordWebElement = driver.findElement(inputPasswordBy);
        inputPasswordWebElement.sendKeys(password);
    }

    public void clickButtonSignin() {
        By buttonSigninBy = By.xpath(LoginXpath.BUTTON_SIGNIN_XPATH);
        WebElement buttonSigninWebElement = driver.findElement(buttonSigninBy);
        buttonSigninWebElement.click();
    }

    public String getErrorMessage() {
        By errorMessageBy = By.xpath(LoginXpath.ERROR_MESSAGE_XPATH);
        WebElement errorMessageWebElement = driver.findElement(errorMessageBy);
        return errorMessageWebElement.getText();
    }
}
