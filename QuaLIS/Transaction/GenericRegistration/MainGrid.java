package GenericRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasicFunction.PageFactoryMethod;
import Config.RegistrationDetail;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class MainGrid extends BrowserOperation
{
	
	public static void mainGrid(String registrationSubType) throws InterruptedException
	{
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);
		
		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		ElementGenericRegistration.homeIcon.click();
		
		ElementGenericRegistration.transactionIcon.click();
		
		ElementGenericRegistration.registrationIcon.click();
		
		ElementGenericRegistration.genericRegistrationIcon.click();
			
		ElementGenericRegistration.advancedFilterHomeIcon.click();
		
		ElementGenericRegistration.filterIcon.click();
		
		String product="Product";
		
		if(registrationType.equals(RegistrationDetail.specialTestKorean)||registrationType.equals(RegistrationDetail.claimTestKorean)||registrationType.equals(RegistrationDetail.requestTestKorean))
		{
			product="품목";
		}
		
		
		
		BasicOperation.select(ElementGenericRegistration.filterSampleType, product);
		
		BasicOperation.select(ElementGenericRegistration.filterRegistrationType, registrationType);
	
		BasicOperation.select(ElementGenericRegistration.filterSubType, registrationSubType);

		ElementGenericRegistration.filterFindRecord.click();
		
		BasicOperation.exception(ElementGenericRegistration.sampleTypeSampleTypeIcon);
		
		
		
	}

}
