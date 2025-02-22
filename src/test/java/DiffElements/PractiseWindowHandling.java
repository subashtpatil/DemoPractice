package DiffElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PractiseWindowHandling {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.gmail.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());

        System.out.println("Total num of windows : "+ driver.getWindowHandles().size());
//adding all winids to a set, as a set does not hold duplicates
        Set<String> winIds= driver.getWindowHandles();
        // iterate through each winIds
       Iterator<String> iterator = winIds.iterator();

       List<String> al = new ArrayList<String>();
       while (iterator.hasNext()){
           al.add(iterator.next());
           //System.out.println(iterator);
       }

       driver.switchTo().window(al.get(0));
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(al.get(1));
        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(al.get(2));
        System.out.println(driver.getTitle());
        driver.close();

    }
}
