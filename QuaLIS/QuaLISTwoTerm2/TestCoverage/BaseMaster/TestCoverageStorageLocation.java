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

public class TestCoverageStorageLocation extends BrowserOperation {


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageStorageLocation.storageLocationAddAllField(TestDataHylands.storageLocation());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageStorageLocation.storageLocationDeleteAllField(TestDataHylands.storageLocation());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageStorageLocation.storageLocationAddMandatoryField(TestDataHylands.storageLocation());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageStorageLocation.storageLocationDeleteMandatoryField(TestDataHylands.storageLocation());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageStorageLocation.storageLocationAddAllField(TestDataHylands.storageLocation());
			
			TestCoverageStorageLocation.storageLocationEditName(TestDataHylands.storageLocation());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageStorageLocation.storageLocationEditDescriptionValueToValue(TestDataHylands.storageLocation());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageStorageLocation.storageLocationEditDescriptionValueToNull(TestDataHylands.storageLocation());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageStorageLocation.storageLocationEditDescriptionNullToValue(TestDataHylands.storageLocation());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> storageLocationAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementStorageLocation.class);
			
 		output=FunctionAdd.addAllField(value,ElementStorageLocation.menu(), ElementStorageLocation.element(),ElementStorageLocation.list());
	
		return output;
	
	}

	public static void storageLocationEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementStorageLocation.element(), ElementStorageLocation.list());
	}
	
	public static void storageLocationAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionAdd.addMandatoryField(value, ElementStorageLocation.element());
	}
	
	public static void storageLocationEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionEdit.editName(value, ElementStorageLocation.element(), ElementStorageLocation.list());
		
		
	}
	
	public static void storageLocationEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementStorageLocation.element(), ElementStorageLocation.list());
	}
	
	public static void storageLocationEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementStorageLocation.element(), ElementStorageLocation.list());
	}
	
	public static void storageLocationEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementStorageLocation.element(), ElementStorageLocation.list());
	}
	
	
	
	public static void storageLocationDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionDelete.delete(value, ElementStorageLocation.element(), ElementStorageLocation.list());		
	}
	
	public static void storageLocationDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionDelete.deleteAll(value, ElementStorageLocation.element(), ElementStorageLocation.list());		
	}
	
	public static void storageLocationDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		FunctionDelete.deleteMandatory(value, ElementStorageLocation.element(), ElementStorageLocation.list());		
	}
	
	

	/*public static void withoutEditAuditTrail() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		Functional.withoutEditAuditTrail(ElementStorageLocation.list());
		
	}*/
	
}
