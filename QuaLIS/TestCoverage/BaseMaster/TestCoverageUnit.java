package BaseMaster;

import java.awt.AWTException;






import java.awt.HeadlessException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Organisation.ElementOrganisation;
import Flow.TestDataHylands;

import Utility.BrowserOperation;
import Utility.Functional;

import UserManagement.TestCoverageAuditTrail;
import Utility.BasicOperation;
import Utility.BrowserOperation;
import Utility.Functional;

public class TestCoverageUnit extends BrowserOperation {
	
	
	public static void twoFieldTestCase() throws InterruptedException
	{
	
	TestCoverageUnit.unitAddAllField(TestDataHylands.unit());
	
	TestCoverageUnit.unitDeleteAllField(TestDataHylands.unit());		
	
	TestCoverageUnit.unitAddMandatoryField(TestDataHylands.unit());
	
	TestCoverageUnit.unitDeleteMandatoryField(TestDataHylands.unit());
	
	TestCoverageUnit.unitAddAllField(TestDataHylands.unit());
	
	TestCoverageUnit.unitEditName(TestDataHylands.unit());
	
	// Description value to value
	TestCoverageUnit.unitEditDescription(TestDataHylands.unit());
	
	// Description value to null
	TestCoverageUnit.unitEditDescriptionValueToNull(TestDataHylands.unit());
			
	// Description null to value
	TestCoverageUnit.unitEditDescriptionNullToValue(TestDataHylands.unit());
		
	
//	TestCoverageUnit.unitDeleteAll(TestDataHylands.unit());	
	
	}


	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		 boolean screen=Function.preCondition( ElementUnit.element());
		
