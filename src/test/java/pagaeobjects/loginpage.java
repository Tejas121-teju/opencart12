package pagaeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends basepage
{

	public loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement passemail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passpsw;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement clicklogin;
	
	public void emailaddres(String email)
	{
		passemail.sendKeys(email);
	}
	public void password(String psw)
	{
		passpsw.sendKeys(psw);
	}
	public void clicklogin()
	{
		clicklogin.click();
	}

}
