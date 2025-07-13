package HandlingDiffObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameDemo {
    public static void main(String[] args)
    {
        // Create a driver object for Firefox browser.
        WebDriver driver = new ChromeDriver();

        // Maximize the web browser.
        driver.manage().window().maximize();

        // Store the URL in a variable of type String.
        String URL = "https://selenium08.blogspot.com/2019/11/selenium-iframe.html";

        // Call get() method and pass the URL as a parameter.
        driver.get(URL);

        // Wait for some time to load web page completely.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Locate the total number of iframes on the web page.
        int iFrameSize = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Toal no of iframes: " +iFrameSize);
        String DefaultTitle = driver.getTitle();
        System.out.println(DefaultTitle);

        for (int i=0; i<=iFrameSize; i++){
try {

  /*  JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", driver.switchTo().frame(i));
*/
    String frameTitle = driver.switchTo().frame(i).getWindowHandle();
    System.out.println(frameTitle);

    driver.switchTo().defaultContent();
    String getTitleOfMain = driver.getWindowHandle();
    System.out.println("Title of main web page: " +getTitleOfMain);
}catch (ElementNotInteractableException e) {
    System.out.println("The " + i + "frame is not interactable, error is " + e.getMessage());
}

        }

        // Locate the first iframe and switch driver to first iframe by index value 0.
    /*    driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@itemprop = 'query-input']")).sendKeys("Selenium Jobs");
        driver.findElement(By.xpath("//button[@class = 'wpb_button wpb_btn-inverse btn']")).click();
*/
        // Now, switch to main web page from iframe by using defaultContent() method.


        String FinalTitle = driver.getTitle();
        System.out.println(FinalTitle);
        // Closing the first frame.


        String mainPageURL = driver.getCurrentUrl();
        System.out.println("URL of main web page: " +mainPageURL);


        driver.quit();
    }
}