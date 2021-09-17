package Configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Flow.TestDataJPDC;
import GenericRegistration.ElementJPDCRequestTest;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageTemplateMaster extends BrowserOperation{
	public static void templateMasterFlow(String sampleCategory,String materialCategory, String instrumentCategory,  String firstField) throws InterruptedException
	{
			TestCoverageTemplateMaster.product(sampleCategory,  firstField);
		 
		 TestCoverageTemplateMaster.instrument(instrumentCategory, firstField);
		 
		 
		 TestCoverageTemplateMaster.material(materialCategory,  firstField);
		 
	}
	
	
	
	public static void instrument(String category, String firstField) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTemplateMaster.class);

		ElementTemplateMaster.masterIcon.click();
		
		ElementTemplateMaster.configurationIcon.click();
		
		PageFactory.initElements(driver, ElementFTPConfiguration.class);
		
		ElementFTPConfiguration.FTPConfigurationIcon.click();
		
		ElementTemplateMaster.templateMasterIcon.click();
		
		
	
		
		WebElement templateMasterFilterSampleType = ElementTemplateMaster.templateMasterFilterSampleType;

		Select templateMasterFilterSampleTypeSelect = new Select(templateMasterFilterSampleType);

		templateMasterFilterSampleTypeSelect.selectByVisibleText("Instrument");
		
		Select filterSampleCategory = new Select(ElementTemplateMaster.filterCategory);

		filterSampleCategory.selectByVisibleText(category);
		
		
			
			
		
		
		ElementTemplateMaster.templateMasterFilterFind.click();
	

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}

		ElementTemplateMaster.templateMasterAdd.click();
		
		ElementTemplateMaster.templateMasterName.sendKeys(category);
		
		ElementTemplateMaster.firstField.sendKeys(firstField);
		
		ElementTemplateMaster.templateMasterAddSubmit.click();
		
	wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
	
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}
		
		ElementTemplateMaster.templateMasterApprove.click();
		

		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
		
		
		
		
		
			ElementTemplateMaster.configurationIcon.click();
			
			ElementTemplateMaster.masterIcon.click();
		
		
		
		
		
		
	}
	
	
	
	public static void product(String category, String firstField) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTemplateMaster.class);

		ElementTemplateMaster.masterIcon.click();
		
		ElementTemplateMaster.configurationIcon.click();
		
		PageFactory.initElements(driver, ElementFTPConfiguration.class);
		
		ElementFTPConfiguration.FTPConfigurationIcon.click();
		
		ElementTemplateMaster.templateMasterIcon.click();
		
		
	
		
		WebElement templateMasterFilterSampleType = ElementTemplateMaster.templateMasterFilterSampleType;

		Select templateMasterFilterSampleTypeSelect = new Select(templateMasterFilterSampleType);

		templateMasterFilterSampleTypeSelect.selectByVisibleText("Product");
		
		Select filterSampleCategory = new Select(ElementTemplateMaster.filterCategory);

		filterSampleCategory.selectByVisibleText(category);
		
		
			
			
		
		
		ElementTemplateMaster.templateMasterFilterFind.click();
	

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}

		ElementTemplateMaster.templateMasterAdd.click();
		
		ElementTemplateMaster.templateMasterName.sendKeys(category);
		
		ElementTemplateMaster.firstField.sendKeys(firstField);
		
		ElementTemplateMaster.templateMasterAddSubmit.click();
		
	wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
			try {
				ElementTemplateMaster.templateMasterAction.click();
			} catch (Exception e) {
				Thread.sleep(2000);

				ElementTemplateMaster.templateMasterAction.click();

			}
			
			ElementTemplateMaster.templateMasterApprove.click();
			
		
	

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
			
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
		
		
		
		
		
			ElementTemplateMaster.configurationIcon.click();
			
			ElementTemplateMaster.masterIcon.click();
		
		
		
		
		
		
	}
	
	public static void material(String category, String firstField) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTemplateMaster.class);

		ElementTemplateMaster.masterIcon.click();
		
		ElementTemplateMaster.configurationIcon.click();
		
		PageFactory.initElements(driver, ElementFTPConfiguration.class);
		
		ElementFTPConfiguration.FTPConfigurationIcon.click();
		
		ElementTemplateMaster.templateMasterIcon.click();
		
		
	
		
		WebElement templateMasterFilterSampleType = ElementTemplateMaster.templateMasterFilterSampleType;

		Select templateMasterFilterSampleTypeSelect = new Select(templateMasterFilterSampleType);

		templateMasterFilterSampleTypeSelect.selectByVisibleText("Material");
		
		Select filterSampleCategory = new Select(ElementTemplateMaster.filterCategory);

		filterSampleCategory.selectByVisibleText(category);
		
		
			
			
		
		
		ElementTemplateMaster.templateMasterFilterFind.click();
	

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}

		ElementTemplateMaster.templateMasterAdd.click();
		
		ElementTemplateMaster.templateMasterName.sendKeys(category);
		
		ElementTemplateMaster.firstField.sendKeys(firstField);
		
		ElementTemplateMaster.templateMasterAddSubmit.click();
		
	wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
			try {
				ElementTemplateMaster.templateMasterAction.click();
			} catch (Exception e) {
				Thread.sleep(2000);

				ElementTemplateMaster.templateMasterAction.click();

			}
			
			ElementTemplateMaster.templateMasterApprove.click();
			
	
			
			

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
		
		
		
		
		
			ElementTemplateMaster.configurationIcon.click();
			
			ElementTemplateMaster.masterIcon.click();
		
		
		
		
		
		
	}
	
	public static void templateMasterProductKorean(String sampleCategory,String templateName, String firstField) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTemplateMaster.class);

		ElementTemplateMaster.masterIcon.click();
		
		ElementTemplateMaster.configurationIcon.click();
		
		PageFactory.initElements(driver, ElementFTPConfiguration.class);
		
		ElementFTPConfiguration.FTPConfigurationIcon.click();
		
		ElementTemplateMaster.templateMasterIcon.click();
		
			
		WebElement templateMasterFilterSampleType = ElementTemplateMaster.templateMasterFilterSampleType;

		Select templateMasterFilterSampleTypeSelect = new Select(templateMasterFilterSampleType);

		BrowserOperation.implicitWait(2);
		
		
		try {
			templateMasterFilterSampleTypeSelect.selectByVisibleText("품목");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			templateMasterFilterSampleTypeSelect.selectByIndex(0);
		}
	
		
		BrowserOperation.implicitWait(20);
		
		BasicOperation.select(ElementTemplateMaster.templateMasterFilterSampleCategory, TestDataJPDC.sampleCategory);
		
			
			
		
		
		ElementTemplateMaster.templateMasterFilterFind.click();
	

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}

		ElementTemplateMaster.templateMasterAdd.click();
		
		ElementTemplateMaster.templateMasterName.sendKeys(templateName);
		
		ElementTemplateMaster.firstField.sendKeys(firstField);
		
		ElementTemplateMaster.templateMasterAddSubmit.click();
		
	wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
	
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}
		
		ElementTemplateMaster.templateMasterApprove.click();
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
		
		
		
		
		
			ElementTemplateMaster.configurationIcon.click();
			
			ElementTemplateMaster.masterIcon.click();
		
		
		
		
		
		
	}
	
	public static void templateMasterMaterial(String templateName, String firstField) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTemplateMaster.class);

		ElementTemplateMaster.masterIcon.click();
		
		ElementTemplateMaster.configurationIcon.click();
		
		PageFactory.initElements(driver, ElementFTPConfiguration.class);
		
		ElementFTPConfiguration.FTPConfigurationIcon.click();
		
		ElementTemplateMaster.templateMasterIcon.click();
		
		
	
		
		WebElement templateMasterFilterSampleType = ElementTemplateMaster.templateMasterFilterSampleType;

		Select templateMasterFilterSampleTypeSelect = new Select(templateMasterFilterSampleType);

		templateMasterFilterSampleTypeSelect.selectByVisibleText("Material");
		
		
			
			
		
		
		ElementTemplateMaster.templateMasterFilterFind.click();
	

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}

		ElementTemplateMaster.templateMasterAdd.click();
		
		ElementTemplateMaster.templateMasterName.sendKeys(templateName);
		
		ElementTemplateMaster.firstField.sendKeys(firstField);
		
		ElementTemplateMaster.templateMasterAddSubmit.click();
		
	wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
	
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}
		
		ElementTemplateMaster.templateMasterApprove.click();
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
		
		
		
		
		
			ElementTemplateMaster.configurationIcon.click();
			
			ElementTemplateMaster.masterIcon.click();
		
		
		
		
		
		
	}
	
	public static void templateMasterInstrument(String templateName, String firstField) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTemplateMaster.class);

		ElementTemplateMaster.masterIcon.click();
		
		ElementTemplateMaster.configurationIcon.click();
		
		PageFactory.initElements(driver, ElementFTPConfiguration.class);
		
		ElementFTPConfiguration.FTPConfigurationIcon.click();
		
		ElementTemplateMaster.templateMasterIcon.click();
		
		
	
		
		WebElement templateMasterFilterSampleType = ElementTemplateMaster.templateMasterFilterSampleType;

		Select templateMasterFilterSampleTypeSelect = new Select(templateMasterFilterSampleType);

		templateMasterFilterSampleTypeSelect.selectByVisibleText("Instrument");
		
		
			
			
		
		
		ElementTemplateMaster.templateMasterFilterFind.click();
	

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}

		ElementTemplateMaster.templateMasterAdd.click();
		
		ElementTemplateMaster.templateMasterName.sendKeys(templateName);
		
		ElementTemplateMaster.firstField.sendKeys(firstField);
		
		ElementTemplateMaster.templateMasterAddSubmit.click();
		
	wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
	
		
		
	
		
		try {
			ElementTemplateMaster.templateMasterAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTemplateMaster.templateMasterAction.click();

		}
		
		ElementTemplateMaster.templateMasterApprove.click();
		
		

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTemplateMaster.templateMasterAction));
			
			wait11.until(ExpectedConditions.elementToBeClickable(ElementTemplateMaster.templateMasterAction));		
		
		
		
		
		
			ElementTemplateMaster.configurationIcon.click();
			
			ElementTemplateMaster.masterIcon.click();
		
		
		
		
		
		
	}
}
