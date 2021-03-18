package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class FacebookReg {
	
	public WebDriver driver;
	
	@FindBy(name = "firstname")
	WebElement firstName;
	@FindBy(name = "lastname")
	WebElement lastName;
	@FindBy(name = "reg_email__")
	WebElement email;
	@FindBy(name = "reg_email_confirmation__")
	WebElement confEmail;
	@FindBy(name = "reg_passwd__")
	WebElement password;
	@FindBy(id = "month")
	WebElement month;
	@FindBy(id = "day")
	WebElement day;
	@FindBy(id = "year")
	WebElement year;
	@FindBy(xpath="//span[@class='signup_box_content']//a[@role='button']")
	WebElement signUp;
	@FindBy(xpath="//input[starts-with(@id,'u_0_5')]")
	WebElement MaleRadioBotton;
	public FacebookReg(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//action method 
	public void SignUpClick() {
		
		signUp.click();
	}
	public void DataInput() {
		firstName.clear();
		firstName.sendKeys("md");
		lastName.clear();
		lastName.sendKeys("islam");
		email.clear();
		email.sendKeys("md@gmail.com");
		confEmail.sendKeys("md@gmail.com");
		password.clear();
		password.sendKeys("mdislam");
		
		new Select(month).selectByVisibleText("Jan");
		new Select(day).selectByVisibleText("15");
		new Select(year).selectByVisibleText("1988");
		
		MaleRadioBotton.click();
		
	}
	

}
