package Utility;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import Esign.ElementEsign;
import UserManagement.ElementProfile;

public class Esign extends BrowserOperation {

	public static void main(String[] args) throws IOException, URISyntaxException 
	{
		
		BrowserOperation.launchLIMS();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.HOURS);
		
		PageFactory.initElements(driver, ElementEsign.class);
	
		for(int i=1;i>0; i++)
		{
			

			try {
				ElementEsign.EsignPassword.click();

				ElementEsign.EsignPassword.sendKeys("123");

				ElementEsign.EsignComments.sendKeys(BasicOperation.timeValue());

				if (ElementEsign.EsignCheckbox.isSelected() == false) {
					ElementEsign.EsignCheckbox.click();
				}

				ElementEsign.EsignSubmit.click();
				
				Thread.sleep(500);

			} catch (Exception e) {

				// TODO: handle exception
			}

			
		}

	}

}
