package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitypackage.Utility_Class1;


public class Test_Login extends Utility_Class1 {

    @Before

    public void openUrl(){

        openBrowser_NopCommerce();
    }



    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        clickOnElement(By.xpath("//a[@class='ico-login']"));
         // finding login click element from nopcommerce website and clicking it
        sendTextToElement(By.xpath("//input[@name='Email']"),"geeta12@gmail.com");
        // entering username
        sendTextToElement(By.xpath("//input[@class='password']"),"MyPassword123");
        //finding element and enetering password
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        // first we find webelement with xpath in above line and then we used clicked method
        clickOnElement(By.linkText("Log out"));
        //Assert.assertEquals("Log out",getTextFromElement(By.linkText("Log out")));

    }

    @After

    public void closeBrowser1(){

        endProcedure();// calling parent method in child class to quit browser.
    }

}
