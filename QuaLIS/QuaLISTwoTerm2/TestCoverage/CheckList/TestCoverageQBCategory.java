package CheckList;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;


import org.openqa.selenium.support.PageFactory;


import BaseMaster.ElementContainerType;
import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation;
import Utility.Functional;


public class TestCoverageQBCategory extends BrowserOperation {
	

	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageQBCategory.QBCategoryAddAllField(TestDataHylands.QBCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageQBCategory.QBCategoryDeleteAllField(TestDataHylands.QBCategory());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageQBCategory.QBCategoryAddMandatoryField(TestDataHylands.QBCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageQBCategory.QBCategoryDeleteMandatoryField(TestDataHylands.QBCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageQBCategory.QBCategoryAddAllField(TestDataHylands.QBCategory());
			
			TestCoverageQBCategory.QBCategoryEditName(TestDataHylands.QBCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageQBCategory.QBCategoryEditDescriptionValueToValue(TestDataHylands.QBCategory());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageQBCategory.QBCategoryEditDescriptionValueToNull(TestDataHylands.QBCategory());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageQBCategory.QBCategoryEditDescriptionNullToValue(TestDataHylands.QBCategory());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> QBCategoryAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementQBCategory.class);
			
 		output=FunctionAdd.addAllField(value,ElementQBCategory.menu(), ElementQBCategory.element(),ElementQBCategory.list());
	
		return output;
	
	}
	
	public static void  QBCategoryEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementQBCategory.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementQBCategory.element(), ElementQBCategory.list());
	}

	public static void QBCategoryAddMandatoryField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionAdd.addMandatoryField(value, ElementQBCategory.element());
	}

	public static void QBCategoryEditName(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionEdit.editName(value, ElementQBCategory.element(), ElementQBCategory.list());

	}

	public static void QBCategoryEditDescription(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionEdit.editDescriptionValueToValue(value, ElementQBCategory.element(), ElementQBCategory.list());
	}

	public static void QBCategoryEditDescriptionValueToNull(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionEdit.editDescriptionValueToNull(value, ElementQBCategory.element(), ElementQBCategory.list());
	}

	public static void QBCategoryEditDescriptionNullToValue(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionEdit.editDescriptionNullToValue(value, ElementQBCategory.element(), ElementQBCategory.list());
	}

	public static void QBCategoryDeleteAllField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionDelete.delete(value, ElementQBCategory.element(), ElementQBCategory.list());
	}

	public static void QBCategoryDeleteAll(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionDelete.deleteAll(value, ElementQBCategory.element(), ElementQBCategory.list());
	}

	public static void QBCategoryDeleteMandatoryField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionDelete.deleteMandatory(value, ElementQBCategory.element(), ElementQBCategory.list());
	}

}
