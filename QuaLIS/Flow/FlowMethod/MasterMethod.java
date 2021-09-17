package FlowMethod;


import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseMaster.ElementBarCode;
import BaseMaster.ElementComponent;
import BaseMaster.ElementSampleTestComments;
import BaseMaster.ElementSamplingPointCategory;
import BaseMaster.ElementStorageCondition;
import BaseMaster.ElementStorageLocation;
import BaseMaster.ElementUnit;
import CheckList.ElementCheckList;
import CheckList.ElementQB;
import CheckList.ElementQBCategory;
import CompetenceManagement.ElementTechnique;
import CompetenceManagement.ElementTrainingAndCertification;
import CompetenceManagement.ElementTrainingCategory;
import CompetenceManagement.ElementTrainingUpdate;
import Configuration.ElementApprovalConfiguration;
import Configuration.ElementFTPConfiguration;
import Configuration.ElementPasswordPolicy;
import Configuration.ElementTemplateMaster;
import Configuration.ElementUserRoleTemplate;
import Contacts.ElementClient;
import Contacts.ElementClientGroup;
import Contacts.ElementCountry;
import Contacts.ElementCourier;
import Contacts.ElementManufacture;
import Contacts.ElementSupplier;
import Contacts.*;
import Esign.ElementEsign;
import Flow.TestDataFlow;
import InstrumentManagement.ElementInstrument;
import InstrumentManagement.ElementInstrumentCategory;
import MaterialManagement.ElementMaterial;
import MaterialManagement.ElementMaterialCategory;
import MaterialManagement.ElementMaterialGrade;
import Organisation.*;
import Organisation.ElementLab;
import Organisation.ElementOrganisation;
import Organisation.ElementSection;
import SampleManagement.ElementSampleCategory;
import SampleManagement.ElementSampleType;
import SampleManagement.ElementSamplingPoint;
import TestGroup.ElementTestGroup;
import TestManagement.ElementMethod;
import TestManagement.ElementMethodCategory;
import TestManagement.ElementTestCategory;
import TestManagement.ElementTestMaster;
import UserManagement.*;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class MasterMethod extends BrowserOperation {
	
	
	
	public static void barCode(String barCode) throws InterruptedException, AWTException
	{
		PageFactory.initElements(driver, ElementBarCode.class);
		
		ElementBarCode.masterIcon.click();
		
		ElementBarCode.baseMasterIcon.click();
		
		ElementBarCode.barCodeIcon.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementBarCode.barCodeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementBarCode.barCodeAction));

		try {
			ElementBarCode.barCodeAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementBarCode.barCodeAction.click();
		}
		
		ElementBarCode.barCodeAdd.click();
		
		
		ElementBarCode.barCode.sendKeys(barCode);
		
		
		ElementBarCode.barCodeFileIcon.click();
		
		//String fileLocation=File.barCode;
		
		//BasicOperation.uploadFile(fileLocation);
		
		ElementBarCode.barCodeDescription.click();
		
		ElementBarCode.barCodeAddSubmit.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementBarCode.barCodeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementBarCode.barCodeAction));

		ElementBarCode.baseMasterIcon.click();
		
		ElementBarCode.masterIcon.click();
		

	}
	
	
	public static void screenRights(String userRole) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementScreenRights.class);
		
		ElementScreenRights.masterIcon.click();
		
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.screenRightsIcon.click();
		
		WebElement screenRightsFilterUserRole=ElementScreenRights.screenRightsFilterUserRole;

		Select screenRightsFilterUserRoleSelect=new Select(screenRightsFilterUserRole);
		
		screenRightsFilterUserRoleSelect.selectByVisibleText(userRole);
		
		ElementScreenRights.screenRightsFilterFind.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementScreenRights.screenRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.screenRightsAction));

		try {
			ElementScreenRights.screenRightsAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementScreenRights.screenRightsAction.click();
		}
		ElementScreenRights.screenRightsAddRights.click();
		

		try {
			ElementScreenRights.screenRightsSearchScreen.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementScreenRights.screenRightsSearchScreen.click();
		}
		if(ElementScreenRights.screenRightsSelectAll.isDisplayed())
		{
		ElementScreenRights.screenRightsSelectAll.click();
		
		ElementScreenRights.screenRightsAddSubmit.click();

		}
		else
		{
			ElementScreenRights.screenRightsAddCancel.click();
		}
		
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementScreenRights.screenRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.screenRightsAction));
		
		ElementScreenRights.userManagementIcon.click();
		
		ElementScreenRights.masterIcon.click();

	}
	
	
	public static void controlRights(String userRole, String screen) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementControlRights.class);
		
		ElementControlRights.masterIcon.click();
		
		ElementControlRights.userManagementIcon.click();
		
		ElementControlRights.controlRightsIcon.click();
		
		

		WebElement userRoleFilter = ElementControlRights.controlRightsFilterUserRole;

		Select userRoleSelect = new Select(userRoleFilter);
		
		userRoleSelect.selectByVisibleText(userRole);

		ElementControlRights.controlRightsFilterFind.click();

		

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsAction));

		List<WebElement> screenList=ElementControlRights.controlRightsScreenList;
		
		List<WebElement> screenCheckboxList=ElementControlRights.controlRightsScreenCheckboxList;
		
		
		
		for (WebElement labE : screenList) {
			if (labE.getText().equals(screen)) {
				
				
				labE.click();
				/*int index = screenList.indexOf(labE);

				String checkBoxStatus = screenCheckboxList.get(index).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					labE.click();
				}*/

			}
		}
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsAction));
		

		try {
			ElementControlRights.controlRightsAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementControlRights.controlRightsAction.click();
		}

		ElementControlRights.controlRightsAddRights.click();
		
		
		try {
			
			if(ElementControlRights.controlRightsSearchControl.isEnabled()||ElementControlRights.controlRightsSearchControl.isDisplayed())
			{
				wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsSearchControl));
				
				wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsSearchControl));
				
				ElementControlRights.controlRightsSearchControl.click();
				
			}
			
			
		}
		catch(Exception e)
		{
			Thread.sleep(2000);
			ElementControlRights.controlRightsSearchControl.click();
		}
		
		
		if(ElementControlRights.controlRightsSelectAll.isDisplayed())
		{
			
			
			ElementControlRights.controlRightsSelectAll.click();
			
			ElementControlRights.controlRightsAddSubmit.click();
		}
		else
		{
			ElementControlRights.controlRightsAddCancel.click();
		}
		
		
		
		
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsAction));
		

		ElementControlRights.userManagementIcon.click();
		
		ElementControlRights.masterIcon.click();
		
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	

	public static void department(String department, String description) throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementDepartment.class);

		ElementDepartment.masterIcon.click();

		ElementDepartment.organisationManagementIcon.click();

		ElementDepartment.departmentIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));

		try {
			ElementDepartment.departmentAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementDepartment.departmentAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAdd));

		ElementDepartment.departmentAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementDepartment.departmentAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementDepartment.class);

				ElementDepartment.masterIcon.click();

				ElementDepartment.organisationManagementIcon.click();

				ElementDepartment.departmentIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));

				try {
					ElementDepartment.departmentAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementDepartment.departmentAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAdd));

				ElementDepartment.departmentAdd.click();

			}
		}

		ElementDepartment.department.sendKeys(department);

		ElementDepartment.departmentDescription.sendKeys(description);

		ElementDepartment.departmentAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));
/*
		FileInputStream s = new FileInputStream("flow.properties");

		Properties properties = new Properties();

		properties.load(s);

		String departmentScreenshot = properties.getProperty("designation");

	//	BasicOperation.screenshot(departmentScreenshot);
*/
		wait1.until(ExpectedConditions.visibilityOf(ElementDepartment.departmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDepartment.departmentAction));

		ElementDepartment.organisationManagementIcon.click();

		ElementDepartment.masterIcon.click();

	}

	public static void designation(String designation, String description) throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementDesignation.class);

		ElementDesignation.masterIcon.click();

		ElementDesignation.userManagementIcon.click();

		ElementDesignation.designationIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

		try {
			ElementDesignation.designationAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementDesignation.designationAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAdd));

		ElementDesignation.designationAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementDesignation.designationAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementDesignation.class);

				ElementDesignation.masterIcon.click();

				ElementDesignation.userManagementIcon.click();

				ElementDesignation.designationIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

				try {
					ElementDesignation.designationAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementDesignation.designationAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAdd));

				ElementDesignation.designationAdd.click();

			}
		}

		ElementDesignation.designation.sendKeys(designation);

		ElementDesignation.description.sendKeys(description);

		ElementDesignation.designationAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

	

		wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

		ElementDesignation.userManagementIcon.click();

		ElementDesignation.masterIcon.click();

	}

	public static void lab(String lab, String description) throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementLab.labAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAdd));

		ElementLab.labAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementLab.labAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementLab.class);

				ElementLab.masterIcon.click();

				ElementLab.organisationManagementIcon.click();

				ElementLab.labIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

				try {
					ElementLab.labAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementLab.labAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementLab.labAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementLab.labAdd));

				ElementLab.labAdd.click();

			}
		}

		ElementLab.lab.sendKeys(lab);

		ElementLab.labDescription.sendKeys(description);

		ElementLab.labAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		/*
		 * FileInputStream s = new FileInputStream("flow.properties");
		 * 
		 * Properties properties = new Properties();
		 * 
		 * properties.load(s);
		 * 
		 * String labScreenshot = properties.getProperty("lab");
		 * 
		 * BasicOperation.screenshot(labScreenshot);
		 * 
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));
		 */

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void section(String section, String description) throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementSection.class);

		ElementSection.masterIcon.click();

		ElementSection.organisationManagementIcon.click();

		ElementSection.sectionIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAction));

		try {
			ElementSection.sectionAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementSection.sectionAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAdd));

		ElementSection.sectionAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSection.sectionAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSection.class);

				ElementSection.masterIcon.click();

				ElementSection.organisationManagementIcon.click();

				ElementSection.sectionIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAction));

				try {
					ElementSection.sectionAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementSection.sectionAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSection.sectionAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAdd));

				ElementSection.sectionAdd.click();

			}
		}

		ElementSection.section.sendKeys(section);

		ElementSection.sectionDescription.sendKeys(description);

		ElementSection.sectionAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.sectionAction));

		/*
		 * FileInputStream s = new FileInputStream("flow.properties");
		 * 
		 * Properties properties = new Properties();
		 * 
		 * properties.load(s);
		 * 
		 * String sectionScreenshot = properties.getProperty("section");
		 * 
		 * BasicOperation.screenshot(sectionScreenshot);
		 * 
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementSection.sectionAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementSection.
		 * sectionAction));
		 */

		ElementSection.organisationManagementIcon.click();

		ElementSection.masterIcon.click();

	}

	public static void country(String country, String abbreviation, String twoChar, String threeChar)
			throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		
		/*List<WebElement> countryList=ElementCountry.countryList;
		
		String validation=country.toUpperCase();
		
		String validationGrid=null;
		
		int grid=0;
		
		System.out.println(validation);
		
		countryList.get(0).click();
		
		
		for(WebElement co:countryList)
		{
			String d=co.getText().toUpperCase();
			
			if(validation.equals(d))
			{
				validationGrid=d;
				
				grid=countryList.indexOf(co);
			}
		}
		
		
		if(validationGrid!=null)
		{
			countryList.get(grid).click();
			

			ElementCountry.countryAction.click();
			
			ElementCountry.countryEdit.click();
			
			BasicOperation.exceptionInputHandling(ElementCountry.country);
			
			ElementCountry.country.clear();
			
			ElementCountry.country.sendKeys(country);
			
			ElementCountry.countryEditSubmit.click();
			
			BasicOperation.esign("edited");
		
		}
		else
		{*/
			try 
			{
				ElementCountry.countryAction.click();
			}
			catch (Exception e)
			{
				Thread.sleep(3000);
				ElementCountry.countryAction.click();
			}
			
			

			wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAdd));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAdd));

			ElementCountry.countryAdd.click();

			for (int i = 0; i < 5; i++) {
				if (ElementCountry.countryAddSubmit.isDisplayed()) {
					break;
				} else {
					BrowserOperation.refreshLoginAdmin();

					PageFactory.initElements(driver, ElementCountry.class);

					ElementCountry.masterIcon.click();

					ElementCountry.contactsIcon.click();

					ElementCountry.countryIcon.click();

					WebDriverWait wait11 = new WebDriverWait(driver, 100);

					wait11.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

					wait11.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

					try {
						ElementCountry.countryAction.click();
					} catch (Exception e) {
						Thread.sleep(3000);
						ElementCountry.countryAction.click();
					}

					wait11.until(ExpectedConditions.visibilityOf(ElementCountry.countryAdd));

					wait11.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAdd));

					ElementCountry.countryAdd.click();

				}
			}

			ElementCountry.country.sendKeys(country);

			ElementCountry.countryAbbreviation.sendKeys(abbreviation);

			ElementCountry.countryTwoCharCode.sendKeys(twoChar);

			ElementCountry.countryThreeCharCode.sendKeys(threeChar);

			ElementCountry.countryAddSubmit.click();


		
		
		
			
				
			

		/*
		FileInputStream s = new FileInputStream("flow.properties");

		Properties properties = new Properties();

		properties.load(s);

		String countryScreenshot = properties.getProperty("country");
*/
		// BasicOperation.screenshot(countryScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();

	}

	public static void userRole(String userRole, String description) throws IOException, InterruptedException {
		PageFactory.initElements(driver, ElementUserRole.class);

		ElementUserRole.masterIcon.click();

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.userRoleIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		try {
			ElementUserRole.userRoleAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementUserRole.userRoleAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAdd));

		ElementUserRole.userRoleAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementUserRole.userRoleAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementUserRole.class);

				ElementUserRole.masterIcon.click();

				ElementUserRole.userManagementIcon.click();

				ElementUserRole.userRoleIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

				try {
					ElementUserRole.userRoleAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementUserRole.userRoleAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAdd));

				ElementUserRole.userRoleAdd.click();

			}
		}

		ElementUserRole.userRole.sendKeys(userRole);

		ElementUserRole.userRoleDescription.sendKeys(description);

		ElementUserRole.userRoleAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));
