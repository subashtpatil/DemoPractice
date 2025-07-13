package DiffElements;


import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
/*import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/

public class WindowHandleTest {

    @Test
    public void windowsExampleCode() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // Navigate to Url
        driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
        //fetch handle of this
        String currHandle = driver.getWindowHandle();
        System.out.println(currHandle);

        //click on link to open a new window
        driver.findElement(By.linkText("Open new window")).click();
        //fetch handles of all windows, there will be two, [0]- default, [1] - new window
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        //assert on title of new window
        String title = driver.getTitle();
        Assert.assertEquals("Simple Page", title);

        //closing current window
        driver.close();
        //Switch back to the old tab or window
        driver.switchTo().window((String) windowHandles[0]);

        //Opens a new tab and switches to new tab
        driver.switchTo().newWindow(WindowType.TAB);
        Assert.assertEquals("", driver.getTitle());

        //Opens a new window and switches to new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        Assert.assertEquals("", driver.getTitle());

        //quitting driver
        driver.quit(); //close all windows
        //    }
    }
}