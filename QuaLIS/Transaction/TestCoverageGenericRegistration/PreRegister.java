package TestCoverageGenericRegistration;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.RegistrationDetail;
import GenericRegistration.ElementHylandsBulkProduct;
import Utility.BasicOperation;

public class PreRegister extends TestDataPre{
	
	public static String bulkProduct()
	{
		PageFactory.initElements(driver, ElementHylandsBulkProduct.class);

		ElementHylandsBulkProduct.transactionIcon.click();
		
		ElementHylandsBulkProduct.registrationIcon.click();
		
		ElementHylandsBulkProduct.genericRegistrationIcon.click();
	
		
		
		ElementHylandsBulkProduct.advancedFilterHomeIcon.click();
		
		ElementHylandsBulkProduct.filterIcon.click();
		

		
		WebElement filterSampleType = ElementHylandsBulkProduct.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementHylandsBulkProduct.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(RegistrationDetail.bulkProduct);
		
		String registrationSubType=RegistrationDetail.registrationType(RegistrationDetail.bulkProduct);

		WebElement filterSubType = ElementHylandsBulkProduct.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);

		ElementHylandsBulkProduct.filterFindRecord.click();
		

		WebDriverWait wait11= new WebDriverWait(driver,10);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsBulkProduct.genericRegistrationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsBulkProduct.genericRegistrationAction));	
		
		try {
			ElementHylandsBulkProduct.genericRegistrationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementHylandsBulkProduct.genericRegistrationAction.click();

		}
		
		ElementHylandsBulkProduct.sampleTypePreRegister.click();
		
	//	BasicOperation.exception(ElementHeylandsBulkProduct.sampleCategory);
		
		BasicOperation.select(ElementHylandsBulkProduct.sampleCategory, sampleCategory);
		
		BasicOperation.select(ElementHylandsBulkProduct.sample, sample);
		
		ElementHylandsBulkProduct.itemCode.sendKeys(itemCode);
		
		
		BasicOperation.select(ElementHylandsBulkProduct.manufacturerSite, manufacturerSite);
		
		ElementHylandsBulkProduct.PONumber.sendKeys(PONumber);
		
		
		ElementHylandsBulkProduct.SHCLotNo.sendKeys(SHCLotNumber);

		
		ElementHylandsBulkProduct.batchNumber.sendKeys(batchNumber);
		
	
		BasicOperation.select(ElementHylandsBulkProduct.storageCodition, storageCondition);
		
		ElementHylandsBulkProduct.numberOfContainer.sendKeys(numberOfContainer);
		
		BasicOperation.select(ElementHylandsBulkProduct.containerType, containerType);
		
		ElementHylandsBulkProduct.lotQuantity.sendKeys(lotQuantity);
		
		ElementHylandsBulkProduct.containerQuantity.sendKeys(containerQuantity);
		
		BasicOperation.select(ElementHylandsBulkProduct.testingType, testingTypeSpecialTesting);
		
		
		ElementHylandsBulkProduct.totalQuantity.sendKeys(totalQuantity);
		
		BasicOperation.select(ElementHylandsBulkProduct.totalQuantityUnit, unit);
		
		BasicOperation.select(ElementHylandsBulkProduct.priority, priorityNormal);
		
		ElementHylandsBulkProduct.remarks.sendKeys(remarks);
		
		
		ElementHylandsBulkProduct.sampleTypePreRegisterInstrumentSubmit.click();
	
		
	wait11.until(ExpectedConditions.visibilityOf(ElementHylandsBulkProduct.genericRegistrationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsBulkProduct.genericRegistrationAction));	
		
	
		ElementHylandsBulkProduct.sampleIcon.click();
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsBulkProduct.genericRegistrationAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsBulkProduct.genericRegistrationAction));	
		
			ElementHylandsBulkProduct.testIcon.click();
			
			
			

			wait11.until(ExpectedConditions.visibilityOf(ElementHylandsBulkProduct.genericRegistrationAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsBulkProduct.genericRegistrationAction));	
			
			
			
			
			
			
			
					
				
				try {
					ElementHylandsBulkProduct.genericRegistrationAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementHylandsBulkProduct.genericRegistrationAction.click();

				}
			
			
				ElementHylandsBulkProduct.testAdd.click();
				
				
			

				try {
					ElementHylandsBulkProduct.testViewTestList.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementHylandsBulkProduct.testViewTestList.click();

				}
				
				ElementHylandsBulkProduct.testSelectAll.click();
				
				
			
				ElementHylandsBulkProduct.testAddSubmit.click();
				

				wait11.until(ExpectedConditions.visibilityOf(ElementHylandsBulkProduct.genericRegistrationAction));
					
					wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsBulkProduct.genericRegistrationAction));	
				
				
				
				
				ElementHylandsBulkProduct.sampleTypeIcon.click();
				
				
				

				wait11.until(ExpectedConditions.visibilityOf(ElementHylandsBulkProduct.genericRegistrationAction));
					
					wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsBulkProduct.genericRegistrationAction));	
				

					try {
						ElementHylandsBulkProduct.genericRegistrationAction.click();
					} catch (Exception e) {
						Thread.sleep(2000);

						ElementHylandsBulkProduct.genericRegistrationAction.click();

					}
					
					ElementHylandsBulkProduct.sampleTypeRegister.click();
					
					BasicOperation.esign("Register");
					
				
					

					wait11.until(ExpectedConditions.visibilityOf(ElementHylandsBulkProduct.genericRegistrationAction));
						
						wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsBulkProduct.genericRegistrationAction));	
					

				List<WebElement> ARNumberList=ElementHylandsBulkProduct.ARNumberList;
				
				
				String ARNumber=ARNumberList.get(0).getText();
				
				System.out.println(ARNumber);
				
				ElementHylandsBulkProduct.registrationIcon.click();
				
				ElementHylandsBulkProduct.transactionIcon.click();
		
				return ARNumber;
				
		
		return null;
		
	}
	
	
	
	

}