/*
		FileInputStream s = new FileInputStream("flow.properties");

		Properties properties = new Properties();

		properties.load(s);

		String userRoleScreenshot = properties.getProperty("userRole");
*/
		// BasicOperation.screenshot(userRoleScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.masterIcon.click();
	}

	public static void userRoleResultEntry(String userRole) throws InterruptedException {
		PageFactory.initElements(driver, ElementUserRole.class);

		ElementUserRole.masterIcon.click();

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.userRoleIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		// System.out.println(ElementUserRole.analyst);

		List<WebElement> userRoleList = ElementUserRole.userRoleList;

		List<WebElement> userRoleDescriptionList = ElementUserRole.userRoleDescriptionList;

		List<WebElement> userRoleApprovalFlow = ElementUserRole.userRoleApprovalFlowList;

		List<WebElement> userRoleResultEntry = ElementUserRole.userRoleResultEntryList;

		for (WebElement resultEntry : userRoleResultEntry) {
			if (resultEntry.isSelected()) {
				resultEntry.click();
			}
		}

		ElementUserRole.userRoleAction.click();

		ElementUserRole.userRoleSave.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		
		for (WebElement userRoleInList : userRoleList)
		{
			if (userRoleInList.getText().equals(userRole))
			{
				
				String nm=userRoleInList.getText();
				
				int i=userRoleList.indexOf(userRoleInList);
				
				WebElement d=userRoleResultEntry.get(i);
				
				try {
				
				d.click();
				}
				
				catch(Exception e)
				{
					Thread.sleep(3000);
				}
				
				
				
				//System.out.println(nm);
				
				
				
			}
			
		}
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userRoleAction.click();
		
		ElementUserRole.userRoleSave.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userManagementIcon.click();
		
		ElementUserRole.masterIcon.click();
	}
	

	
	public static void userRoleApprovalFlow(String userRole) throws InterruptedException {

		PageFactory.initElements(driver, ElementUserRole.class);

		ElementUserRole.masterIcon.click();

		ElementUserRole.userManagementIcon.click();

		ElementUserRole.userRoleIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));


		List<WebElement> userRoleList = ElementUserRole.userRoleList;

		List<WebElement> userRoleDescriptionList = ElementUserRole.userRoleDescriptionList;

		List<WebElement> userRoleApprovalFlow = ElementUserRole.userRoleApprovalFlowList;

		List<WebElement> userRoleResultEntry = ElementUserRole.userRoleResultEntryList;

		
		for (WebElement approvalUserRole : userRoleList) {
			if (approvalUserRole.getText().equals(userRole)) {
				int i = userRoleList.indexOf(approvalUserRole);

				WebElement approvalFlow = userRoleApprovalFlow.get(i);

				if (approvalFlow.isSelected() == false) {
					approvalFlow.click();
				}

			}

		}
		

		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));
		

		ElementUserRole.userRoleAction.click();
		
		ElementUserRole.userRoleSave.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementUserRole.userRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUserRole.userRoleAction));

		ElementUserRole.userManagementIcon.click();
		
		ElementUserRole.masterIcon.click();

	}

	public static void passwordPolicy(String userRole) throws IOException {
		PageFactory.initElements(driver, ElementPasswordPolicy.class);

		ElementPasswordPolicy.masterIcon.click();

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.passwordPolicyIcon.click();

		WebElement userRoleFilter = ElementPasswordPolicy.passwordPolicyFilterUserRole;

		Select userRoleFilterSelect = new Select(userRoleFilter);

		userRoleFilterSelect.selectByVisibleText(userRole);

		ElementPasswordPolicy.passwordPolicyFilterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.passwordPolicyAction.click();

		ElementPasswordPolicy.passwordPolicyAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementPasswordPolicy.passwordPolicyAddSubmit.isDisplayed()) {
				break;
			}

			else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementPasswordPolicy.class);

				ElementPasswordPolicy.masterIcon.click();

				ElementPasswordPolicy.configurationIcon.click();

				ElementPasswordPolicy.passwordPolicyIcon.click();

				WebElement userRoleFilter1 = ElementPasswordPolicy.passwordPolicyFilterUserRole;

				Select userRoleFilterSelect1 = new Select(userRoleFilter1);

				userRoleFilterSelect1.selectByVisibleText(userRole);

				ElementPasswordPolicy.passwordPolicyFilterFind.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

				ElementPasswordPolicy.passwordPolicyAction.click();

				ElementPasswordPolicy.passwordPolicyAdd.click();

			}

		}
		ElementPasswordPolicy.passwordPolicy.sendKeys(userRole);

		ElementPasswordPolicy.passwordPolicyNumeric.sendKeys("0");

		ElementPasswordPolicy.passwordPolicyLowerCase.sendKeys("0");

		ElementPasswordPolicy.passwordPolicyUpperCase.sendKeys("0");

		ElementPasswordPolicy.passwordPolicySpecialCharacter.sendKeys("0");

		ElementPasswordPolicy.passwordPolicyMinimumLength.sendKeys("1");

		ElementPasswordPolicy.passwordPolicyMaximumLength.sendKeys("3");

		ElementPasswordPolicy.passwordPolicyFailedAttempt.sendKeys("9");

		ElementPasswordPolicy.passwordPolicyAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.masterIcon.click();

	}

	public static void user(String loginID, String firstName, String lastName, String email, String qualification,
			String bloodGroup, String address, String designation, String department, String country)
			throws InterruptedException {
		PageFactory.initElements(driver, ElementUsers.class);

		ElementUsers.masterIcon.click();

		ElementUsers.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementUsers.usersUsersIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersAction));

		try {
			ElementUsers.usersAction.click();

		} catch (Exception e) {
			Thread.sleep(3000);

			ElementUsers.usersAction.click();
		}

		ElementUsers.usersAdd.click();

		if (ElementUsers.usersAddSubmit.isDisplayed()) {
			ElementUsers.usersloginID.sendKeys(loginID);

			ElementUsers.usersFirstName.sendKeys(firstName);

			ElementUsers.usersLastName.sendKeys(lastName);

			ElementUsers.userEmployeeID.sendKeys(loginID);

			WebElement designationElement = ElementUsers.usersDesignation;

			Select designationSelect = new Select(designationElement);

			designationSelect.selectByVisibleText(designation);

			WebElement departmentElement = ElementUsers.usersDepartment;

			Select departmentSelect = new Select(departmentElement);

			departmentSelect.selectByVisibleText(department);

			ElementUsers.usersQualification.sendKeys(qualification);

			ElementUsers.usersBloodGroup.sendKeys(qualification);

			ElementUsers.usersJobInformation.sendKeys(designation);

			ElementUsers.usersAddressOne.sendKeys(address);

			ElementUsers.usersAddressTwo.sendKeys(address);

			ElementUsers.usersAddressThree.sendKeys(address);

			WebElement countryElement = ElementUsers.usersCountry;

			Select countrySelect = new Select(countryElement);

			countrySelect.selectByVisibleText(country);

			ElementUsers.usersMail.sendKeys(email);

			ElementUsers.userPhoneNumber.sendKeys("9999999999");

			ElementUsers.usersMobileNumber.sendKeys("9999999999");

			if (ElementUsers.usersActive.isSelected() == false) {
				ElementUsers.usersActive.click();
			}

			if (ElementUsers.usersUnlock.isSelected() == false) {
				ElementUsers.usersUnlock.click();
			}

			ElementUsers.usersAddSubmit.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersAction));

		ElementUsers.userManagementIcon.click();

		ElementUsers.masterIcon.click();

	}

	public static void userUserRole(String user, String userRole) throws InterruptedException {
		PageFactory.initElements(driver, ElementUsers.class);

		ElementUsers.masterIcon.click();

		ElementUsers.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersAction));

		List<WebElement> usersList = ElementUsers.usersList;

		List<WebElement> usersCheckboxList = ElementUsers.usersCheckboxList;

		for (WebElement users : usersList) {
			if (users.getText().equals(user)) {
				int i = usersList.indexOf(users);

				String checkBoxStatus = usersCheckboxList.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					users.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersAction));

		ElementUsers.usersUserRoleIcon.click();

		try {
			ElementUsers.usersUserRoleAction.click();

		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUsers.usersUserRoleAction.click();
		}

		ElementUsers.usersUserRoleAdd.click();
		WebElement userRoleElement = ElementUsers.usersUserRole;

		Select userRoleSelect = new Select(userRoleElement);

		userRoleSelect.selectByVisibleText(userRole);

		ElementUsers.usersUserRoleAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersUserRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersUserRoleAction));

		ElementUsers.userManagementIcon.click();

		ElementUsers.masterIcon.click();

	}

	public static void userDeputyUser(String user, String deputyUserID, String deputyUserUserRole) {

		PageFactory.initElements(driver, ElementUsers.class);

		ElementUsers.masterIcon.click();

		ElementUsers.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersAction));

		List<WebElement> usersList = ElementUsers.usersList;

		List<WebElement> usersCheckboxList = ElementUsers.usersCheckboxList;

		for (WebElement users : usersList) {
			if (users.getText().equals(user)) {
				int i = usersList.indexOf(users);

				String checkBoxStatus = usersCheckboxList.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					users.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersAction));

		ElementUsers.usersDeputyUserIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersDeputyUserAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersDeputyUserAction));

		ElementUsers.usersDeputyUserAction.click();

		ElementUsers.usersDeputyUserAdd.click();

		WebElement deputyUserID1 = ElementUsers.usersDeputyUserLoginID;

		Select deputyUserIDSelect = new Select(deputyUserID1);

		deputyUserIDSelect.selectByVisibleText(deputyUserID);

		WebElement deputyUserRole = ElementUsers.usersDeputyUserLoginID;

		Select deputyUserRoleSelect = new Select(deputyUserRole);

		deputyUserRoleSelect.selectByVisibleText(deputyUserUserRole);

		ElementUsers.usersDeputyUserAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersDeputyUserAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersDeputyUserAction));

		ElementUsers.userManagementIcon.click();

		ElementUsers.masterIcon.click();

	}

	public static void organisation(String department, String lab, String section) throws InterruptedException {
		PageFactory.initElements(driver, ElementOrganisation.class);

		ElementOrganisation.masterIcon.click();

		ElementOrganisation.organisationManagementIcon.click();

		ElementOrganisation.organisationIcon.click();

		WebElement site = ElementOrganisation.organisationFilterSite;

		Select siteSelect = new Select(site);

		siteSelect.selectByIndex(0);

		ElementOrganisation.organisationFilterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationDepartmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationDepartmentAction));

		try {
			ElementOrganisation.organisationDepartmentAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationDepartmentAction.click();
		}

		ElementOrganisation.organisationDepartmentAdd.click();

		ElementOrganisation.organisationDepartmentSearch.click();

		List<WebElement> departmentList = ElementOrganisation.departmentList;

		for (WebElement departmentElement : departmentList) {

			if (departmentElement.getText().equals(department)) {
				departmentElement.click();

			}

		}

		ElementOrganisation.organisationDepartmentAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationDepartmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationDepartmentAction));

		List<WebElement> organisationDepartments = ElementOrganisation.departments;

		List<WebElement> organisationDepartmentCheckBox = ElementOrganisation.departmentCheckBox;

		for (WebElement dept : organisationDepartments) {
			if (dept.getText().equals(department)) {
				int index = organisationDepartments.indexOf(dept);

				String checkBoxStatus = organisationDepartmentCheckBox.get(index).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					dept.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationLabIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationLabIcon));

		ElementOrganisation.organisationLabIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationLabAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationLabAction));

		try {
			ElementOrganisation.organisationLabAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationLabAction.click();
		}

		ElementOrganisation.organisationLabAdd.click();

		ElementOrganisation.organisationLabSearch.click();

		List<WebElement> labList = ElementOrganisation.labsLIst;

		for (WebElement labElement : labList) {
			if (labElement.getText().equals(lab)) {
				labElement.click();
			}
		}

		ElementOrganisation.organisationLabAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationLabAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationLabAction));

		List<WebElement> organisationLabs = ElementOrganisation.labs;

		List<WebElement> organisationLabCheckBox = ElementOrganisation.labCheckBox;

		for (WebElement labE : organisationLabs) {
			if (labE.getText().equals(lab)) {
				int index = organisationLabs.indexOf(labE);

				String checkBoxStatus = organisationLabCheckBox.get(index).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					labE.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionIcon));

		ElementOrganisation.organisationSectionIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionAction));

		try {
			ElementOrganisation.organisationSectionAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationSectionAction.click();
		}

		ElementOrganisation.organisationSectionAdd.click();

		ElementOrganisation.organisationSectionSearch.click();

		List<WebElement> sectionList = ElementOrganisation.sectionList;

		for (WebElement sectionElement : sectionList) {
			if (sectionElement.getText().equals(section)) {
				sectionElement.click();
			}
		}

		ElementOrganisation.organisationSectionAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionAction));

		// ElementOrganisation.organisationSectionAction.click();

		List<WebElement> organisationSections = ElementOrganisation.sections;

		List<WebElement> organisationSectionsCheckBox = ElementOrganisation.sectionsCheckBox;

		for (WebElement sectionS : organisationSections) {
			if (sectionS.getText().equals(section)) {
				int index = organisationSections.indexOf(sectionS);

				String checkBoxStatus = organisationSectionsCheckBox.get(index).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					sectionS.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationUsersIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationUsersIcon));

		ElementOrganisation.organisationUsersIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationUsersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationUsersAction));

		try {
			ElementOrganisation.organisationUsersAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationUsersAction.click();
		}

		ElementOrganisation.organisationUsersAdd.click();

		ElementOrganisation.organisationUsersSearch.click();

		List<WebElement> usersList = ElementOrganisation.usersList;

		for (WebElement user : usersList) {
			user.click();
		}

		ElementOrganisation.organisationUsersAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationUsersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationUsersAction));

		ElementOrganisation.organisationManagementIcon.click();

		ElementOrganisation.masterIcon.click();

	}

	public static void sampleCategory(String sampleCategory, String description)
			throws InterruptedException, IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementSampleCategory.class);

		ElementSampleCategory.masterIcon.click();

		ElementSampleCategory.sampleManagementIcon.click();

		ElementSampleCategory.sampleCategoryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));


	/*	
		
		List<WebElement> siteLength=ElementSampleCategory.sampleCategoryList;
		
		int beforeCount=siteLength.size();
		BasicOperation.time();
		
		System.out.println(beforeCount);
		*/

		
		try {
			ElementSampleCategory.sampleCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementSampleCategory.sampleCategoryAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAdd));

		ElementSampleCategory.sampleCategoryAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSampleCategory.sampleCategoryAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSampleCategory.class);

				ElementSampleCategory.masterIcon.click();

				ElementSampleCategory.sampleManagementIcon.click();

				ElementSampleCategory.sampleCategoryIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));

				try {
					ElementSampleCategory.sampleCategoryAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementSampleCategory.sampleCategoryAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAdd));

				ElementSampleCategory.sampleCategoryAdd.click();

			}
		}

		ElementSampleCategory.sampleCategory.sendKeys(sampleCategory);
		
		BasicOperation.screenshot("E:\\samplecategory0001");

		ElementSampleCategory.sampleCategoryDescription.sendKeys(description);
		
		
		if(ElementSampleCategory.sampleCategoryCategoryFlowBased.isSelected()==false)
		{
			ElementSampleCategory.sampleCategoryCategoryFlowBased.click();
		}

		ElementSampleCategory.sampleCategoryAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));

		
		/*
		
		
		
		
		int afterCount=siteLength.size();
		BasicOperation.time();
		
		System.out.println(afterCount);
		
*/
		
		
		
		
		/*
		 * FileInputStream s = new FileInputStream("");
		 * 
		 * Properties properties = new Properties();
		 * 
		 * properties.load(s);
		 * 
		 * String sampleCategoryScreenshot =
		 * properties.getProperty("sampleCategoryAdd");
		 * 
		 * BasicOperation.screenshot(sampleCategoryScreenshot);
		 * 
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.
		 * sampleCategoryAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.
		 * sampleCategoryAction));
		 */

		ElementSampleCategory.sampleManagementIcon.click();

		ElementSampleCategory.masterIcon.click();

	}

	public static void sampleType(String sampleCategory, String sampleType, String description)
			throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementSampleType.class);

		ElementSampleType.masterIcon.click();

		ElementSampleType.sampleManagementIcon.click();

		ElementSampleType.sampleTypeIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));

		try {
			ElementSampleType.sampleTypeAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementSampleType.sampleTypeAction.click();
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAdd));

		ElementSampleType.sampleTypeAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSampleType.sampleTypeAddSubmit.isDisplayed()) {
				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSampleType.class);

				ElementSampleType.masterIcon.click();

				ElementSampleType.sampleManagementIcon.click();

				ElementSampleType.sampleTypeIcon.click();

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));

				try {
					ElementSampleType.sampleTypeAction.click();
				} catch (Exception e) {
					Thread.sleep(3000);
					ElementSampleType.sampleTypeAction.click();
				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAdd));

				ElementSampleType.sampleTypeAdd.click();

			}
		}

		WebElement sampleCategoryElement = ElementSampleType.sampleCategory;

		Select sampleCategorySelect = new Select(sampleCategoryElement);

		sampleCategorySelect.selectByVisibleText(sampleCategory);

		ElementSampleType.sampleType.sendKeys(sampleType);

		ElementSampleType.sampleTypeDescription.sendKeys(description);

		ElementSampleType.sampleTypeAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));

		/*
		 * FileInputStream s = new FileInputStream("");
		 * 
		 * Properties properties = new Properties();
		 * 
		 * properties.load(s);
		 * 
		 * String sampleTypeScreenshot = properties.getProperty("sampleTypeAdd");
		 * 
		 * BasicOperation.screenshot(sampleTypeScreenshot);
		 * 
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.
		 * sampleTypeAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.
		 * sampleTypeAction));
		 */

		ElementSampleType.sampleManagementIcon.click();

		ElementSampleType.masterIcon.click();

	}

	public static void passwordPolicy() throws InterruptedException {

		PageFactory.initElements(driver, ElementPasswordPolicy.class);

		ElementPasswordPolicy.masterIcon.click();

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.passwordPolicyIcon.click();

		WebElement passwordPolicyUserRole = ElementPasswordPolicy.passwordPolicyFilterUserRole;

		Select passwordPolicyUserRoleSelect = new Select(passwordPolicyUserRole);

		passwordPolicyUserRoleSelect.selectByIndex(0);

		ElementPasswordPolicy.passwordPolicyFilterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		try {
			ElementPasswordPolicy.passwordPolicyAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementPasswordPolicy.passwordPolicyAction.click();
		}

		ElementPasswordPolicy.passwordPolicyCopy.click();

		try {
			ElementPasswordPolicy.passwordPolicyCopyRole.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementPasswordPolicy.passwordPolicyCopyRole.click();
		}

		ElementPasswordPolicy.passwordPolicyCopyRoleSelectAll.click();

		ElementPasswordPolicy.passwordPolicyCopySubmit.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.masterIcon.click();

	}

	public static void passwordPolicyApproval(String userRole) throws InterruptedException {

		PageFactory.initElements(driver, ElementPasswordPolicy.class);
		
		

		ElementPasswordPolicy.masterIcon.click();

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.passwordPolicyFilterIcon.click();

		WebElement role = ElementPasswordPolicy.passwordPolicyFilterUserRole;

		Select roleSelect = new Select(role);

		roleSelect.selectByVisibleText(userRole);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.passwordPolicyFilterFind.click();

		try {
			ElementPasswordPolicy.passwordPolicyAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementPasswordPolicy.passwordPolicyAction.click();
		}

		ElementPasswordPolicy.passwordPolicyApprove.click();
		
		
		BasicOperation.esign("a");

	
		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.masterIcon.click();

	}

	public static void unitOfMeasurement(String unit, String description) throws InterruptedException, IOException, HeadlessException, AWTException {

		PageFactory.initElements(driver, ElementUnit.class);
		
		PageFactory.initElements(driver, ElementStorageCondition.class);

		ElementUnit.masterIcon.click();

		ElementUnit.baseMasterIcon.click();
		
		ElementStorageCondition.storageConditionIcon.click();

		ElementUnit.unitIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		try {
			ElementUnit.unitAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUnit.unitAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAdd));

		ElementUnit.unitAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementUnit.unitAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementUnit.class);

				ElementUnit.masterIcon.click();

				ElementUnit.baseMasterIcon.click();

				ElementUnit.unitIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

				try {
					ElementUnit.unitAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementUnit.unitAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementUnit.unitAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAdd));

				ElementUnit.unitAdd.click();

			}

		}

		ElementUnit.unit.sendKeys(unit);
		
		BasicOperation.screenshot("E:\\unist");

		ElementUnit.unitDescription.sendKeys(description);

		ElementUnit.unitAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUnit.unitAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUnit.unitAction));

		ElementUnit.baseMasterIcon.click();

		ElementUnit.masterIcon.click();

	}

	public static void samplingPointCategory(String samplingPointCategory, String description)
			throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementSamplingPointCategory.class);

		ElementSamplingPointCategory.masterIcon.click();

		ElementSamplingPointCategory.baseMasterIcon.click();

		ElementSamplingPointCategory.samplingPointCategoryIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPointCategory.samplingPointCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPointCategory.samplingPointCategoryAction));

		try {
			ElementSamplingPointCategory.samplingPointCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSamplingPointCategory.samplingPointCategoryAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPointCategory.samplingPointCategoryAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPointCategory.samplingPointCategoryAdd));

		ElementSamplingPointCategory.samplingPointCategoryAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSamplingPointCategory.samplingPointCategoryAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSamplingPointCategory.class);

				ElementSamplingPointCategory.masterIcon.click();

				ElementSamplingPointCategory.baseMasterIcon.click();

				ElementSamplingPointCategory.samplingPointCategoryIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSamplingPointCategory.samplingPointCategoryAction));

				wait11.until(ExpectedConditions
						.elementToBeClickable(ElementSamplingPointCategory.samplingPointCategoryAction));

				try {
					ElementSamplingPointCategory.samplingPointCategoryAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementSamplingPointCategory.samplingPointCategoryAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSamplingPointCategory.samplingPointCategoryAdd));

				wait11.until(
						ExpectedConditions.elementToBeClickable(ElementSamplingPointCategory.samplingPointCategoryAdd));

				ElementSamplingPointCategory.samplingPointCategoryAdd.click();

			}

		}

		ElementSamplingPointCategory.samplingPointCategory.sendKeys(samplingPointCategory);

		ElementSamplingPointCategory.samplingPointCategoryDescription.sendKeys(description);

		ElementSamplingPointCategory.samplingPointCategoryAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPointCategory.samplingPointCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPointCategory.samplingPointCategoryAction));

		// BasicOperation.screenshot(samplingPointCategoryScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPointCategory.samplingPointCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPointCategory.samplingPointCategoryAction));

		ElementSamplingPointCategory.baseMasterIcon.click();

		ElementSamplingPointCategory.masterIcon.click();

	}

	public static void samplingPoint(String samplingPointCategory, String samplingPoint, String description)
			throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementSamplingPoint.class);

		ElementSamplingPoint.masterIcon.click();

		//ElementSamplingPoint.baseMasterIcon.click();

		ElementSamplingPoint.samplingPointIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPoint.samplingPointAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPoint.samplingPointAction));

		try {
			ElementSamplingPoint.samplingPointAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSamplingPoint.samplingPointAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPoint.samplingPointAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPoint.samplingPointAdd));

		ElementSamplingPoint.samplingPointAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSamplingPoint.samplingPointAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSamplingPoint.class);

				ElementSamplingPoint.masterIcon.click();

		//		ElementSamplingPoint.baseMasterIcon.click();

				ElementSamplingPoint.samplingPointIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSamplingPoint.samplingPointAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSamplingPoint.samplingPointAction));

				try {
					ElementSamplingPoint.samplingPointAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementSamplingPoint.samplingPointAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSamplingPoint.samplingPointAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSamplingPoint.samplingPointAdd));

				ElementSamplingPoint.samplingPointAdd.click();

			}

		}

	/*	WebElement samplingPointCategoryElement = ElementSamplingPoint.samplingPointCategory;

		Select samplingPointCategorySelect = new Select(samplingPointCategoryElement);

		samplingPointCategorySelect.selectByVisibleText(samplingPointCategory);

		ElementSamplingPoint.samplingPoint.sendKeys(samplingPoint);
*/
		ElementSamplingPoint.samplingPointDescription.sendKeys(description);

		ElementSamplingPoint.samplingPointAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPoint.samplingPointAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPoint.samplingPointAction));

		// BasicOperation.screenshot(samplingPointScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementSamplingPoint.samplingPointAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSamplingPoint.samplingPointAction));

		//ElementSamplingPoint.baseMasterIcon.click();

		ElementSamplingPoint.masterIcon.click();

	}

	public static void storageLocation(String storageLocation, String description)
			throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementStorageLocation.class);

		ElementStorageLocation.masterIcon.click();

		ElementStorageLocation.baseMasterIcon.click();

		ElementStorageLocation.storageLocationIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageLocation.storageLocationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageLocation.storageLocationAction));

		try {
			ElementStorageLocation.storageLocationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementStorageLocation.storageLocationAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageLocation.storageLocationAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageLocation.storageLocationAdd));

		ElementStorageLocation.storageLocationAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementStorageLocation.storageLocationAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementStorageLocation.class);

				ElementStorageLocation.masterIcon.click();

				ElementStorageLocation.baseMasterIcon.click();

				ElementStorageLocation.storageLocationIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementStorageLocation.storageLocationAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementStorageLocation.storageLocationAction));

				try {
					ElementStorageLocation.storageLocationAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementStorageLocation.storageLocationAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementStorageLocation.storageLocationAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementStorageLocation.storageLocationAdd));

				ElementStorageLocation.storageLocationAdd.click();

			}

		}

		ElementStorageLocation.storageLocation.sendKeys(storageLocation);

		ElementStorageLocation.storageLocationDescription.sendKeys(description);

		ElementStorageLocation.storageLocationAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageLocation.storageLocationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageLocation.storageLocationAction));

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageLocation.storageLocationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageLocation.storageLocationAction));

		ElementStorageLocation.baseMasterIcon.click();

		ElementStorageLocation.masterIcon.click();

	}

	public static void storageCondition(String storageCondition, String description)
			throws InterruptedException, IOException {
/*
		FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String storageConditionScreenshot = properties.getProperty("storageCondition");

	*/	PageFactory.initElements(driver, ElementStorageCondition.class);

		ElementStorageCondition.masterIcon.click();

		ElementStorageCondition.baseMasterIcon.click();

		ElementStorageCondition.storageConditionIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageCondition.storageConditionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageCondition.storageConditionAction));

		try {
			ElementStorageCondition.storageConditionAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementStorageCondition.storageConditionAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageCondition.storageConditionAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageCondition.storageConditionAdd));

		ElementStorageCondition.storageConditionAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementStorageCondition.storageConditionAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementStorageCondition.class);

				ElementStorageCondition.masterIcon.click();

				ElementStorageCondition.baseMasterIcon.click();

				ElementStorageCondition.storageConditionIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementStorageCondition.storageConditionAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementStorageCondition.storageConditionAction));

				try {
					ElementStorageCondition.storageConditionAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementStorageCondition.storageConditionAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementStorageCondition.storageConditionAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementStorageCondition.storageConditionAdd));

				ElementStorageCondition.storageConditionAdd.click();

			}

		}

		ElementStorageCondition.storageCondition.sendKeys(storageCondition);

		ElementStorageCondition.storageConditionDescription.sendKeys(description);

		ElementStorageCondition.storageConditionAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageCondition.storageConditionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageCondition.storageConditionAction));

		// BasicOperation.screenshot(storageConditionScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementStorageCondition.storageConditionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementStorageCondition.storageConditionAction));

		ElementStorageCondition.baseMasterIcon.click();

		ElementStorageCondition.masterIcon.click();

	}

	public static void component(String component, String description) throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementComponent.class);

		ElementComponent.masterIcon.click();

		ElementComponent.baseMasterIcon.click();

		ElementComponent.componentIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementComponent.componentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementComponent.componentAction));

		try {
			ElementComponent.componentAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementComponent.componentAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementComponent.componentAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementComponent.componentAdd));

		ElementComponent.componentAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementComponent.componentAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementComponent.class);

				ElementComponent.masterIcon.click();

				ElementComponent.baseMasterIcon.click();

				ElementComponent.componentIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementComponent.componentAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementComponent.componentAction));

				try {
					ElementComponent.componentAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementComponent.componentAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementComponent.componentAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementComponent.componentAdd));

				ElementComponent.componentAdd.click();

			}

		}

		ElementComponent.component.sendKeys(component);

		ElementComponent.componentDescription.sendKeys(description);

		ElementComponent.componentAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementComponent.componentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementComponent.componentAction));

		// BasicOperation.screenshot(componentScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementComponent.componentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementComponent.componentAction));

		ElementComponent.baseMasterIcon.click();

		ElementComponent.masterIcon.click();

	}

	public static void sampleTestComments(String sampleTestComments, String description)
			throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementSampleTestComments.class);

		ElementSampleTestComments.masterIcon.click();

		ElementSampleTestComments.baseMasterIcon.click();

		ElementSampleTestComments.sampleTestCommentsIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleTestComments.sampleTestCommentsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleTestComments.sampleTestCommentsAction));

		try {
			ElementSampleTestComments.sampleTestCommentsAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSampleTestComments.sampleTestCommentsAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleTestComments.sampleTestCommentsAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleTestComments.sampleTestCommentsAdd));

		ElementSampleTestComments.sampleTestCommentsAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSampleTestComments.sampleTestCommentsAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSampleTestComments.class);

				ElementSampleTestComments.masterIcon.click();

				ElementSampleTestComments.baseMasterIcon.click();

				ElementSampleTestComments.sampleTestCommentsIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleTestComments.sampleTestCommentsAction));

				wait11.until(
						ExpectedConditions.elementToBeClickable(ElementSampleTestComments.sampleTestCommentsAction));

				try {
					ElementSampleTestComments.sampleTestCommentsAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementSampleTestComments.sampleTestCommentsAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleTestComments.sampleTestCommentsAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleTestComments.sampleTestCommentsAdd));

				ElementSampleTestComments.sampleTestCommentsAdd.click();

			}

		}

		ElementSampleTestComments.sampleTestComments.sendKeys(sampleTestComments);

		ElementSampleTestComments.sampleTestCommentsDescription.sendKeys(description);

		ElementSampleTestComments.sampleTestCommentsAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleTestComments.sampleTestCommentsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleTestComments.sampleTestCommentsAction));

		// BasicOperation.screenshot(sampleTestCommentsScreenshot);

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleTestComments.sampleTestCommentsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleTestComments.sampleTestCommentsAction));

		ElementSampleTestComments.baseMasterIcon.click();

		ElementSampleTestComments.masterIcon.click();

	}

	//

	public static void sampleCategory1(String sampleCategory, String description)
			throws InterruptedException, IOException {

		PageFactory.initElements(driver, ElementSampleCategory.class);

		ElementSampleCategory.masterIcon.click();

		ElementSampleCategory.sampleManagementIcon.click();

		FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String sampleCategoryScreenshot = properties.getProperty("sampleCategory");

		String sampleCategoryMaster = properties.getProperty("sampleCategoryMaster");

		PageFactory.initElements(driver, ElementSampleCategory.class);

		ElementSampleCategory.sampleCategoryIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));

		try {
			ElementSampleCategory.sampleCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSampleCategory.sampleCategoryAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAdd));

		ElementSampleCategory.sampleCategoryAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSampleCategory.sampleCategoryAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSampleCategory.class);

				ElementSampleCategory.masterIcon.click();

				ElementSampleCategory.sampleManagementIcon.click();

				ElementSampleCategory.sampleCategoryIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));

				try {
					ElementSampleCategory.sampleCategoryAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementSampleCategory.sampleCategoryAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAdd));

				ElementSampleCategory.sampleCategoryAdd.click();

			}

		}

		ElementSampleCategory.sampleCategory.sendKeys(sampleCategory);

		ElementSampleCategory.sampleCategoryDescription.sendKeys(description);

		ElementSampleCategory.sampleCategoryAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));

	/*	BasicOperation.screenshot(sampleCategoryScreenshot);

		BasicOperation.screenshot(sampleCategoryMaster);*/

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));

		List<WebElement> sampleCategoryList = ElementSampleCategory.sampleCategoryList;

		List<WebElement> sampleCategoryDescriptionList = ElementSampleCategory.sampleCategoryDescriptionList;

		String lastSampleCategory = sampleCategoryList.get(0).getText();

		String lastSampleCategoryDescription = sampleCategoryDescriptionList.get(0).getText();

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleCategory.sampleCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleCategory.sampleCategoryAction));

	}

	public static void sampleType(String sampleType, String description) throws InterruptedException, IOException {
/*
		FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String sampleTypeScreenshot = properties.getProperty("sampleType");

		String sampleTypeMaster = properties.getProperty("sampleTypeMaster");
*/
		PageFactory.initElements(driver, ElementSampleType.class);
		
		ElementSampleType.masterIcon.click();
		
		ElementSampleType.sampleManagementIcon.click();

		ElementSampleType.sampleTypeIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));

		try {
			ElementSampleType.sampleTypeAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSampleType.sampleTypeAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAdd));

		ElementSampleType.sampleTypeAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementSampleType.sampleTypeAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementSampleType.class);

				ElementSampleType.masterIcon.click();

				ElementSampleType.sampleManagementIcon.click();

				ElementSampleType.sampleTypeIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));

				try {
					ElementSampleType.sampleTypeAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementSampleType.sampleTypeAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAdd));

				ElementSampleType.sampleTypeAdd.click();

			}

		}

		ElementSampleType.sampleType.sendKeys(sampleType);

		ElementSampleType.sampleTypeDescription.sendKeys(description);

		ElementSampleType.sampleTypeAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));
