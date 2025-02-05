package testcasses;

import org.testng.annotations.Test;

import pagaeobjects.homepage;
import pagaeobjects.regestierpage;
import testbase.baseclas;

public class accountregestire extends baseclas
{  

	@Test(groups = {"regression","master"})
	public void accregestire()
	{   
		logger.info("*************Starting Teatcase*********");
		
		homepage hm=new homepage(driver);//create object for paject object(page class) homepage
		hm.clickmyaccount();
		hm.clickrigister();
		logger.info("Clicked regestire link");
		regestierpage rg=new regestierpage(driver);//create object for paject object(page class) regestire page
		logger.info("provide customer details");
		rg.txtfirstname(RandomString());
		rg.txtlastname(RandomString());
		rg.txtemail(RandomString()+"@gmail.com");
		rg.txttele(RandomNumbar()
				);
		rg.txtpasword(Alphanumaric());
		rg.cnformpsw(Alphanumaric());
		rg.chkpol();
		rg.btnclick();
		
		logger.info("*************finishing Teatcase*********");
	}
	

}
