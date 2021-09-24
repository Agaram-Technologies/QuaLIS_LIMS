package Configuration;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.FTP;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageFTPConfiguration extends BrowserOperation{
	
	
	
	public static void FTP() throws InterruptedException, AWTException 
	{
		HashMap<String, String> ftp;
		
	
		PageFactory.initElements(driver, ElementFTPConfiguration.class);
		
		ElementFTPConfiguration.masterIcon.click();
		
		ElementFTPConfiguration.configurationIcon.click();
		
		ElementFTPConfiguration.FTPConfigurationIcon.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementFTPConfiguration.FTPAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementFTPConfiguration.FTPAction));

		try {
			ElementFTPConfiguration.FTPAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementFTPConfiguration.FTPAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementFTPConfiguration.FTPAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementFTPConfiguration.FTPAdd));

		ElementFTPConfiguration.FTPAdd.click();
		
		ElementFTPConfiguration.FTPUserName.sendKeys(FTPUserName);
		
		
		ElementFTPConfiguration.FTPPassword.sendKeys(FTPPassword);
		
	 		
		ElementFTPConfiguration.FTPHostName.sendKeys(FTPHost);
		
		ElementFTPConfiguration.FTPPortNumber.sendKeys(FTPPort);
		
		
		
		
		ElementFTPConfiguration.FTPPhysicalPath.sendKeys(FTPFolder);
		
		if(ElementFTPConfiguration.FTPSSL.isSelected())
		{
			ElementFTPConfiguration.FTPSSL.click();
		}
		
		
		JavascriptExecutor  a=(JavascriptExecutor)driver;
		
		
		a.executeScript("window.scroll(0,0)", "");
		
			ElementFTPConfiguration.FTPAddSubmit.click();
		
		
			
			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	


		try {
			
			if(ElementFTPConfiguration.alert.isDisplayed())
			{
				ElementFTPConfiguration.alertClose.click();
			}
		} catch (Exception e) {
			
		}
		
		try {
			ElementFTPConfiguration.FTPAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementFTPConfiguration.FTPAction.click();
		}
		
		
		ElementFTPConfiguration.FTPSetDefault.click();
		
		

		try {
			
			if(ElementFTPConfiguration.alert.isDisplayed())
			{
				ElementFTPConfiguration.alertClose.click();
			}
		} catch (Exception e) {
			
		}
		
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementFTPConfiguration.FTPAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementFTPConfiguration.FTPAction));
		
		
		
		
		try {
			ElementFTPConfiguration.FTPAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementFTPConfiguration.FTPAction.click();
		}
		
		ElementFTPConfiguration.FTPTestConnection.click();
		
 

		try {
			
			if(ElementFTPConfiguration.alert.isDisplayed())
			{
				ElementFTPConfiguration.alertClose.click();
			}
		} catch (Exception e) {
			
		}
		

		wait1.until(ExpectedConditions.visibilityOf(ElementFTPConfiguration.FTPAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementFTPConfiguration.FTPAction));
		
		ElementFTPConfiguration.configurationIcon.click();
		
		ElementFTPConfiguration.masterIcon.click();
		
		ElementFTPConfiguration.homeIcon.click();
		
	}
	

}
