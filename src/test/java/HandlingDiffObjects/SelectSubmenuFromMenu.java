package DiffElements;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectSubmenuFromMenu {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get("https://www.amazon.com/");

      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5000));

        WebElement dissmissBtn= driver.findElement(By.xpath("//span[@class='a-button-text'][contains(text(),'Dismiss')]"));
        wait.until(ExpectedConditions.elementToBeClickable(dissmissBtn));
        dissmissBtn.click();


        //identify menu
       // WebElement n=driver.findElement(By.id("nav-link-accountList"));   Account & Lists
        WebElement n=driver.findElement(By.xpath("//span[normalize-space()=\"Account & Lists\"]"));
        // object of Actions with method moveToElement
        Actions a = new Actions(driver);
        a.moveToElement(n).perform();
       // Thread.sleep(3000);


        //identify sub-menu element
        WebElement m=driver.
                findElement(By.xpath("//*[text()='Create a List']"));
        wait.until(ExpectedConditions.elementToBeClickable(m));
        //move to element and click
        a.moveToElement(m).click().perform();
        Thread.sleep(3000);
        System.out.println("Page navigated to: " +driver.getTitle());

        //driver.quit();
    }
}
