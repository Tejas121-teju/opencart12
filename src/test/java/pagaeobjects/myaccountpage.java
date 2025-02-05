package pagaeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccountpage extends basepage
{

	public myaccountpage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement msgheadding;
	
	
	@FindBy(xpath = "//a[@class='list-group-item'][text()='Logout']")
	WebElement logoutbtn;
	
     public boolean ismyaccount()
     {
    	 try {
    		 return(msgheadding.isDisplayed());
			
		} catch (Exception e)
    	 {
			return false;
		}
     }
     
     public void clicklogout()
     {
    	 logoutbtn.click();
     }
     
     
}
