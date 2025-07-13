package DiffElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.manager.SeleniumManager;

public class HandlingFrames {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.paytm.com");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Locating element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
        Element.click();
Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments
        //Here i pass values based on css style. Yellow background color with solid red color border.

     //   WebElement iframe = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div"));
   //    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", iframe);
List<WebElement> iframes =driver.findElements(By.tagName("iframe"));
        System.out.println(iframes.size());
        //Switch to the frame
        driver.switchTo().frame(iframes.get(0));
        driver.switchTo().frame(0);


        driver.findElement(By.xpath("//a[@class='_1mvLksqBDbXvIRjc9YWvF x-link'][contains(text(),'privacy policy')]")).click();
        Thread.sleep(2000);

        //2nd page

        WebElement Element2 = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
        Element.click();
        Thread.sleep(2000);
        driver.switchTo().frame(iframes.get(1));

        driver.findElement(By.xpath("//a[@class='_1mvLksqBDbXvIRjc9YWvF x-link'][contains(text(),'privacy policy')]")).click();
        Thread.sleep(2000);
    }
}
