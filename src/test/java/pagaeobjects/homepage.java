package pagaeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage
{

	public homepage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@title='My Account']") 
	WebElement linkmyaccount;
	@FindBy(xpath = "//a[text()='Register']") 
	WebElement linkrigister;
	@FindBy(xpath = "//a[text()='Login']") 
	WebElement linkLogin;
	
	
	public void clickmyaccount()
	{
		linkmyaccount.click();
		}
	
	public void clickrigister() 
	{
		linkrigister.click();
	}
	public void clicklogin()
	{
		linkLogin.click();
	}
	

}