		return screen;
	}
	
	

	
	public static void unitAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
			
		FunctionAdd.addAllField(value, ElementUnit.element());
	}
	
	public static void unitAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionAdd.addMandatoryField(value, ElementUnit.element());
	}
	
	public static void unitEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionEdit.editName(value, ElementUnit.element(), ElementUnit.list());
		
		
	}
	
	public static void unitEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionEdit.editDescription(value, ElementUnit.element(), ElementUnit.list());
	}
	
	public static void unitEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementUnit.element(), ElementUnit.list());
	}
	
	public static void unitEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementUnit.element(), ElementUnit.list());
	}
	
	
	
	public static void unitDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionDelete.delete(value, ElementUnit.element(), ElementUnit.list());		
	}
	
	public static void unitDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionDelete.deleteAll(value, ElementUnit.element(), ElementUnit.list());		
	}
	
	public static void unitDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionDelete.deleteMandatory(value, ElementUnit.element(), ElementUnit.list());		
	}
	

	public static void unitAddAuditTrail(String unit, String description)
			throws InterruptedException, IOException, HeadlessException, AWTException {

		PageFactory.initElements(driver, ElementUnit.class);

		ElementUnit.masterIcon.click();

		ElementUnit.baseMasterIcon.click();

		ElementUnit.unitIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		try {
			ElementUnit.unitAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUnit.unitAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAdd));

		ElementUnit.unitAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementUnit.unitAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementUnit.class);

				ElementUnit.masterIcon.click();

				ElementUnit.baseMasterIcon.click();

				ElementUnit.unitIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

				try {
					ElementUnit.unitAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementUnit.unitAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementUnit.unitAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAdd));

				ElementUnit.unitAdd.click();

			}

		}

		ElementUnit.unit.sendKeys(unit);

		ElementUnit.unitDescription.sendKeys(description);

		BasicOperation.screenshot("D:\\QuaLIS\\AuditTrail\\BaseMaster\\Unit\\unitAddData.png");

		ElementUnit.unitAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		BasicOperation.screenshot("D:\\QuaLIS\\AuditTrail\\BaseMaster\\Unit\\unitAddGrid.png");

		ElementUnit.baseMasterIcon.click();

		ElementUnit.masterIcon.click();

	}

	public static void unitEdit(String unit, String unitEdit)
			throws InterruptedException, HeadlessException, IOException, AWTException {
		PageFactory.initElements(driver, ElementUnit.class);

		PageFactory.initElements(driver, ElementStorageCondition.class);

		ElementUnit.masterIcon.click();

		ElementUnit.baseMasterIcon.click();

		ElementStorageCondition.storageConditionIcon.click();
		ElementUnit.unitIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		List<WebElement> u = ElementUnit.unitList;

		try {
			u.get(0).click();

			System.out.println("cliced");
		} catch (Exception e) {

			System.out.println("not cliced");

		}

		System.out.println("unselect");

		List<WebElement> c = ElementUnit.unitCheckboxList;

		for (WebElement departmentElement : u) {

			if (departmentElement.getText().equals(unit)) {

				System.out.println(departmentElement.getText());

				int i = u.indexOf(departmentElement);

				c.get(i).click();

			}

		}
		System.out.println("clicked");

		try {
			ElementUnit.unitAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUnit.unitAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitEdit));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitEdit));

		ElementUnit.unitEdit.click();

		boolean display = false;
		for (int k = 0; k < 100; k++) {
			try {
				ElementUnit.unit.click();

				display = true;

				if (display == true) {
					System.out.println(k);

					break;
				}

			} catch (Exception e) {
				Thread.sleep(100);

				ElementUnit.unit.click();
			}

		}

		ElementUnit.unit.clear();

		ElementUnit.unit.sendKeys(unitEdit);

		// ElementUnit.unitDescription.sendKeys(description);

		ElementUnit.unitEditSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		ElementUnit.baseMasterIcon.click();

		ElementUnit.masterIcon.click();

	}

	public static void unitDelete(String unit) throws InterruptedException {
		PageFactory.initElements(driver, ElementUnit.class);

		PageFactory.initElements(driver, ElementStorageCondition.class);

		ElementUnit.masterIcon.click();

		ElementUnit.baseMasterIcon.click();

		ElementStorageCondition.storageConditionIcon.click();

		ElementUnit.unitIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		List<WebElement> u = ElementUnit.unitList;

		try {
			u.get(0).click();

			System.out.println("cliced");
		} catch (Exception e) {

			System.out.println("not cliced");

		}

		System.out.println("unselect");

		List<WebElement> c = ElementUnit.unitCheckboxList;

		for (WebElement departmentElement : u) {

			if (departmentElement.getText().equals(unit)) {

				System.out.println(departmentElement.getText());

				int i = u.indexOf(departmentElement);

				c.get(i).click();

			}

		}

		try {
			ElementUnit.unitAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUnit.unitAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitDelete));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitDelete));

		ElementUnit.unitDelete.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		ElementUnit.baseMasterIcon.click();

		ElementUnit.masterIcon.click();
	}

	public static void unitAdd(String unit, String description) throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementUnit.class);

		PageFactory.initElements(driver, ElementStorageCondition.class);

		ElementUnit.masterIcon.click();

		ElementUnit.baseMasterIcon.click();

		ElementStorageCondition.storageConditionIcon.click();

		ElementUnit.unitIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		try {
			ElementUnit.unitAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUnit.unitAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAdd));

		ElementUnit.unitAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementUnit.unitAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementUnit.class);

				ElementUnit.masterIcon.click();

				ElementUnit.baseMasterIcon.click();

				ElementUnit.unitIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

				try {
					ElementUnit.unitAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementUnit.unitAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementUnit.unitAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAdd));

				ElementUnit.unitAdd.click();

			}

		}

		ElementUnit.unit.sendKeys(unit);

		ElementUnit.unitDescription.sendKeys(description);

		ElementUnit.unitAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		ElementUnit.baseMasterIcon.click();

		ElementUnit.masterIcon.click();
	}

	
	
	
/*	
	public static void withoutEditAuditTrail() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		Functional.withoutEditAuditTrail(ElementUnit.list());
		
	}
	*/
	
	
	
	

}
