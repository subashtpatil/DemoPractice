package Strings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.manager.SeleniumManager;

public class HighlighterClass {

    @Test
    public void highlighterElement() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        WebElement ele = driver.findElement(By.xpath("//*[@id='identifierId']"));
        //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
        highlightObject(driver,ele);
        //ele.sendKeys("SoftwareTestingMaterial.com");

        //ALTERNATIVE METHOD TO ENTER TEXT OTHER THAN SENDKEYS

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='SoftwareTestingMaterial.com';", ele);
    }
    //Creating a custom function
    public void highlightObject(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}
