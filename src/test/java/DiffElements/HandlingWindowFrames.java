package DiffElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.util.Set;

public class HandlingWindowFrames {
        public static void main(String[] args) throws InterruptedException {
            //System.setProperty("webdriver.chrome.driver","./src/resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/browser-windows");

            // Open new window by clicking the button "New Window"
            driver.findElement(By.id("windowButton")).click();

            // Click on the new window element and read the text displayed on the window
           // WebElement text = driver.findElement(By.id("sampleHeading"));
Thread.sleep(3000);


            String parentWindow = driver.getWindowHandle();
            System.out.println(parentWindow);
            Set<String> handles =  driver.getWindowHandles();
            for(String windowHandle  : handles)
            {
                if(!windowHandle.equals(parentWindow))
                {
                    driver.switchTo().window(windowHandle);

                    WebElement text2 = driver.findElement(By.xpath(" //h1[@id='sampleHeading']"));

                    // Fetching the text using method and printing it
                    System.out.println("Element found using text: " + text2.getText());

                        driver.close(); //closing child window
                    Thread.sleep(4000);
                    driver.switchTo().window(parentWindow); //cntrl to parent window
                }
            }

            driver.quit();
        }
    }