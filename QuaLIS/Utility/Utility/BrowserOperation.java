package Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UserManagement.ElementProfile;


public class BrowserOperation 
{
	public static String configSource="Configuration\\Config\\config.properties";
	
	public static String configPackage="/config.properties";
	
	public static String configJar;
	
	public static String driverJar;
	
	public static WebDriver driver;
	
	public static String lims;
	
	public static String userName;
	
	public static String passWord;
	
	public static String latestChromeVersion;
	
	public static String FTPUserName;
	
	public static String FTPPort;
	
	public static String FTPPassword;
	
	public static String FTPFolder;
	
	public static String FTPHost;
	
	public static void configProperties() throws URISyntaxException, IOException
	{
			String jarPath = BrowserOperation.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
		    
	      	configJar=jarPath.substring(0,jarPath.length()-10);
	      	
	      	System.out.println(configJar);
			
			FileInputStream fis;
			
			try {
				
				fis = new FileInputStream(configJar+configPackage);
				
			} 
			catch (Exception e) 
			{
							
				fis = new FileInputStream(configSource);
			}
		

			Properties properties = new Properties();

			properties.load(fis);		
			
			
			latestChromeVersion=properties.getProperty("latestChromeVersion");
			
			lims=properties.getProperty("lims");
				
			userName=properties.getProperty("userName");
			
			passWord=properties.getProperty("passWord");
				
			FTPUserName=properties.getProperty("FTPUser");
			
			FTPPort=properties.getProperty("FTPPort");
				
			FTPPassword=properties.getProperty("FTPPassword");
			
			FTPFolder=properties.getProperty("FTPFolder");
			
			FTPHost=properties.getProperty("FTPHost");
						
			System.out.println(latestChromeVersion);
			
			System.out.println(lims);
			
			System.out.println(userName);
			
			System.out.println(passWord);
			
			System.out.println(FTPUserName);
			
			System.out.println(FTPPort);
			
			System.out.println(FTPPassword);
			
			System.out.println(FTPFolder);
			
 	  
					
	}
	
	
	public static HashMap<String, String> launchBrowser() throws IOException, URISyntaxException
	{
		
		configProperties();
		
		 ChromeOptions o= new ChromeOptions();
	      // add Incognito parameter
	      o.addArguments("--incognito");
	      // DesiredCapabilities object
	      DesiredCapabilities c = DesiredCapabilities.chrome();
	      //set capability to browser
	      c.setCapability(ChromeOptions.CAPABILITY, o);
	      
	    o.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	    
		HashMap<String, String> output=new HashMap<String, String>();
		
        // Get path of the JAR file
        String jarPath = BrowserOperation.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
    
      	String jar=jarPath.substring(0,jarPath.length()-4);
      	
      	System.out.println(jar);
		
		FileInputStream fis;
		
		try {
			
			System.out.println(configJar+configPackage);
			
			fis = new FileInputStream(configJar+configPackage);
			
		} 
		catch (Exception e) 
		{
			
		
			fis = new FileInputStream(configSource);
		}
	

		Properties properties = new Properties();

		properties.load(fis);		
		
		int version=Integer.parseInt(latestChromeVersion);  
		
		int condition=version-5;
	
		for(int i=version; i>=condition; i--)
			{
				boolean launch=false;
				
				try
				{
					String path=jar+"\\GoogleChrome\\"+i+".exe";
					
					System.setProperty("webdriver.chrome.driver", path);
					
				
					driver = new ChromeDriver(o);
					
					launch=true;
					
					if(launch==true)
					{
						System.out.println("path-->"+path);
						
						break;
					}
					
				}
				catch (Exception e) 
				{
					try {

						System.setProperty("webdriver.chrome.driver", "WebDriver\\GoogleChrome\\"+i+".exe");
						
						System.out.println("Driver\\GoogleChrome\\"+i+".exe");
						
						

						driver = new ChromeDriver();
						
						launch=true;
						
						if(launch==true)
						{
							break;
						}
						
					} 
					
					catch (Exception e2)
					{
						
					}
				}
			}
			
			

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		return output;
								
	}
	
	public static void launchLIMS() throws URISyntaxException, IOException
	{
		
		launchBrowser();
		
		configProperties();
			
		driver.get(lims);
		
		
		PageFactory.initElements(driver, ElementProfile.class);


		WebElement loginButton = ElementProfile.loginIcon;

		List <WebElement>languageList = ElementProfile.languageList;

		WebElement french = ElementProfile.language;

		if (languageList.get(0).isDisplayed()) 
		{

			Select d=new Select(driver.findElement(By.id("sysLang")));
			
			d.selectByVisibleText("English");

			ElementProfile.userName.sendKeys(userName);

			ElementProfile.passWord.click();
		}

		List<WebElement> userRoleList = ElementProfile.userRoleList;

		if (userRoleList.get(0).isDisplayed()) 
		{
			ElementProfile.passWord.sendKeys(passWord);

			loginButton.click();

		}
		
			
					
	}


	public static void refreshLoginAdmin() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
