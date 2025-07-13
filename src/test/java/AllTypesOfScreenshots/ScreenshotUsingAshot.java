package AllTypesOfScreenshots;


import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
   import ru.yandex.qatools.ashot.Screenshot;
   import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
   import org.openqa.selenium.WebDriver;
   import java.io.File;
   import java.io.IOException;
   import javax.imageio.ImageIO;

public class ScreenshotUsingAshot {
    public static void main(String[] args) throws IOException {
        // Replace with your WebDriver instance
        WebDriver driver = new ChromeDriver(); // Example using ChromeDriver
        driver.get("https://www.example.com"); // Replace with the URL

        // Take the screenshot
        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(1000)) // Scrolls the page to capture the full content
                .takeScreenshot(driver);

        // Save the screenshot
        File file = new File("./screenshot/full_page_screenshot.png");
        ImageIO.write(screenshot.getImage(), "PNG", file);

        System.out.println("Screenshot saved to: " + file.getAbsolutePath());

        driver.quit();
    }
}