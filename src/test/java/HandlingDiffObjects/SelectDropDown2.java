package HandlingDiffObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropDown2 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver= new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://jqueryui.com/selectmenu/");
        By name = By.name("Country");
        selectDropDownValue(name, "value", "India" );
    }

    public static void selectDropDownValue(By locator, String type, String value) throws InterruptedException {
        //driver.findElement(locator);
        Select select = new Select(getElement(locator));

        switch (type) {

            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "visibletext":
                select.selectByVisibleText(value);
                break;
            default:
                System.out.println("Please pass the correct selection criteria ......");
                break;
        }
        Thread.sleep(4000);
    }

    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }
}

