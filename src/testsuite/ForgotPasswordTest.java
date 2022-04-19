package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    //browser opening method
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    //browser closing demo
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //finding forgotyourpassword link element
        WebElement forgotYourPasswordLink=driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        //sending click to the field
       forgotYourPasswordLink.click();
        String actualMessage=driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]")).getText();

        String expectedMessage="Forgot your password?";
        //Validate actual and expected message
        Assert.assertEquals("Forgot your password?","Forgot your password?");

    }
}
