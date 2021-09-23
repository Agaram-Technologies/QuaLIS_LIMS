package CompetenceManagement;

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

public class TestCoverageTrainingCategory extends BrowserOperation{


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageTrainingCategory.trainingCategoryAddAllField(TestDataHylands.trainingCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageTrainingCategory.trainingCategoryDeleteAllField(TestDataHylands.trainingCategory());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageTrainingCategory.trainingCategoryAddMandatoryField(TestDataHylands.trainingCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageTrainingCategory.trainingCategoryDeleteMandatoryField(TestDataHylands.trainingCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageTrainingCategory.trainingCategoryAddAllField(TestDataHylands.trainingCategory());
			
			TestCoverageTrainingCategory.trainingCategoryEditName(TestDataHylands.trainingCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageTrainingCategory.trainingCategoryEditDescriptionValueToValue(TestDataHylands.trainingCategory());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageTrainingCategory.trainingCategoryEditDescriptionValueToNull(TestDataHylands.trainingCategory());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageTrainingCategory.trainingCategoryEditDescriptionNullToValue(TestDataHylands.trainingCategory());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> trainingCategoryAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementTrainingCategory.class);
			
 		output=FunctionAdd.addAllField(value,ElementTrainingCategory.menu(), ElementTrainingCategory.element(),ElementTrainingCategory.list());
	
		return output;
	
	}

	public static void trainingCategoryEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementTrainingCategory.element(), ElementTrainingCategory.list());
	}
	
	
	public static void trainingCategoryAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionAdd.addMandatoryField(value, ElementTrainingCategory.element());
	}
	
	public static void trainingCategoryEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionEdit.editName(value, ElementTrainingCategory.element(), ElementTrainingCategory.list());
	
		
		
	}
 
	
	public static void trainingCategoryEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementTrainingCategory.element(), ElementTrainingCategory.list());
	}
	
	public static void trainingCategoryEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementTrainingCategory.element(), ElementTrainingCategory.list());
	}
	
	
	
	public static void trainingCategoryDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionDelete.delete(value, ElementTrainingCategory.element(), ElementTrainingCategory.list());		
	}
	
	public static void trainingCategoryDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionDelete.deleteAll(value, ElementTrainingCategory.element(), ElementTrainingCategory.list());		
	}
	
	public static void trainingCategoryDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTrainingCategory.class);
		
		FunctionDelete.deleteMandatory(value, ElementTrainingCategory.element(), ElementTrainingCategory.list());		
	}
	

	
	
	

}
