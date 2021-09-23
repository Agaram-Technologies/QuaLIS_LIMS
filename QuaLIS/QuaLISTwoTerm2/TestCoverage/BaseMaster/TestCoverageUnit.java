package BaseMaster;

import java.awt.AWTException; 


import java.util.HashMap; 
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
import org.openqa.selenium.support.PageFactory;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Contacts.ElementSupplierCategory; 
import Utility.BrowserOperation;


public class TestCoverageUnit extends BrowserOperation {
	


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageUnit.unitAddAllField(TestDataHylands.unit());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageUnit.unitDeleteAllField(TestDataHylands.unit());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageUnit.unitAddMandatoryField(TestDataHylands.unit());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageUnit.unitDeleteMandatoryField(TestDataHylands.unit());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageUnit.unitAddAllField(TestDataHylands.unit());
			
			TestCoverageUnit.unitEditName(TestDataHylands.unit());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageUnit.unitEditDescriptionValueToValue(TestDataHylands.unit());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageUnit.unitEditDescriptionValueToNull(TestDataHylands.unit());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageUnit.unitEditDescriptionNullToValue(TestDataHylands.unit());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> unitAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementUnit.class);
			
 		output=FunctionAdd.addAllField(value,ElementUnit.menu(), ElementUnit.element(),ElementUnit.list());
	
		return output;
	
	}

	public static void unitEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUnit.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementUnit.element(), ElementUnit.list());
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
		
		FunctionEdit.editDescriptionValueToValue(value, ElementUnit.element(), ElementUnit.list());
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
	
}
