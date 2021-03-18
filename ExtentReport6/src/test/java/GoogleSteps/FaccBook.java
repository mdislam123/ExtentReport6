package GoogleSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaccBook {
	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		 //return document.body.scrollHeight
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		/*
		 * WebElement fb= driver.findElement(By.xpath("//*[@id=\"facebook\"]")); Actions
		 * ac= new Actions(driver);
		 * ac.clickAndHold(fb).moveByOffset(0,200).release().perform();
		 */
	}

}
