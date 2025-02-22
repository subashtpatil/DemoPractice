package DiffElements;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.devtools.v85.memory.Memory;
//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TestNewTabsAndWindows {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);        //2ND window
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Hello Selenium 4");
        Thread.sleep(2000);
        System.out.println("This is new Window tab : " + driver.getTitle());
        driver.switchTo().newWindow(WindowType.WINDOW);          //3rD window
        driver.get("http://gmail.com");
        System.out.println("This is the New Window : " + driver.getTitle());
        System.out.println("Total no of windows : " + driver.getWindowHandles().size());
        //Get all Window IDs
        Set<String> winids = driver.getWindowHandles();
        //Iterate through each of the windows
        Iterator<String> iterator = winids.iterator();
        List<String> winIndex = new ArrayList<String>();
        int i = 0;
        while (iterator.hasNext()) {
            winIndex.add(iterator.next());      // adding winids to the ArrayList

            driver.switchTo().window(winIndex.get(i));
            System.out.println("First window title is :" + driver.getTitle());
            driver.close();
            i++;
        }
        driver.quit();

      /*  driver.switchTo().window(winIndex.get(0));
        System.out.println("First window title is :" + driver.getTitle());
        driver.close();

        driver.switchTo().window(winIndex.get(1));
        System.out.println("second window title is :" + driver.getTitle());
        driver.close();


        driver.switchTo().window(winIndex.get(2));
        System.out.println("third window title is :" + driver.getTitle());*/
        driver.quit();



     }

}