/*
		BasicOperation.screenshot(sampleTypeScreenshot);

		BasicOperation.screenshot(sampleTypeMaster);*/

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));

		List<WebElement> sampleTypeList = ElementSampleType.sampleTypeList;

		List<WebElement> sampleTypeDescriptionList = ElementSampleType.sampleTypeDescriptionList;

		String lastSampleType = sampleTypeList.get(0).getText();

		String lastSampleTypeDescription = sampleTypeDescriptionList.get(0).getText();

		//testCase = report.createTest("Check weather Sample Category name accept space in front or not");

		wait1.until(ExpectedConditions.visibilityOf(ElementSampleType.sampleTypeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSampleType.sampleTypeAction));

		ElementSampleType.sampleManagementIcon.click();

		ElementSampleType.masterIcon.click();

	}

	/*
	 * 
	 * public static void organisation() throws InterruptedException {
	 * 
	 * PageFactory.initElements(driver, MasterOrganisationOrganisation.class);
	 * 
	 * 
	 * // MasterOrganisationOrganisation.organisationManagementIcon.click();
	 * 
	 * MasterOrganisationOrganisation.organisationIcon.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * MasterOrganisationOrganisation.organisationFilterFind.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * MasterOrganisationOrganisation.organisationDepartmentAction.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * 
	 * MasterOrganisationOrganisation.organisationDepartmentAdd.click();
	 * 
	 * MasterOrganisationOrganisation.organisationDepartmentSearchDepartment.click()
	 * ;
	 * 
	 * List<WebElement> departmentList=driver.findElements(By.xpath(
	 * "//*[@id='ID_ORD_FilterPopUp1']/li"));
	 * 
	 * int listOfDepartment=departmentList.size();
	 * 
	 * System.out.println(listOfDepartment);
	 * 
	 * 
	 * for(WebElement list: departmentList) {
	 * if(list.getText().contains(MasterOrganisationData.department)) {
	 * list.click(); }
	 * 
	 * list.click();
	 * 
	 * 
	 * }
	 * 
	 * Thread.sleep(2000);
	 * MasterOrganisationOrganisation.organisationDepartmentAddSubmit.click();
	 * 
	 * }
	 */

	public static void technique(String technique, String description) throws InterruptedException, IOException {

		/*
		 * FileInputStream s = new
		 * FileInputStream("Properties//spaceInFront.properties");
		 * 
		 * Properties properties = new Properties();
		 * 
		 * properties.load(s);
		 * 
		 * String techniqueScreenshot = properties.getProperty("technique");
		 * 
		 * String techniqueMaster = properties.getProperty("techniqueMaster");
		 */

		PageFactory.initElements(driver, ElementTechnique.class);

		ElementTechnique.masterIcon.click();

		ElementTechnique.competenceManagementIcon.click();

		ElementTechnique.techniqueIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementTechnique.techniqueAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementTechnique.techniqueAction));

		try {
			ElementTechnique.techniqueAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTechnique.techniqueAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementTechnique.techniqueAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementTechnique.techniqueAdd));

		ElementTechnique.techniqueAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementTechnique.techniqueAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementTechnique.class);

				ElementTechnique.masterIcon.click();

				ElementTechnique.competenceManagementIcon.click();

				ElementTechnique.techniqueIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementTechnique.techniqueAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementTechnique.techniqueAction));

				try {
					ElementTechnique.techniqueAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementTechnique.techniqueAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementTechnique.techniqueAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementTechnique.techniqueAdd));

				ElementTechnique.techniqueAdd.click();

			}

		}

		ElementTechnique.technique.sendKeys(technique);

		ElementTechnique.techniqueDescription.sendKeys(description);

		ElementTechnique.techniqueAddSubmit.click();

		/*
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementTechnique.techniqueAction)
		 * );
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementTechnique.
		 * techniqueAction));
		 * 
		 * BasicOperation.screenshot(techniqueScreenshot);
		 * 
		 * BasicOperation.screenshot(techniqueMaster);
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementTechnique.techniqueAction)
		 * );
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementTechnique.
		 * techniqueAction));
		 * 
		 * 
		 * 
		 * List<WebElement> sectionList=ElementTechnique.techniqueList;
		 * 
		 * List<WebElement>
		 * sectionDescriptionList=ElementTechnique.techniqueDescriptionList;
		 * 
		 * 
		 * 
		 * String lasSection=sectionList.get(0).getText();
		 * 
		 * String lastSectionDescription=sectionDescriptionList.get(0).getText();
		 * 
		 * testCase=report.
		 * createTest("Check weather Technique name accept space in front or not");
		 * 
		 * if(lasSection.equals(technique)) { testCase.log(Status.FAIL,
		 * "Technique name accept space in front"); } else { testCase.log(Status.PASS,
		 * "Technique name never accept space in front"); }
		 * 
		 * 
		 * 
		 * testCase=report.
		 * createTest("Check weather Technique desciption accept space in front or not"
		 * );
		 * 
		 * 
		 * 
		 * if(lastSectionDescription.equals(description)) { testCase.log(Status.FAIL,
		 * "Technique description accept space in front"); } else {
		 * testCase.log(Status.PASS,
		 * "Technique description never accept space in front"); }
		 * 
		 */

		wait1.until(ExpectedConditions.visibilityOf(ElementTechnique.techniqueAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementTechnique.techniqueAction));

		ElementTechnique.competenceManagementIcon.click();

		ElementTechnique.masterIcon.click();

	}

	public static void trainingCategory(String trainingCategory, String description)
			throws InterruptedException, IOException {
		/*
		 * FileInputStream s = new
		 * FileInputStream("Properties//spaceInFront.properties");
		 * 
		 * Properties properties = new Properties();
		 * 
		 * properties.load(s);
		 * 
		 * String trainingCategoryScreenshot =
		 * properties.getProperty("trainingCategory");
		 * 
		 * String trainingCategoryMaster =
		 * properties.getProperty("trainingCategoryMaster");
		 * 
		 */
		PageFactory.initElements(driver, ElementTrainingCategory.class);

		ElementTrainingCategory.masterIcon.click();

		ElementTrainingCategory.competenceManagementIcon.click();

		ElementTrainingCategory.trainingCategoryIcon.click();

		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementTrainingCategory.trainingCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementTrainingCategory.trainingCategoryAction));

		try {
			ElementTrainingCategory.trainingCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingCategory.trainingCategoryAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementTrainingCategory.trainingCategoryAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementTrainingCategory.trainingCategoryAdd));

		ElementTrainingCategory.trainingCategoryAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementTrainingCategory.trainingCategoryAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementTrainingCategory.class);

				ElementTrainingCategory.masterIcon.click();

				ElementTrainingCategory.competenceManagementIcon.click();

				ElementTrainingCategory.trainingCategoryIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementTrainingCategory.trainingCategoryAction));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementTrainingCategory.trainingCategoryAction));

				try {
					ElementTrainingCategory.trainingCategoryAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementTrainingCategory.trainingCategoryAction.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementTrainingCategory.trainingCategoryAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementTrainingCategory.trainingCategoryAdd));

				ElementTrainingCategory.trainingCategoryAdd.click();

			}

		}

		ElementTrainingCategory.trainingCategory.sendKeys(trainingCategory);

		ElementTrainingCategory.trainingCategoryDescription.sendKeys(description);

		ElementTrainingCategory.trainingCategoryAddSubmit.click();

		/*
		 * wait1.until(ExpectedConditions.visibilityOf(ElementTrainingCategory.
		 * trainingCategoryAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementTrainingCategory.
		 * trainingCategoryAction));
		 */

		/*
		 * BasicOperation.screenshot(trainingCategoryScreenshot);
		 * 
		 * BasicOperation.screenshot(trainingCategoryMaster);
		 * 
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementTrainingCategory.
		 * trainingCategoryAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementTrainingCategory.
		 * trainingCategoryAction));
		 * 
		 * 
		 * 
		 * List<WebElement> sectionList=ElementTrainingCategory.trainingCategoryList;
		 * 
		 * List<WebElement> sectionDescriptionList=ElementTrainingCategory.
		 * trainingCategoryDescriptionList;
		 * 
		 * 
		 * 
		 * String lasSection=sectionList.get(0).getText();
		 * 
		 * String lastSectionDescription=sectionDescriptionList.get(0).getText();
		 * 
		 * testCase=report.
		 * createTest("Check weather Training Category name accept space in front or not"
		 * );
		 * 
		 * if(lasSection.equals(trainingCategory)) { testCase.log(Status.FAIL,
		 * " Training Category name accept space in front"); } else {
		 * testCase.log(Status.PASS,
		 * " Training Category name never accept space in front"); }
		 * 
		 * 
		 * 
		 * testCase=report.
		 * createTest("Check weather  Training Category desciption accept space in front or not"
		 * );
		 * 
		 * 
		 * 
		 * if(lastSectionDescription.equals(description)) { testCase.log(Status.FAIL,
		 * " Training Category description accept space in front"); } else {
		 * testCase.log(Status.PASS,
		 * " Training Category description never accept space in front"); }
		 */

		wait1.until(ExpectedConditions.visibilityOf(ElementTrainingCategory.trainingCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementTrainingCategory.trainingCategoryAction));

		ElementTrainingCategory.competenceManagementIcon.click();
		ElementTrainingCategory.masterIcon.click();

	}

	public static void trainingAndCertification(String trainingName, String technique, String trainingCategory,
			String trainingTopic, String time, String trainerName, String trainingVenue, String description,
			String section) throws InterruptedException, AWTException {
		PageFactory.initElements(driver, ElementTrainingAndCertification.class);

		ElementTrainingAndCertification.masterIcon.click();

		ElementTrainingAndCertification.CompetenceManagementIcon.click();

		ElementTrainingAndCertification.trainingAndCertificationIcon.click();
		
		

		ElementTrainingAndCertification.trainingAndCertificationFilterFind.click();

		try {
			ElementTrainingAndCertification.trainingAndCertificationScheduleAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingAndCertification.trainingAndCertificationScheduleAction.click();

		}

		ElementTrainingAndCertification.trainingAndCertificationScheduleAdd.click();
		WebElement trainingCategoryElement = ElementTrainingAndCertification.trainingAndCertificationScheduleTrainingCategory;

		Select trainingCategoryElementSelect = new Select(trainingCategoryElement);

		trainingCategoryElementSelect.selectByVisibleText(trainingCategory);

		WebElement techniqueElement = ElementTrainingAndCertification.trainingAndCertificationScheduleTechnique;

		Select techniqueElementSelect = new Select(techniqueElement);

		techniqueElementSelect.selectByVisibleText(technique);

		ElementTrainingAndCertification.trainingAndCertificationScheduleTrainingTopic.sendKeys(trainingTopic);

		ElementTrainingAndCertification.trainingAndCertificationScheduleDate.click();
		WebElement date = driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[5]/td[4]"));

		date.click();

		/*
		 * 
		 * ElementTrainingAndCertification.trainingAndCertificationScheduleDate.sendKeys
		 * ("2020-10-03");
		 */
		/*
		 * Robot rob = new Robot();
		 * 
		 * rob.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * rob.keyRelease(KeyEvent.VK_ENTER);
		 */

		ElementTrainingAndCertification.trainingAndCertificationScheduleTime.sendKeys(time);

		ElementTrainingAndCertification.trainingAndCertificationScheduleTrainer.sendKeys(trainerName);

		ElementTrainingAndCertification.trainingAndCertificationScheduleVenue.sendKeys(trainingVenue);

		ElementTrainingAndCertification.trainingAndCertificationScheduleComments.sendKeys(description);

		ElementTrainingAndCertification.trainingAndCertificationScheduleAddSubmit.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions
				.visibilityOf(ElementTrainingAndCertification.trainingAndCertificationScheduleAction));

		wait1.until(ExpectedConditions
				.elementToBeClickable(ElementTrainingAndCertification.trainingAndCertificationScheduleAction));

		wait1.until(ExpectedConditions
				.visibilityOf(ElementTrainingAndCertification.trainingAndCertificationParticipantsIcon));

		wait1.until(ExpectedConditions
				.elementToBeClickable(ElementTrainingAndCertification.trainingAndCertificationParticipantsIcon));

		ElementTrainingAndCertification.trainingAndCertificationParticipantsIcon.click();

		wait1.until(ExpectedConditions
				.visibilityOf(ElementTrainingAndCertification.trainingAndCertificationParticipantsAction));

		wait1.until(ExpectedConditions
				.elementToBeClickable(ElementTrainingAndCertification.trainingAndCertificationParticipantsAction));

		try {
			ElementTrainingAndCertification.trainingAndCertificationParticipantsAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingAndCertification.trainingAndCertificationParticipantsAction.click();

		}

		ElementTrainingAndCertification.trainingAndCertificationParticipantAdd.click();

		WebElement sectionElement = ElementTrainingAndCertification.trainingAndCertificationParticipantSection;

		Select sectionSelect = new Select(sectionElement);

		sectionSelect.selectByVisibleText(section);

		ElementTrainingAndCertification.trainingAndCertificationParticipantFind.click();

		ElementTrainingAndCertification.trainingAndCertificationParticipantSelectAll.click();

		ElementTrainingAndCertification.trainingAndCertificationParticipantAddSubmit.click();

		List<WebElement> participantsList = ElementTrainingAndCertification.trainingAndCertificationParticipantsList;

		List<WebElement> participantsCheckboxList = ElementTrainingAndCertification.trainingAndCertificationParticipantsCheckboxList;

		for (WebElement checkbox : participantsCheckboxList) {

			String checkBoxStatus = checkbox.getAttribute("checkboxselect");

			if (checkBoxStatus.equals("0")) {
				checkbox.click();
			}
		}

		try {
			ElementTrainingAndCertification.trainingAndCertificationParticipantsAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingAndCertification.trainingAndCertificationParticipantsAction.click();

		}

		ElementTrainingAndCertification.trainingAndCertificationParticipantSendInvitation.click();

		wait1.until(ExpectedConditions
				.visibilityOf(ElementTrainingAndCertification.trainingAndCertificationParticipantsAction));

		wait1.until(ExpectedConditions
				.elementToBeClickable(ElementTrainingAndCertification.trainingAndCertificationParticipantsAction));

		ElementTrainingAndCertification.trainingAndCertificationScheduleIcon.click();

		wait1.until(ExpectedConditions
				.visibilityOf(ElementTrainingAndCertification.trainingAndCertificationScheduleAction));

		wait1.until(ExpectedConditions
				.elementToBeClickable(ElementTrainingAndCertification.trainingAndCertificationScheduleAction));
		try {
			ElementTrainingAndCertification.trainingAndCertificationScheduleAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingAndCertification.trainingAndCertificationScheduleAction.click();

		}
		ElementTrainingAndCertification.trainingAndCertificationScheduleConduct.click();

		wait1.until(ExpectedConditions
				.visibilityOf(ElementTrainingAndCertification.trainingAndCertificationScheduleAction));

		wait1.until(ExpectedConditions
				.elementToBeClickable(ElementTrainingAndCertification.trainingAndCertificationScheduleAction));

		ElementTrainingAndCertification.CompetenceManagementIcon.click();

		ElementTrainingAndCertification.masterIcon.click();

	}

	public static void trainingUpdate(String technique) throws InterruptedException {
		PageFactory.initElements(driver, ElementTrainingUpdate.class);

		ElementTrainingUpdate.masterIcon.click();

		ElementTrainingUpdate.CompetenceManagementIcon.click();

		ElementTrainingUpdate.trainingUpdateIcon.click();

		WebElement techniqueElement = ElementTrainingUpdate.trainingUpdateFilterTechnique;

		Select techniqueElementSelect = new Select(techniqueElement);

		techniqueElementSelect.selectByVisibleText(technique);

		ElementTrainingUpdate.trainingUpdateFilterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementTrainingUpdate.trainingUpdateTrainingUpdateAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementTrainingUpdate.trainingUpdateTrainingUpdateAction));

		ElementTrainingUpdate.trainingUpdateParticipantDetailIcon.click();

		List<WebElement> participantsCheckboxList = ElementTrainingUpdate.trainingUpdateTrainingUpdateParticipantsCheckboxList;

		for (WebElement checkbox : participantsCheckboxList) {

			String checkBoxStatus = checkbox.getAttribute("checkboxselect");

			if (checkBoxStatus.equals("0")) {
				checkbox.click();
			}
		}

		try {
			ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction.click();

		}

		ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAttended.click();

		try {
			ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction.click();

		}

		ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantCertified.click();

		try {
			ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction.click();

		}

		ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantCompleted.click();

		WebDriverWait wait11 = new WebDriverWait(driver, 100);

		wait11.until(ExpectedConditions
				.visibilityOf(ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction));

		wait11.until(ExpectedConditions
				.elementToBeClickable(ElementTrainingUpdate.trainingUpdateParticipantDetailParticipantAction));

		ElementTrainingUpdate.trainingUpdateParticipantDetailBackButton.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementTrainingUpdate.trainingUpdateTrainingUpdateAction));

		wait11.until(ExpectedConditions.elementToBeClickable(ElementTrainingUpdate.trainingUpdateTrainingUpdateAction));

		try {
			ElementTrainingUpdate.trainingUpdateTrainingUpdateAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTrainingUpdate.trainingUpdateTrainingUpdateAction.click();

		}

		ElementTrainingUpdate.trainingUpdateCompletedTraining.click();
		
		ElementTrainingUpdate.CompetenceManagementIcon.click();
		
		ElementTrainingUpdate.masterIcon.click();

	}

	public static void courier(String courier, String contactPerson, String address, String country, String phoneNumber,
			String fax, String mobileNumber) throws InterruptedException {
		PageFactory.initElements(driver, ElementCourier.class);

		ElementCourier.masterIcon.click();

		ElementCourier.contactsIcon.click();

		ElementCourier.courierIcon.click();

		try {
			ElementCourier.courierAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementCourier.courierAction.click();

		}

		ElementCourier.courierAdd.click();

		ElementCourier.courier.sendKeys(courier);

		ElementCourier.contactPerson.sendKeys(contactPerson);

		ElementCourier.addressOne.sendKeys(address);

		ElementCourier.courierAddressTwo.sendKeys(address);

		ElementCourier.courierAddressThree.sendKeys(address);

		WebElement countryElement = ElementCourier.courierCountry;

		Select countryElementSelect = new Select(countryElement);

		countryElementSelect.selectByVisibleText(country);

		ElementCourier.courierPhoneNumber.sendKeys(phoneNumber);

		ElementCourier.courierFax.sendKeys(fax);

		ElementCourier.courierMobileNumber.sendKeys(mobileNumber);

		ElementCourier.courierAddSubmit.click();

		ElementCourier.contactsIcon.click();

		ElementCourier.masterIcon.click();

	}

	public static void clientGroup(String clientGroup, String description) throws InterruptedException {
		PageFactory.initElements(driver, ElementClientGroup.class);

		ElementClientGroup.masterIcon.click();

		ElementClientGroup.contactsIcon.click();

		ElementClientGroup.clientGroupIcon.click();

		try {
			ElementClientGroup.clientGroupAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementClientGroup.clientGroupAction.click();

		}

		ElementClientGroup.clientGroupAdd.click();

		ElementClientGroup.clientGroup.sendKeys(clientGroup);

		ElementClientGroup.clientGroupDescription.sendKeys(description);

		ElementClientGroup.clientGroupAddSubmit.click();

		ElementClientGroup.contactsIcon.click();

		ElementClientGroup.masterIcon.click();
	}

	public static void supplierCategory(String supplierCategory, String description) throws InterruptedException {
		PageFactory.initElements(driver, ElementSupplierCategory.class);

		ElementSupplierCategory.masterIcon.click();

		ElementSupplierCategory.contactsIcon.click();

		ElementSupplierCategory.supplierCategoryIcon.click();

		try {
			ElementSupplierCategory.supplierCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSupplierCategory.supplierCategoryAction.click();

		}

		ElementSupplierCategory.supplierCategoryAdd.click();

		ElementSupplierCategory.supplierCategory.sendKeys(supplierCategory);

		ElementSupplierCategory.supplierCategoryDescription.sendKeys(description);

		ElementSupplierCategory.supplierCategoryAddSubmit.click();

		ElementSupplierCategory.contactsIcon.click();

		ElementSupplierCategory.masterIcon.click();
	}

	public static void client(String clientGroup, String client, String description, String clientSite) throws InterruptedException, AWTException {
		PageFactory.initElements(driver, ElementClient.class);

		ElementClient.masterIcon.click();

		ElementClient.contactsIcon.click();

		ElementClient.clientIcon.click();

		ElementClient.clientClientIcon.click();

		try {
			ElementClient.clientAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementClient.clientAction.click();

		}

		ElementClient.clientAdd.click();

		WebElement clientGroupElement = ElementClient.clientClientGroup;

		Select clientGroupSelect = new Select(clientGroupElement);

		clientGroupSelect.selectByVisibleText(clientGroup);

		ElementClient.client.sendKeys(client);

		ElementClient.clientId.sendKeys(client);

		ElementClient.clientDescription.sendKeys(description);

		if (ElementClient.clientActive.isSelected() == false) {
			ElementClient.clientActive.click();
		}

		ElementClient.clientAddSubmit.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementClient.clientAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementClient.clientAction));

		ElementClient.cilentSiteIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementClient.cilentSiteAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementClient.cilentSiteAction));

		try {
			ElementClient.cilentSiteAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementClient.cilentSiteAction.click();

		}
		
		ElementClient.clientSiteAdd.click();
		
		ElementClient.clientSite.sendKeys(clientSite);
		
		String doorNumber=TestDataFlow.doorNumber;
		
		String streetAddress=TestDataFlow.streetAddress;
		
		String city=TestDataFlow.city;
		
		String state=TestDataFlow.state;
		
		String zip=TestDataFlow.zip;
		
		String telephoneNumber=TestDataFlow.telephoneNumber;
		
		String fax=TestDataFlow.fax;
		
		String designation="Manager";
		
		String country=TestDataFlow.country;
		
		String website=TestDataFlow.website;
		
		
		String email=TestDataFlow.mail;
		
		ElementClient.clientSiteDoorNumber.sendKeys(doorNumber);
		
		ElementClient.clientSiteStreet.sendKeys(streetAddress);
		
		ElementClient.clientSiteCity.sendKeys(city);
		
		ElementClient.clientState.sendKeys(state);
		
		WebElement countryElement=ElementClient.clientCountry;
		
		Select countryElementSelect=new Select(countryElement);
		
		countryElementSelect.selectByVisibleText(country);
		
		ElementClient.clientZip.sendKeys(zip);
		
		ElementClient.clientSiteTelephone.sendKeys(telephoneNumber);
		
		ElementClient.clientSiteFax.sendKeys(fax);
		
		ElementClient.clientSiteEmail.sendKeys(email);
		
		ElementClient.clientSiteWebSite.sendKeys(website);
		
		ElementClient.clientSiteAddSubmit.click();
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementClient.cilentSiteAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementClient.cilentSiteAction));

		ElementClient.clientSiteContactIcon.click();
		


		wait1.until(ExpectedConditions.visibilityOf(ElementClient.clientContactAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementClient.clientContactAction));
		
		

		try {
			ElementClient.clientContactAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementClient.clientContactAction.click();

		}
		
		
		
		
		ElementClient.clientSiteContactAdd.click();
		
		
		ElementClient.clientSiteContactName.sendKeys("murali");
		
		
		ElementClient.clientSiteContactDesignation.sendKeys(designation);
		
		ElementClient.clientSiteContactMobileNumber.sendKeys(telephoneNumber);
		
		ElementClient.clientSiteContactTelephoneNumber.sendKeys(telephoneNumber);
		
		ElementClient.clientSiteContactMail.sendKeys(email);
		
		ElementClient.clientSiteContactRemarks.sendKeys(client);
		
		ElementClient.clientSiteContactAddSubmit.click();
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementClient.clientContactAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementClient.clientContactAction));
	
		ElementClient.clientSiteBack.click();
		/*
		ElementClient.clientFileIcon.click();
		
		


		try {
			ElementClient.clientFileAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementClient.cilentSiteAction.click();

		}
		ElementClient.clientFileAdd.click();
		
		ElementClient.clientFileUploadIcon.click();
		
		Thread.sleep(5000);
		
		String file=File.file;
		
		StringSelection fileLocation=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocation, null);
		
		
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		
rob.keyPress(KeyEvent.VK_ENTER);
		
		rob.keyRelease(KeyEvent.VK_ENTER);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementClient.clientFileAddSubmit));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementClient.clientFileAddSubmit));
		
		ElementClient.clientFileAddSubmit.click();
		*/

		wait1.until(ExpectedConditions.visibilityOf(ElementClient.cilentSiteAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementClient.cilentSiteAction));
	
		
		ElementClient.contactsIcon.click();
		
		ElementClient.masterIcon.click();
		
		
		
		
		
	}
	
	public static void manufacture(String manufacture, String description, String manufactureSite) throws InterruptedException, AWTException {
		PageFactory.initElements(driver, ElementManufacture.class);

		ElementManufacture.masterIcon.click();

		ElementManufacture.contactsIcon.click();

		ElementManufacture.manufactureIcon.click();

		ElementManufacture.manufactureManufactureIcon.click();

		try {
			ElementManufacture.manufactureAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementManufacture.manufactureAction.click();

		}

		ElementManufacture.manufactureAdd.click();

		ElementManufacture.manufacture.sendKeys(manufacture);

		

		ElementManufacture.manufactureDescription.sendKeys(description);

		if (ElementManufacture.manufactureActive.isSelected() == false) {
			ElementManufacture.manufactureActive.click();
		}

		ElementManufacture.manufactureAddSubmit.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementManufacture.manufactureAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementManufacture.manufactureAction));

		ElementManufacture.manufactureSiteIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementManufacture.manufactureSiteAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementManufacture.manufactureSiteAction));

		try {
			ElementManufacture.manufactureSiteAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementManufacture.manufactureSiteAction.click();

		}
		
		ElementManufacture.manufactureSiteAdd.click();
		
		ElementManufacture.manufactureSite.sendKeys(manufactureSite);
		
		String doorNumber=TestDataFlow.doorNumber;
		
		String streetAddress=TestDataFlow.streetAddress;
		
		String city=TestDataFlow.city;
		
		String state=TestDataFlow.state;
		
		String zip=TestDataFlow.zip;
		
		String telephoneNumber=TestDataFlow.telephoneNumber;
		
		String fax=TestDataFlow.fax;
		
		String designation="Manager";
		
		String country=TestDataFlow.country;
		
		String website=TestDataFlow.website;
		
		
		String email=TestDataFlow.mail;
		
		ElementManufacture.manufactureSiteDoorNumber.sendKeys(doorNumber);
		
		ElementManufacture.manufactureSiteStreet.sendKeys(streetAddress);
		
		ElementManufacture.manufactureSiteCity.sendKeys(city);
		
		ElementManufacture.manufactureSiteState.sendKeys(state);
		
		WebElement countryElement=ElementManufacture.manufactureSiteCountry;
		
		Select countryElementSelect=new Select(countryElement);
		
		countryElementSelect.selectByVisibleText(country);
		
		ElementManufacture.manufactureZip.sendKeys(zip);
		
		ElementManufacture.manufactureSiteTelephone.sendKeys(telephoneNumber);
		
		ElementManufacture.manufactureSiteFax.sendKeys(fax);
		
		ElementManufacture.manufactureSiteMail.sendKeys(email);
		
		ElementManufacture.manufactureSiteWebsite.sendKeys(website);
		
		ElementManufacture.manufactureSiteAddSubmet.click();
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementManufacture.manufactureSiteAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementManufacture.manufactureSiteAction));

		ElementManufacture.manufactureContactIcon.click();
		


		wait1.until(ExpectedConditions.visibilityOf(ElementManufacture.manufactureContactAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementManufacture.manufactureContactAction));
		
		

		try {
			ElementManufacture.manufactureContactAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementManufacture.manufactureContactAction.click();

		}
		
		
		
		
		ElementManufacture.manufactureContactAdd.click();
		
		
		ElementManufacture.manufactureContactName.sendKeys("murali");
		
		
		ElementManufacture.manufactureContactDesignation.sendKeys(designation);
		
		ElementManufacture.manufactureContactMobileNumber.sendKeys(telephoneNumber);
		
		ElementManufacture.manufactureContactTelephoneNumber.sendKeys(telephoneNumber);
		
		ElementManufacture.manufactureContactEmail.sendKeys(email);
		
		ElementManufacture.manufactureContactRemarks.sendKeys(manufacture);
		
		ElementManufacture.manufactureContactAddSubmit.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementManufacture.manufactureContactAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementManufacture.manufactureContactAction));
	
		
		/*
				ElementManufacture.manufactureSiteBack.click();
		
		ElementManufacture.manufactureFileIcon.click();
		
		


		try {
			ElementManufacture.manufactureFileAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementManufacture.manufactureFileAction.click();

		}
		ElementManufacture.manufactureFileAdd.click();
		
		ElementManufacture.manufactureFileUploadIcon.click();
		
		Thread.sleep(5000);
		
		String file=File.file;
		
		StringSelection fileLocation=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocation, null);
		
		
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		
rob.keyPress(KeyEvent.VK_ENTER);
		
		rob.keyRelease(KeyEvent.VK_ENTER);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementManufacture.manufactureFileAddSubmit));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementManufacture.manufactureFileAddSubmit));
		
		ElementManufacture.manufactureFileAddSubmit.click();
		*/

		wait1.until(ExpectedConditions.visibilityOf(ElementManufacture.manufactureFileAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementManufacture.manufactureFileAction));
	
		
		ElementManufacture.contactsIcon.click();
		
		ElementManufacture.masterIcon.click();
		
		
		
		
		
	}
	
	
	
	public static void materialCategory(String materialCategory, String description, String userRole, String barcode) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMaterialCategory.class);

		ElementMaterialCategory.masterIcon.click();

		ElementMaterialCategory.materialManagementIcon.click();
		
		ElementMaterialCategory.materialCategoryIcon.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementMaterialCategory.materialCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementMaterialCategory.materialCategoryAction));



		try {
			ElementMaterialCategory.materialCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementMaterialCategory.materialCategoryAction.click();

		}
		
		ElementMaterialCategory.materialCategoryAdd.click();
		
		WebElement materialCategoryType=ElementMaterialCategory.materialCategoryType;
		
		Select materialCategoryTypeSelect=new Select(materialCategoryType);
		
		materialCategoryTypeSelect.selectByVisibleText("Standard Type");
		
		
		
		
		ElementMaterialCategory.materialCategory.sendKeys(materialCategory);
		

		WebElement materialCategoryUserRole=ElementMaterialCategory.materialCategoryUserRole;
		
		Select materialCategoryUserRoleSelect=new Select(materialCategoryUserRole);
		
		materialCategoryUserRoleSelect.selectByIndex(0);
		
		
