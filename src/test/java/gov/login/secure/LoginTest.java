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

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");
        String inputPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By inputParrwordBy = By.xpath(inputPasswordXpath);
        WebElement inputPasswordWebElement = driver.findElement(inputParrwordBy);
        inputPasswordWebElement.sendKeys("1q2w#E4r");

        String buttonSigninXpath = "//*[@id=\"new_user\"]/lg-submit-button/button";
        By buttonSigninBy = By.xpath(buttonSigninXpath);
        WebElement buttonSigninWebElement = driver.findElement(buttonSigninBy);
        buttonSigninWebElement.click();
    }
 @Test
 public void test4() {
     WebDriver driver = new ChromeDriver();
     driver.get("https://secure.login.gov/");

     String inputEmailXpath = "/html/body/main/div/form/lg-validated-field/div/input";
     By inputEmailBy = By.xpath(inputEmailXpath);
     WebElement inputEmailWebElement = driver.findElement(inputEmailBy);
     inputEmailWebElement.sendKeys("testB@test.com");

     String inputPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
     By inputParrwordBy = By.xpath(inputPasswordXpath);
     WebElement inputPasswordWebElement = driver.findElement(inputParrwordBy);
     inputPasswordWebElement.sendKeys("a1S@d3F$");

     String buttonSigninXpath = "/html/body/main/div/form/lg-submit-button/button";
     By buttonSigninBy = By.xpath(buttonSigninXpath);
     WebElement buttonSigninWebElement = driver.findElement(buttonSigninBy);
     buttonSigninWebElement.click();
 }
}

