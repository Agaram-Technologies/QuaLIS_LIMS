package GenericRegistration;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicFunction.PageFactoryMethod;
import BasicFunction.Transaction_Attachment;
import BasicFunction.Transaction_Comments;
import Config.RegistrationDetail;
import RegistrationType.TestDataHylands;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class B_Attachment_Comment_PreRegister_Sample_Test extends TestDataHylands
{	
	public static String preRegister(String registrationSubType, String sampleTypeFile, String sampleFile, String testFile) throws InterruptedException, AWTException
	{
		
		String ARNumber="";
		
		String registrationType=RegistrationDetail.registrationType(registrationSubType);

		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		
		System.out.println(registrationType);
		
		PageFactoryMethod.pageFactory();
		

		ElementGenericRegistration.transactionIcon.click();
		
		ElementGenericRegistration.registrationIcon.click();
		
		ElementGenericRegistration.genericRegistrationIcon.click();
			
		ElementGenericRegistration.advancedFilterHomeIcon.click();
		
		ElementGenericRegistration.filterIcon.click();
		
		
		WebElement filterSampleType = ElementGenericRegistration.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText("Product");

		WebElement filterRegistrationType = ElementGenericRegistration.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);
		
		System.out.println(registrationType);
		
		

		WebElement filterSubType = ElementGenericRegistration.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);

		ElementGenericRegistration.filterFindRecord.click();
		

		WebDriverWait wait11= new WebDriverWait(driver,20);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementGenericRegistration.genericRegistrationMainGridSearch));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementGenericRegistration.genericRegistrationMainGridSearch));	
		
		try {
			ElementGenericRegistration.genericRegistrationAction.click();
		} catch (ElementClickInterceptedException e) {
			Thread.sleep(5000);

			ElementGenericRegistration.genericRegistrationAction.click();

		}
		
		ElementGenericRegistration.sampleTypePreRegister.click();
		
		
		if(registrationSubType.equals(RegistrationDetail.purifiedWater))
		{
			BasicOperation.select(ElementHylandsPurifiedWater.sampleCategory, sampleCategory);
			
			BasicOperation.select(ElementHylandsPurifiedWater.sample, sample);
			
			ElementHylandsPurifiedWater.itemCode.sendKeys(itemCode);
			
			BasicOperation.select(ElementHylandsPurifiedWater.sampleSite, sampleSite);		
			
			BasicOperation.select(ElementHylandsPurifiedWater.dropSample, samplingPort);	
			
			ElementHylandsPurifiedWater.timerID.sendKeys(timerID);
						
			ElementHylandsPurifiedWater.lotNumber.sendKeys(lotNumber);			
		
			BasicOperation.select(ElementHylandsPurifiedWater.storageCodition, storageCondition);
			
			ElementHylandsPurifiedWater.numberOfContainer.sendKeys(numberOfContainer);
			
			BasicOperation.select(ElementHylandsPurifiedWater.containerType, containerType);
				
			BasicOperation.select(ElementHylandsPurifiedWater.testingType, testingTypeSpecialTesting);
						
			ElementHylandsPurifiedWater.totalQuantity.sendKeys(totalQuantity);
			
			BasicOperation.select(ElementHylandsPurifiedWater.totalQuantityUnit, unit);
			
			BasicOperation.select(ElementHylandsPurifiedWater.priority, priorityNormal);
			
			ElementHylandsPurifiedWater.remarks.sendKeys(remarks);
			
			
			ElementHylandsPurifiedWater.sampleTypePreRegisterSubmit.click();
		
			
			wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));
			
			
		}
		else if (registrationSubType.equals(RegistrationDetail.intermediate))
		{
			BasicOperation.select(ElementHylandsIntermediate.sampleCategory, sampleCategory);
			
			BasicOperation.select(ElementHylandsIntermediate.sample, sample);
			
			ElementHylandsIntermediate.itemCode.sendKeys(itemCode);
			
			
			BasicOperation.select(ElementHylandsIntermediate.manufacturerSite, manufacturerSite);
			
			ElementHylandsIntermediate.PONumber.sendKeys(PONumber);
			
			
			ElementHylandsIntermediate.SHCLotNo.sendKeys(SHCLotNumber);

			
			ElementHylandsIntermediate.batchNumber.sendKeys(batchNumber);
			
		
			BasicOperation.select(ElementHylandsIntermediate.storageCodition, storageCondition);
			
			ElementHylandsIntermediate.numberOfContainer.sendKeys(numberOfContainer);
			
			BasicOperation.select(ElementHylandsIntermediate.containerType, containerType);
			
			ElementHylandsIntermediate.lotQuantity.sendKeys(lotQuantity);
			
			ElementHylandsIntermediate.containerQuantity.sendKeys(containerQuantity);
			
			BasicOperation.select(ElementHylandsIntermediate.testingType, testingTypeSpecialTesting);
			
			
			ElementHylandsIntermediate.totalQuantity.sendKeys(totalQuantity);
			
			BasicOperation.select(ElementHylandsIntermediate.totalQuantityUnit, unit);
			
			BasicOperation.select(ElementHylandsIntermediate.priority, priorityNormal);
			
			ElementHylandsIntermediate.remarks.sendKeys(remarks);
			
			
			ElementHylandsIntermediate.sampleTypePreRegisterInstrumentSubmit.click();
		
			
			wait11.until(ExpectedConditions.visibilityOf(ElementHylandsIntermediate.genericRegistrationAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsIntermediate.genericRegistrationAction));
			
			
	
	
		}
		
		else if (registrationSubType.equals(RegistrationDetail.rawMaterial)) {
			
			
			BasicOperation.select(ElementHylandsRawMaterail.sampleCategory, sampleCategory);
			
			BasicOperation.select(ElementHylandsRawMaterail.sample, sample);
			
			ElementHylandsRawMaterail.itemCode.sendKeys(itemCode);
			
			BasicOperation.select(ElementHylandsRawMaterail.supplierOrManufacturer, "Supplier");		
			
			BasicOperation.select(ElementHylandsRawMaterail.supplier, supplier);	
			
			
			ElementHylandsRawMaterail.materialDescription.sendKeys(materialDescription);
			
			
			ElementHylandsRawMaterail.SHCLotNo.sendKeys(SHCLotNumber);
			
			ElementHylandsRawMaterail.batchNumber.sendKeys(batchNumber);
			
			
			ElementHylandsRawMaterail.supplierLotNumber.sendKeys(supplierLotNumber);
		
			BasicOperation.select(ElementHylandsRawMaterail.storageCodition, storageCondition);
			
			ElementHylandsRawMaterail.numberOfContainer.sendKeys(numberOfContainer);
			
			BasicOperation.select(ElementHylandsRawMaterail.containerType, containerType);
			
			ElementHylandsRawMaterail.lotQuantity.sendKeys(lotQuantity);
			
			ElementHylandsRawMaterail.containerQuantity.sendKeys(containerQuantity);
				
			BasicOperation.select(ElementHylandsRawMaterail.testingType, testingTypeSpecialTesting);
			
			
			ElementHylandsRawMaterail.totalQuantity.sendKeys(totalQuantity);
			
			BasicOperation.select(ElementHylandsRawMaterail.totalQuantityUnit, unit);
			
			BasicOperation.select(ElementHylandsRawMaterail.priority, priorityNormal);
			
			ElementHylandsRawMaterail.remarks.sendKeys(remarks);
			
			
			ElementHylandsRawMaterail.sampleTypePreRegisterInstrumentSubmit.click();
		
			
		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsRawMaterail.genericRegistrationAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsRawMaterail.genericRegistrationAction));	
			
			
			
		}
		
		else if (registrationSubType.equals(RegistrationDetail.bulkProduct)) {
			
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
			
			
		}
		
		else if (registrationSubType.equals(RegistrationDetail.finishedGoods)) {

			BasicOperation.select(ElementHylandsFinishedGoods.sampleCategory, sampleCategory);
			
			BasicOperation.select(ElementHylandsFinishedGoods.sample, sample);
			
			ElementHylandsFinishedGoods.itemCode.sendKeys(itemCode);
			
			
			BasicOperation.select(ElementHylandsFinishedGoods.manufacturerSite, manufacturerSite);
			
			ElementHylandsFinishedGoods.PONumber.sendKeys(PONumber);
			
			
			ElementHylandsFinishedGoods.SHCLotNumber.sendKeys(SHCLotNumber);

			
			ElementHylandsFinishedGoods.batchNumber.sendKeys(batchNumber);
			
			
			BasicOperation.select(ElementHylandsFinishedGoods.marketDestination, country);
			
		
			BasicOperation.select(ElementHylandsFinishedGoods.storageCodition, storageCondition);
			
			ElementHylandsFinishedGoods.numberOfPallets.sendKeys(numberOfContainer);
			
			BasicOperation.select(ElementHylandsFinishedGoods.containerType, containerType);
			
			ElementHylandsFinishedGoods.lotQuantity.sendKeys(lotQuantity);
			
			ElementHylandsFinishedGoods.palletQuantity.sendKeys(containerQuantity);
		
			BasicOperation.select(ElementHylandsFinishedGoods.testingType, testingTypeSpecialTesting);
			
			
			ElementHylandsFinishedGoods.totalQuantity.sendKeys(totalQuantity);
			
			BasicOperation.select(ElementHylandsFinishedGoods.totalQuantityUnit, unit);
			
			BasicOperation.select(ElementHylandsFinishedGoods.priority, priorityNormal);
			
			ElementHylandsFinishedGoods.remarks.sendKeys(remarks);
			
			
			ElementHylandsFinishedGoods.sampleTypePreRegisterInstrumentSubmit.click();
		
			
		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsFinishedGoods.genericRegistrationAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsFinishedGoods.genericRegistrationAction));	

		
		}
		
		else if (registrationSubType.equals(RegistrationDetail.externallyManufactured)) {
			
			BasicOperation.select(ElementHylandsFinishedGoods.sampleCategory, sampleCategory);
			
			BasicOperation.select(ElementHylandsFinishedGoods.sample, sample);
			
			ElementHylandsFinishedGoods.itemCode.sendKeys(itemCode);
			
			
			BasicOperation.select(ElementHylandsFinishedGoods.manufacturerSite, manufacturerSite);
			
			ElementHylandsFinishedGoods.PONumber.sendKeys(PONumber);
			
			
			ElementHylandsFinishedGoods.SHCLotNumber.sendKeys(SHCLotNumber);

			
			ElementHylandsFinishedGoods.batchNumber.sendKeys(batchNumber);
			
			
			BasicOperation.select(ElementHylandsFinishedGoods.marketDestination, country);
			
		
			BasicOperation.select(ElementHylandsFinishedGoods.storageCodition, storageCondition);
			
			ElementHylandsFinishedGoods.numberOfPallets.sendKeys(numberOfContainer);
			
			BasicOperation.select(ElementHylandsFinishedGoods.containerType, containerType);
			
			ElementHylandsFinishedGoods.lotQuantity.sendKeys(lotQuantity);
			
			ElementHylandsFinishedGoods.palletQuantity.sendKeys(containerQuantity);
		
			BasicOperation.select(ElementHylandsFinishedGoods.testingType, testingTypeSpecialTesting);
			
			
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			
			try {
				ElementHylandsFinishedGoods.totalQuantity.sendKeys(totalQuantity);
				
			} catch (Exception e) {
				
				ElementHylandsFinishedGoods.totalQuantity2.sendKeys(totalQuantity);
				// TODO: handle exception
			}
			
			
			BasicOperation.select(ElementHylandsFinishedGoods.totalQuantityUnit, unit);
			
			BasicOperation.select(ElementHylandsFinishedGoods.priority, priorityNormal);
			
			ElementHylandsFinishedGoods.remarks.sendKeys(remarks);
			
			
			ElementHylandsFinishedGoods.sampleTypePreRegisterInstrumentSubmit.click();
		
			
		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsFinishedGoods.genericRegistrationAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsFinishedGoods.genericRegistrationAction));	
			

			
		
			
		}
		
		else if (registrationSubType.equals(RegistrationDetail.stabilityStudies)) {
			

			BasicOperation.select(ElementHylandsStabilityStudies.sampleCategory, sampleCategory);
			
			BasicOperation.select(ElementHylandsStabilityStudies.sample, sample);
			
			ElementHylandsStabilityStudies.itemCode.sendKeys(itemCode);
			
			ElementHylandsStabilityStudies.stabilityProtocolNumber.sendKeys(stabilityProtocolNumber);
			
			BasicOperation.select(ElementHylandsStabilityStudies.manufacturerSite, manufacturerSite);	
			
			
			ElementHylandsStabilityStudies.SHCLotNumber.sendKeys(SHCLotNumber);
			
			ElementHylandsStabilityStudies.batchNumber.sendKeys(batchNumber);
			
		
			BasicOperation.select(ElementHylandsStabilityStudies.storageCodition, storageCondition);
			
			ElementHylandsStabilityStudies.storageChamber.sendKeys(storageChamber);
			
			ElementHylandsStabilityStudies.temperature.sendKeys(temperature);
			
			BasicOperation.select(ElementHylandsStabilityStudies.containerType, containerType);
			

				
			BasicOperation.select(ElementHylandsStabilityStudies.testingType, testingTypeSpecialTesting);
			
			
			ElementHylandsStabilityStudies.totalQuantity.sendKeys(totalQuantity);
			
			BasicOperation.select(ElementHylandsStabilityStudies.totalQuantityUnit, unit);
			
			BasicOperation.select(ElementHylandsStabilityStudies.priority, priorityNormal);
			
			ElementHylandsStabilityStudies.remarks.sendKeys(remarks);
			
			
			ElementHylandsStabilityStudies.sampleTypePreRegisterInstrumentSubmit.click();
		
			
		wait11.until(ExpectedConditions.visibilityOf(ElementGenericRegistration.genericRegistrationAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementGenericRegistration.genericRegistrationAction));	
			
		
		}
		
		
		String[] data= {"Generic Registration",sampleFile, "Des"};
		
		
		
		
		Transaction_Attachment.attachmentAdd(ElementGenericRegistration.sampleTypeAttachment(), data);
		
		Transaction_Comments.commentsAdd(ElementGenericRegistration.sampleTypeComments(), data);
		
		
		ARNumber =B_Attachment_Comment_PreRegister_Sample_Test.subSampleTest(sampleFile, testFile) ;
		
		return ARNumber;
			
	
	}
	
	
	public static String subSampleTest(String sampleFile, String testFile) throws InterruptedException, AWTException
	{
		
		PageFactoryMethod.pageFactory();
		
		
		ElementHylandsPurifiedWater.sampleIcon.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 20);

		wait11.until(ExpectedConditions.visibilityOf(ElementGenericRegistration.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementGenericRegistration.genericRegistrationAction));
		
		ElementGenericRegistration.genericRegistrationAction.click();
		
		
		ElementGenericRegistration.sampleSampleAdd.click();
		
		ElementGenericRegistration.sampleSampleName.sendKeys("s001");
		
		
		ElementGenericRegistration.sampleSampleQuanity.sendKeys("100");
		
		
		
		ElementGenericRegistration.sampleSampleAddSubmit.click();
		
		

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));
	
		String[] data= {"Generic Registration",sampleFile, "Des"};
		
		
		Transaction_Attachment.attachmentAdd(ElementGenericRegistration.sampleAttachment(), data);
		
		Transaction_Comments.commentsAdd(ElementGenericRegistration.sampleComments(), data);
		

		ElementHylandsPurifiedWater.testIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));

		try {
			ElementHylandsPurifiedWater.genericRegistrationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementHylandsPurifiedWater.genericRegistrationAction.click();

		}

		ElementHylandsPurifiedWater.testAdd.click();

		try {
			ElementHylandsPurifiedWater.testViewTestList.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementHylandsPurifiedWater.testViewTestList.click();

		}

		ElementHylandsPurifiedWater.testSelectAll.click();

		ElementHylandsPurifiedWater.testAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));
		
		
		
		Transaction_Attachment.attachmentAdd(ElementGenericRegistration.testAttachment(), data);
		
		Transaction_Comments.commentsAdd(ElementGenericRegistration.testComments(), data);
		
		ElementHylandsPurifiedWater.testAdditionalInformationIcon.click();
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.testAdditionalInformationSave));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.testAdditionalInformationSave));
		
		
		for(int i=0; i<5;i++)
		{

			ElementHylandsPurifiedWater.testAdditionalInformationSave.click();
			
			if(ElementHylandsPurifiedWater.testAdditionalInformationSaveAlert.isDisplayed())
			{
				ElementHylandsPurifiedWater.testAdditionalInformationSaveAlertClose.click();
				
				break;
			}
			{
				System.out.println("A");
			}
			
		}
		
		
	

		ElementHylandsPurifiedWater.sampleTypeIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));

		try {
			ElementHylandsPurifiedWater.genericRegistrationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementHylandsPurifiedWater.genericRegistrationAction.click();

		}

		ElementHylandsPurifiedWater.sampleTypeRegister.click();

		BasicOperation.esign("Register");

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));

		List<WebElement> ARNumberList = ElementHylandsPurifiedWater.ARNumberList;

		String ARNumber = "";

		for (int i = 1; i > 0; i++) {
			ARNumber = ARNumberList.get(0).getText();

			Thread.sleep(100);

			if (ARNumber.equals("-") == false) {
				break;
			}

		}

		System.out.println(ARNumber);

		ElementHylandsPurifiedWater.registrationIcon.click();

		ElementHylandsPurifiedWater.transactionIcon.click();

		return ARNumber;
	}
	
	
	

}
