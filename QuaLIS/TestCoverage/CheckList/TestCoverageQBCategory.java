package CheckList;

import java.util.HashMap;


import org.openqa.selenium.support.PageFactory;

import BaseMaster.ElementContainerType;
import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;

import Utility.BrowserOperation;
import Utility.Functional;


public class TestCoverageQBCategory extends BrowserOperation {
	
	public static void twoFieldTestCase() throws InterruptedException
	{
		
		TestCoverageQBCategory.QBCategoryAddAllField(TestDataHylands.QBCategory());
		
		TestCoverageQBCategory.QBCategoryDeleteAllField(TestDataHylands.QBCategory());		
		
		TestCoverageQBCategory.QBCategoryAddMandatoryField(TestDataHylands.QBCategory());
		
		TestCoverageQBCategory.QBCategoryDeleteMandatoryField(TestDataHylands.QBCategory());
		
		TestCoverageQBCategory.QBCategoryAddAllField(TestDataHylands.QBCategory());
		
		TestCoverageQBCategory.QBCategoryEditName(TestDataHylands.QBCategory());
		
		// Description value to value
		TestCoverageQBCategory.QBCategoryEditDescription(TestDataHylands.QBCategory());
		
		// Description value to null
		TestCoverageQBCategory.QBCategoryEditDescriptionValueToNull(TestDataHylands.QBCategory());
				
		// Description null to value
		TestCoverageQBCategory.QBCategoryEditDescriptionNullToValue(TestDataHylands.QBCategory());
			
		
	//	TestCoverageQBCategory.QBCategoryDeleteAll(TestDataHylands.QBCategory());	
	}
	
	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementQBCategory.class);
		
		 boolean screen=Function.preCondition( ElementQBCategory.element());
		
		return screen;
	}

	public static void QBCategoryAddAllField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementQBCategory.class);

		FunctionAdd.addAllField(value, ElementQBCategory.element());
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

		FunctionEdit.editDescription(value, ElementQBCategory.element(), ElementQBCategory.list());
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
