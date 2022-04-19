package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    //browser opening method
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    //browser closing method
    @After
    public void teardown(){
        closeBrowser();
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //finding username element
        WebElement username=driver.findElement(By.id("txtUsername"));
        //sending username to username field
        username.sendKeys("Admin");
        //finding password element
        WebElement password=driver.findElement(By.name("txtPassword"));
        //sending password to password field
        password.sendKeys("admin123");
        //finding login button element
        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        //sending click to log in button
        loginButton.click();
        //finding actual message element
        WebElement actualMessage=driver.findElement(By.id("welcome"));
        String actualResult=actualMessage.getText();
        String expectedMessage="Welcome";
        //Validate actual and expected message
        Assert.assertEquals("Welcome","Welcome");
        //printing only first part of the message on console
        System.out.println(actualResult.substring(0,7));


    }

}
