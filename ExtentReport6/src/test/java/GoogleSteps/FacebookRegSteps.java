package GoogleSteps;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.Task;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import Pages.FacebookReg;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;



public class FacebookRegSteps extends TestBase{


	//public WebDriver driver;
	//public FacebookReg fbR;
	public Scenario scenario;
	
	/*
	 * @BeforeStep() public void setup() {
	 * 
	 * driver.manage().window().maximize(); }
	 */

	@Before
	public void before(Scenario scenario){

		System.out.println("------------------------------");
		System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
		System.out.println("------------------------------");
		TestBase.initializeDriver();
		fbR = new FacebookReg(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void takeScreenshot(Scenario scenario){
		
	
		System.out.println("------------------------------");
		System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
		System.out.println("------------------------------");

		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot is taken after failed");
		}
		
		if (driver !=null) {
			driver.close();
		}

		
	}

	
	/*
	 * @After(order=0) public void TearDown() { driver.close(); }
	 */
	 
	@Given("user given the URL")

	public void user_given_the_url() {

		// TestBase.initializeDriver();
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form"*/
		//fbR = new FacebookReg(driver);

		/*
		 * WebDriverManager.chromedriver().setup(); driver= new ChromeDriver();
		 * driver.get(
		 * "https://www.facebook.com/pages/create/?ref_type=registration_form");
		 */
	}

	@When("user click the create new account botton")
	public void user_click_the_create_new_account_botton() {
		// driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")).click();
		fbR.SignUpClick();
	}

	@When("user enter the input {string} and {string} and {string} and {string} and {string} as all bottons")
	public void user_enter_the_input_and_and_and_and_as_all_bottons(String firstName, String lastName, String email,
			String confEmail, String password) throws InterruptedException {

		
		//fbR.DataInput();

		
		 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.name("firstname")).sendKeys(firstName);
		  driver.findElement(By.name("lastname")).sendKeys(lastName);
		  driver.findElement(By.name("reg_email__")).sendKeys(email);
		  Thread.sleep(2000);
		  driver.findElement(By.id("u_0_v")).sendKeys("md@gmail.com");
		  driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		  
		  Select dropDownMonth= new Select(driver.findElement(By.id("month")));
		  dropDownMonth.selectByVisibleText("Jan"); Select dropDownDay= new
		  Select(driver.findElement(By.id("day")));
		  dropDownDay.selectByVisibleText("18"); Select dropDownYear= new
		  Select(driver.findElement(By.id("year")));
		  dropDownYear.selectByVisibleText("1988"); //click radio botton
		  driver.findElement(By.id("u_0_6")).click();
		  //driver.findElement(By.id("u_0_7")).click();
		  //driver.findElement(By.id("u_0_8")).click();
		  }

	@When("user click the sing up botton")
	public void user_click_the_sing_up_botton() throws InterruptedException {
		//Thread.sleep(2000);
		//Task.Delay(2000).Wait(driver);
		//https://reports.cucumber.io/docs/cucumber-jvm  
 
		// driver.findElement(By.name("websubmit")).click();
	}

	@Then("user sucessfully register the application")
	public void user_sucessfully_register_the_application() {
	/*	
		JavascriptExecutor js= (JavascriptExecutor)driver ;
		//window scroll
		js.executeScript("window.scroolto(400)");
		//element up to scroll
		js.executeScript("argument[0].scrollIntoview(true)","xpath");
		//dyanic scroll bur.
		
		long initialLength=(long)(js.executeScript("return document.body.scrollHeight"));
		while(true) {
			long currentLength=(long)(js.executeScript("window.scrollTo(0,document.bosy.scrollHeight)"));
			if(initialLength==currentLength) {
				break;
			}
			initialLength=currentLength;
		}
		*/
			
		
		

	}
	
	@Given("user given the  URL {string}")
	public void user_given_the_url(String url1) {
		
		driver.get(url1);
		//Assert.assertTrue(true);

	}

}
