package DiffElements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class TestAlerts_Actions_MoveToElement {

    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Locating element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.click();
        System.out.println(driver.switchTo().alert().getText());  // Get text within alert
        Thread.sleep(5000);
        driver.switchTo().alert().accept();                        //Accept the alert

//HANDLING A normal alert which is as below

      /*  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://americangolf.co.uk/");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //Locating element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//button[contains(text(),'Accept')]"));
        Element.click();
        //clicking on Golf Clubs by HANDLING MOUSE HOVER
        WebElement Elt = driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div/ul/li[3]/a"));
        a.moveToElement(Elt).build().perform();
        //Elt.click();
        Thread.sleep(3000);
       // HANDLING MOUSE HOVER and clicking on Driver link
        WebElement Element2 = driver.findElement(By.xpath("(//*[contains(text(),'Drivers')])[4]"));
        Element2.click();
    }*/
    }
}

