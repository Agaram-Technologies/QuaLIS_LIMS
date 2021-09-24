package MaterialManagement;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;


import org.openqa.selenium.support.PageFactory;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import CheckList.ElementQBCategory;
import Flow.TestDataHylands;
import TestMethod.TestCoverageTwoFieldScreen; 
import Utility.BrowserOperation;

public class TestCoverageMaterialGrade extends BrowserOperation 
{
	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageMaterialGrade.materialGradeAddAllField(TestDataHylands.materialGrade());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageMaterialGrade.materialGradeDeleteAllField(TestDataHylands.materialGrade());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageMaterialGrade.materialGradeAddMandatoryField(TestDataHylands.materialGrade());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageMaterialGrade.materialGradeDeleteMandatoryField(TestDataHylands.materialGrade());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageMaterialGrade.materialGradeAddAllField(TestDataHylands.materialGrade());
			
			TestCoverageMaterialGrade.materialGradeEditName(TestDataHylands.materialGrade());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageMaterialGrade.materialGradeEditDescriptionValueToValue(TestDataHylands.materialGrade());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageMaterialGrade.materialGradeEditDescriptionValueToNull(TestDataHylands.materialGrade());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageMaterialGrade.materialGradeEditDescriptionNullToValue(TestDataHylands.materialGrade());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> materialGradeAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementMaterialGrade.class);
			
 		output=FunctionAdd.addAllField(value,ElementMaterialGrade.menu(), ElementMaterialGrade.element(),ElementMaterialGrade.list());
	
		return output;
	
	}
	
	public static void materialGradeAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMaterialGrade.class);
		
		FunctionAdd.addMandatoryField(value, ElementMaterialGrade.element());
	}
	
	public static void materialGradeEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMaterialGrade.class);
		
		FunctionEdit.editName(value, ElementMaterialGrade.element(), ElementMaterialGrade.list());
	
		
		
	}
	 
	
	public static void materialGradeEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMaterialGrade.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementMaterialGrade.element(), ElementMaterialGrade.list());
	}
	
	public static void materialGradeEditDescriptionValueToNull(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementMaterialGrade.class);

		FunctionEdit.editDescriptionValueToNull(value, ElementMaterialGrade.element(), ElementMaterialGrade.list());
	}

	public static void materialGradeEditDescriptionNullToValue(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementMaterialGrade.class);

		FunctionEdit.editDescriptionNullToValue(value, ElementMaterialGrade.element(), ElementMaterialGrade.list());
	}

	public static void materialGradeDeleteAllField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementMaterialGrade.class);

		FunctionDelete.delete(value, ElementMaterialGrade.element(), ElementMaterialGrade.list());
	}

	public static void materialGradeDeleteAll(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementMaterialGrade.class);

		FunctionDelete.deleteAll(value, ElementMaterialGrade.element(), ElementMaterialGrade.list());
	}

	public static void materialGradeDeleteMandatoryField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementMaterialGrade.class);

		FunctionDelete.deleteMandatory(value, ElementMaterialGrade.element(), ElementMaterialGrade.list());
	}


}
