package ResultEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import CompetenceManagement.ElementTrainingAndCertification;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageBatchRunCreation extends BrowserOperation {
	
	public static void batchRunCreationCreate(String registrationType, String test, String instrumentCategory, String instrument, String sampleType) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		ElementBatchRunCreation.transactionIcon.click();
		
		ElementBatchRunCreation.resultEntryIcon.click();
		
		ElementBatchRunCreation.batchRunCreationIcon.click();
		
		BasicOperation.selectByVisibleText(ElementBatchRunCreation.filterRegistrationType, registrationType);
		
		
		ElementBatchRunCreation.filterFind.click();
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationAction);
		
		ElementBatchRunCreation.batchRunCreationAdd.click();
		
		BasicOperation.exception(ElementBatchRunCreation.remark);
		
		
		ElementBatchRunCreation.testName.sendKeys(test);
		
		
		BasicOperation.selectByVisibleText(ElementBatchRunCreation.instrumentCategory, instrumentCategory);
		
		
		BasicOperation.selectByVisibleText(ElementBatchRunCreation.instrument, instrument);
		
		BasicOperation.selectByVisibleText(ElementBatchRunCreation.sampleType, sampleType);
		
		ElementBatchRunCreation.remark.sendKeys(test);
		
		
		ElementBatchRunCreation.find.click();
		
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).click();
		
	//	ElementBatchRunCreation.sampleOne.click();
		
		ElementBatchRunCreation.batchRunCreationAddSubmit.click();
		
		
	}
	
	public static void batchRunCreationDelete() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationAction);
		
		ElementBatchRunCreation.batchRunCreationDelete.click();

		
	}
	
	public static void batchRunCreationEditRemark() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationAction);
		
		ElementBatchRunCreation.batchRunCreationEditRemark.click();
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationEditRemarkRemark);
		
		ElementBatchRunCreation.batchRunCreationEditRemarkRemark.sendKeys("Rem 002");
		
		ElementBatchRunCreation.batchRunCreationEditRemarkSubmit.click();
		
		
	}
	
	public static void batchRunCreationInitiate() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationAction);
		
		ElementBatchRunCreation.batchRunCreationInitiate.click();
	}
	
	public static void batchRunCreationExportToCSV() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationAction);
		
		ElementBatchRunCreation.batchRunCreationExportToCSV.click();
	}
	
	public static void batchRunCreationComplete() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationAction);
		
		ElementBatchRunCreation.batchRunCreationViewResult.click();
		
		BasicOperation.exception(ElementBatchRunCreation.batchRunCreationComplete);
		
		
	}
	
	public static void sampleAdd() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		ElementBatchRunCreation.sampleTab.click();
		
		BasicOperation.exception(ElementBatchRunCreation.sampleAction);
		
		ElementBatchRunCreation.sampleAdd.click();
		
		BasicOperation.exception(ElementBatchRunCreation.find);
		
		ElementBatchRunCreation.sampleOne.click();
		
		ElementBatchRunCreation.batchRunCreationAddSubmit.click();
		
		
				
		
	}
	
	public static void sampleDelete() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
	
		
		BasicOperation.exception(ElementBatchRunCreation.sampleAction);
		
		ElementBatchRunCreation.sampleDelete.click();
			
	}
	
	public static void materialAdd()  throws InterruptedException
	{
		
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		ElementBatchRunCreation.materialTab.click();
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialAdd.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		ElementBatchRunCreation.usedQuantity.sendKeys("10");
		
		ElementBatchRunCreation.mobilePhase.sendKeys("MP001");
		
		ElementBatchRunCreation.CarierGas.sendKeys("CG001");
		
		ElementBatchRunCreation.materialRemark.sendKeys("MR001");
		
		ElementBatchRunCreation.materialAddSubmit.click();
		
	}
	
	public static void materialInventoryEdit()  throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		BasicOperation.selectByIndex(ElementBatchRunCreation.inventoryID, 1);
		
		ElementBatchRunCreation.materialEditSubmit.click();
		
		
	}
	
	public static void materialMaterialEdit() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		BasicOperation.selectByIndex(ElementBatchRunCreation.material, 1);
		
		ElementBatchRunCreation.materialEditSubmit.click();
	}
	
	public static void materialMaterialCategoryEdit()  throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		BasicOperation.selectByIndex(ElementBatchRunCreation.materialCategory, 1);
		
		ElementBatchRunCreation.materialEditSubmit.click();
	}
	
	public static void materialUsedQuantityEdit() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		ElementBatchRunCreation.usedQuantity.clear();
		
		ElementBatchRunCreation.usedQuantity.sendKeys("20");
		
		ElementBatchRunCreation.materialEditSubmit.click();
	}
	
	public static void materialMobilePhaseEdit() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		ElementBatchRunCreation.mobilePhase.clear();
		
		ElementBatchRunCreation.mobilePhase.sendKeys("MP 002");
		
		ElementBatchRunCreation.materialEditSubmit.click();
	}
	
	public static void materialCarierGasEdit() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		ElementBatchRunCreation.CarierGas.clear();
		
		ElementBatchRunCreation.CarierGas.sendKeys("cr 002");
		
		ElementBatchRunCreation.materialEditSubmit.click();
	}
	
	public static void materialRemarkEdit() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		ElementBatchRunCreation.materialRemark.clear();
		
		ElementBatchRunCreation.materialRemark.sendKeys("Mrem 002");
		
		ElementBatchRunCreation.materialEditSubmit.click();
	}
	
	public static void materialAllEdit() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.materialEdit.click();
		
		BasicOperation.exception(ElementBatchRunCreation.mobilePhase);
		
		BasicOperation.selectByIndex(ElementBatchRunCreation.materialCategory, 0);
		
		ElementBatchRunCreation.usedQuantity.clear();
		
		ElementBatchRunCreation.usedQuantity.sendKeys("13");
		
		ElementBatchRunCreation.mobilePhase.clear();
		
		ElementBatchRunCreation.mobilePhase.sendKeys("mob 003");
		
		ElementBatchRunCreation.CarierGas.clear();
		
		ElementBatchRunCreation.CarierGas.sendKeys("vst 00t");
			
		ElementBatchRunCreation.materialRemark.clear();
		
		ElementBatchRunCreation.materialRemark.sendKeys("Mrem 00rr");
		
		ElementBatchRunCreation.materialEditSubmit.click();
	}
	
	public static void materialDelete() throws InterruptedException
	{

		PageFactory.initElements(driver, ElementBatchRunCreation.class);
		
		BasicOperation.exception(ElementBatchRunCreation.materialAction);
		
		ElementBatchRunCreation.batchRunCreationDelete.click();
		
	}
	
	public static void instrumentAdd()
	{
		
	}
	
	public static void instrumentEdit()
	{
		
	}
	
	public static void instrumentCategoryEdit()
	{
		
	}
	
	public static void instrumentStartDateEdit()
	{
		
	}
	
	public static void instrumentStartTimeEdit()
	{
		
	}
	
	public static void instrumentEndDateEdit()
	{
		
	}
	
	public static void instrumentEndTimeEdit()
	{
		
	}
	

	public static void instrumentAllEdit()
	{
		
	}
	
	public static void instrumentDelete()
	{
		
	}
	
	
	
	

}
