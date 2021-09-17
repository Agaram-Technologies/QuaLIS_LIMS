package BasicFunction;

import org.openqa.selenium.support.PageFactory;


import Config.ScreenName;
import GenericRegistration.*;
import UserManagement.ElementDesignation;

public class PageFactoryMethod extends ScreenName{
	
	
	public static void pageFactory()
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		PageFactory.initElements(driver, ElementHylandsPurifiedWater.class);
		
		PageFactory.initElements(driver, ElementHylandsRawMaterail.class);
		
		PageFactory.initElements(driver, ElementHylandsIntermediate.class);
		
		PageFactory.initElements(driver, ElementHylandsBulkProduct.class);
		
		PageFactory.initElements(driver, ElementHylandsFinishedGoods.class);
		
		PageFactory.initElements(driver, ElementHylandsExternallyManufactured.class);
		
		PageFactory.initElements(driver, ElementHylandsStabilityStudies.class);
		
		
	}
	

	public static void pageFactory(String className)
	{
	
	}

}
