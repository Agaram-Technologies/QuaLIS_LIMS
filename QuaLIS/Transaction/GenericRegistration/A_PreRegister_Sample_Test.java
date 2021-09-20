package GenericRegistration;

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
import Flow.TestDataFlow;
import Flow.TestDataJPDC;
import GenericRegistration.ElementGenericRegistration;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class A_PreRegister_Sample_Test extends TestDataFlow{
	
	
	public static String preRegister(String registrationSubType) throws InterruptedException
	{
		
		String ARNumber="";
		
		String registrationType=registrationSubType;

		PageFactory.initElements(driver, ElementGenericRegistration.class);
		
		PageFactory.initElements(driver, ElementHPCLRoutine.class);
		
		
		PageFactoryMethod.pageFactory();
		

		ElementGenericRegistration.transactionIcon.click();
		
		ElementGenericRegistration.registrationIcon.click();
		
		ElementGenericRegistration.genericRegistrationIcon.click();
			
		ElementGenericRegistration.advancedFilterHomeIcon.click();
		
		ElementGenericRegistration.filterIcon.click();
		
		String product="Product";
		

		
		System.out.println(registrationType);
	
		
		WebElement filterSampleType = ElementGenericRegistration.filterSampleType;

		Select filterSampleTypeSelect = new Select(filterSampleType);

		filterSampleTypeSelect.selectByVisibleText(product);

		WebElement filterRegistrationType = ElementGenericRegistration.filterRegistrationType;

		Select filterRegistrationTypeSelect = new Select(filterRegistrationType);

		filterRegistrationTypeSelect.selectByVisibleText(registrationType);
		
		
		
		System.out.println(registrationType);
		
		/*

		WebElement filterSubType = ElementGenericRegistration.filterSubType;

		Select filterSubTypeSelect = new Select(filterSubType);

		filterSubTypeSelect.selectByVisibleText(registrationSubType);*/

		ElementGenericRegistration.filterFindRecord.click();
		
		
		
	
		

		BasicOperation.exception(ElementGenericRegistration.genericRegistrationAction);
		
		ElementGenericRegistration.sampleTypePreRegister.click();
		
		
		if(registrationSubType.equals(RegistrationDetail.purifiedWater))
		{
			
			BasicOperation.exception(ElementHylandsPurifiedWater.lotNumber);
			
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
			
			
			ElementHylandsIntermediate.sampleTypePreRegisterInstrumentSubmit.click();
			
			BasicOperation.wait(ElementHylandsPurifiedWater.genericRegistrationAction);
			
			
			
		
			
		}
		else if(registrationSubType.equals("Routine"))
		{
			System.out.println("trig");
			
			PageFactory.initElements(driver, ElementHPCLRoutine.class);
			
			BasicOperation.exception(ElementHPCLRoutine.reason);
			
			BasicOperation.select(ElementHPCLRoutine.client, "Analytical Lab");
			
			BasicOperation.select(ElementHPCLRoutine.projectID, "PD/2017/007");
			
			
			
			BasicOperation.select(ElementHPCLRoutine.storageCondition, "Deep Freezers");		
			
			BasicOperation.select(ElementHPCLRoutine.disposition, "Return");	
			
			
			ElementHPCLRoutine.reason.sendKeys("reason");
			
			
			ElementHPCLRoutine.precautions.sendKeys("precautions");

			BasicOperation.select(ElementHPCLRoutine.priority, "Normal");	
			
			ElementHPCLRoutine.safetyRemarks.sendKeys(remarks);
			
		//	ElementHPCLRoutine.sp.sendKeys(remarks);
			
			
			ElementHylandsIntermediate.sampleTypePreRegisterInstrumentSubmit.click();
			
			BasicOperation.wait(ElementHPCLRoutine.genericRegistrationAction);
			
			
			
		
			
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
			
			BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);
		
			
			
	
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
		
			BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);		
			
			
			
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
			BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);	
			
			
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
		
			
			BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);
			
			
		
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
		
			BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);	
			
			

			
		
			
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
		
			BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);		
			
			
		
		}
	else if (registrationSubType.equals(RegistrationDetail.requestTestKorean)) {
			
		PageFactory.initElements(driver, ElementJPDCRequestTest.class);
		
			System.out.println("aaaaaaaa");
			
			BasicOperation.select(ElementJPDCRequestTest.client, TestDataJPDC.client);

			BasicOperation.select(ElementJPDCRequestTest.sampleCategory, "먹는물");
			
			/*BasicOperation.select(ElementJPDCRequestTest.sample, sample);
			
			ElementJPDCRequestTest.itemCode.sendKeys(itemCode);
			
			ElementJPDCRequestTest.stabilityProtocolNumber.sendKeys(stabilityProtocolNumber);
			
			BasicOperation.select(ElementJPDCRequestTest.manufacturerSite, manufacturerSite);	
			
			
			ElementJPDCRequestTest.SHCLotNumber.sendKeys(SHCLotNumber);
			
			ElementJPDCRequestTest.batchNumber.sendKeys(batchNumber);
			
		
			BasicOperation.select(ElementJPDCRequestTest.storageCodition, storageCondition);
			
			ElementJPDCRequestTest.storageChamber.sendKeys(storageChamber);
			
			ElementJPDCRequestTest.temperature.sendKeys(temperature);
			
			BasicOperation.select(ElementJPDCRequestTest.containerType, containerType);
			

				
			BasicOperation.select(ElementJPDCRequestTest.testingType, testingTypeSpecialTesting);
			
			
			ElementJPDCRequestTest.totalQuantity.sendKeys(totalQuantity);
			
			BasicOperation.select(ElementJPDCRequestTest.totalQuantityUnit, unit);
			
			BasicOperation.select(ElementJPDCRequestTest.priority, priorityNormal);
			
			ElementJPDCRequestTest.remarks.sendKeys(remarks);
		*/	
			
			ElementGenericRegistration.preRegisterSubmit.click();
		
			BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);		
		
		}
		
		
	else if (registrationSubType.equals(RegistrationDetail.claimTest)) {
		

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
	
		BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);		
	
	}
	
	else if (registrationSubType.equals(RegistrationDetail.specialTest)) {
		

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
	
		BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);		
	
	}
	

