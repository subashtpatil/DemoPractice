package DiffElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.manager.SeleniumManager;

public class Menu_Submenu_Click {

    public static void main(String[] args) {
       // System.setProperty("webdriver.gecko.driver",
          //      "C:\Users\ghs6kor\Desktop\Java\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get("https://www.amazon.com/");
        //identify menu
        WebElement n=driver.findElement(By.id("nav-link-accountList"));
        // object of Actions with method moveToElement
        Actions a = new Actions(driver);
        a.moveToElement(n).perform();
        //identify sub-menu element
        WebElement m=driver.
                findElement(By.xpath("//*[text()='Create a List']"));
        //move to element and click
        a.moveToElement(m).click().perform();
        System.out.println("Page navigated to: " +driver.getTitle());
        driver.quit();
    }
}
