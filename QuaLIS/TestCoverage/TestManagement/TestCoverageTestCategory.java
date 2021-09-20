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
import UserManagement.ElementDesignation;
import Utility.BrowserOperation;

public class TestCoverageTestCategory extends BrowserOperation
{
	
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		
		
		BrowserOperation.launchLIMS();
		
		testCategoryAddAllField(TestDataHylands.testCategory());
		
		
		
	}

	public static void testCategoryAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
			
		FunctionAdd.addAllField(value, ElementTestCategory.element());
	}
	
	public static void testCategoryAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionAdd.addMandatoryField(value, ElementTestCategory.element());
	}
	
/*	public static void testCategoryEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionEdit.editName(value, ElementTestCategory.element(), ElementTestCategory.list());
		
	}
	
	public static void testCategoryEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementTestCategory.class);
		
		FunctionEdit.editDescription(value, ElementTestCategory.element(), ElementTestCategory.list());
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
	}*/
	
}
