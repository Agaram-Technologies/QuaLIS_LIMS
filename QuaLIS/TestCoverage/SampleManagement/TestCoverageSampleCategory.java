package SampleManagement;

import java.util.HashMap; 

import org.openqa.selenium.support.PageFactory;

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


public class TestCoverageSampleCategory extends BrowserOperation
{


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageSampleCategory.sampleCategoryAddAllField(TestDataHylands.sampleCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageSampleCategory.sampleCategoryDeleteAllField(TestDataHylands.sampleCategory());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageSampleCategory.sampleCategoryAddMandatoryField(TestDataHylands.sampleCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageSampleCategory.sampleCategoryDeleteMandatoryField(TestDataHylands.sampleCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageSampleCategory.sampleCategoryAddAllField(TestDataHylands.sampleCategory());
			
			TestCoverageSampleCategory.sampleCategoryEditName(TestDataHylands.sampleCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageSampleCategory.sampleCategoryEditDescriptionValueToValue(TestDataHylands.sampleCategory());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageSampleCategory.sampleCategoryEditDescriptionValueToNull(TestDataHylands.sampleCategory());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageSampleCategory.sampleCategoryEditDescriptionNullToValue(TestDataHylands.sampleCategory());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> sampleCategoryAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementSampleCategory.class);
			
 		output=FunctionAdd.addAllField(value,ElementSampleCategory.menu(), ElementSampleCategory.element(),ElementSampleCategory.list());
	
		return output;
	
	}

	public static void sampleCategoryEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementSampleCategory.element(), ElementSampleCategory.list());
	}
	
	
	public static void sampleCategoryAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionAdd.addMandatoryField(value, ElementSampleCategory.element());
	}
	
	public static void sampleCategoryEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionEdit.editName(value, ElementSampleCategory.element(), ElementSampleCategory.list());
	
		
		
	}
	
	 
	
	public static void sampleCategoryEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementSampleCategory.element(), ElementSampleCategory.list());
	}
	
	public static void sampleCategoryEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementSampleCategory.element(), ElementSampleCategory.list());
	}
	
	
	
	public static void sampleCategoryDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionDelete.delete(value, ElementSampleCategory.element(), ElementSampleCategory.list());		
	}
	
	public static void sampleCategoryDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionDelete.deleteAll(value, ElementSampleCategory.element(), ElementSampleCategory.list());		
	}
	
	public static void sampleCategoryDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSampleCategory.class);
		
		FunctionDelete.deleteMandatory(value, ElementSampleCategory.element(), ElementSampleCategory.list());		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
