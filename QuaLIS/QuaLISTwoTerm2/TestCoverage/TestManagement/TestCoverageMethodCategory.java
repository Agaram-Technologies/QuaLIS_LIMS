package TestManagement;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Config.ElementName;
import Flow.TestDataHylands;
import FlowMethod.MasterMethod;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageMethodCategory extends BrowserOperation {
	 public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageMethodCategory.methodCategoryAddAllField(TestDataHylands.methodCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageMethodCategory.methodCategoryDeleteAllField(TestDataHylands.methodCategory());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageMethodCategory.methodCategoryAddMandatoryField(TestDataHylands.methodCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageMethodCategory.methodCategoryDeleteMandatoryField(TestDataHylands.methodCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageMethodCategory.methodCategoryAddAllField(TestDataHylands.methodCategory());
			
			TestCoverageMethodCategory.methodCategoryEditName(TestDataHylands.methodCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageMethodCategory.methodCategoryEditDescriptionValueToValue(TestDataHylands.methodCategory());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageMethodCategory.methodCategoryEditDescriptionValueToNull(TestDataHylands.methodCategory());

		}

		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageMethodCategory.methodCategoryEditDescriptionNullToValue(TestDataHylands.methodCategory());		
		
		}
		
		return output;


	}

	public static HashMap<String, String> methodCategoryAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
			PageFactory.initElements(driver, ElementMethodCategory.class);
			
			output=FunctionAdd.addAllField(value,ElementMethodCategory.menu(), ElementMethodCategory.element(),ElementMethodCategory.list());

		return output;

	}
	 
	public static void methodCategoryAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionAdd.addMandatoryField(value, ElementMethodCategory.element());
	}

	public static void methodCategoryEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionEdit.editName(value, ElementMethodCategory.element(), ElementMethodCategory.list());
		
		
	}

	public static void methodCategoryEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMethodCategory.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementMethodCategory.element(), ElementMethodCategory.list());
	}
	 
		
		public static void methodCategoryEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
		{
			PageFactory.initElements(driver, ElementMethodCategory.class);
			
			FunctionEdit.editDescriptionValueToNull(value, ElementMethodCategory.element(), ElementMethodCategory.list());
		}
		
		public static void methodCategoryEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
		{
			PageFactory.initElements(driver, ElementMethodCategory.class);
			
			FunctionEdit.editDescriptionNullToValue(value, ElementMethodCategory.element(), ElementMethodCategory.list());
		}
		
		
		
		public static void methodCategoryDeleteAllField(HashMap <String, String> value) throws InterruptedException
		{
			PageFactory.initElements(driver, ElementMethodCategory.class);
			
			FunctionDelete.delete(value, ElementMethodCategory.element(), ElementMethodCategory.list());		
		}
		
		public static void methodCategoryDeleteAll(HashMap <String, String> value) throws InterruptedException
		{
			PageFactory.initElements(driver, ElementMethodCategory.class);
			
			FunctionDelete.deleteAll(value, ElementMethodCategory.element(), ElementMethodCategory.list());		
		}
		
		public static void methodCategoryDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
		{
			PageFactory.initElements(driver, ElementMethodCategory.class);
			
			FunctionDelete.deleteMandatory(value, ElementMethodCategory.element(), ElementMethodCategory.list());		
		}  }
