package utilities;

import org.testng.annotations.DataProvider;

public class Dataprovider
{
	@DataProvider(name="LoginDdata")
	public String[][] getdata() throws Exception
	{
		String path="C:\\selenium2\\opencart12\\testadata\\Book1.xlsx";
		Excelutility util=new Excelutility(path);
		int totalrows=util.getrow("Login");
		int totalcolms=util.getcell("Login", 1);
		String Logindata[][]=new String[totalrows][totalcolms];
		for(int i=1; i<=totalrows;i++)
		{
			for(int j=0;j<totalcolms;j++)
			{
				Logindata[i-1][j]=util.getcelldata("Login", i, j);
			}
		}
		
		
		return Logindata;
		
	}
	

}
