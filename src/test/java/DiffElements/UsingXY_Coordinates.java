package DiffElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class UsingXY_Coordinates {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement link = driver.findElement(By.linkText("Gmail"));
        int x = link.getRect().getX();
        int y = link.getRect().getY();

        Actions actions = new Actions(driver);
        actions.moveByOffset(x,y).click().perform();
        driver.quit();

    }
}
