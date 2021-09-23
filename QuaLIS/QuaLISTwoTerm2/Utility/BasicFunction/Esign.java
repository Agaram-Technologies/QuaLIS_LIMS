package BasicFunction;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import Esign.ElementEsign;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class Esign extends BrowserOperation{
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		BrowserOperation.launchLIMS();
		
		for(int i=1; i>0; i++)
		{
			PageFactory.initElements(driver, ElementEsign.class);

			driver.manage().timeouts().implicitlyWait(1, TimeUnit.DAYS);

			try {
				ElementEsign.EsignPassword.click();

				ElementEsign.EsignPassword.sendKeys("123");

				ElementEsign.EsignComments.sendKeys(BasicOperation.timeValue());

				if (ElementEsign.EsignCheckbox.isSelected() == false) {
					ElementEsign.EsignCheckbox.click();
				}

				ElementEsign.EsignSubmit.click();

			} catch (Exception e) {

				// TODO: handle exception
			}

		
		}
	}

}
