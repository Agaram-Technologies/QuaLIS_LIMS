package TestManagement;

import java.io.IOException;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Attribute.AttributeTestMaster;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configuration.TestCoverageApprovalConfiguration;
import Esign.ElementEsign;
import GenericRegistration.ElementGenericRegistration;
import GenericRegistration.ElementJPDCRequestTest;
import Organisation.ElementOrganisation;
import Settings.ParameterType;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageTest extends BrowserOperation 
{
	public static void testAdd(String testCategory, String test, String method, String section, String instrumentCategory,
			String checkList,HashMap<String,String>parameterDetail,boolean accredited,boolean active) throws InterruptedException, IOException, AWTException {
				
		PageFactory.initElements(driver, ElementTestMaster.class);

		ElementTestMaster.masterIcon.click();

		ElementTestMaster.testManagementIcon.click();

		ElementTestMaster.testIcon.click();
			
			
		BasicOperation.selectByVisibleText(ElementTestMaster.testFilterTestCategory, testCategory);
		
		BasicOperation.click(ElementTestMaster.testFilterFindTest);

		
		BasicOperation.wait(ElementTestMaster.testTestIcon);
			
		BasicOperation.exception(ElementTestMaster.testTestIcon);
			
		BasicOperation.exception(ElementTestMaster.testTestAction);

		ElementTestMaster.testAdd.click();
		
		BasicOperation.exception(ElementTestMaster.test);

		BasicOperation.selectByVisibleText(ElementTestMaster.testCategory, testCategory);
		
		ElementTestMaster.test.sendKeys(test);

		ElementTestMaster.testAbbreviation.clear();

		ElementTestMaster.testAbbreviation.sendKeys(test+" abb");

		ElementTestMaster.testProcedure.sendKeys(test+" proc");

		ElementTestMaster.testPrice.sendKeys("100");
		
		BasicOperation.selectByVisibleText(ElementTestMaster.testSection, section);
		
		BasicOperation.selectByVisibleText(ElementTestMaster.testMethod, method);
		
		BasicOperation.selectByVisibleText(ElementTestMaster.testAdditionalInfo, checkList);
	
		BasicOperation.selectByVisibleText(ElementTestMaster.testInstrument, instrumentCategory);

		String parameterType=parameterDetail.get(AttributeTestMaster.parameterType);
		
		if(parameterType.equals(ParameterType.numeric))
		{
			TestCoverageTestParameter.numeric(parameterDetail);
		}
		
		else if(parameterType.equals(ParameterType.attachment))
		{
			TestCoverageTestParameter.attachment(parameterDetail);
		}
		else if(parameterType.equals(ParameterType.character))
		{
			TestCoverageTestParameter.character(parameterDetail);
		
		}
		else if(parameterType.equals(ParameterType.preDefined))
		{
			TestCoverageTestParameter.preDefined(parameterDetail);
		}


		
		
		if(accredited==true)
		{
			if (ElementTestMaster.testAccredited.isSelected() == false)
			{
				ElementTestMaster.testAccredited.click();
			}
		}
		else if(accredited==false)
		{
			if (ElementTestMaster.testAccredited.isSelected())
			{
				ElementTestMaster.testAccredited.click();
			}
		}

		 
		
		if(accredited==true)
		{
			if (ElementTestMaster.testActive.isSelected() == false)
			{
				ElementTestMaster.testActive.click();
			}
		}
		else if(accredited==false)
		{
			if (ElementTestMaster.testActive.isSelected())
			{
				ElementTestMaster.testActive.click();
			}
		}
		
	 

		ElementTestMaster.testAddSubmit.click();

		BasicOperation.wait(ElementTestMaster.testTestAction);

		ElementTestMaster.testManagementIcon.click();
		
		ElementTestMaster.masterIcon.click();
		
		ElementTestMaster.homeIcon.click();

	}
	
}
