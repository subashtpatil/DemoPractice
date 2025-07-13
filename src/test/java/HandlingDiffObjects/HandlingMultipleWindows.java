package HandlingDiffObjects;



import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleWindows {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Step 1: Open LinkedIn login page
        driver.get("https://www.linkedin.com/login");

// Step 2: Store the parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        Thread.sleep(4000);
// Step 3: Click on the "Sign in with Google" button
       // driver.findElement(By.xpath("(//span[text()='Continue with Google'])[1]")).click();
        Thread.sleep(4000);
// Step 4: Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + allWindowHandles);

// Step 5: Iterate through the window handles and switch to the child window (Google login window)
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindow)) {
                // Switch to Google login window
                driver.switchTo().window(windowHandle);
                String actTxt = driver.getTitle();
                System.out.println("Switched to  Window    :  " + actTxt);

                // Step 6: Perform actions in the Google login window (e.g., enter email and password)
                driver.findElement(By.id("identifierId")).sendKeys("shubash.auto@gmail.com");
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                driver.close();

                // Assuming you have a wait to handle loading and next steps, you would perform further login steps here
                break;
            }
        }

// Step 7: After completing the Google login, switch back to the LinkedIn window
        driver.switchTo().window(parentWindow);

        System.out.println("Switched back to Parent Window");
        driver.quit();
    }
}