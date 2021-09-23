package Organisation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import BaseMaster.ElementContainerType; 
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BasicOperation;
import Utility.BrowserOperation;
import Utility.Functional;

public class TestCoverageDepartment extends BrowserOperation{
	

	
	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageDepartment.departmentAddAllField(TestDataHylands.department());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageDepartment.departmentDeleteAllField(TestDataHylands.department());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageDepartment.departmentAddMandatoryField(TestDataHylands.department());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageDepartment.departmentDeleteMandatoryField(TestDataHylands.department());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageDepartment.departmentAddAllField(TestDataHylands.department());
			
			TestCoverageDepartment.departmentEditName(TestDataHylands.department());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageDepartment.departmentEditDescriptionValueToValue(TestDataHylands.department());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageDepartment.departmentEditDescriptionValueToNull(TestDataHylands.department());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageDepartment.departmentEditDescriptionNullToValue(TestDataHylands.department());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> departmentAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementDepartment.class);
			
 		output=FunctionAdd.addAllField(value,ElementDepartment.menu(), ElementDepartment.element(),ElementDepartment.list());
	
		return output;
	
	}
	public static void departmentAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionAdd.addMandatoryField(value, ElementDepartment.element());
	}
	
	public static void departmentEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionEdit.editName(value, ElementDepartment.element(), ElementDepartment.list());
	
		
		
	}
	
	public static void departmentEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementDepartment.element(), ElementContainerType.list());
	}
	
	public static void departmentEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementDepartment.element(), ElementDepartment.list());
	}
	
	public static void departmentEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementDepartment.element(), ElementDepartment.list());
	}
	
	public static void departmentEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementDepartment.element(), ElementDepartment.list());
	}
	
	
	
	public static void departmentDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionDelete.delete(value, ElementDepartment.element(), ElementDepartment.list());		
	}
	
	public static void departmentDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionDelete.deleteAll(value, ElementDepartment.element(), ElementDepartment.list());		
	}
	
	public static void departmentDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
		FunctionDelete.deleteMandatory(value, ElementDepartment.element(), ElementDepartment.list());		
	}
	

	

	public static void departmentAdd(String department, String description) throws IOException, InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);

		ElementDepartment.masterIcon.click();

		ElementDepartment.organisationManagementIcon.click();

		ElementDepartment.departmentIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));

		try {
			ElementDepartment.departmentAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementDepartment.departmentAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAdd));

		ElementDepartment.departmentAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementDepartment.departmentAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementDepartment.class);

				ElementDepartment.masterIcon.click();

				ElementDepartment.organisationManagementIcon.click();

				ElementDepartment.departmentIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));

				try {
					ElementDepartment.departmentAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementDepartment.departmentAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAdd));

				ElementDepartment.departmentAdd.click();

			}
		}

		ElementDepartment.department.sendKeys(department);

		ElementDepartment.departmentDescription.sendKeys(description);

		ElementDepartment.departmentAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));

		/*FileInputStream s = new FileInputStream("flow.properties");

		Properties properties = new Properties();

		properties.load(s);

		String departmentScreenshot = properties.getProperty("department");

		BasicOperation.screenshot(departmentScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));
*/
		ElementDepartment.organisationManagementIcon.click();

		ElementDepartment.masterIcon.click();

	}
	
	public static void withoutEditAuditTrail() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDepartment.class);
		
	//	Functional.withoutEditAuditTrail(ElementDepartment.list());
		
	}
}
