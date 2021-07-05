package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;

public class TestRunner {

    public static WebDriver driver;

    static {
        String baseUrl = "https://www.google.com";  // base url
        System.setProperty("webdriver.chrome.driver", // chromeDriver is storring locally
                "C:\\Users\\ViacheslavKuzenko\\chromedriver_win32\\chromedriver.exe"); // path to driver

        driver = new ChromeDriver();  // Chrome driver initialization
        driver.get(baseUrl);  // getting base url
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // waiters to have all components of the page loaded
    }
    @AfterTest
    public void close() {
        driver.close();  //closing webdriver after test
    }
}







