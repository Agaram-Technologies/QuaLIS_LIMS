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


import Config.Config;
import UserManagement.ElementProfile;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserOperation extends Config
{

	public static HashMap<String, String> launchBrowser() throws IOException, URISyntaxException
	{
		Build.preCondition();

		ChromeOptions o = new ChromeOptions();
		// add Incognito parameter
		o.addArguments("--incognito");
		// DesiredCapabilities object
		DesiredCapabilities c = DesiredCapabilities.chrome();
		// set capability to browser
		c.setCapability(ChromeOptions.CAPABILITY, o);

		o.setExperimentalOption("excludeSwitches", new String[]
		{ "enable-automation" });

		HashMap<String, String> output = new HashMap<String, String>();
 
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);

		return output;

	}

	public static void launchLIMS() throws URISyntaxException, IOException
	{
 		
		launchBrowser(); 
			
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


	public static void refreshLoginAdmin()
	{
		driver.navigate().refresh();
		
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


	public static void implicitWait(int i) 
	{
		
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		// TODO Auto-generated method stub
		
	}
	
	public static void smallImplicitWaitClick(WebElement element)
	{				
		driver.manage().timeouts().implicitlyWait(smartWait, TimeUnit.SECONDS);
		
		element.click();
		
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);		 		
	}
	
	public static int smallImplicitWaitListCount(List<WebElement> list)
	{				
		driver.manage().timeouts().implicitlyWait(smartWait, TimeUnit.SECONDS);
		
		int count=list.size();
		
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);		 
		
		return count;
	}
	
	public static void smallImplicitWaitSendKeys( WebElement element, String value)
	{				
		driver.manage().timeouts().implicitlyWait(smartWait, TimeUnit.SECONDS);
		
		element.sendKeys(value);
		
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);		 
		
		 
	}
	
	
}
