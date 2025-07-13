package DiffElements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.manager.SeleniumManager;


public class TestAlert {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click();
		
		/*   //1st method using SwitchTo()
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();*/
		
		/*  //2nd method  using Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();*/

		// 3rd method using Javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		try {
			js.executeScript("window.alert=function{};");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
