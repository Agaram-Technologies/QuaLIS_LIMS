package Contacts;

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
import Utility.BrowserOperation;

public class TestCoverageSupplierCategory extends BrowserOperation{


	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageSupplierCategory.supplierCategoryAddAllField(TestDataHylands.supplierCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageSupplierCategory.supplierCategoryDeleteAllField(TestDataHylands.supplierCategory());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageSupplierCategory.supplierCategoryAddMandatoryField(TestDataHylands.supplierCategory());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageSupplierCategory.supplierCategoryDeleteMandatoryField(TestDataHylands.supplierCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageSupplierCategory.supplierCategoryAddAllField(TestDataHylands.supplierCategory());
			
			TestCoverageSupplierCategory.supplierCategoryEditName(TestDataHylands.supplierCategory());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageSupplierCategory.supplierCategoryEditDescriptionValueToValue(TestDataHylands.supplierCategory());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageSupplierCategory.supplierCategoryEditDescriptionValueToNull(TestDataHylands.supplierCategory());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageSupplierCategory.supplierCategoryEditDescriptionNullToValue(TestDataHylands.supplierCategory());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> supplierCategoryAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementSupplierCategory.class);
			
 		output=FunctionAdd.addAllField(value,ElementSupplierCategory.menu(), ElementSupplierCategory.element(),ElementSupplierCategory.list());
	
		return output;
	
	}

	public static void supplierCategoryEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementSupplierCategory.element(), ElementSupplierCategory.list());
	}
	
	
	public static void supplierCategoryAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionAdd.addMandatoryField(value, ElementSupplierCategory.element());
	}
	
	public static void supplierCategoryEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionEdit.editName(value, ElementSupplierCategory.element(), ElementSupplierCategory.list());
	
		
		
	}
	
	 
	
	public static void supplierCategoryEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementSupplierCategory.element(), ElementSupplierCategory.list());
	}
	
	public static void supplierCategoryEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementSupplierCategory.element(), ElementSupplierCategory.list());
	}
	
	
	
	public static void supplierCategoryDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionDelete.delete(value, ElementSupplierCategory.element(), ElementSupplierCategory.list());		
	}
	
	public static void supplierCategoryDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionDelete.deleteAll(value, ElementSupplierCategory.element(), ElementSupplierCategory.list());		
	}
	
	public static void supplierCategoryDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementSupplierCategory.class);
		
		FunctionDelete.deleteMandatory(value, ElementSupplierCategory.element(), ElementSupplierCategory.list());		
	}
	

	
	

}
