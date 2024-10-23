package gov.login.secure;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");
        String buttonSigninXpath = "//*[@id=\"new_user\"]/lg-submit-button/button";
        By buttonSigninBy = By.xpath(buttonSigninXpath);
        WebElement buttonSigninWebElement = driver.findElement(buttonSigninBy);
        buttonSigninWebElement.click();
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");
        String inputEmailXpath = "//*[@id=\"user_email\"]";
        By inputEmailBy = By.xpath(inputEmailXpath);
        WebElement inputEmailWebElement = driver.findElement(inputEmailBy);
        inputEmailWebElement.sendKeys("testA@test.com");

        String buttonSigninXpath = "//*[@id=\"new_user\"]/lg-submit-button/button";
        By buttonSigninBy = By.xpath(buttonSigninXpath);
        WebElement buttonSigninWebElement = driver.findElement(buttonSigninBy);
        buttonSigninWebElement.click();
    }
}