/*
		WebElement materialCategoryBarCode=ElementMaterialCategory.materialCategoryBarCode;
		
		Select materialCategoryBarCodeSelect=new Select(materialCategoryBarCode);
		
		materialCategoryBarCodeSelect.selectByVisibleText("Water Barcode");
*/		
		if(ElementMaterialCategory.materialCategoryCategoryBasedFlow.isSelected()==false)
		{
			ElementMaterialCategory.materialCategoryCategoryBasedFlow.click();
		}
		
		
		ElementMaterialCategory.materialCategoryAddSubmit.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementMaterialCategory.materialCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementMaterialCategory.materialCategoryAction));
		
		ElementMaterialCategory.materialManagementIcon.click();
		
		ElementMaterialCategory.masterIcon.click();
		
		


		
	}
	
	public static void materialGrade(String materialGrade, String description) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementMaterialGrade.class);

		ElementMaterialGrade.masterIcon.click();

		ElementMaterialGrade.materialManagementIcon.click();
		
		ElementMaterialGrade.materialGradeIcon.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementMaterialGrade.materialGradeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementMaterialGrade.materialGradeAction));



		try {
			ElementMaterialGrade.materialGradeAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementMaterialGrade.materialGradeAction.click();

		}
		
		ElementMaterialGrade.materialGradeAdd.click();
		
		ElementMaterialGrade.materialGrade.sendKeys(materialGrade);
		
		ElementMaterialGrade.materialGradeDescription.sendKeys(description);
		
	
		ElementMaterialGrade.materialGradeAddSubmit.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementMaterialGrade.materialGradeAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementMaterialGrade.materialGradeAction));
		
		ElementMaterialGrade.materialManagementIcon.click();
		
		ElementMaterialGrade.masterIcon.click();
		
		


		
	}
	
	
	public static void material(String materialCategory, String material, String materialGrade, String unit, String reOrderLevel, String supplier,String storageLocation, String manufacture, String section) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementMaterial.class);

		ElementMaterial.masterIcon.click();

		ElementMaterial.materialManagementIcon.click();
		
		ElementMaterial.materialIcon.click();
		

		WebElement materialCategoryType=ElementMaterial.materialFilterMaterialType;
		
		Select materialCategoryTypeSelect=new Select(materialCategoryType);
		
		materialCategoryTypeSelect.selectByVisibleText("Standard Type");
		

		WebElement materialCategoryElement=ElementMaterial.materialFilterMaterialCategory;
		
		Select materialCategorySelect=new Select(materialCategoryElement);
		
		materialCategorySelect.selectByVisibleText(materialCategory);
		
		ElementMaterial.materialFilterFindMaterial.click();
		
		
	
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementMaterial.materialAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementMaterial.materialAction));


		try {
			ElementMaterial.materialAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementMaterial.materialAction.click();

		}
		
		ElementMaterial.materialAdd.click();
		
		ElementMaterial.material.sendKeys(material);
		

		WebElement materialUnit=ElementMaterial.materialUnit;
		
		Select materialUnitSelect=new Select(materialUnit);
		
		materialUnitSelect.selectByVisibleText(unit);
		
		ElementMaterial.materialPrefix.sendKeys(material);
		
		if(ElementMaterial.materialQuarantine.isSelected()==false)
		{
			ElementMaterial.materialQuarantine.click();
		}
		
		ElementMaterial.meterialReorder.sendKeys(reOrderLevel);
		
		ElementMaterial.materialOpenExpiry.sendKeys("10");
		

		WebElement materialOpenExpiryPeriod=ElementMaterial.meterialOpenExpiryPeriod;
		
		Select materialOpenExpiryPeriodSelect=new Select(materialOpenExpiryPeriod);
		
		materialOpenExpiryPeriodSelect.selectByVisibleText("Years");
	
	
		
		ElementMaterial.materialNextValidation.sendKeys("5");
		
		

		WebElement materialNextValidationPeriod=ElementMaterial.materialNextValidationPeriod;
		
		Select materialNextValidationPeriodSelect=new Select(materialNextValidationPeriod);
		
		materialNextValidationPeriodSelect.selectByVisibleText("Years");
	
		
		
		
		ElementMaterial.materialExpiryDays.sendKeys("15");
		
		

		WebElement meterialOpenExpiryPeriod=ElementMaterial.meterialOpenExpiryPeriod;
		
		Select meterialOpenExpiryPeriodSelect=new Select(meterialOpenExpiryPeriod);
		
		meterialOpenExpiryPeriodSelect.selectByVisibleText("Years");
		
		
		
		ElementMaterial.materialAddSubmit.click();
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementMaterial.materialAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementMaterial.materialAction));

		ElementMaterial.materialInventoryIcon.click();
		

		try {
			ElementMaterial.materialInventoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementMaterial.materialInventoryAction.click();

		}
		
		ElementMaterial.materialInventoryAdd.click();
		
		ElementMaterial.materialInventoryInternalRefrence.sendKeys(material+ "001");
		
		
		ElementMaterial.materialInventoryBatchNumber.sendKeys("100");
		
		ElementMaterial.materialInventoryLotNumber.sendKeys("100");
		
		ElementMaterial.materialInventoryRefrenceNumber.sendKeys(material+ "001");
		
		ElementMaterial.materialInventoryContainerID.sendKeys("100");
		
		WebElement storageLocationElement=ElementMaterial.materialInventoryStorageLocation;
		
		Select storageLocationElementSelect=new Select(storageLocationElement);
		
		storageLocationElementSelect.selectByVisibleText(storageLocation);
		
		
		
		
		
		
		
		WebElement materialInventorySupplier=ElementMaterial.materialInventorySupplier;
		
		Select materialInventorySupplierSelect=new Select(materialInventorySupplier);
		
		materialInventorySupplierSelect.selectByVisibleText(supplier);
		
		

		WebElement materialInventoryManufacture=ElementMaterial.materialInventoryManufacture;
		
		Select materialInventoryManufactureSelect=new Select(materialInventoryManufacture);
		
		materialInventoryManufactureSelect.selectByVisibleText(manufacture);
		
		

		WebElement materialInventorySection=ElementMaterial.materialInventorySection;
		
		Select materialInventorySectionSelect=new Select(materialInventorySection);
		
		materialInventorySectionSelect.selectByVisibleText(section);
		
		

		WebElement materialInventoryGrade=ElementMaterial.materialInventoryGrade;
		
		Select materialInventoryGradeSelect=new Select(materialInventoryGrade);
		
		materialInventoryGradeSelect.selectByVisibleText(materialGrade);
		ElementMaterial.materialInventoryQuantityReceived.sendKeys("100");
		
		
		ElementMaterial.materialInventoryCost.sendKeys("100");
		
		ElementMaterial.materialInventoryRemarks.sendKeys(material);
		
		
		
		ElementMaterial.materialInventoryAddSubmit.click();
		
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementMaterial.materialInventoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementMaterial.materialInventoryAction));

		ElementMaterial.materialManagementIcon.click();
		
		ElementMaterial.masterIcon.click();
		
		
		
	}
	
	
	
	public static void supplier(String supplier, String description, String supplierCategory, String materialCategory) throws InterruptedException, AWTException
	{
		PageFactory.initElements(driver, ElementSupplier.class);
		
		ElementSupplier.masterIcon.click();
		
		ElementSupplier.contactsIcon.click();
		
		ElementSupplier.supplierIcon.click();
		
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierAction));



		try {
			ElementSupplier.supplierAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementSupplier.supplierAction.click();

		}
		String doorNumber=TestDataFlow.doorNumber;
		
		String streetAddress=TestDataFlow.streetAddress;
		
		//String doorNumber=TestDataFlow.doorNumber;
		
		String city=TestDataFlow.city;
		
		String state=TestDataFlow.state;
		
		String zip=TestDataFlow.zip;
		
		String telephoneNumber=TestDataFlow.telephoneNumber;
		
		String fax=TestDataFlow.fax;
		
		String designation="Manager";
		
		String country=TestDataFlow.country;
		
		String website=TestDataFlow.website;
		
		String email=TestDataFlow.mail;
		
		
		ElementSupplier.supplierAdd.click();
		
		ElementSupplier.supplier.sendKeys(supplier);
		
		ElementSupplier.supplierStreet.sendKeys(streetAddress);
		
		ElementSupplier.supplierDoorNumber.sendKeys(doorNumber);
		
		
		ElementSupplier.supplierZip.sendKeys(zip);
		
		ElementSupplier.supplierCity.sendKeys(city);
		
		ElementSupplier.supplierState.sendKeys(state);
		

		WebElement supplierCountry=ElementSupplier.supplierCountry;
		
		Select supplierCountrySelect=new Select(supplierCountry);
		
		supplierCountrySelect.selectByVisibleText(country);
		
		ElementSupplier.supplierTelePhoneNumber.sendKeys(telephoneNumber);
		
		ElementSupplier.supplierPhoneNumber.sendKeys(telephoneNumber);
		
		ElementSupplier.supplierFax.sendKeys(fax);
		
		ElementSupplier.supplierMail.sendKeys(email);
		
		ElementSupplier.supplierWebsite.sendKeys(website);
		
		ElementSupplier.supplierDescription.sendKeys(description);
		
		if(ElementSupplier.supplierActive.isSelected()==false)
		{
			ElementSupplier.supplierActive.click();
			
		}
		
		ElementSupplier.supplierAddSubmit.click();
		
		
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierAction));
		
		ElementSupplier.supplierContactIcon.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierContactAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierContactAction));


		try {
			ElementSupplier.supplierContactAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSupplier.supplierContactAction.click();

		}
		
		ElementSupplier.supplierContactAdd.click();
		
		ElementSupplier.supplierContactName.sendKeys("murali");
		
		ElementSupplier.supplierContactDesignation.sendKeys(designation);
		
		ElementSupplier.supplierContactMobileNumber.sendKeys(telephoneNumber);
		
		ElementSupplier.supplierContactEmail.sendKeys(email);
		
		ElementSupplier.supplierContactDesignation.sendKeys("contact details");
		
		ElementSupplier.supplierContactAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierContactAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierContactAction));
		
		ElementSupplier.supplierSupplierCategoryIcon.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierSupplierCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierSupplierCategoryAction));


		try {
			ElementSupplier.supplierSupplierCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSupplier.supplierSupplierCategoryAction.click();

		}
		
		ElementSupplier.supplierSupplierCategoryAdd.click();
		
		List<WebElement> supplierCategoryList=ElementSupplier.supplierSupplierCategoryList;
		
		
		
		List<WebElement> supplierCategoryCheckboxList=ElementSupplier.supplierSupplierCategoryCheckBoxList;
		
			//System.out.println(supplierCategoryList.size());
		
		for(WebElement supplierCategoryElement:supplierCategoryCheckboxList)
		{
			
			supplierCategoryElement.click();
			/*String supplierCategoryName=supplierCategoryElement.getText();
			
			if(supplierCategoryName.equals(supplierCategory))
			{
				int i=supplierCategoryList.indexOf(supplierCategoryName);
				
				System.out.println(i);
				
				WebElement supplierCategoryCheckbox=supplierCategoryCheckboxList.get(i+1);
				
				if(supplierCategoryCheckbox.isSelected()==false)
				{
					supplierCategoryCheckbox.click();
				}
			}*/
		}
		
		ElementSupplier.supplierSupplierCategoryAddSubmit.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierSupplierCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierSupplierCategoryAction));
		
		
		ElementSupplier.supplierMaterialCategoryIcon.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierMaterialCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierMaterialCategoryAction));


		try {
			ElementSupplier.supplierMaterialCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSupplier.supplierMaterialCategoryAction.click();

		}
		
		ElementSupplier.supplierMaterialCategoryAdd.click();
		
		List<WebElement> materialCategoryList=ElementSupplier.supplierMaterialCategryList;
		
		
		
		List<WebElement> materialCategoryCheckboxList=ElementSupplier.supplierMaterialCategoryCheckboxList;
		
		for(WebElement materialCategoryElement:materialCategoryList)
		{
			String materialCategoryName=materialCategoryElement.getText();
			
			if(materialCategoryName.equals(materialCategory))
			{
				int i=materialCategoryList.indexOf(materialCategoryName);
				
				WebElement materialCategoryCheckbox=materialCategoryCheckboxList.get(i+1);
				
				if(materialCategoryCheckbox.isSelected()==false)
				{
					materialCategoryCheckbox.click();
				}
			}
		}
		
		ElementSupplier.supplierMaterialCategoryAddSubmit.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierMaterialCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierMaterialCategoryAction));
		