/*		ARNumber =A_PreRegister_Sample_Test.subSampleTest();
		*/
		ARNumber=A_PreRegister_Sample_Test.subSampleWithTest(5);
		
		
		return ARNumber;
			
	
	}
	

	public static String subSampleIrsha() throws InterruptedException
	{
		

		
		PageFactoryMethod.pageFactory();
		
		
		ElementHylandsPurifiedWater.sampleIcon.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 20);

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

		ElementHylandsPurifiedWater.sampleTypeIcon.click();
/*
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
		*/
	
		String ARNumber = "a";

		System.out.println(ARNumber);

		ElementHylandsPurifiedWater.registrationIcon.click();

		ElementHylandsPurifiedWater.transactionIcon.click();
		
		driver.findElement(By.xpath("//*[@id=\"MenuTree\"]/li[1]/a")).click();

		return ARNumber;
	}
	
	
	public static String subSampleTest() throws InterruptedException
	{
		
		
		
		
		PageFactoryMethod.pageFactory();
		
		
		ElementHylandsPurifiedWater.sampleIcon.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 20);

		wait11.until(ExpectedConditions.visibilityOf(ElementGenericRegistration.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementGenericRegistration.genericRegistrationAction));
		
		ElementGenericRegistration.genericRegistrationAction.click();
		
		
		try {
			
			ElementGenericRegistration.sampleSampleAdd.click();
			
		} catch (Exception e) {
			
			ElementGenericRegistration.genericRegistrationAction.click();
			
			ElementGenericRegistration.sampleSampleAdd.click();
			
			// TODO: handle exception
		}
	
		
		ElementGenericRegistration.sampleSampleName.sendKeys("s001");
		
		
		ElementGenericRegistration.sampleSampleQuanity.sendKeys("100");
		
	
		
		
		ElementGenericRegistration.sampleSampleAddSubmit.click();
		
		

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));
	
		

		ElementHylandsPurifiedWater.testIcon.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));

		try {
			ElementHylandsPurifiedWater.genericRegistrationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementHylandsPurifiedWater.genericRegistrationAction.click();

		}
		
		try {
			ElementHylandsPurifiedWater.testAdd.click();
		} catch (Exception e) {
			

			ElementHylandsPurifiedWater.genericRegistrationAction.click();
			
			ElementHylandsPurifiedWater.testAdd.click();

		}

		
		
		
		BasicOperation.exception(ElementHylandsPurifiedWater.testViewTestList);

		

		ElementHylandsPurifiedWater.testSelectAll.click();

		ElementHylandsPurifiedWater.testAddSubmit.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));

		ElementHylandsPurifiedWater.sampleTypeIcon.click();
		
		String ARNumber = "";

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
//driver.findElement(By.xpath("//*[@id=\"MenuTree\"]/li[1]/a")).click();
		
		return null;
	}
	
	public static String subSampleWithTest( int subSample) throws InterruptedException
	{
			
		
			PageFactoryMethod.pageFactory();
			
			
			ElementHylandsPurifiedWater.sampleIcon.click();
			
		
			
			for(int k=0; k<subSample; k++)
			{

				int j=k+1;
				
				
				WebDriverWait wait11 = new WebDriverWait(driver, 20);

				wait11.until(ExpectedConditions.visibilityOf(ElementGenericRegistration.genericRegistrationAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementGenericRegistration.genericRegistrationAction));
				
				ElementGenericRegistration.genericRegistrationAction.click();
				
				
				ElementGenericRegistration.sampleSampleAdd.click();
				
				BasicOperation.exception(ElementGenericRegistration.sampleSampleName);
				
				ElementGenericRegistration.sampleSampleName.sendKeys("시료 추가 "+j);
				
				
				ElementGenericRegistration.sampleSampleQuanity.sendKeys("100");
				
				
				BasicOperation.select(ElementJPDCRequestTest.sampleSampleUnit, TestDataJPDC.unit);
				
				
				
				ElementGenericRegistration.sampleSampleViewTestList.click();
				
				ElementGenericRegistration.sampleSampleTestSelectAll.click();
				
				
				
				
				ElementGenericRegistration.sampleSampleAddSubmit.click();
				
				

				wait11.until(ExpectedConditions.visibilityOf(ElementHylandsPurifiedWater.genericRegistrationAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementHylandsPurifiedWater.genericRegistrationAction));
			
				
			}
			

			return subSample+"";

	}
	
	
	

}
