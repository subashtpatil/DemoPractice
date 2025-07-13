package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.manager.SeleniumManager;

//https://grotechminds.com/javascript-popup/  very good demo


public class AlertHandlingDemo {
    public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
        //System.setProperty("webdriver.chrome.driver","Path_of_Chrome_Driver"); //mention dummy path or variable that stores chrome driver path
        WebDriver driver = new ChromeDriver(); driver.get("https://www.browserstack.com/users/sign_up");

        driver.findElement(By.id("user_full_name")).sendKeys("username"); driver.findElement(By.id("user_email_login")).sendKeys("username.xyz.net");
        driver.findElement(By.id("user_password")).sendKeys("Your_Password");
        driver.findElement(By.id("user_submit")).click();

        Thread.sleep(5000);


        String alertMessage= driver.findElement(By.id("bs-alert-text-id")).getText();
        System.out.println(alertMessage);
        Alert alert = driver.switchTo().alert(); // switch to alert

       // String alertMessage= driver.switchTo().alert().getText(); // capture alert message

        // Print Alert Message
        Thread.sleep(5000);
        alert.accept();
    }
}