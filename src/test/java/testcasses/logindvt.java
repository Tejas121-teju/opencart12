package testcasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagaeobjects.homepage;
import pagaeobjects.loginpage;
import pagaeobjects.myaccountpage;
import testbase.baseclas;
import utilities.Dataprovider;

public class logindvt extends baseclas
{
	@Test(dataProvider ="LoginDdata",dataProviderClass = Dataprovider.class ,groups = "datadriven")
	public  void verify_login(String email,String psw,String exp)
	{
		logger.info("**********testcase Start*********");
		try {
		homepage hm=new homepage(driver);
		hm.clickmyaccount();
		hm.clicklogin();
		
		loginpage lp=new loginpage(driver);
		lp.emailaddres(email);
		lp.password(psw);
		lp.clicklogin();
		
		myaccountpage my=new myaccountpage(driver);
	    boolean tgtpage=my.ismyaccount();
	    
	    if(exp.equalsIgnoreCase("vaild"))
	    {
	    	if(tgtpage==true)
	    	{
	    		my.clicklogout();
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);
	    	}
	    }
	    if(exp.equalsIgnoreCase("invalid"))
	    {
	    	if(tgtpage==true) 
	    	{
	    	my.clicklogout();
	    	Assert.assertTrue(false);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(true);
	    	}
	    }
	    	
		} catch (Exception e) 
		{
			Assert.fail();
		}  	
		logger.info("**********testcase exceute*********");
	}

}
