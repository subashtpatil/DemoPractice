package HandlingDiffObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//https://www.youtube.com/watch?v=nvOSyRyGAM4


public class FrameHandling {

    public static void main(String[] args) throws InterruptedException {
        // Create a driver object for Firefox browser.
        WebDriver driver = new ChromeDriver();

        // Maximize the web browser.
        driver.manage().window().maximize();

        // Store the URL in a variable of type String.
        String URL = "https://ui.vision/demo/webtest/frames/";

        // Call get() method and pass the URL as a parameter.
        driver.get(URL);

        // Wait for some time to load web page completely.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        int iFrameSize = driver.findElements(By.tagName("frame")).size();
        System.out.println("Toal no of iframes: " +iFrameSize);
        String DefaultTitle = driver.getTitle();
        System.out.println(DefaultTitle);



     /*   // Locate the total number of iframes on the web page.
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Subash Patil");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        //2nd frame
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Amrita Patil");
        driver.switchTo().defaultContent();
Thread.sleep(2000);
        //3rd frame
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Varun Patil");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        //4th frame
        WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("Shreyas Patil");
        driver.switchTo().defaultContent();*/
    }
}
