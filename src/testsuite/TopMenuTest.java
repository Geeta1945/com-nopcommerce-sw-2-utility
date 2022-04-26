package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilitypackage.Utility_Class1;

public class TopMenuTest extends Utility_Class1 {

    @Before
    public void openBrowser2(){ // public no return type method created

        openBrowser_NopCommerce();   // calling parent class public method into child class


    }

    /*1. userShouldNavigateToComputerPageSuccessfully
     * click on the ‘Computers’ Tab
     * Verify the text ‘Computers
     */

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        String expectedMessage = "";
        clickOnElement(By.xpath("//a[@href='/computers']"));

        Assert.assertEquals("Computers",getTextFromElement(By.xpath("//h1[text()='Computers']")));

        // 2. when user click on Electronics tab - it should navigate to that page
        // checking whether that page have message displayed - 'Electronics'
        clickOnElement(By.xpath("//a[@href='/electronics']"));// clicking on Electronics tab
        Assert.assertEquals("Electronics",getTextFromElement(By.xpath("//h1[normalize-space()='Electronics']")));

        //3. when user click on Apparel tab - it should navigate to that page
        // checking whether that page have message displayed - 'Apparel'

        clickOnElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Apparel']"));
        Assert.assertEquals("Apparel",getTextFromElement(By.xpath("//h1[normalize-space()='Apparel']")));

        //4. when user click on Digital downloads tab - it should navigate to that page
        // checking whether that page have message displayed - 'Digital downloads'

          clickOnElement(By.xpath("//a[@href='/digital-downloads']"));
        Assert.assertEquals("Digital downloads",getTextFromElement(By.xpath("//h1[normalize-space()='Digital downloads']")));



        //5. when user click on Books tab - it should navigate to that page
        // checking whether that page have message displayed - 'Books'

        clickOnElement(By.xpath("//a[@href='/books']"));
        Assert.assertEquals("Books",getTextFromElement(By.xpath("//h1[normalize-space()='Books']")));


        //6. when user click on  Jewelry tab - it should navigate to that page
        // checking whether that page have message displayed - 'Jewelry'

        clickOnElement(By.xpath("//a[@href='/jewelry']"));
        Assert.assertEquals("Jewelry",getTextFromElement(By.xpath("//h1[normalize-space()='Jewelry']")));

        //7. when user click on Gift Cards tab - it should navigate to that page
        // checking whether that page have message displayed - 'Gift Cards’
        clickOnElement(By.xpath("//a[@href='/gift-cards']"));
        Assert.assertEquals("Gift Cards",getTextFromElement(By.xpath("//h1[normalize-space()='Gift Cards']")));

      }


    @After // after the test case finished this below mehtod will be executed

    public void closeBrowser1(){

        endProcedure();// calling parent method in child class to quit browser.
    }


}
