package DiffElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSliders {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement mainSlider = driver.findElement(By.id("slider"));  //		entire horizontal slider
		int width = mainSlider.getSize().width/2;    //will slide horizontally exactly by half of the sceen if given as width/2
													  //will slide horizontally full screen to the end if given as width only
		WebElement sliderButton = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		new Actions(driver).dragAndDropBy(sliderButton, width, 0).perform();
	}
}
