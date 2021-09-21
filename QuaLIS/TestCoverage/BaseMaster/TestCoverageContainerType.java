package BaseMaster;

import java.io.IOException;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;

import Flow.TestDataHylands;

import Utility.BrowserOperation;
import Utility.Functional;

public class TestCoverageContainerType extends BrowserOperation

{
	
	
	
	public static void twoFieldTestCase() throws InterruptedException
	{
		
	TestCoverageContainerType.containerTypeAddAllField(TestDataHylands.containerType());
	
	TestCoverageContainerType.containerTypeDeleteAllField(TestDataHylands.containerType());		
	
	TestCoverageContainerType.containerTypeAddMandatoryField(TestDataHylands.containerType());
	
	TestCoverageContainerType.containerTypeDeleteMandatoryField(TestDataHylands.containerType());
	
	TestCoverageContainerType.containerTypeAddAllField(TestDataHylands.containerType());
	
	TestCoverageContainerType.containerTypeEditName(TestDataHylands.containerType());
	
	// Description value to value
	TestCoverageContainerType.containerTypeEditDescription(TestDataHylands.containerType());
	
	// Description value to null
	TestCoverageContainerType.containerTypeEditDescriptionValueToNull(TestDataHylands.containerType());
			
	// Description null to value
	TestCoverageContainerType.containerTypeEditDescriptionNullToValue(TestDataHylands.containerType());
		
	
	TestCoverageContainerType.containerTypeDeleteAll(TestDataHylands.containerType());
	}
	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		 boolean screen=Function.preCondition( ElementContainerType.element());
		
		return screen;
	}
	
	public static void containerTypeAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		
		
		PageFactory.initElements(driver, ElementContainerType.class);
			
		FunctionAdd.addAllField(value, ElementContainerType.element());
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
	
	public static void containerTypeEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementContainerType.class);
		
		FunctionEdit.editDescription(value, ElementContainerType.element(), ElementContainerType.list());
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