/*		ElementSupplier.supplierFileIcon.click();
		
		


		try {
			ElementSupplier.supplierFileAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSupplier.supplierFileAction.click();

		}
		ElementSupplier.supplierFileAdd.click();
		
		ElementSupplier.supplierFileUpload.click();
		
		Thread.sleep(5000);
		
		String file=File.file;
		
		StringSelection fileLocation=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocation, null);
		
		
		Robot rob=new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		
		rob.keyPress(KeyEvent.VK_ENTER);
		
		rob.keyRelease(KeyEvent.VK_ENTER);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierFileAddSubmit));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierFileAddSubmit));
		
		ElementSupplier.supplierFileAddSubmit.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierFileAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierFileAction));
		
		*/
		
		ElementSupplier.supplierSupplierIcon.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierAction));
		
		


		try {
			ElementSupplier.supplierAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementSupplier.supplierAction.click();

		}
		
		
	
		ElementSupplier.supplierApprove.click();
		
		
		BasicOperation.esign("Approved");
		
	/*	PageFactory.initElements(driver, ElementEsign.class);
		ElementEsign.EsignPassword.sendKeys("123");
		
		ElementEsign.EsignComments.sendKeys("approved");
		
		if(ElementEsign.EsignCheckbox.isSelected()==false)
		{
			ElementEsign.EsignCheckbox.click();
			
		}
		
		
		ElementEsign.EsignSubmit.click();
		*/

		

		wait1.until(ExpectedConditions.visibilityOf(ElementSupplier.supplierAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementSupplier.supplierAction));
	
		ElementSupplier.contactsIcon.click();
		
		ElementSupplier.masterIcon.click();
		
		
		





	}
	
	
	public static void instrumentCategory(String instrumentCategory, String technique, String description) throws IOException, InterruptedException
	{
		
	
		PageFactory.initElements(driver, ElementInstrumentCategory.class);

		ElementInstrumentCategory.masterIcon.click();

		ElementInstrumentCategory.instrumentManagementIcon.click();

		ElementInstrumentCategory.instrumentCategoryIcon.click();

		

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrumentCategory.instrumentCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrumentCategory.instrumentCategoryAction));

		try {
			ElementInstrumentCategory.instrumentCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementInstrumentCategory.instrumentCategoryAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrumentCategory.instrumentCategoryAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrumentCategory.instrumentCategoryAdd));

		ElementInstrumentCategory.instrumentCategoryAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementInstrumentCategory.instrumentCategoryAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementInstrumentCategory.class);

				ElementInstrumentCategory.masterIcon.click();

				ElementInstrumentCategory.instrumentManagementIcon.click();

				ElementInstrumentCategory.instrumentCategoryIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementInstrumentCategory.instrumentCategoryAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementInstrumentCategory.instrumentCategoryAdd));

				try {
					ElementInstrumentCategory.instrumentCategoryAdd.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementInstrumentCategory.instrumentCategoryAdd.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementInstrumentCategory.instrumentCategoryAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementInstrumentCategory.instrumentCategoryAdd));

				ElementInstrumentCategory.instrumentCategoryAdd.click();

			}

		}

		ElementInstrumentCategory.instrumentCategory.sendKeys(instrumentCategory);

		ElementInstrumentCategory.instrumentCategoryDescription.sendKeys(description);
		


		WebElement instrumentCategoryTechnique=ElementInstrumentCategory.instrumentCategoryTechnique;
		
		Select instrumentCategoryTechniqueSelect=new Select(instrumentCategoryTechnique);
		
		instrumentCategoryTechniqueSelect.selectByVisibleText(technique);
		


		WebElement instrumentCategoryInterface=ElementInstrumentCategory.instrumentCategoryInterface;
		
		Select instrumentCategoryInterfaceSelect=new Select(instrumentCategoryInterface);
		
		instrumentCategoryInterfaceSelect.selectByIndex(0);
		
		
		if(ElementInstrumentCategory.instrumentCategoryCalibrationRequired.isSelected()==false)
		{
			ElementInstrumentCategory.instrumentCategoryCalibrationRequired.click();
		}
		
		if(ElementInstrumentCategory.instrumentCategoryCategoryFlowBased.isSelected()==false)
		{
			ElementInstrumentCategory.instrumentCategoryCategoryFlowBased.click();
		}
		

		ElementInstrumentCategory.instrumentCategoryAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrumentCategory.instrumentCategoryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrumentCategory.instrumentCategoryAction));

		
		ElementInstrumentCategory.instrumentManagementIcon.click();

		ElementInstrumentCategory.masterIcon.click();

	}
	
	public static void instrument(String instrument, String instrumentCategory, String description, String supplier, String windowPeriodUnit, String incharge, String status,String section, String manufacture, boolean calibration) throws IOException, InterruptedException
	{
		
	
		PageFactory.initElements(driver, ElementInstrument.class);
		
		ElementInstrument.homeIcon.click();

		ElementInstrument.masterIcon.click();

		ElementInstrument.instrumentManagementIcon.click();

		ElementInstrument.instrumentIcon.click();
		


		WebElement instrumentFilterInstrumentCategory=ElementInstrument.instrumentFilterInstrumentCategory;
		
		Select instrumentFilterInstrumentCategorySelect=new Select(instrumentFilterInstrumentCategory);
		
		instrumentFilterInstrumentCategorySelect.selectByVisibleText(instrumentCategory);
	

		ElementInstrument.instrumentFilterFindInstrument.click();
		
		
		

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));

		try {
			ElementInstrument.instrumentAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementInstrument.instrumentAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAdd));

		ElementInstrument.instrumentAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementInstrument.instrumentAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementInstrument.class);

				ElementInstrument.masterIcon.click();

				ElementInstrument.instrumentManagementIcon.click();

				ElementInstrument.instrumentIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAdd));

				try {
					ElementInstrument.instrumentAdd.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementInstrument.instrumentAdd.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAdd));

				ElementInstrument.instrumentAdd.click();

			}

		}

		ElementInstrument.instrumentID.sendKeys(instrument);

		ElementInstrument.instrumentName.sendKeys(instrument);
		
		
		


		WebElement instrumentSupplier=ElementInstrument.instrumentSupplier;
		
		Select instrumentSupplierSelect=new Select(instrumentSupplier);
		
		instrumentSupplierSelect.selectByVisibleText(supplier);
		
		ElementInstrument.instrumentSerialNumber.sendKeys("100");
		
		ElementInstrument.instrumentModelNumber.sendKeys("100");
		


		WebElement instrumentManufactureName=ElementInstrument.instrumentManufactureName;
		
		Select instrumentManufactureNameSelect=new Select(instrumentManufactureName);
		
		instrumentManufactureNameSelect.selectByVisibleText(manufacture);
		
		
		ElementInstrument.instrumentPocketNumber.sendKeys("100");
	/*	
		
		ElementInstrument.instrumentManufactureDate.click();
		
		
		ElementInstrument.instrumentManufactureDateValue.click();
		
		String i=ElementInstrument.instrumentManufactureDateValue.getText();
		
		int ii=Integer.parseInt(i);
		
		System.out.println(ii);
		
		
		
		ElementInstrument.instrumentPocketDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'2')]")).click();
		
		ElementInstrument.instrumentReceivedDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'3')]")).click();
	
		
		ElementInstrument.instrumentInstallationDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'4')]")).click();
	

		ElementInstrument.instrumentWarrantyExpireDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'5')]")).click();
		*/
		
		WebElement instrumentServicedBy=ElementInstrument.instrumentServicedBy;
		
		Select instrumentServicedBySelect=new Select(instrumentServicedBy);
		
		instrumentServicedBySelect.selectByVisibleText(supplier);
		
	
	
	
		
		WebElement instrumentSection=ElementInstrument.instrumentSection;
		
		Select instrumentSectionSelect=new Select(instrumentSection);
		
		instrumentSectionSelect.selectByVisibleText(section);
		
		

		WebElement instrumentIncharge=ElementInstrument.instrumentIncharge;
		
		Select instrumentInchargeSelect=new Select(instrumentIncharge);
		
		instrumentInchargeSelect.selectByVisibleText(incharge);
		


		WebElement instrumentStatus=ElementInstrument.instrumentStatus;
		
		Select instrumentStatusSelect=new Select(instrumentStatus);
		
		instrumentStatusSelect.selectByVisibleText(status);
		
		ElementInstrument.instrumentWindowPeriodFrom.sendKeys("10");
		
		
		WebElement instrumentWindowPeriodFromUnit = ElementInstrument.instrumentWindowPeriodFromUnit;

		Select instrumentWindowPeriodFromUnitSelect = new Select(instrumentWindowPeriodFromUnit);

		instrumentWindowPeriodFromUnitSelect.selectByVisibleText(windowPeriodUnit);
		
		ElementInstrument.instrumentWindowPeriodTo.sendKeys("20");
		

		WebElement instrumentWindowPeriodToUnit = ElementInstrument.instrumentWindowPeriodToUnit;

		Select instrumentWindowPeriodToUnitSelect = new Select(instrumentWindowPeriodToUnit);

		instrumentWindowPeriodToUnitSelect.selectByVisibleText(windowPeriodUnit);
		
		ElementInstrument.instrumentRemarks.sendKeys(description);	

		ElementInstrument.instrumentAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));

		
		ElementInstrument.intrumentCalibraitonIcon.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentCalibrationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentCalibrationAction));

		
	

		try {
			ElementInstrument.instrumentCalibrationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementInstrument.instrumentCalibrationAction.click();

		}
		
		ElementInstrument.instrumetCalibrationAdd.click();;
		
		
		WebElement instrumentCalibrationStatus = ElementInstrument.instrumentCalibrationStatus;

		Select instrumentCalibrationStatusSelect = new Select(instrumentCalibrationStatus);

		
		if(calibration==true)
		{
			instrumentCalibrationStatusSelect.selectByVisibleText("Calibrated");
		}
		else
		{
			instrumentCalibrationStatusSelect.selectByVisibleText("Under Calibration");
		}
		
		
		ElementInstrument.instrumentCalibrationAddSubmit.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentCalibrationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentCalibrationAction));
		
		ElementInstrument.instrumentCalibrationBack.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));


		ElementInstrument.instrumentValidationIcon.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentValidationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentValidationAction));

		
	

		try {
			ElementInstrument.instrumentValidationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementInstrument.instrumentValidationAction.click();

		}
		
		ElementInstrument.instrumentValidationAdd.click();;
		
		
		WebElement instrumentValidationStatus = ElementInstrument.instrumentValidationStatus;

		Select instrumentValidationStatusSelect = new Select(instrumentValidationStatus);

		instrumentValidationStatusSelect.selectByIndex(0);
		
		ElementInstrument.instrumentValidationAddSubmit.click();
		

		List<WebElement> organisationDepartments = ElementInstrument.instrumentIDList;

		List<WebElement> organisationDepartmentCheckBox = ElementInstrument.checkboxList;

		List<WebElement> validationList = ElementInstrument.validationList;

		WebDriverWait wait2 = new WebDriverWait(driver, 5);
		
		try
		{
			Thread.sleep(1000);
			validationList.get(0).click();
			
			
			wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentValidationAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentValidationAction));

			ElementInstrument.instrumentValidationBack.click();
				
		}	
		catch (Exception e) {
			
			PageFactory.initElements(driver, ElementInstrumentCategory.class);

			ElementInstrumentCategory.instrumentCategoryIcon.click();
			
			ElementInstrument.instrumentIcon.click();
			

	instrumentFilterInstrumentCategorySelect.selectByVisibleText(instrumentCategory);
		

			ElementInstrument.instrumentFilterFindInstrument.click();
			
			
			
	wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));

			organisationDepartments.get(0).click();
			
			for (WebElement dept : organisationDepartments) {
				if (dept.getText().equals(instrument)) {
					
					int index = organisationDepartments.indexOf(dept);
					organisationDepartmentCheckBox.get(index).click();

				}
			}
			
			
			

			wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentValidationIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentValidationIcon));

			

