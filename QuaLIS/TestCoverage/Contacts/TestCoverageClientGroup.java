package Contacts;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;
import Organisation.ElementDepartment; 
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation;

public class TestCoverageClientGroup extends BrowserOperation{
	


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageClientGroup.clientGroupAddAllField(TestDataHylands.clientGroup());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageClientGroup.clientGroupDeleteAllField(TestDataHylands.clientGroup());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageClientGroup.clientGroupAddMandatoryField(TestDataHylands.clientGroup());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageClientGroup.clientGroupDeleteMandatoryField(TestDataHylands.clientGroup());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageClientGroup.clientGroupAddAllField(TestDataHylands.clientGroup());
			
			TestCoverageClientGroup.clientGroupEditName(TestDataHylands.clientGroup());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageClientGroup.clientGroupEditDescriptionValueToValue(TestDataHylands.clientGroup());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageClientGroup.clientGroupEditDescriptionValueToNull(TestDataHylands.clientGroup());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageClientGroup.clientGroupEditDescriptionNullToValue(TestDataHylands.clientGroup());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> clientGroupAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementClientGroup.class);
			
 		output=FunctionAdd.addAllField(value,ElementClientGroup.menu(), ElementClientGroup.element(),ElementClientGroup.list());
	
		return output;
	
	}

	public static void clientGroupEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementClientGroup.element(), ElementClientGroup.list());
	}
	
	
	public static void clientGroupAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionAdd.addMandatoryField(value, ElementClientGroup.element());
	}
	
	public static void clientGroupEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionEdit.editName(value, ElementClientGroup.element(), ElementClientGroup.list());
	
		
		
	}
	 
	
	public static void clientGroupEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementClientGroup.element(), ElementClientGroup.list());
	}
	
	public static void clientGroupEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementClientGroup.element(), ElementClientGroup.list());
	}
	
	
	
	public static void clientGroupDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionDelete.delete(value, ElementClientGroup.element(), ElementClientGroup.list());		
	}
	
	public static void clientGroupDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionDelete.deleteAll(value, ElementClientGroup.element(), ElementClientGroup.list());		
	}
	
	public static void clientGroupDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementClientGroup.class);
		
		FunctionDelete.deleteMandatory(value, ElementClientGroup.element(), ElementClientGroup.list());		
	}
	

	
	

}
