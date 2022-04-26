package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitypackage.Utility_Class1;

import java.time.Duration;

public class RegisterTest extends Utility_Class1 {

    @Before
    public void openMyUrl() {

        openBrowser_NopCommerce();
    }


    @Test


    public void userShouldNavigateToRegisterPageSuccessfully() {

        clickOnElement(By.className("ico-register"));
        Assert.assertEquals("Register", getTextFromElement(By.xpath("//h1[text()='Register']")));

    }

    @Test

    public void userShouldRegisterAccountSuccessfully() {

        clickOnElement(By.className("ico-register"));
        clickOnElement((By.xpath("//input[@id='gender-female']")));
        sendTextToElement(By.id("FirstName"), "Sofia");
        sendTextToElement(By.id("LastName"), "Yunus");
        sendTextToElement(By.xpath("//select[@name ='DateOfBirthDay']"), "12");
        sendTextToElement(By.xpath("//select[@name ='DateOfBirthMonth']"), "January");

        sendTextToElement(By.xpath("//select[@name ='DateOfBirthYear']"), "2000");
        sendTextToElement(By.xpath("//input[@type='email']"), "geeta66@gmail.com");

        sendTextToElement(By.xpath("//input[@id='Password']"), "MyPassword123");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "MyPassword123");
        clickOnElement(By.xpath("//button[@name='register-button']"));

        Assert.assertEquals("Your registration completed", getTextFromElement(By.xpath("//div[@class='result']")));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After

    public void closeBrowser1() {

        //endProcedure();// calling parent method in child class to quit browser.
    }
}
