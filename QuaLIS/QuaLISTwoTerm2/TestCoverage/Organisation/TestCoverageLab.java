package Organisation;

import java.awt.AWTException;


import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import BaseMaster.ElementUnit;
import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataHylands;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BasicOperation;
import Utility.BrowserOperation;
import Utility.Functional;

import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageLab extends BrowserOperation// extends TestDataTestCoverageOrganisation

{ 
	

	public static HashMap<String, String> twoFieldTestCase() throws InterruptedException,  IOException, URISyntaxException
	{
		HashMap<String, String> output=null;
		
		if(TestCoverageTwoFieldScreen.addAllField)
		{
			output=TestCoverageLab.labAddAllField(TestDataHylands.lab());
		}
		
		if(TestCoverageTwoFieldScreen.deleteAllField)
		{
			TestCoverageLab.labDeleteAllField(TestDataHylands.lab());	
		}
		
		if(TestCoverageTwoFieldScreen.addMandatoryField)
		{
			TestCoverageLab.labAddMandatoryField(TestDataHylands.lab());
		}
		
		if(TestCoverageTwoFieldScreen.deleteMandatoryField)
		{
			TestCoverageLab.labDeleteMandatoryField(TestDataHylands.lab());
		}
		
		if(TestCoverageTwoFieldScreen.editName)
		{
			TestCoverageLab.labAddAllField(TestDataHylands.lab());
			
			TestCoverageLab.labEditName(TestDataHylands.lab());
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			// Description value to value
			TestCoverageLab.labEditDescriptionValueToValue(TestDataHylands.lab());
			
		}
		
		if(TestCoverageTwoFieldScreen.editDescriptionValueToValue)
		{
			
			// Description value to null
			TestCoverageLab.labEditDescriptionValueToNull(TestDataHylands.lab());

		}
	
		if(TestCoverageTwoFieldScreen.editDescriptionNullToValue)
		{
			// Description null to value
			TestCoverageLab.labEditDescriptionNullToValue(TestDataHylands.lab());		
		
		}
		
		return output;
	

	}
 
	public static HashMap<String, String> labAddAllField(HashMap <String, String> value) throws InterruptedException, URISyntaxException, IOException
	{
		HashMap<String, String> output;
		
 		PageFactory.initElements(driver, ElementLab.class);
			
 		output=FunctionAdd.addAllField(value,ElementLab.menu(), ElementLab.element(),ElementLab.list());
	
		return output;
	
	}

	public static void labEditDescriptionValueToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementLab.class);
		
		FunctionEdit.editDescriptionValueToValue(value, ElementLab.element(), ElementLab.list());
	}
	

	public static void labAddMandatoryField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionAdd.addMandatoryField(value, ElementLab.element());
	}

	public static void labEditName(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionEdit.editName(value, ElementLab.element(), ElementLab.list());

	}

	 

	public static void labEditDescriptionValueToNull(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionEdit.editDescriptionValueToNull(value, ElementLab.element(), ElementLab.list());
	}

	public static void labEditDescriptionNullToValue(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionEdit.editDescriptionNullToValue(value, ElementLab.element(), ElementLab.list());
	}

	public static void labDeleteAllField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionDelete.delete(value, ElementLab.element(), ElementLab.list());
	}

	public static void labDeleteAll(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionDelete.deleteAll(value, ElementLab.element(), ElementLab.list());
	}

	public static void labDeleteMandatoryField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionDelete.deleteMandatory(value, ElementLab.element(), ElementLab.list());
	}

	}
