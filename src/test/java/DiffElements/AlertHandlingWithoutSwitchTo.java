package DiffElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHandlingWithoutSwitchTo {

    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

       // driver.findElement(By.id("alertBtn")).click();//opens the alertbox

        Thread.sleep(3000);
      /*  //1  SwitchTo() method
        Alert alert = driver.switchTo().alert();    alert.accept();
*/

     /*   // 2  Explicit wait method
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        String alertMsg = alert.getText();*/

/*//    3  javascriptexecutor method
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {    // to handle the exception
        js.executeScript("window.alert=function{};");
             }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/


        //Prompt Alert
        driver.findElement(By.id("promptBtn")).click();
       //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // Alert alert = wait.until(ExpectedConditions.alertIsPresent());*/
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Subash Patil");
        Thread.sleep(8000);
        alert.dismiss();

    }
}
