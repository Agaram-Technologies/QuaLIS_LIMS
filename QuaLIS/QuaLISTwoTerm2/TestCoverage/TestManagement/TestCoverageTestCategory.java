package TestManagement;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;
import TestMethod.TestCoverageTwoFieldScreen;
import UserManagement.ElementDesignation;
import Utility.BrowserOperation;

public class TestCoverageTestCategory extends BrowserOperation
{public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
{
	HashMap<String, String> output=null;
	
	if(TestCoverageTwoFieldScreen.addAllField)
	{
		output=TestCoverageTestCategory.testCategoryAddAllField(TestDataHylands.testCategory());
	}
	
	if(TestCoverageTwoFieldScreen.deleteAllField)
	{
		TestCoverageTestCategory.testCategoryDeleteAllField(TestDataHylands.testCategory());	
	}
	
	if(TestCoverageTwoFieldScreen.addMandatoryField)
	{
		TestCoverageTestCategory.testCategoryAddMandatoryField(TestDataHylands.testCategory());
	}
	
	if(TestCoverageTwoFieldScreen.deleteMandatoryField)
	{
		TestCoverageTestCategory.testCategoryDeleteMandatoryField(TestDataHylands.testCategory());
	}
	
	if(TestCoverageTwoFieldScreen.editName)
	{
		TestCoverageTestCategory.testCategoryAddAllField(TestDataHylands.testCategory());
		
		TestCoverageTestCategory.testCategoryEditName(TestDataHylands.testCategory());
	}
	
	if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
	{
		// Description value to value
		TestCoverageTestCategory.testCategoryEditDescriptionValueToValue(TestDataHylands.testCategory());
		
	}
	
	if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
	{
		
		// Description value to null
		TestCoverageTestCategory.testCategoryEditDescriptionValueToNull(TestDataHylands.testCategory());

	}

	if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
	{
		// Description null to value
		TestCoverageTestCategory.testCategoryEditDescriptionNullToValue(TestDataHylands.testCategory());		
	
	}
	
	return output;


}

public static HashMap<String, String> testCategoryAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
{
	HashMap<String, String> output;
	
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		output=FunctionAdd.addAllField(value,ElementTestCategory.menu(), ElementTestCategory.element(),ElementTestCategory.list());

	return output;

}
 
public static void testCategoryAddMandatoryField(HashMap <String, String> value) throws InterruptedException
{
	PageFactory.initElements(driver, ElementTestCategory.class);
	
	FunctionAdd.addMandatoryField(value, ElementTestCategory.element());
}

public static void testCategoryEditName(HashMap <String, String> value) throws InterruptedException
{
	PageFactory.initElements(driver, ElementTestCategory.class);
	
	FunctionEdit.editName(value, ElementTestCategory.element(), ElementTestCategory.list());
	
	
}

public static void testCategoryEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
{
	PageFactory.initElements(driver, ElementTestCategory.class);
	
	FunctionEdit.editDescriptionValueToValue(value, ElementTestCategory.element(), ElementTestCategory.list());
}
 
	
	public static void testCategoryEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementTestCategory.element(), ElementTestCategory.list());
	}
	
	public static void testCategoryEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementTestCategory.element(), ElementTestCategory.list());
	}
	
	
	
	public static void testCategoryDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionDelete.delete(value, ElementTestCategory.element(), ElementTestCategory.list());		
	}
	
	public static void testCategoryDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionDelete.deleteAll(value, ElementTestCategory.element(), ElementTestCategory.list());		
	}
	
	public static void testCategoryDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionDelete.deleteMandatory(value, ElementTestCategory.element(), ElementTestCategory.list());		
	}  }
