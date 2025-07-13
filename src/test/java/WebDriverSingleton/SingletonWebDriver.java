package WebDriverSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*The Singleton pattern in Selenium Java automation ensures that only one instance of a class,
particularly the WebDriver instance, is created throughout the test execution.
This is achieved by making the constructor private and providing a public static method to access
the single instance.

The singleton pattern in Selenium Java automation ensures a class has only one instance throughout
the test run, providing a global access point to that instance. This pattern is useful for managing
resources like WebDriver, properties files, or test data where a single instance is required for
 coordinated actions.
*/

public class SingletonWebDriver {
    private static WebDriver driver;

    // Private constructor to prevent direct instantiation
    private SingletonWebDriver() {
        // Initialize WebDriver here (e.g., create a Chrome browser)
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); //Set path to ChromeDriver executable
        driver = new ChromeDriver();
    }

    // Public static method to access the single instance
    public static WebDriver getDriver() {
        if (driver == null) {
            new SingletonWebDriver(); //Create instance if not already
        }
        return driver;
    }

    // Method to close the browser instance (optional)
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}