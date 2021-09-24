package TestManagement;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Attribute.AttributeTestMaster;
import Flow.PreDefinedParameterActualResult;
import Settings.ParameterType;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageTestParameter  extends BrowserOperation
{
	public static HashMap<String,String> numeric(HashMap<String,String> value)
	{
		
		HashMap<String,String> output=new HashMap<String,String> ();
		
		PageFactory.initElements(driver, ElementTestMaster.class);
		
		ElementTestMaster.testParameter.clear();

		ElementTestMaster.testParameter.sendKeys(value.get(AttributeTestMaster.parameterName));

		ElementTestMaster.testParameterAbbreviation.clear();

		ElementTestMaster.testParameterAbbreviation.sendKeys(value.get(AttributeTestMaster.parameterAbbreviation));
		
		BasicOperation.selectByVisibleText(ElementTestMaster.testParameterType, ParameterType.numeric);

		ElementTestMaster.testRoundingDigits.sendKeys(value.get(AttributeTestMaster.parameterRoundingDigit));
	
		BasicOperation.selectByVisibleText(ElementTestMaster.testUnit,value.get(AttributeTestMaster.parameterUnit));
		
		return output;
		
	}
	
	public static HashMap<String,String> attachment(HashMap<String,String> value)
	{
		
		HashMap<String,String> output=new HashMap<String,String> ();
		
		PageFactory.initElements(driver, ElementTestMaster.class);
		
		ElementTestMaster.testParameter.clear();

		ElementTestMaster.testParameter.sendKeys(value.get(AttributeTestMaster.parameterName));

		ElementTestMaster.testParameterAbbreviation.clear();

		ElementTestMaster.testParameterAbbreviation.sendKeys(value.get(AttributeTestMaster.parameterAbbreviation));
		
		BasicOperation.selectByVisibleText(ElementTestMaster.testParameterType, ParameterType.attachment);

		return output;
		
	}
	
	public static HashMap<String,String> character(HashMap<String,String> value)
	{
		
		HashMap<String,String> output=new HashMap<String,String> ();
		
		PageFactory.initElements(driver, ElementTestMaster.class);
		
		ElementTestMaster.testParameter.clear();

		ElementTestMaster.testParameter.sendKeys(value.get(AttributeTestMaster.parameterName));

		ElementTestMaster.testParameterAbbreviation.clear();

		ElementTestMaster.testParameterAbbreviation.sendKeys(value.get(AttributeTestMaster.parameterAbbreviation));
		
		BasicOperation.selectByVisibleText(ElementTestMaster.testParameterType, ParameterType.character);
	
		return output;
		
	}
	
	public static HashMap<String,String> preDefined(HashMap<String,String> value)
	{
		
		HashMap<String,String> output=new HashMap<String,String> ();
		
		PageFactory.initElements(driver, ElementTestMaster.class);
		
		ElementTestMaster.testParameter.clear();

		ElementTestMaster.testParameter.sendKeys(value.get(AttributeTestMaster.parameterName));

		ElementTestMaster.testParameterAbbreviation.clear();

		ElementTestMaster.testParameterAbbreviation.sendKeys(value.get(AttributeTestMaster.parameterAbbreviation));
		
		BasicOperation.selectByVisibleText(ElementTestMaster.testParameterType, ParameterType.preDefined);
		
		ElementTestMaster.testParameterCodedResult.sendKeys(value.get(AttributeTestMaster.parameterCodedResult));
			
		BasicOperation.selectByVisibleText(ElementTestMaster.testParameterActualResult,PreDefinedParameterActualResult.BDL);
		
		return output;
		
	}
}
