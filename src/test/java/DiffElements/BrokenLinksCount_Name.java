package DiffElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinksCount_Name {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

//    Actions a = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Locating element by link text and store in variable "Element"
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        int linksCount = Links.size();
        for (int i = 0; i < linksCount; i++) {
            //using href we can get url of the required link
            WebElement element = Links.get(i);
            String strURL = element.getAttribute("href");

            URL url = new URL(strURL);

            //Create a connection using URL object link
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            Thread.sleep(3000);
            //establish connection
            httpConn.connect();
            int respcode = httpConn.getResponseCode();

            if (respcode > 400) {
                System.out.println(strURL + "-----" + "is a broken link.");
            } else {
                System.out.println(strURL + "-----" + "is a Valid link.");
            }

        }

    }
}