ElementInstrument.instrumentValidationIcon.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentValidationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentValidationAction));

	//	int i=0;
	
		
		if(validationList.size()>0)
		{
			ElementInstrument.instrumentValidationBack.click();
			
		}
		else
		{

			wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentValidationAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentValidationAction));

			
		

			try {
				ElementInstrument.instrumentValidationAction.click();
			} catch (Exception ee) {
				Thread.sleep(2000);

				ElementInstrument.instrumentValidationAction.click();

			}
			
			ElementInstrument.instrumentValidationAdd.click();
		
			instrumentValidationStatusSelect.selectByVisibleText("Validated");
			
			ElementInstrument.instrumentValidationAddSubmit.click();
			
		}

			
			
			
			
		}
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));


   ElementInstrument.instrumentMaintanceIcon.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentMaintananceAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentMaintananceAction));

		
	

		try {
			ElementInstrument.instrumentMaintananceAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementInstrument.instrumentMaintananceAction.click();

		}
		
		ElementInstrument.instrumentMaintananceAdd.click();;
		
		
		WebElement instrumentMaintananceStatus = ElementInstrument.instrumentMaintananceStatus;

		Select instrumentMaintananceStatusSelect = new Select(instrumentMaintananceStatus);

		instrumentMaintananceStatusSelect.selectByIndex(0);
		
		ElementInstrument.instrumentMaintanaceAddSubmit.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentMaintananceAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentMaintananceAction));
		
		PageFactory.initElements(driver, ElementInstrumentCategory.class);
		
		ElementInstrumentCategory.instrumentCategoryIcon.click();
		
		ElementInstrument.instrumentManagementIcon.click();
		
		ElementInstrument.masterIcon.click();

	
	}
	public static void instrumentUnderCalibration(String instrument, String instrumentCategory,  String supplier,  String section, String manufacture) throws IOException, InterruptedException
	{
		
	
		PageFactory.initElements(driver, ElementInstrument.class);
		
		PageFactory.initElements(driver, ElementInstrumentCategory.class);

		ElementInstrument.masterIcon.click();

		ElementInstrument.instrumentManagementIcon.click();
		
		ElementInstrumentCategory.instrumentCategoryIcon.click();


		ElementInstrument.instrumentIcon.click();
		


		WebElement instrumentFilterInstrumentCategory=ElementInstrument.instrumentFilterInstrumentCategory;
		
		Select instrumentFilterInstrumentCategorySelect=new Select(instrumentFilterInstrumentCategory);
		
		instrumentFilterInstrumentCategorySelect.selectByVisibleText(instrumentCategory);
	

		ElementInstrument.instrumentFilterFindInstrument.click();
		
		
		

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));

		try {
			ElementInstrument.instrumentAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementInstrument.instrumentAction.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAdd));

		ElementInstrument.instrumentAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementInstrument.instrumentAddSubmit.isDisplayed()) {

				break;
			} else {
				BrowserOperation.refreshLoginAdmin();

				PageFactory.initElements(driver, ElementInstrument.class);

				ElementInstrument.masterIcon.click();

				ElementInstrument.instrumentManagementIcon.click();

				ElementInstrument.instrumentIcon.click();

				Thread.sleep(500);

				WebDriverWait wait11 = new WebDriverWait(driver, 100);

				wait11.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAdd));

				try {
					ElementInstrument.instrumentAdd.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementInstrument.instrumentAdd.click();

				}

				wait11.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAdd));

				wait11.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAdd));

				ElementInstrument.instrumentAdd.click();

			}

		}

		ElementInstrument.instrumentID.sendKeys(instrument);

		ElementInstrument.instrumentName.sendKeys(instrument);
		
		
		


		WebElement instrumentSupplier=ElementInstrument.instrumentSupplier;
		
		Select instrumentSupplierSelect=new Select(instrumentSupplier);
		
		instrumentSupplierSelect.selectByVisibleText(supplier);
		
		ElementInstrument.instrumentSerialNumber.sendKeys("100");
		
		ElementInstrument.instrumentModelNumber.sendKeys("100");
		


		WebElement instrumentManufactureName=ElementInstrument.instrumentManufactureName;
		
		Select instrumentManufactureNameSelect=new Select(instrumentManufactureName);
		
		instrumentManufactureNameSelect.selectByVisibleText(manufacture);
		
		
		ElementInstrument.instrumentPocketNumber.sendKeys("100");
	/*	
		
		ElementInstrument.instrumentManufactureDate.click();
		
		
		ElementInstrument.instrumentManufactureDateValue.click();
		
		String i=ElementInstrument.instrumentManufactureDateValue.getText();
		
		int ii=Integer.parseInt(i);
		
		System.out.println(ii);
		
		
		
		ElementInstrument.instrumentPocketDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'2')]")).click();
		
		ElementInstrument.instrumentReceivedDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'3')]")).click();
	
		
		ElementInstrument.instrumentInstallationDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'4')]")).click();
	

		ElementInstrument.instrumentWarrantyExpireDate.click();
		
		driver.findElement(By.xpath("//td[contains(text(),'5')]")).click();
		*/
		
		WebElement instrumentServicedBy=ElementInstrument.instrumentServicedBy;
		
		Select instrumentServicedBySelect=new Select(instrumentServicedBy);
		
		instrumentServicedBySelect.selectByVisibleText(supplier);
		
	
	
	
		
		WebElement instrumentSection=ElementInstrument.instrumentSection;
		
		Select instrumentSectionSelect=new Select(instrumentSection);
		
		instrumentSectionSelect.selectByVisibleText(section);
		
		

		WebElement instrumentIncharge=ElementInstrument.instrumentIncharge;
		
		Select instrumentInchargeSelect=new Select(instrumentIncharge);
		
		instrumentInchargeSelect.selectByVisibleText("Murali R");
		


		ElementInstrument.instrumentStatus.sendKeys("Active");
		
	
		ElementInstrument.instrumentWindowPeriodFrom.sendKeys("10");
		
		
		WebElement instrumentWindowPeriodFromUnit = ElementInstrument.instrumentWindowPeriodFromUnit;

		Select instrumentWindowPeriodFromUnitSelect = new Select(instrumentWindowPeriodFromUnit);

		instrumentWindowPeriodFromUnitSelect.selectByIndex(0);
		
		ElementInstrument.instrumentWindowPeriodTo.sendKeys("20");
		

		WebElement instrumentWindowPeriodToUnit = ElementInstrument.instrumentWindowPeriodToUnit;

		Select instrumentWindowPeriodToUnitSelect = new Select(instrumentWindowPeriodToUnit);

		instrumentWindowPeriodToUnitSelect.selectByIndex(0);
		
		ElementInstrument.instrumentRemarks.sendKeys("instruments");	

		ElementInstrument.instrumentAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));

		
		ElementInstrument.intrumentCalibraitonIcon.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentCalibrationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentCalibrationAction));

		
	

		try {
			ElementInstrument.instrumentCalibrationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementInstrument.instrumentCalibrationAction.click();

		}
		
		ElementInstrument.instrumetCalibrationAdd.click();;
		
		
		WebElement instrumentCalibrationStatus = ElementInstrument.instrumentCalibrationStatus;

		Select instrumentCalibrationStatusSelect = new Select(instrumentCalibrationStatus);

		instrumentCalibrationStatusSelect.selectByIndex(1);
		
		ElementInstrument.instrumentCalibrationAddSubmit.click();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentCalibrationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentCalibrationAction));
		
		ElementInstrument.instrumentCalibrationBack.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementInstrument.instrumentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementInstrument.instrumentAction));

		ElementInstrument.instrumentManagementIcon.click();
		
		ElementInstrument.masterIcon.click();

	
	}
	
	
	
	///////
	


	
	public static void testCategory(String testCategory,String description) throws InterruptedException, IOException {

			
		PageFactory.initElements(driver, ElementTestCategory.class);


		ElementTestCategory.masterIcon.click();
		
		ElementTestCategory.testManagementIcon.click();
		
		ElementTestCategory.testCategoryIcon.click();
		
		Thread.sleep(500);

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementTestCategory.testCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementTestCategory.testCategoryAction));		
		
		try {
			ElementTestCategory.testCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTestCategory.testCategoryAction.click();

		}

		
		wait1.until(ExpectedConditions.visibilityOf(ElementTestCategory.testCategoryAdd));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementTestCategory.testCategoryAdd));		
	
		ElementTestCategory.testCategoryAdd.click();


		for(int i=0; i<5; i++)
		{
			if(ElementTestCategory.testCategoryAddSubmit.isDisplayed())
			{
				
				
				break;
			}
			else
			{
				BrowserOperation.refreshLoginAdmin();
				
				PageFactory.initElements(driver, ElementTestCategory.class);

				ElementTestCategory.masterIcon.click();

				ElementTestCategory.testManagementIcon.click();

				ElementTestCategory.testCategoryIcon.click();
				
				Thread.sleep(500);

				WebDriverWait wait11= new WebDriverWait(driver,100);
				
				wait11.until(ExpectedConditions.visibilityOf(ElementTestCategory.testCategoryAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementTestCategory.testCategoryAction));		
				
				try {
					ElementTestCategory.testCategoryAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementTestCategory.testCategoryAction.click();

				}

				
				wait11.until(ExpectedConditions.visibilityOf(ElementTestCategory.testCategoryAdd));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementTestCategory.testCategoryAdd));		
			
				ElementTestCategory.testCategoryAdd.click();

			}
			
			
			
		}
		
	


		ElementTestCategory.testCategory.sendKeys(testCategory);

		ElementTestCategory.testCategoryDescription.sendKeys(description);

		

		ElementTestCategory.testCategoryAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementTestCategory.testCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementTestCategory.testCategoryAction));	
		
		
		
		ElementTestCategory.testManagementIcon.click();
		
		ElementTestCategory.masterIcon.click();
