package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.FacebookReg;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	static Properties prop;
	public static FacebookReg fbR;
	
	  public TestBase() throws IOException {
	  
	  prop = new Properties(); 
	  FileInputStream file = null; try { file = new
	  FileInputStream(
	  "C:\\Users\\mdislam\\eclipse-workspace\\ExtentReport6\\ExtentReport6\\src\\test\\resources\\Config\\config.properties"
	  );
	  } catch (FileNotFoundException e) 
	  { prop.load(file); e.printStackTrace();
	  }
	  
	  }
	 

	public static void initializeDriver() {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		
		 /* String browserName = prop.getProperty("browser");
		  System.out.println("bowser name is:    " + browserName); if
		  (browserName.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); } else
		  if (browserName.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();*/
		  
		  
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");

	}

}
