package BaseMaster;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;

import Flow.TestDataHylands;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation;
import Utility.FileHandling;
import Utility.Functional;

public class TestCoverageContainerType extends BrowserOperation

{
	
	
	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageContainerType.containerTypeAddAllField(TestDataHylands.containerType());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageContainerType.containerTypeDeleteAllField(TestDataHylands.containerType());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageContainerType.containerTypeAddMandatoryField(TestDataHylands.containerType());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageContainerType.containerTypeDeleteMandatoryField(TestDataHylands.containerType());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageContainerType.containerTypeAddAllField(TestDataHylands.containerType());
			
			TestCoverageContainerType.containerTypeEditName(TestDataHylands.containerType());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageContainerType.containerTypeEditDescriptionValueToValue(TestDataHylands.containerType());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageContainerType.containerTypeEditDescriptionValueToNull(TestDataHylands.containerType());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageContainerType.containerTypeEditDescriptionNullToValue(TestDataHylands.containerType());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> containerTypeAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementContainerType.class);
			
 		output=FunctionAdd.addAllField(value,ElementContainerType.menu(), ElementContainerType.element(),ElementContainerType.list());
	
		return output;
	
	}
	
	public static void containerTypeAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionAdd.addMandatoryField(value, ElementContainerType.element());
	}
	
	public static void containerTypeEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionEdit.editName(value, ElementContainerType.element(), ElementContainerType.list());
		
		
	}
	
	public static void containerTypeEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementContainerType.element(), ElementContainerType.list());
	}
	
	public static void containerTypeEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementContainerType.element(), ElementContainerType.list());
	}
	
	public static void containerTypeEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementContainerType.element(), ElementContainerType.list());
	}
	
	
	
	public static void containerTypeDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionDelete.delete(value, ElementContainerType.element(), ElementContainerType.list());		
	}
	
	public static void containerTypeDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionDelete.deleteAll(value, ElementContainerType.element(), ElementContainerType.list());		
	}
	
	public static void containerTypeDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionDelete.deleteMandatory(value, ElementContainerType.element(), ElementContainerType.list());		
	}
	
	
	
	
	public static void containerType(String containerType, String description)	throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementContainerType.class);

		ElementContainerType.masterIcon.click();

		ElementContainerType.baseMasterIcon.click();
		
		try {
			
			BrowserOperation.implicitWait(2);
			
			ElementContainerType.containerTypeIcon.click();

			Thread.sleep(500);

			WebDriverWait wait1 = new WebDriverWait(driver, 100);

			wait1.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAction));

			try {
				ElementContainerType.containerTypeAction.click();
			} catch (Exception e) {
				Thread.sleep(2000);

				ElementContainerType.containerTypeAction.click();

			}

			wait1.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAdd));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAdd));

			ElementContainerType.containerTypeAdd.click();

			for (int i = 0; i < 5; i++) {
				if (ElementContainerType.containerTypeAddSubmit.isDisplayed()) {

					break;
				} else {
					BrowserOperation.refreshLoginAdmin();

					PageFactory.initElements(driver, ElementContainerType.class);

					ElementContainerType.masterIcon.click();

					ElementContainerType.baseMasterIcon.click();

					ElementContainerType.containerTypeIcon.click();

					Thread.sleep(500);

					WebDriverWait wait11 = new WebDriverWait(driver, 100);

					wait11.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAction));

					wait11.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAction));

					try {
						ElementContainerType.containerTypeAction.click();
					} catch (Exception e) {
						Thread.sleep(2000);

						ElementContainerType.containerTypeAction.click();

					}

					wait11.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAdd));

					wait11.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAdd));

					ElementContainerType.containerTypeAdd.click();

				}

			}

			ElementContainerType.containerType.sendKeys(containerType);

			ElementContainerType.containerTypeDescription.sendKeys(description);

			ElementContainerType.containerTypeAddSubmit.click();

			wait1.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAction));
			
			ElementContainerType.baseMasterIcon.click();
			
			ElementContainerType.masterIcon.click();
			
			ElementContainerType.homeIcon.click();
 			
		}
		catch (Exception e) {
			
			ElementContainerType.baseMasterIcon.click();

			ElementContainerType.masterIcon.click();
			
			ElementContainerType.homeIcon.click();
			// TODO: handle exception
		}
		
	
		

	}


	
	public static void withoutEditAuditTrail() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
	//	Functional.withoutEditAuditTrail(ElementContainerType.list());
		
	}
	
	public static void addContainerType(String name, String description) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);

		ElementContainerType.masterIcon.click();

		ElementContainerType.baseMasterIcon.click();

		ElementContainerType.containerTypeIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAction));

		try {
			ElementContainerType.containerTypeAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementContainerType.containerTypeAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAdd));

		ElementContainerType.containerTypeAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementContainerType.containerTypeAddSubmit.isDisplayed()) {

				break;
			} else {
				

				PageFactory.initElements(driver, ElementContainerType.class);

				ElementContainerType.masterIcon.click();

				ElementContainerType.baseMasterIcon.click();

				ElementContainerType.containerTypeIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAction));

				try {
					ElementContainerType.containerTypeAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementContainerType.containerTypeAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAdd));

				ElementContainerType.containerTypeAdd.click();

			}

		}

		ElementContainerType.containerType.sendKeys(name);

		ElementContainerType.containerTypeDescription.sendKeys(description);

		ElementContainerType.containerTypeAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAction));

		wait1.until(ExpectedConditions.visibilityOf(ElementContainerType.containerTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementContainerType.containerTypeAction));

		ElementContainerType.baseMasterIcon.click();

		ElementContainerType.masterIcon.click();

	}
	
	
	
}
