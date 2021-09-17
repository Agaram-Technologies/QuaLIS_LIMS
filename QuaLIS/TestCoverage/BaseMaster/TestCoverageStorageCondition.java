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


public class TestCoverageStorageCondition  extends BrowserOperation{
	
	public static void twoFieldTestCase() throws InterruptedException
	{
	TestCoverageStorageCondition.storageConditionAddAllField(TestDataHylands.storageCondition());
	
	TestCoverageStorageCondition.storageConditionDeleteAllField(TestDataHylands.storageCondition());		
	
	TestCoverageStorageCondition.storageConditionAddMandatoryField(TestDataHylands.storageCondition());
	
	TestCoverageStorageCondition.storageConditionDeleteMandatoryField(TestDataHylands.storageCondition());
	
	TestCoverageStorageCondition.storageConditionAddAllField(TestDataHylands.storageCondition());
	
	TestCoverageStorageCondition.storageConditionEditName(TestDataHylands.storageCondition());
	
	// Description value to value
	TestCoverageStorageCondition.storageConditionEditDescription(TestDataHylands.storageCondition());
	
	// Description value to null
	TestCoverageStorageCondition.storageConditionEditDescriptionValueToNull(TestDataHylands.storageCondition());
			
	// Description null to value
	TestCoverageStorageCondition.storageConditionEditDescriptionNullToValue(TestDataHylands.storageCondition());
		
	
//	TestCoverageStorageCondition.storageConditionDeleteAll(TestDataHylands.storageCondition());	
	}

	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
		
		 boolean screen=Function.preCondition( ElementStorageCondition.element());
		
		return screen;
	}
	
	
	public static void storageConditionAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementStorageCondition.class);
			
		FunctionAdd.addAllField(value, ElementStorageCondition.element());
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
		
		FunctionEdit.editDescription(value, ElementStorageCondition.element(), ElementStorageCondition.list());
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
