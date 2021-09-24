package BaseMaster;

import java.util.HashMap; 
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

import org.openqa.selenium.support.PageFactory;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;

import Utility.BrowserOperation;
import Utility.Functional;


import org.openqa.selenium.support.PageFactory;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;

import Utility.BrowserOperation;
import Utility.Functional;
 

public class TestCoverageStorageCondition  extends BrowserOperation{
	


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageStorageCondition.storageConditionAddAllField(TestDataHylands.storageCondition());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageStorageCondition.storageConditionDeleteAllField(TestDataHylands.storageCondition());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageStorageCondition.storageConditionAddMandatoryField(TestDataHylands.storageCondition());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageStorageCondition.storageConditionDeleteMandatoryField(TestDataHylands.storageCondition());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageStorageCondition.storageConditionAddAllField(TestDataHylands.storageCondition());
			
			TestCoverageStorageCondition.storageConditionEditName(TestDataHylands.storageCondition());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageStorageCondition.storageConditionEditDescriptionValueToValue(TestDataHylands.storageCondition());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageStorageCondition.storageConditionEditDescriptionValueToNull(TestDataHylands.storageCondition());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageStorageCondition.storageConditionEditDescriptionNullToValue(TestDataHylands.storageCondition());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> storageConditionAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementStorageCondition.class);
			
 		output=FunctionAdd.addAllField(value,ElementStorageCondition.menu(), ElementStorageCondition.element(),ElementStorageCondition.list());
	
		return output;
	
	}

	public static void storageConditionEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementStorageCondition.element(), ElementStorageCondition.list());
	}
	
	
	public static void storageConditionAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionAdd.addMandatoryField(value, ElementStorageCondition.element());
	}
	
	public static void storageConditionEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionEdit.editName(value, ElementStorageCondition.element(), ElementStorageCondition.list());
		
		
	}
	
	public static void storageConditionEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementStorageCondition.element(), ElementStorageCondition.list());
	}
	
	public static void storageConditionEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementStorageCondition.element(), ElementStorageCondition.list());
	}
	
	public static void storageConditionEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementStorageCondition.element(), ElementStorageCondition.list());
	}
	
	
	
	public static void storageConditionDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionDelete.delete(value, ElementStorageCondition.element(), ElementStorageCondition.list());		
	}
	
	public static void storageConditionDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionDelete.deleteAll(value, ElementStorageCondition.element(), ElementStorageCondition.list());		
	}
	
	public static void storageConditionDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		FunctionDelete.deleteMandatory(value, ElementStorageCondition.element(), ElementStorageCondition.list());		
	}
	
	
	/*
	public static void withoutEditAuditTrail() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		Functional.withoutEditAuditTrail(ElementStorageCondition.list());
		
	}*/

}
