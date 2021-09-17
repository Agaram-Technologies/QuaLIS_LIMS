package Utility;



import java.util.ArrayList;

import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UserManagement.ElementProfile;

public class BrowserOperationAuditTrail 
{
	public static WebDriver driver;
	
	
		
		public static void login(String id)
	{
		
		BasicOperation.timeValue();
		
		
		PageFactory.initElements(driver, ElementProfile.class);
		
		List <WebElement>languageList = ElementProfile.languageList;
		String pwd="123";
		
	//	System.out.println(languageList.get(0).getText());
		
		if (languageList.get(0).isDisplayed()) 
		{
/*
			Select d=new Select(driver.findElement(By.id("sysLang")));
			
			d.selectByVisibleText("tamil");*/

			ElementProfile.userName.sendKeys(id);

			ElementProfile.passWord.click();
		}


		WebElement loginButton = ElementProfile.loginIcon;

		

		
		List<WebElement> userRoleList = ElementProfile.userRoleList;

		if (userRoleList.get(0).isDisplayed()) 
		{
			ElementProfile.passWord.sendKeys(pwd);

			loginButton.click();

		}
		
		
	}
	
	
	public static void launchLIMS() throws IOException
	{
		FileInputStream fis = new FileInputStream("Configuration//Config//config.properties");

		Properties properties = new Properties();

		properties.load(fis);

		
		
		String driverName=properties.getProperty("browser");
		
		String lims=properties.getProperty("lims");
		
		String userName=properties.getProperty("userName");
		
		String passWord=properties.getProperty("passWord");
		
		if(driverName.contains("chrome"))
		{
			String driverPath = properties.getProperty("driverChrome");
			
			System.setProperty("webdriver.chrome.driver", driverPath);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		}
		else if(driverName.contains("edge"))
		{
			String driverPath = properties.getProperty("driverEdge");
			
			System.setProperty("webdriver.edge.driver", driverPath);

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(driverName.contains("fire"))
		{
			String driverPath = properties.getProperty("mozilaFirefox");
			
			System.setProperty("webdriver.chrome.driver", driverPath);

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else if(driverName.contains("internet"))
		{
			String driverPath = properties.getProperty("driverEdge");
			
			System.setProperty("webdriver.chrome.driver", driverPath);

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
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
	
	
	public static void newTab(int n) throws IOException
	{
		JavascriptExecutor js2 = (JavascriptExecutor) driver;  
		

		FileInputStream fis = new FileInputStream("Configuration//Config//config.properties");

		Properties properties = new Properties();

		properties.load(fis);

		
		
		String driverName=properties.getProperty("browser");
		
		String lims=properties.getProperty("lims");
		
		String one="window.open('";
		
		String two="','_blank')";
		
		String link=one+lims+two;
		
		for(int i=0; i<n; i++ )
		{
			js2.executeScript(link);
		}
	}
	
	
	
	
	public static void switchToNewTab()
	{
	

		Set<String> d = driver.getWindowHandles();

		ArrayList<String> dd = new ArrayList<String>();
		for (String ddd : d) {
			dd.add(ddd);
		}
		
	
		driver.switchTo().window(dd.get(1));
		
	}
	
	public static void switchToOldTab()
	{
	

		Set<String> d = driver.getWindowHandles();

		ArrayList<String> dd = new ArrayList<String>();
		for (String ddd : d) {
			dd.add(ddd);
		}
		
	
		driver.switchTo().window(dd.get(0));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void newUserRefreshLogin()
	{
		
	}
	
	public static void launchLIMSLanguage()
	{
		
	}
	
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	public static void implicitWait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void refreshLogin(String userName, String password) throws IOException
	{
	
		driver.navigate().refresh();
		
		PageFactory.initElements(driver, ElementProfile.class);


		WebElement loginButton = ElementProfile.loginIcon;

		List <WebElement>languageList = ElementProfile.languageList;

		
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
			ElementProfile.passWord.sendKeys(password);

			loginButton.click();
		}

		}
	
	
	public static void sdmsLogin() throws IOException
	{
		FileInputStream fis = new FileInputStream("Configuration//Config//config.properties");

		Properties properties = new Properties();

		properties.load(fis);

		
		
		String driverName=properties.getProperty("browser");
		
		String lims=properties.getProperty("lims");
		
		if(driverName.contains("chrome"))
		{
			String driverPath = properties.getProperty("driverChrome");
			
			System.setProperty("webdriver.chrome.driver", driverPath);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(driverName.contains("edge"))
		{
			String driverPath = properties.getProperty("microsoftEdge");
			
			System.setProperty("webdriver.edge.driver", driverPath);

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(driverName.contains("fire"))
		{
			String driverPath = properties.getProperty("mozilaFirefox");
			
			System.setProperty("webdriver.chrome.driver", driverPath);

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else if(driverName.contains("internet"))
		{
			String driverPath = properties.getProperty("driverEdge");
			
			System.setProperty("webdriver.chrome.driver", driverPath);

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		/*String userName=properties.getProperty("userName");
		
		String passWord=properties.getProperty("passWord");
		
		*/
		driver.get("http://5.189.171.17:8085/LogilabSDMS/Login.html");
		
		

	}

	public static void login() throws IOException
	{
		FileInputStream fis = new FileInputStream("Configuration//Config//config.properties");

		Properties properties = new Properties();

		properties.load(fis);

		
		
		String driverName=properties.getProperty("browser");
		
		String lims=properties.getProperty("lims");
		
		String userName=properties.getProperty("userName");
		
		String passWord=properties.getProperty("passWord");
		

		
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

}
