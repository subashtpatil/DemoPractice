package WebDriverSingleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = SingletonWebDriver.getDriver(); // Get the WebDriver instance
        // ... navigate to a URL, etc.
        driver.get("https://www.google.com");
        Thread.sleep(4000);
    }

    @Test
    public void myTest() {
        // Use the WebDriver to perform test actions
    }

    @AfterMethod
    public void tearDown() {
        // You can optionally add code here to close the browser
        SingletonWebDriver.closeDriver();
    }
}