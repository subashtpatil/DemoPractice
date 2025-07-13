package AllTypesOfScreenshots;



 import org.apache.commons.io.FileUtils;
 import org.openqa.selenium.OutputType;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import ru.yandex.qatools.ashot.AShot;
   import ru.yandex.qatools.ashot.Screenshot;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.By;
   import java.io.File;
   import java.io.IOException;
   import javax.imageio.ImageIO;
   import org.openqa.selenium.manager.SeleniumManager;

 import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class SpecificElementScreenshot {

    public static void main(String[] args) throws IOException {
        // Replace with your WebDriver instance
        WebDriver driver = new FirefoxDriver(); // Example using ChromeDriver
        driver.get("https://www.google.com"); // Replace with the URL



        WebElement above = driver.findElement(with(By.tagName("img")).above(By.name("q")));   //  Google image
       // above.sendKeys("trainer@way2automation.com");   //entering data in email field
        File aboveScrn = above.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(aboveScrn, new File("./screenshot/GoogleImgAbove.jpg"));

        WebElement below = driver.findElement(with(By.name("q")).below(By.tagName("img")));   //Google search box
        below.sendKeys("Subash Patil");            //CITY field
        File belowScrn = below.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(belowScrn, new File("./screenshot/google.jpg"));
        driver.quit();
    }
}