/*
		BasicOperation.screenshot(testCategoryScreenshot);
		
		BasicOperation.screenshot(testCategoryMaster);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementTestCategory.testCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementTestCategory.testCategoryAction));	
		
List<WebElement> sectionList=ElementTestCategory.testCategoryList;
		
		List<WebElement> sectionDescriptionList=ElementTestCategory.testCategoryDescriptionList;
		
		
		
		String lasSection=sectionList.get(0).getText();
		
		String lastSectionDescription=sectionDescriptionList.get(0).getText();
		
		testCase=report.createTest("Check weather Section name accept space in front or not");
		
		if(lasSection.equals(testCategory))
		{
			testCase.log(Status.FAIL, "Test Category name accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, "Test Category name never accept space in front");
		}
		
		
		
		testCase=report.createTest("Check weather Section desciption accept space in front or not");
		
		
		
		if(lastSectionDescription.equals(description))
		{
			testCase.log(Status.FAIL, "Test Category description accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, "Test Category description never accept space in front");
		}
		

		

		wait1.until(ExpectedConditions.visibilityOf(ElementTestCategory.testCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementTestCategory.testCategoryAction));	
	
		*/
	}
	
	


	public static void methodCategory(String methodCategory,String description) throws InterruptedException, IOException {

		/*FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String methodCategoryScreenshot = properties.getProperty("methodCategory");
		
		String methodCategoryMaster = properties.getProperty("methodCategoryMaster");

*/
		PageFactory.initElements(driver, ElementMethodCategory.class);

		ElementMethodCategory.masterIcon.click();
		
		ElementMethodCategory.testManagementIcon.click();
	
		ElementMethodCategory.methodCategoryIcon.click();
		
		Thread.sleep(500);

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementMethodCategory.methodCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethodCategory.methodCategoryAction));		
		
		try {
			ElementMethodCategory.methodCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementMethodCategory.methodCategoryAction.click();

		}

		
		wait1.until(ExpectedConditions.visibilityOf(ElementMethodCategory.methodCategoryAdd));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethodCategory.methodCategoryAdd));		
	
		ElementMethodCategory.methodCategoryAdd.click();


		for(int i=0; i<5; i++)
		{
			if(ElementMethodCategory.methodCategoryAddSubmit.isDisplayed())
			{
				
				
				break;
			}
			else
			{
				BrowserOperation.refreshLoginAdmin();
				
				PageFactory.initElements(driver, ElementMethodCategory.class);

				ElementMethodCategory.masterIcon.click();

				ElementMethodCategory.testManagementIcon.click();

				ElementMethodCategory.methodCategoryIcon.click();
				
				Thread.sleep(500);

				WebDriverWait wait11= new WebDriverWait(driver,100);
				
				wait11.until(ExpectedConditions.visibilityOf(ElementMethodCategory.methodCategoryAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementMethodCategory.methodCategoryAction));		
				
				try {
					ElementMethodCategory.methodCategoryAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementMethodCategory.methodCategoryAction.click();

				}

				
				wait11.until(ExpectedConditions.visibilityOf(ElementMethodCategory.methodCategoryAdd));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementMethodCategory.methodCategoryAdd));		
			
				ElementMethodCategory.methodCategoryAdd.click();

			}
			
			
			
		}
		
	


		ElementMethodCategory.methodCategory.sendKeys(methodCategory);

		ElementMethodCategory.methodCategoryDescription.sendKeys(description);

		

		ElementMethodCategory.methodCategoryAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementMethodCategory.methodCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethodCategory.methodCategoryAction));	
		
		ElementMethodCategory.testManagementIcon.click();
		
		ElementMethodCategory.masterIcon.click();
/*
		BasicOperation.screenshot(methodCategoryScreenshot);
		
		BasicOperation.screenshot(methodCategoryMaster);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementMethodCategory.methodCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethodCategory.methodCategoryAction));		
		
		List<WebElement> sectionList=ElementMethodCategory.methodCategoryList;
		
		List<WebElement> sectionDescriptionList=ElementMethodCategory.methodCategoryDescriptionList;
		
		
		
		String lasSection=sectionList.get(0).getText();
		
		String lastSectionDescription=sectionDescriptionList.get(0).getText();
		
		testCase=report.createTest("Check weather Method Category name accept space in front or not");
		
		if(lasSection.equals(methodCategory))
		{
			testCase.log(Status.FAIL, "Method Category name accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, "Method Category name never accept space in front");
		}
		
		
		
		testCase=report.createTest("Check weather Method Category desciption accept space in front or not");
		
		
		
		if(lastSectionDescription.equals(description))
		{
			testCase.log(Status.FAIL, "Method Category description accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, "Method Category description never accept space in front");
		}


		
		wait1.until(ExpectedConditions.visibilityOf(ElementMethodCategory.methodCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethodCategory.methodCategoryAction));		
	
		*/
	}
	
	


	public static void method(String methodCategory, String method,String description) throws InterruptedException, IOException {

	/*	FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String methodScreenshot = properties.getProperty("method");

		String methodMaster = properties.getProperty("methodMaster");

	*/	PageFactory.initElements(driver, ElementMethod.class);
	
	ElementMethod.masterIcon.click();
	
	ElementMethod.testManagementIcon.click();

		ElementMethod.methodIcon.click();
		
		Thread.sleep(500);

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementMethod.methodAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethod.methodAction));		
		
		try {
			ElementMethod.methodAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementMethod.methodAction.click();

		}

		
		wait1.until(ExpectedConditions.visibilityOf(ElementMethod.methodAdd));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethod.methodAdd));		
	
		ElementMethod.methodAdd.click();


		for(int i=0; i<5; i++)
		{
			if(ElementMethod.methodAddSubmit.isDisplayed())
			{
				
				
				break;
			}
			else
			{
				BrowserOperation.refreshLoginAdmin();
				
				PageFactory.initElements(driver, ElementMethod.class);

				ElementMethod.masterIcon.click();

				ElementMethod.testManagementIcon.click();

				ElementMethod.methodIcon.click();
				
				Thread.sleep(500);

				WebDriverWait wait11= new WebDriverWait(driver,100);
				
				wait11.until(ExpectedConditions.visibilityOf(ElementMethod.methodAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementMethod.methodAction));		
				
				try {
					ElementMethod.methodAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementMethod.methodAction.click();

				}

				
				wait11.until(ExpectedConditions.visibilityOf(ElementMethod.methodAdd));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementMethod.methodAdd));		
			
				ElementMethod.methodAdd.click();

			}
			
			
			
		}


		WebElement methodCateogoryElement=ElementMethod.methodCategory;
		
		Select methodCateogorySelect=new Select(methodCateogoryElement);
		
		methodCateogorySelect.selectByVisibleText(methodCategory);
		ElementMethod.method.sendKeys(method);

		ElementMethod.methodDescription.sendKeys(description);

		

		ElementMethod.methodAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementMethod.methodAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethod.methodAction));
		
		ElementMethod.testManagementIcon.click();
		
		ElementMethod.masterIcon.click();
/*
		BasicOperation.screenshot(methodScreenshot);
		
		BasicOperation.screenshot(methodMaster);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementMethod.methodAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethod.methodAction));		
		
List<WebElement> sectionList=ElementMethod.methodList;
		
		List<WebElement> sectionDescriptionList=ElementMethod.methodDescriptionList;
		
		
		
		String lasSection=sectionList.get(0).getText();
		
		String lastSectionDescription=sectionDescriptionList.get(0).getText();
		
		testCase=report.createTest("Check weather Method name accept space in front or not");
		
		if(lasSection.equals(method))
		{
			testCase.log(Status.FAIL, "Method name accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, "Method name never accept space in front");
		}
		
		
		
		testCase=report.createTest("Check weather Method desciption accept space in front or not");
		
		
		
		if(lastSectionDescription.equals(description))
		{
			testCase.log(Status.FAIL, "Method description accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, "Method description never accept space in front");
		}
		


		wait1.until(ExpectedConditions.visibilityOf(ElementMethod.methodAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementMethod.methodAction));		
		
	*/
		
	}
	
	

	


	public static void QB(String QBCategory, String QB) throws InterruptedException, IOException {

		/*FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String QBScreenshot = properties.getProperty("QB");
		
		String QBMaster = properties.getProperty("QBMaster");

*/
		PageFactory.initElements(driver, ElementQB.class);
		

		//ElementQB.checkListManagementIcon.click();

		ElementQB.masterIcon.click();
		

		ElementQB.checkListManagementIcon.click();

	//	ElementQB.masterIcon.click();


	

		ElementQB.QBIcon.click();
		
		Thread.sleep(500);

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));		
		
		try {
			ElementQB.QBAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementQB.QBAction.click();

		}

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAdd));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAdd));		
	
		ElementQB.QBAdd.click();


		for(int i=0; i<5; i++)
		{
			if(ElementQB.QBAddSubmit.isDisplayed())
			{
				
				
				break;
			}
			else
			{
				BrowserOperation.refreshLoginAdmin();
				
				PageFactory.initElements(driver, ElementQB.class);

				ElementQB.masterIcon.click();

				ElementQB.checkListManagementIcon.click();

				ElementQB.QBIcon.click();
				
				Thread.sleep(500);

				WebDriverWait wait11= new WebDriverWait(driver,100);
				
				wait11.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));		
				
				try {
					ElementQB.QBAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementQB.QBAction.click();

				}

				
				wait11.until(ExpectedConditions.visibilityOf(ElementQB.QBAdd));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAdd));		
			
				ElementQB.QBAdd.click();

			}
			
			
			
		}
		

		WebElement QBQBCategory =ElementQB.QBQBCategory;
		
		Select QBQBCategorySelect=new Select(QBQBCategory);
	
		QBQBCategorySelect.selectByVisibleText(QBCategory);
		

		ElementQB.QB.sendKeys(QB);
		

		WebElement QBComponentElement =ElementQB.QBComponent;
		
		Select QBComponentElementSelect=new Select(QBComponentElement);
	
		QBComponentElementSelect.selectByVisibleText("TextInput");
		


		ElementQB.QBAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));		
		
		
		ElementQB.checkListManagementIcon.click();
		
		ElementQB.masterIcon.click();
		
		
		
		

	/*	BasicOperation.screenshot(QBScreenshot);
		
		BasicOperation.screenshot(QBMaster);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));
		

		
		List<WebElement> sectionList=ElementQB.QBList;
		
		
		
		String lasSection=sectionList.get(0).getText();
		
		
		testCase=report.createTest("Check weather Checklist  name accept space in front or not");
		
		if(lasSection.equals(QB))
		{
			testCase.log(Status.FAIL, " QB accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, " QB never accept space in front");
		}
		
		
		
		
		
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));
	*/
		
	}
	


	public static void checkList(String checkList,String description, String QBCategory) throws InterruptedException, IOException {

	/*	FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String checkListScreenshot = properties.getProperty("checklist");
		
		String checkListMaster = properties.getProperty("checklistMaster");

*/
		PageFactory.initElements(driver, ElementCheckList.class);
		
		ElementCheckList.masterIcon.click();
		
		ElementCheckList.checkListManagementIcon.click();

	
		ElementCheckList.checklistIcon.click();
		
		Thread.sleep(500);

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAction));		
		
		try {
			ElementCheckList.checkListAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementCheckList.checkListAction.click();

		}

		
		wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAdd));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAdd));		
	
		ElementCheckList.checkListAdd.click();


		for(int i=0; i<5; i++)
		{
			if(ElementCheckList.checkListAddSubmit.isDisplayed())
			{
				
				
				break;
			}
			else
			{
				BrowserOperation.refreshLoginAdmin();
				
				PageFactory.initElements(driver, ElementCheckList.class);

				ElementCheckList.masterIcon.click();

				ElementCheckList.checkListManagementIcon.click();

				ElementCheckList.checklistIcon.click();
				
				Thread.sleep(500);

				WebDriverWait wait11= new WebDriverWait(driver,100);
				
				wait11.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAction));		
				
				try {
					ElementCheckList.checkListAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementCheckList.checkListAction.click();

				}

				
				wait11.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAdd));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAdd));		
			
				ElementCheckList.checkListAdd.click();

			}
			
			
			
		}
		
		
	


		ElementCheckList.checkList.sendKeys(checkList);

		ElementCheckList.checkListDesciption.sendKeys(description);

		

		ElementCheckList.checkListAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAction));	
		
		
		ElementCheckList.checkListQBIcon.click();
		

		wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListQBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListQBAction));	
		
		
		try {
			ElementCheckList.checkListQBAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementCheckList.checkListQBAction.click();

		}
			
		ElementCheckList.checkListQBAdd.click();
		
		WebElement QBCategoryElement=ElementCheckList.checkListQBCategory;
		
		
		Select QBCategoryElementSelct=new Select(QBCategoryElement);
		
		QBCategoryElementSelct.selectByVisibleText(QBCategory);
		
		
		ElementCheckList.checkListSelectQB.click();
		
		
		ElementCheckList.checkListQBSelectAll.click();
		
		ElementCheckList.checkListQBAddSubmit.click();
		
		
		

		wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListQBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListQBAction));		
	
		
		ElementCheckList.checkListCheckListIcon.click();
		
		
		
	wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAction));		
	
	
		
		try {
			ElementCheckList.checkListAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementCheckList.checkListAction.click();

		}
			
		ElementCheckList.checkListApproveVersion.click();
		
		
		
	wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAction));		
	
		ElementCheckList.checkListManagementIcon.click();
		
		ElementCheckList.masterIcon.click();
		
		
		
		
		
/*
		BasicOperation.screenshot(checkListScreenshot);
		
		BasicOperation.screenshot(checkListMaster);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAction));		
		

		
		List<WebElement> sectionList=ElementCheckList.checkListList;
		
		List<WebElement> sectionDescriptionList=ElementCheckList.checkListDescriptionList;
		
		
		
		String lasSection=sectionList.get(0).getText();
		
		String lastSectionDescription=sectionDescriptionList.get(0).getText();
		
		testCase=report.createTest("Check weather Checklist  name accept space in front or not");
		
		if(lasSection.equals(checkList))
		{
			testCase.log(Status.FAIL, " Checklist  name accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, " Checklist name never accept space in front");
		}
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCheckList.checkListAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCheckList.checkListAction));		
		

		*/
	
		
	}
	
	
	


	public static void QBCategory(String QBCategory, String description) throws InterruptedException, IOException {
/*
		FileInputStream s = new FileInputStream("Properties//spaceInFront.properties");

		Properties properties = new Properties();

		properties.load(s);

		String QBCategoryScreenshot = properties.getProperty("QBCategory");
		
		String QBCategoryMaster = properties.getProperty("QBCategoryMaster");


		*/PageFactory.initElements(driver, ElementQBCategory.class);

		ElementQBCategory.masterIcon.click();
		
		ElementQBCategory.checkListManagementIcon.click();
		
		
		ElementQBCategory.QBCategoryIcon.click();
		
		Thread.sleep(500);

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementQBCategory.QBCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQBCategory.QBCategoryAction));		
		
		try {
			ElementQBCategory.QBCategoryAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementQBCategory.QBCategoryAction.click();

		}

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQBCategory.QBCategoryAdd));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQBCategory.QBCategoryAdd));		
	
		ElementQBCategory.QBCategoryAdd.click();


		for(int i=0; i<5; i++)
		{
			if(ElementQBCategory.QBCategoryAddSubmit.isDisplayed())
			{
				
				
				break;
			}
			else
			{
				BrowserOperation.refreshLoginAdmin();
				
				PageFactory.initElements(driver, ElementQBCategory.class);

				ElementQBCategory.masterIcon.click();

				ElementQBCategory.checkListManagementIcon.click();

				ElementQBCategory.QBCategoryIcon.click();
				
				Thread.sleep(500);

				WebDriverWait wait11= new WebDriverWait(driver,100);
				
				wait11.until(ExpectedConditions.visibilityOf(ElementQBCategory.QBCategoryAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementQBCategory.QBCategoryAction));		
				
				try {
					ElementQBCategory.QBCategoryAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementQBCategory.QBCategoryAction.click();

				}

				
				wait11.until(ExpectedConditions.visibilityOf(ElementQBCategory.QBCategoryAdd));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementQBCategory.QBCategoryAdd));		
			
				ElementQBCategory.QBCategoryAdd.click();

			}
			
			
			
		}
		

		ElementQBCategory.QBCategory.sendKeys(QBCategory);
		

		ElementQBCategory.QBCategoryDescription.sendKeys(description);


		ElementQBCategory.QBCategoryAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQBCategory.QBCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQBCategory.QBCategoryAction));		
