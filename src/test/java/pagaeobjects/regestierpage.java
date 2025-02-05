package pagaeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class regestierpage extends basepage
{

	public regestierpage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath = "//input[@id='input-firstname']")
WebElement txtfirstname;
@FindBy(xpath = "//input[@id='input-lastname']")
WebElement txtlastname;
@FindBy(xpath = "//input[@id='input-email']")
WebElement txtemail;
@FindBy(xpath = "//input[@id='input-telephone']")
WebElement txttele;
@FindBy(xpath = "//input[@id='input-password']")
WebElement txtpassword;
@FindBy(xpath = "//input[@id='input-confirm']")
WebElement cnfpassw;
@FindBy(xpath = "//input[@name='agree']")
WebElement chkdpolicy;
@FindBy(xpath = "//input[@type='submit']")
WebElement btncontinue;

	
	public void txtfirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	public void txtlastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	public void txtemail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void txttele(String teleph)
	{
		txtemail.sendKeys(teleph);
	}
	public void txtpasword(String psw)
	{
		txtpassword.sendKeys(psw);
	}
	public void cnformpsw(String psw)
	{
		txtpassword.sendKeys(psw);
	}
	public void chkpol()
	{
		chkdpolicy.click();
	}
	public void btnclick()
	{
		btncontinue.click();
	}
	
	
	
	
}
