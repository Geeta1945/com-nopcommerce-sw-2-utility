package testsuite;

import browserfactory.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitypackage.Utility_Class1;


public class LoginTest  extends Utility_Class1 { // inheritance created to access method of parent class - BaseTest

    @Before // @Before annotation in JUnit is used on a method containing java code to run before each est case

    public void openBrowser(){ // public no return type method created

        openBrowser_NopCommerce();   // calling parent class public method into child class


    }

    /*1. userShouldNavigateToLoginPageSuccessfully
     * click on the ‘Login’ link
     * Verify the text ‘Welcome, Please Sign In!’
     */
    @Test // this annotation is used to write code under test

    public void loginTest(){

        clickOnElement(By.className("ico-login"));
        Assert.assertEquals("Not navigated to login page","Welcome, Please Sign In!",getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")));

    }

    /*2. userShouldLoginSuccessfullyWithValidCredentials
    * click on the ‘Login’ link * Enter valid username
    * Enter valid password * Click on ‘LOGIN’ button
    * Verify the ‘Log out’ text is display
    */

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

    /*
    3. verifyTheErrorMessage * click on the ‘Login’ link
    * Enter invalid username * Enter invalid password
    * Click on Login button * Verify the error message ‘Login was unsuccessful.
    Please correct the errors and try again. No customer account found’
     */

    @Test
    public void verifyTheErrorMessage(){



        String expectedErrorMessage ="Login was unsuccessful. Please correct the errors and try again.\n" +"No customer account found";

        clickOnElement(By.className("ico-login"));// finding login click element from nopcommerce website and clicking it

        sendTextToElement(By.xpath("//input[@name='Email']"),"geeta1945p@gmail.com");
        sendTextToElement(By.xpath("//input[@class='password']"),"Geeta20");   //finding element and enetering password
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        // first we find webelement with xpath in above line and then we used clicked method

        String ActualErrorMessage1= getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        System.out.println(ActualErrorMessage1+"   Second TEstCase Message");

      Assert.assertEquals(expectedErrorMessage,ActualErrorMessage1);

         }

    @After // after the test case finished this below mehtod will be executed

    public void closeBrowser(){

        endProcedure();// calling parent method in child class to quit browser.
    }


}
