package testcasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagaeobjects.homepage;
import pagaeobjects.loginpage;
import pagaeobjects.myaccountpage;
import testbase.baseclas;

public class logintomyaccount extends baseclas
{
	@Test(groups = {"sanity","master"})
	public void logintomyaccout()
	{
		logger.info("*******testcase start***********");
		try
		{
		homepage hm=new homepage(driver);
		hm.clickmyaccount();
		hm.clicklogin();
		
		loginpage lp=new loginpage(driver);
		lp.emailaddres(pr.getProperty("email"));
		lp.password(pr.getProperty("PSW"));
		lp.clicklogin();
		
		myaccountpage my=new myaccountpage(driver);
		boolean targtpage=my.ismyaccount();
		
		//Assert.assertEquals(targtpage, true);
		Assert.assertTrue(targtpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*********test finish***********");
	}
	
	

}
