package HandlingDiffObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SelectDropDown3 {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://seleniumpractise.blogspot.com/2016/08/");
        driver.findElement(By.xpath("//button[@id='menu1']")).click();
       String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        Thread.sleep(3000);
        List<WebElement> webElements = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//child::li/a"));
        for (WebElement myElement : webElements) {
            if (myElement.getText().trim().equalsIgnoreCase("JavaScript")) {
                myElement.click();
                Thread.sleep(3000);
                break;
            }
        }
        driver.close();
    }
}
