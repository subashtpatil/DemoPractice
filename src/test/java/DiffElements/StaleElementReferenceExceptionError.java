package DiffElements;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class StaleElementReferenceExceptionError {

           public static void main(String [] args) throws InterruptedException
        {
            WebDriver driver;

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://practicetestautomation.com/practice-test-login/");

            Thread.sleep(3000);
           /* WebElement login=driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
            login.click();
*/
            Thread.sleep(2000);
            WebElement userName=driver.findElement(By.name("username"));
            userName.sendKeys("subashtpatil@gmail.com");

            WebElement pwd= driver.findElement(By.name("password"));
            pwd.sendKeys("test@123");
            driver.navigate().refresh();
            Thread.sleep(3000);
            try {
                userName.sendKeys("subashtpatil@gmail.com");
                pwd.sendKeys("test@123");
               // throw new StaleElementReferenceException(null, null);
            }
            catch(StaleElementReferenceException e){
			userName=driver.findElement(By.name("username"));
			userName.sendKeys("student");
			pwd= driver.findElement(By.name("password"));
			pwd.sendKeys("Password123");
			driver.findElement(By.id("submit")).click();
                e.printStackTrace();
            }
        }
    }
