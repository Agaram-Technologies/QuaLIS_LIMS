package UserManagement;

import java.io.FileInputStream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseMaster.ElementUnit;
import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation;


public class TestCoverageUserRole extends BrowserOperation{
	
	
	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageUserRole.userRoleAddAllField(TestDataHylands.userRole());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageUserRole.userRoleDeleteAllField(TestDataHylands.userRole());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageUserRole.userRoleAddMandatoryField(TestDataHylands.userRole());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageUserRole.userRoleDeleteMandatoryField(TestDataHylands.userRole());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageUserRole.userRoleAddAllField(TestDataHylands.userRole());
			
			TestCoverageUserRole.userRoleEditName(TestDataHylands.userRole());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageUserRole.userRoleEditDescriptionValueToValue(TestDataHylands.userRole());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageUserRole.userRoleEditDescriptionValueToNull(TestDataHylands.userRole());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageUserRole.userRoleEditDescriptionNullToValue(TestDataHylands.userRole());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> userRoleAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementUserRole.class);
			
 		output=FunctionAdd.addAllField(value,ElementUserRole.menu(), ElementUserRole.element(),ElementUserRole.list());
	
		return output;
	
	}
	
	public static void userRoleAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionAdd.addMandatoryField(value, ElementUserRole.element());
	}
	
	public static void userRoleEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editName(value, ElementUserRole.element(), ElementUserRole.list());
	
		
		
	}
	 
	
	public static void userRoleEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementUserRole.element(), ElementUserRole.list());
	}
	
	public static void userRoleEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementUserRole.element(), ElementUserRole.list());
	}
	
	public static void userRoleEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementUserRole.element(), ElementUserRole.list());
	}
	
	
	
	public static void userRoleDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionDelete.delete(value, ElementUserRole.element(), ElementUserRole.list());		
	}
	
	public static void userRoleDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionDelete.deleteAll(value, ElementUserRole.element(), ElementUserRole.list());		
	}
	
	public static void userRoleDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRole.class);
		
		FunctionDelete.deleteMandatory(value, ElementUserRole.element(), ElementUserRole.list());		
	}
}
