package DiffElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

//https://www.google.com/search?client=firefox-b-d&q=how+to+write+a+generic+code+selenium+java+code+to+automate+a+dropdown%2C+video+example#fpstate=ive&vld=cid:03c46fa7,vid:AqTUbO4v0h8,st:101

public class SelectDropDown {
 static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
     driver= new ChromeDriver() ;
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
     driver.get("https://www.orangehrm.com/30-day-free-trial");
By name = By.name("Country");
        selectDropDownValue(name, "value", "India" );
    }

    public static void selectDropDownValue(By locator, String type, String value) throws InterruptedException {
                                    //driver.findElement(locator);
        Select select = new Select(getElement(locator));  //dropdown webelement

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

