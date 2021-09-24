package Organisation;

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
import MaterialManagement.ElementMaterialGrade;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation;
public class TestCoverageSection extends BrowserOperation{
	

	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageSection.sectionAddAllField(TestDataHylands.section());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageSection.sectionDeleteAllField(TestDataHylands.section());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageSection.sectionAddMandatoryField(TestDataHylands.section());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageSection.sectionDeleteMandatoryField(TestDataHylands.section());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageSection.sectionAddAllField(TestDataHylands.section());
			
			TestCoverageSection.sectionEditName(TestDataHylands.section());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageSection.sectionEditDescriptionValueToValue(TestDataHylands.section());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageSection.sectionEditDescriptionValueToNull(TestDataHylands.section());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageSection.sectionEditDescriptionNullToValue(TestDataHylands.section());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> sectionAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementSection.class);
			
 		output=FunctionAdd.addAllField(value,ElementSection.menu(), ElementSection.element(),ElementSection.list());
	
		return output;
	
	}

	public static void sectionEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementSection.element(), ElementSection.list());
	}
	
	
	public static void sectionAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionAdd.addMandatoryField(value, ElementSection.element());
	}
	
	public static void sectionEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionEdit.editName(value, ElementSection.element(), ElementSection.list());
		
		
	}
	 
	   
	public static void sectionEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementSection.element(), ElementSection.list());
	}
	
	public static void sectionEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementSection.element(), ElementSection.list());
	}
	
	public static void sectionEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementSection.element(), ElementSection.list());
	}
	
	
	
	public static void sectionDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionDelete.delete(value, ElementSection.element(), ElementSection.list());		
	}
	
	public static void sectionDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionDelete.deleteAll(value, ElementSection.element(), ElementSection.list());		
	}
	
	public static void sectionDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSection.class);
		
		FunctionDelete.deleteMandatory(value, ElementSection.element(), ElementSection.list());		
	}
	

	
	
	public static void sectionAdd(String section, String description) throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementSection.class);

		ElementSection.masterIcon.click();

		ElementSection.organisationManagementIcon.click();

		ElementSection.sectionIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAction));

		try {
			ElementSection.sectionAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementSection.sectionAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAdd));

		ElementSection.sectionAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSection.sectionAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSection.class);

				ElementSection.masterIcon.click();

				ElementSection.organisationManagementIcon.click();

				ElementSection.sectionIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAction));

				try {
					ElementSection.sectionAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementSection.sectionAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSection.sectionAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAdd));

				ElementSection.sectionAdd.click();

			}
		}

		ElementSection.section.sendKeys(section);

		ElementSection.sectionDescription.sendKeys(description);

		ElementSection.sectionAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAction));

		/*
		 * FileInputStream s = new FileInputStream("flow.properties");
		 * 
		 * Properties properties = new Properties();
		 * 
		 * properties.load(s);
		 * 
		 * String sectionScreenshot = properties.getProperty("section");
		 * 
		 * BasicOperation.screenshot(sectionScreenshot);
		 * 
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.
		 * sectionAction));
		 */

		ElementSection.organisationManagementIcon.click();

		ElementSection.masterIcon.click();

	}
}