/*
		BasicOperation.screenshot(QBCategoryScreenshot);
		
		BasicOperation.screenshot(QBCategoryMaster);
		

		wait1.until(ExpectedConditions.visibilityOf(ElementQBCategory.QBCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQBCategory.QBCategoryAction));		
		

		
		List<WebElement> sectionList=ElementQBCategory.QBCategoryList;
		
		List<WebElement> sectionDescriptionList=ElementQBCategory.QBCategoryDescriptionList;
		
		
		
		String lasSection=sectionList.get(0).getText();
		
		String lastSectionDescription=sectionDescriptionList.get(0).getText();
		
		testCase=report.createTest("Check weather QBCategory  name accept space in front or not");
		
		if(lasSection.equals(QBCategory))
		{
			testCase.log(Status.FAIL, " QBCategory  name accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, " QBCategory name never accept space in front");
		}
		
		
		
		testCase=report.createTest("Check weather  QBCategory desciption accept space in front or not");
		
		
		
		if(lastSectionDescription.equals(description))
		{
			testCase.log(Status.FAIL, " QBCategory description accept space in front");
		}
		else
		{
			testCase.log(Status.PASS, " QBCategory description never accept space in front");
			


		}
		

*/
		wait1.until(ExpectedConditions.visibilityOf(ElementQBCategory.QBCategoryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQBCategory.QBCategoryAction));
		
		ElementQBCategory.checkListManagementIcon.click();
		
		ElementQBCategory.masterIcon.click();
		
	
		
	}
	
	
	public static void test(String testCategory,String unit,String test, String section, String method, String instrumentCategory, String parameterType, String checklist, String price, String parameter, String roundingDigits) throws InterruptedException, IOException
	{
		PageFactory.initElements(driver, ElementTestMaster.class);

		ElementTestMaster.masterIcon.click();
		
		ElementTestMaster.testManagementIcon.click();
		
		
		ElementTestMaster.testIcon.click();
		
		WebElement testCategoryFilter = ElementTestMaster.testFilterTestCategory;

		Select testCategoryFilterSelect = new Select(testCategoryFilter);

		testCategoryFilterSelect.selectByVisibleText(testCategory);
		
		ElementTestMaster.testFilterFindTest.click();

		
		Thread.sleep(500);

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementTestMaster.testTestAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testTestAction));		
		
		try {
			ElementTestMaster.testTestAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTestMaster.testTestAction.click();

		}

		
		wait1.until(ExpectedConditions.visibilityOf(ElementTestMaster.testAdd));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testAdd));		
	
		ElementTestMaster.testAdd.click();


		for(int i=0; i<5; i++)
		{
			if(ElementTestMaster.testAddSubmit.isDisplayed())
			{
				
				
				break;
			}
			else
			{
				BrowserOperation.refreshLoginAdmin();
				
				PageFactory.initElements(driver, ElementTestMaster.class);

				ElementTestMaster.masterIcon.click();
				
				ElementTestMaster.testManagementIcon.click();
				
				
				ElementTestMaster.testIcon.click();
				
				WebElement testCategoryFilter1 = ElementTestMaster.testFilterTestCategory;

				Select testCategoryFilterSelect1 = new Select(testCategoryFilter1);

				testCategoryFilterSelect1.selectByVisibleText(testCategory);

				
				Thread.sleep(500);

				WebDriverWait wait11= new WebDriverWait(driver,100);
				
				wait11.until(ExpectedConditions.visibilityOf(ElementTestMaster.testTestAction));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testTestAction));		
				
				try {
					ElementTestMaster.testTestAction.click();
				} catch (Exception e) {
					Thread.sleep(2000);

					ElementTestMaster.testTestAction.click();

				}

				
				wait11.until(ExpectedConditions.visibilityOf(ElementTestMaster.testAdd));
				
				wait11.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testAdd));		
			
				ElementTestMaster.testAdd.click();

			}
			
			
			


			WebElement testCategoryElement = ElementTestMaster.testCategory;

			Select testCategoryElementSelect = new Select(testCategoryElement);

			testCategoryElementSelect.selectByVisibleText(testCategory);
			

			
		
		PageFactory.initElements(driver, ElementTestMaster.class);

		ElementTestMaster.masterIcon.click();
		
		ElementTestMaster.testManagementIcon.click();
		
		
		ElementTestMaster.testIcon.click();
		
		WebElement testCategoryFilter1 = ElementTestMaster.testFilterTestCategory;

		Select testCategoryFilterSelect1 = new Select(testCategoryFilter1);

		testCategoryFilterSelect1.selectByVisibleText(testCategory);
		ElementTestMaster.testFilterFindTest.click();
		
		Thread.sleep(500);

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestMaster.testTestAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testTestAction));		
		
		try {
			ElementTestMaster.testTestAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTestMaster.testTestAction.click();

		}

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestMaster.testAdd));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testAdd));		
	
		ElementTestMaster.testAdd.click();
		
			ElementTestMaster.test.sendKeys(test);

			ElementTestMaster.testAbbreviation.clear();

			ElementTestMaster.testAbbreviation.sendKeys(test);

			ElementTestMaster.testProcedure.sendKeys(test);

			ElementTestMaster.testPrice.sendKeys(price);

			WebElement testSection = ElementTestMaster.testSection;

			Select testSectionSelect = new Select(testSection);

			testSectionSelect.selectByVisibleText(section);

			WebElement testMethod = ElementTestMaster.testMethod;

			Select testMethodSelect = new Select(testMethod);

			testMethodSelect.selectByVisibleText(method);

			WebElement testInstrumentCategory = ElementTestMaster.testInstrument;

			Select testInstrumentSelect = new Select(testInstrumentCategory);

			testInstrumentSelect.selectByVisibleText(instrumentCategory);
			
			ElementTestMaster.testParameter.clear();

			ElementTestMaster.testParameter.sendKeys(parameter);
			
			ElementTestMaster.testParameterAbbreviation.clear();

			ElementTestMaster.testParameterAbbreviation.sendKeys(parameter);

			WebElement parameterTypeElement = ElementTestMaster.testParameterType;

			Select parameterTypeSelect = new Select(parameterTypeElement);

			parameterTypeSelect.selectByVisibleText(parameterType);

			ElementTestMaster.testRoundingDigits.sendKeys("4");

			WebElement parameterUnit = ElementTestMaster.testUnit;

			Select parameterUnitSelect = new Select(parameterUnit);

			parameterUnitSelect.selectByVisibleText(unit);

			WebElement accredited = ElementTestMaster.testAccredited;

			WebElement active = ElementTestMaster.testActive;

			if (accredited.isSelected() == false) {
				accredited.click();
			}

			if (active.isSelected() == false) {
				active.click();
			}

			ElementTestMaster.testAddSubmit.click();
			
			
			

			WebDriverWait wait111= new WebDriverWait(driver,100);
			
			wait111.until(ExpectedConditions.visibilityOf(ElementTestMaster.testTestAction));
			
			wait111.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testTestAction));		
			
			ElementTestMaster.testManagementIcon.click();
			
			ElementTestMaster.masterIcon.click();
		
		}
		
		}
	
	
	public static void test (String testCategory,String unit,String test, String section, String method, String instrumentCategory, String parameterType, String checklist, String price, String parameter, String roundingDigits, String checkList) throws InterruptedException, IOException

	{
		PageFactory.initElements(driver, ElementTestMaster.class);

		ElementTestMaster.masterIcon.click();
		
		ElementTestMaster.testManagementIcon.click();
		
		
		ElementTestMaster.testIcon.click();
		
		WebElement testCategoryFilter1 = ElementTestMaster.testFilterTestCategory;

		Select testCategoryFilterSelect1 = new Select(testCategoryFilter1);

		testCategoryFilterSelect1.selectByVisibleText(testCategory);
		ElementTestMaster.testFilterFindTest.click();
		
		Thread.sleep(500);

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestMaster.testTestAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testTestAction));		
		
		try {
			ElementTestMaster.testTestAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTestMaster.testTestAction.click();

		}

		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestMaster.testAdd));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testAdd));		
	
		ElementTestMaster.testAdd.click();
		
			ElementTestMaster.test.sendKeys(test);

			ElementTestMaster.testAbbreviation.clear();

			ElementTestMaster.testAbbreviation.sendKeys(test);

			ElementTestMaster.testProcedure.sendKeys(test);

			ElementTestMaster.testPrice.sendKeys(price);
			
			WebElement testFilterCheckList = ElementTestMaster.instrumentAddSubmit;

			Select testFilterCheckListSelect = new Select(testFilterCheckList);

			testFilterCheckListSelect.selectByVisibleText(checkList);

			WebElement testSection = ElementTestMaster.testSection;

			Select testSectionSelect = new Select(testSection);

			testSectionSelect.selectByVisibleText(section);

			WebElement testMethod = ElementTestMaster.testMethod;

			Select testMethodSelect = new Select(testMethod);

			testMethodSelect.selectByVisibleText(method);

			WebElement testInstrumentCategory = ElementTestMaster.testInstrument;

			Select testInstrumentSelect = new Select(testInstrumentCategory);

			testInstrumentSelect.selectByVisibleText(instrumentCategory);
			
			ElementTestMaster.testParameter.clear();

			ElementTestMaster.testParameter.sendKeys(parameter);
			
			ElementTestMaster.testParameterAbbreviation.clear();

			ElementTestMaster.testParameterAbbreviation.sendKeys(parameter);

			WebElement parameterTypeElement = ElementTestMaster.testParameterType;

			Select parameterTypeSelect = new Select(parameterTypeElement);

			parameterTypeSelect.selectByVisibleText(parameterType);

			ElementTestMaster.testRoundingDigits.sendKeys("4");

			WebElement parameterUnit = ElementTestMaster.testUnit;

			Select parameterUnitSelect = new Select(parameterUnit);

			parameterUnitSelect.selectByVisibleText(unit);
/*
			WebElement accredited = ElementTestMaster.Accredited;

			WebElement active = ElementTestMaster.Active;

			if (accredited.isSelected() == false) {
				accredited.click();
			}

			if (active.isSelected() == false) {
				active.click();
			}

			ElementTestMaster.Submit.click();*/
			
			
			

			WebDriverWait wait111= new WebDriverWait(driver,100);
			
			wait111.until(ExpectedConditions.visibilityOf(ElementTestMaster.testTestAction));
			
			wait111.until(ExpectedConditions.elementToBeClickable(ElementTestMaster.testTestAction));		
			
			ElementTestMaster.testManagementIcon.click();
			
			ElementTestMaster.masterIcon.click();
		
			
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	public static void testGroup(String registrationCategory, String category,String templateMasterName, String specName, String fieldValue, String testCategory) throws InterruptedException
	{

		PageFactory.initElements(driver, ElementTestGroup.class);

		ElementTestGroup.masterIcon.click();
		
		ElementTestGroup.testGroupManagementIcon.click();
		
		ElementTestGroup.testGroupIcon.click();
		
		WebElement templateMasterFilterSampleType = ElementTestGroup.testGroupFilterSampleType;

		Select templateMasterFilterSampleTypeSelect = new Select(templateMasterFilterSampleType);

		templateMasterFilterSampleTypeSelect.selectByVisibleText(registrationCategory);
		
		
		WebElement templateMasterlFilterSampleName = ElementTestGroup.testGroupFilterSampleCategory;

		Select templateMasterlFilterSampleNameSelect = new Select(templateMasterlFilterSampleName);

		templateMasterlFilterSampleNameSelect.selectByVisibleText(category);
		
/*
		WebElement testGroupFilterTemplateVersion = ElementTestGroup.testGroupFilterTemplateVersion;

		Select testGroupFilterTemplateVersionSelect = new Select(testGroupFilterTemplateVersion);

		testGroupFilterTemplateVersionSelect.selectByVisibleText(templateMasterName);
*/	
		ElementTestGroup.testGroupFilterFind.click();
		
		WebDriverWait wait11= new WebDriverWait(driver,10);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestGroup.testGroupSpecificationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestGroup.testGroupSpecificationAction));		
	
		
		
	//	BasicOperation.exceptio(ElementTestGroup.testGroupSpecificationAction);
		
		
		
		ElementTestGroup.testGroupSpecificationAdd.click();
		
		ElementTestGroup.testGroupSpecificationFirstValue.sendKeys("1");
		
		ElementTestGroup.testGroupSpecification.sendKeys(specName);
		
		
		Select a=new Select(ElementTestGroup.testGroupSpecificationProjectID);
		
		a.selectByVisibleText("NA");
		
		
		
			
		/*
		if(ElementTestGroup.testGroupSpecificationComponent.isSelected()==false)
		{
			ElementTestGroup.testGroupSpecificationComponent.click();
		}*/
		
		ElementTestGroup.testGroupSpecificationAddSubmit.click();
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestGroup.testGroupSpecificationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestGroup.testGroupSpecificationAction));		
	
		
		
		ElementTestGroup.testGroupTestDetailsIcon.click();
		
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestGroup.testGroupTestDetailTestAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestGroup.testGroupTestDetailTestAction));		
	
		
		
		try {
			ElementTestGroup.testGroupTestDetailTestAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTestGroup.testGroupTestDetailTestAction.click();

		}
		
		
		ElementTestGroup.testGroupTestDetailTestAdd.click();
		

		
		WebElement testGroupTestDetailTestTestCategory = ElementTestGroup.testGroupTestDetailTestTestCategory;;

		Select testGroupTestDetailTestTestCategorySelect = new Select(testGroupTestDetailTestTestCategory);

		testGroupTestDetailTestTestCategorySelect.selectByVisibleText(testCategory);
		
		
		
		
		
		ElementTestGroup.testGroupTestDetailTestFind.click();
		
		
		

		ElementTestGroup.testGroupTestDetailTestTestSelectAll.click();
		
		ElementTestGroup.testGroupTestDetailTestAddSubmit.click();
		
		ElementTestGroup.testGroupTestDetailTestTestBack.click();
		

		try {
			ElementTestGroup.testGroupSpecificationAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementTestGroup.testGroupSpecificationAction.click();

		}
		
		
		
		
		
		ElementTestGroup.testGroupSpecificationComplete.click();
		

		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementTestGroup.testGroupSpecificationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementTestGroup.testGroupSpecificationAction));		
	

		ElementTestGroup.testGroupFilterIcon.click();
		
		ElementTestGroup.testGroupManagementIcon.click();
		
		ElementTestGroup.masterIcon.click();
		
		
		
	}
	
	
	public static void userRoleTemplateTestGroup(String approvalType, String templateName, String firstUserRole, String secondUserRole) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRoleTemplate.class);
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
		

		WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

		Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

		userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText(approvalType);
		
		
		ElementUserRoleTemplate.userRoleTemplateFilterFind.click();
		
		


		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	

		try {
			ElementUserRoleTemplate.userRoleTemplateAction.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUserRoleTemplate.userRoleTemplateAction.click();

		}
		
		ElementUserRoleTemplate.userRoleTemplateCreateVersion.click();
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys(approvalType);
		
		
		WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

		Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

		userRoleTemplateFirstRoleSelect.selectByVisibleText(firstUserRole);
		
		/*
		WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

		Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

		userRoleTemplateSecondRoleSelect.selectByVisibleText(secondUserRole);
		
	*/	ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();
	

		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
		
		
	
		
	}
	
	
	
	
	public static void approvalConfigurationTestGroupAuto(String approvalType ) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementApprovalConfiguration.masterIcon.click();
		
		ElementApprovalConfiguration.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		WebElement approvalConfigurationFilterApprovalType = ElementApprovalConfiguration.approvalConfigurationFilterApprovalType;

		Select approvalConfigurationFilterApprovalTypeSelect = new Select(approvalConfigurationFilterApprovalType);

		approvalConfigurationFilterApprovalTypeSelect.selectByVisibleText(approvalType);
		
		
		ElementApprovalConfiguration.approvalConfigurationFilterFind.click();
		
	
		

		WebDriverWait wait11= new WebDriverWait(driver,100);
		
		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));		
		
		List<WebElement> list=ElementApprovalConfiguration.approvalConfigurationList;
		
		int i=list.size();
		
		int j=i+1;
		
		
		String ii=""+j;
		
		String correction="ID_APC_Correction_"+ii;
		
		String Esign="ID_APC_Esign_"+ii;
		
String approvalStatus="ID_APC_ApprovalStatus_"+ii;
		
		String filterStatusOne="//*[@id='ID_APC_OpenFilterPopUP_";
		
		String filterStatusTwo=ii+"";
		
		String filterStatusThree="']/button";
		
		String filterStatusFind=filterStatusOne+filterStatusTwo+filterStatusThree;
		
		String filterCloseOne="//*[@id='ID_APC_FilterPopUp_";
		
		String filterCloseTwo=""+ii;
		
		String filterCloseThree="']/span/div/span/i";
		
	String filterClose=filterCloseOne+filterCloseTwo+filterCloseThree;
	
	
	String validationStatusOne="//*[@id='ID_APC_OpenValidPopUP_";
	
	String validationStatusTwo=ii+"";
	
	String validationStatusThree="']/button";
	
	String validationStatusFind=validationStatusOne+validationStatusTwo+validationStatusThree;
	
	String validationCloseOne="//*[@id='ID_APC_ValidPopUp_";
	
	String validationCloseTwo=""+ii;
	
	String validationCloseThree="']/span/div/span/i";
	
String validationClose=validationCloseOne+validationCloseTwo+validationCloseThree;

		
		

	

		try {
			ElementApprovalConfiguration.approvalConfigurationAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementApprovalConfiguration.approvalConfigurationAction.click();

		}
		
		
		
		ElementApprovalConfiguration.approvalConfigurationCreateVersion.click();
		
		ElementApprovalConfiguration.approvalConfiguration.sendKeys(approvalType);
		
		
		ElementApprovalConfiguration.approvalConfigurationAutoApproval.click();
		
		ElementApprovalConfiguration.approvalConfigurationUserRoleSave.click();
		
		Thread.sleep(2000);
		
		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationIcon.click();
		
		driver.findElement(By.id(correction)).click();
		
		
	//ElementApprovalConfiguration.approvalConfigurationTestGroupFirstUserRoleCorrection.click();
		
		//ElementApprovalConfiguration.approvalConfigurationTestGroupFirstUserRoleEsign.click();
		
		driver.findElement(By.id(Esign)).click();
		
	WebElement	approvalConfigurationTestGroupFirstApprovalStatus=driver.findElement(By.id(approvalStatus));
		
		Select approvalStatusElement=new Select(approvalConfigurationTestGroupFirstApprovalStatus);
		
		approvalStatusElement.selectByVisibleText("Approved");
		
		
		driver.findElement(By.xpath(filterStatusFind)).click();
		
		

		//ElementApprovalConfiguration.approvalConfigurationTestGroupFilterFind.click();
		
		ElementApprovalConfiguration.approvalConfigurationTestGroupFilterSelectAll.click();
		
		//ElementApprovalConfiguration.approvalConfigurationTestGroupFilterClose.click();
		
		driver.findElement(By.xpath(filterClose)).click();
		
	//	driver.findElement(By.xpath(validationStatusFind)).click();
		
	//	ElementApprovalConfiguration.approvalConfigurationTestGroupValidationStatusFind.click();
		
		//ElementApprovalConfiguration.approvalConfigurationTestGroupValidationSelectAll.click();
		
		//driver.findElement(By.id("selectall")).click();
		
		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddSubmit.click();
		
		Thread.sleep(2000);
		
		try {
		
		ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddCancel.click();
		}
		catch(Exception e)
		{
			Thread.sleep(5000);
			

			
			ElementApprovalConfiguration.approvalConfigurationRoleConfigurationAddCancel.click();
		}
		
			
		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));	
		
		ElementApprovalConfiguration.approvalConfigurationAction.click();
		
		ElementApprovalConfiguration.approvalConfigurationApprove.click();
		
		
		wait11.until(ExpectedConditions.visibilityOf(ElementApprovalConfiguration.approvalConfigurationAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementApprovalConfiguration.approvalConfigurationAction));	
	
		
		ElementApprovalConfiguration.configurationIcon.click();
		
		ElementApprovalConfiguration.masterIcon.click();
		
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
