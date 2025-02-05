package testbase;

import java.io.FileInputStream;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseclas
{ 
   public WebDriver driver;
   public Logger logger;
   public Properties pr;
	@BeforeClass(groups = {"sanity","regression","master","datadriven"})
	@Parameters({"os","browser"})
	 public void setup(String os,String br) throws Exception
	{    
		//using log4j2
		FileInputStream file=new FileInputStream("C:\\selenium2\\opencart12\\src\\test\\resources\\configproper.properties");      //loding configproperties file
		pr=new Properties();
		pr.load(file);
		logger=LogManager.getLogger(this.getClass());
		    if(pr.getProperty("execuation_env").equalsIgnoreCase("remote"))
		    {
              DesiredCapabilities capil=new DesiredCapabilities();
		    
		    	if(os.equalsIgnoreCase("windows"))
		    	{
		    		capil.setPlatform(Platform.WIN10);
		    	}
		    	else
		    		if(os.equalsIgnoreCase("linux"))
		    		{
		    			capil.setPlatform(Platform.LINUX);
		    		}
		    		else
		    		{ 
		    			System.out.println("NO os matching");
		    		}
		    	
		    	
		    	 switch (br.toLowerCase()) 
		    	 {
				case "chrome":capil.setBrowserName("chrome");break;
				case "edge":capil.setBrowserName("MicrosoftEdge");break;
				default:System.out.println("no browser matching");return;
				}
		    	 driver=new RemoteWebDriver(new URL("http://DESKTOP-E06HOR8:4444/wb/hub"),capil);
		   }
		      if(pr.getProperty("execuation_env").equalsIgnoreCase("local"))
		      {
        		switch (br.toLowerCase())  //croos browser execution using Xml in local envirement
        		{
				case "chrome": driver=new ChromeDriver();break;
				case "edge": driver=new EdgeDriver();break;
				case "safari": driver=new SafariDriver();break;
				default:System.out.println("Invalid browser name...");return;
        		}
        	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		       driver.get(pr.getProperty("url"));//reading url form properties file
  		       driver.manage().window().maximize();
		      }	
	}
	@AfterClass(groups = {"sanity","regression"+ "","master","datadriven"})
	public void close() 
	{
		driver.quit();
		
	}
	
	public String RandomString()
	{
		String generateString=RandomStringUtils.randomAlphabetic(5);
		return generateString;
		
	}
		public String RandomNumbar()
		{   
			String generateNumer=RandomStringUtils.randomNumeric(10);
			return generateNumer;
		}
		
		public String Alphanumaric()
		{
			String generateString=RandomStringUtils.randomAlphabetic(5);
			String generateNumer=RandomStringUtils.randomNumeric(5);
			return(generateString+"@"+generateNumer);
			
		}
		
		
		
	
	
	
}
