package BaseMaster;

import java.util.HashMap;


import org.openqa.selenium.support.PageFactory;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;

import Utility.BrowserOperation;
import Utility.Functional;

public class TestCoverageStorageLocation extends BrowserOperation {

	public static void twoFieldTestCase() throws InterruptedException
	{
	
	TestCoverageStorageLocation.storageLocationAddAllField(TestDataHylands.storageLocation());
	
	TestCoverageStorageLocation.storageLocationDeleteAllField(TestDataHylands.storageLocation());		
	
	TestCoverageStorageLocation.storageLocationAddMandatoryField(TestDataHylands.storageLocation());
	
	TestCoverageStorageLocation.storageLocationDeleteMandatoryField(TestDataHylands.storageLocation());
	
	TestCoverageStorageLocation.storageLocationAddAllField(TestDataHylands.storageLocation());
	
	TestCoverageStorageLocation.storageLocationEditName(TestDataHylands.storageLocation());
	
	// Description value to value
	TestCoverageStorageLocation.storageLocationEditDescription(TestDataHylands.storageLocation());
	
	// Description value to null
	TestCoverageStorageLocation.storageLocationEditDescriptionValueToNull(TestDataHylands.storageLocation());
			
	// Description null to value
	TestCoverageStorageLocation.storageLocationEditDescriptionNullToValue(TestDataHylands.storageLocation());
		
	
//	TestCoverageStorageLocation.storageLocationDeleteAll(TestDataHylands.storageLocation());	
	
	}


	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
		
		 boolean screen=Function.preCondition( ElementStorageLocation.element());
		
		return screen;
	}
	
	
	
	public static void storageLocationAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageLocation.class);
			
		FunctionAdd.addAllField(value, ElementStorageLocation.element());
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
		
		FunctionEdit.editDescription(value, ElementStorageLocation.element(), ElementStorageLocation.list());
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
