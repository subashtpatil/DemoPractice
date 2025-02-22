package TestNG_Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//@Listeners(MyCustomListener.class)    //this is used to run at class level and not suite level
public class TestNG {
    WebDriver driver;

    @Test  //Success Test
    public void CloseBrowser() {
        driver.close();
        Reporter.log("Driver Closed After Testing");
    }

    @Test //Failed Test
    public void OpenBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        String expectedTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
    }
    private int i = 1;

    @Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
    public void AccountTest() {
        if(i < 2)
            Assert.assertEquals(i , i);
        i++;
    }

    @Test  // Skip Test
    public void SkipTest() {
        throw new SkipException("Skipping The Test Method ");
    }
}