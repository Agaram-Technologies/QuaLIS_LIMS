package UserManagement;

import java.awt.AWTException; 

import java.util.HashMap;  
import org.openqa.selenium.support.PageFactory;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import CompetenceManagement.ElementTechnique;


import java.io.IOException;
import java.net.URISyntaxException; 
import Flow.TestDataHylands; 
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation; 
public class TestCoverageDesignation extends BrowserOperation
{
	
	
	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageDesignation.designationAddAllField(TestDataHylands.designation());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageDesignation.designationDeleteAllField(TestDataHylands.designation());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageDesignation.designationAddMandatoryField(TestDataHylands.designation());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageDesignation.designationDeleteMandatoryField(TestDataHylands.designation());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageDesignation.designationAddAllField(TestDataHylands.designation());
			
			TestCoverageDesignation.designationEditName(TestDataHylands.designation());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageDesignation.designationEditDescriptionValueToValue(TestDataHylands.designation());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageDesignation.designationEditDescriptionValueToNull(TestDataHylands.designation());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageDesignation.designationEditDescriptionNullToValue(TestDataHylands.designation());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> designationAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementDesignation.class);
			
 		output=FunctionAdd.addAllField(value,ElementDesignation.menu(), ElementDesignation.element(),ElementDesignation.list());
	
		return output;
	
	}
	
	public static void designationAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionAdd.addMandatoryField(value, ElementDesignation.element());
	}
	
	public static void designationEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editName(value, ElementDesignation.element(), ElementDesignation.list());
	
		
		
	}
	
	public static void designationEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementDesignation.element(), ElementTechnique.list());
	}
	 
	
	public static void designationEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementDesignation.element(), ElementDesignation.list());
	}
	
	public static void designationEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementDesignation.element(), ElementDesignation.list());
	}
	
	
	
	public static void designationDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionDelete.delete(value, ElementDesignation.element(), ElementDesignation.list());		
	}
	
	public static void designationDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionDelete.deleteAll(value, ElementDesignation.element(), ElementDesignation.list());		
	}
	
	public static void designationDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionDelete.deleteMandatory(value, ElementDesignation.element(), ElementDesignation.list());		
	}
	

	 
	}
