package DiffElements;


import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RectangleTest {

        public static void main(String[] args) {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            JavascriptExecutor js = (JavascriptExecutor) driver;



            //WebElement img = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
            WebElement img = driver.findElement(By.xpath("//*[@alt=\"Google\"]"));
            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", img);

            Rectangle rect = img.getRect();

            System.out.println("Height : "+rect.getHeight());
            System.out.println("Width : "+rect.getWidth());
            System.out.println("X Coord : "+rect.getX());
            System.out.println("Y Coord : "+rect.getY());


        }

    }
