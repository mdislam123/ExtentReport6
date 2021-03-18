package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {
	
	public void Auto() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		
			try{driver.findElement(By.id("imagesrc")).click();
			}catch(org.openqa.selenium.InvalidArgumentException ex) {
				driver.findElement(By.id("imagesrc")).click();
			}
		//Runtime.getRuntime().exec("C:\\Users\\mdislam\\Documents\\compare testcase\\upload.exe");
	}

}
