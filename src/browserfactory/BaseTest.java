package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //we give implict time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void closeBrowser(){
        driver.quit();
    }
}
