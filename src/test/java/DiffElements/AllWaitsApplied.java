package DiffElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import org.openqa.selenium.manager.SeleniumManager;

public class AllWaitsApplied {

        public static void main(String[] args) throws InterruptedException {
           /* WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();*/
            //WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.get("http://gmail.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(5))
                    .withMessage("Time out as the condition is not met")
                    .ignoring(NoSuchElementException.class);
            //driver.manage().window().minimize();
            WebElement username = driver.findElement(By.id("identifierId"));
            username.sendKeys("trainer@way2automation.com");
            //driver.manage().window().fullscreen();
            driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
            //Thread.sleep(10000);
            //driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("asdfsf");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("sadfdf");
            driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();

            System.out.println(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).getText());

        }

    }
/*
Explicit waits are used to wait for a certain condition to occur before proceeding further in the code.
WebDriverWait is a commonly used explicit wait that calls the
ExpectedCondition every 500 milliseconds until it returns successfully.

When to use: Use explicit waits when an element takes a long time to load or to check specific properties of an element,
such as presence or clickability.

FluentWait is a more flexible type of explicit wait where you can specify:

Frequency with which FluentWait checks the conditions defined.
Specific types of exceptions to ignore while waiting.
Maximum amount of time to wait for a condition.

When to use FluentWait: Use FluentWait when you need more control over the waiting process, such as specifying custom polling intervals and ignoring specific exceptions.

Key Differences
Setting Type: WebDriverWait always sets the type to WebDriver, whereas FluentWait can be set to any class, including
 WebDriver.
Default Exception Handling: WebDriverWait automatically ignores NotFoundException by default,
whereas FluentWait does not ignore any exceptions unless specified.
Flexibility: FluentWait offers more customization options, such as polling intervals and exception handling,
 making it suitable for more complex scenarios.
Summary
In summary, if you are primarily dealing with WebDriver-related operations, WebDriverWait is usually sufficient.
However, if you need to handle more complex waiting scenarios,
 such as repeatedly calling an API until a valid response is received, FluentWait offers the flexibility you need.
*/
