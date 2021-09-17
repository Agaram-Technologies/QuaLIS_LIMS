package Organisation;

import java.awt.AWTException;

import java.awt.HeadlessException;
import java.io.IOException;

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
import Utility.BasicOperation;
import Utility.BrowserOperation;
import Utility.Functional;

import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageLab extends BrowserOperation// extends TestDataTestCoverageOrganisation

{/*
	
	public static void twoFieldTestCase() throws InterruptedException
	{
	TestCoverageLab.labAddAllField(TestDataHylands.lab());
	
	TestCoverageLab.labDeleteAllField(TestDataHylands.lab());		
	
	TestCoverageLab.labAddMandatoryField(TestDataHylands.lab());
	
	TestCoverageLab.labDeleteMandatoryField(TestDataHylands.lab());
	
	TestCoverageLab.labAddAllField(TestDataHylands.lab());
	
	TestCoverageLab.labEditName(TestDataHylands.lab());
	
	// Description value to value
	TestCoverageLab.labEditDescription(TestDataHylands.lab());
	
	// Description value to null
	TestCoverageLab.labEditDescriptionValueToNull(TestDataHylands.lab());
			
	// Description null to value
	TestCoverageLab.labEditDescriptionNullToValue(TestDataHylands.lab());
		
	
//	TestCoverageLab.labDeleteAll(TestDataHylands.lab());	
	}
	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementLab.class);
		
		 boolean screen=Function.preCondition( ElementLab.element());
		
		return screen;
	}
	

	public static void labAddAllField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionAdd.addAllField(value, ElementLab.element());
	}

	public static void labAddMandatoryField(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionAdd.addMandatoryField(value, ElementLab.element());
	}

	public static void labEditName(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionEdit.editName(value, ElementLab.element(), ElementLab.list());

	}

	public static void labEditDescription(HashMap<String, String> value) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		FunctionEdit.editDescription(value, ElementLab.element(), ElementLab.list());
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

	
	 * public static void main(String[] args) throws IOException,
	 * InterruptedException
	 * 
	 * {
	 * 
	 * LaunchCloseBrowser.launchLIMS();
	 * 
	 * 
	 * TestCoverageLab.labAdd(labNameAdd, labDescriptionAdd);
	 * 
	 * TestCoverageLab.labNameEdit(labNameAdd, labNameEdit);
	 * 
	 * TestCoverageLab.labDescriptionEdit(labNameEdit, labDescriptionEdit);
	 * 
	 * TestCoverageLab.labDelete(labNameEdit);
	 * 
	 * TestCoverageLab.labWithoutSelectEdit();
	 * 
	 * TestCoverageLab.labWithoutSelectDelete();
	 * 
	 * TestCoverageLab.labNameDuplicate();
	 * 
	 * TestCoverageLab.unitSwitchToOldTab();
	 * 
	 * // Lab.labDeleteValidation(labDeleteValidation, labUserLoginID,
	 * labUserFirstName, labUserLastName, labUserMail, labUserAddress,
	 * labDesignation, labCountry, labDepartment, labSection);
	 * 
	 * TestCoverageLab.unitSwitchToNewTabMultiUser(); }
	 * 
	 

	public static String unitSwitchToNewTabMultiUser() throws IOException {

		String l = driver.getWindowHandle();

		((JavascriptExecutor) driver).executeScript("window.open('about:blank', '-blank')");
		// To switch to the new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String old = tabs.get(0);
		return old;

	}

	// public static void lab

	public static void labWithoutMandatory() throws InterruptedException {
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
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labAdd.click();

		if (ElementLab.labNameField.isDisplayed()) {

			ElementLab.labAddSubmit.click();

			String d = ElementLab.labNameField.getAttribute("class");

			String dd = "form-control LB_LabMandatory LB_LabSubmitCss invalid";

			if (d.equals(dd)) {
				System.out.println("mandatory field working");
			}

			ElementLab.labAddCancel.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labList = ElementLab.labList;

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();
	}

	public static void labWithoutMandatoryWithSpace() throws InterruptedException {
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
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labAdd.click();

		if (ElementLab.labNameField.isDisplayed()) {

			ElementLab.labNameField.sendKeys("                 ");

			ElementLab.labAddSubmit.click();

			String d = ElementLab.labNameField.getAttribute("class");

			String dd = "form-control LB_LabMandatory LB_LabSubmitCss invalid";

			if (d.equals(dd)) {
				System.out.println("mandatory field working");
			}

			ElementLab.labAddCancel.click();

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labList = ElementLab.labList;

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();
	}

	public static void multiUserEdit() throws InterruptedException {
		
		 * PageFactory.initElements(driver, ElementLab.class);
		 * 
		 * ElementLab.masterIcon.click();
		 * 
		 * ElementLab.organisationManagementIcon.click();
		 * 
		 * ElementLab.labIcon.click();
		 * 
		 * WebDriverWait wait1= new WebDriverWait(driver,100);
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));
		 * 
		 * 
		 * 
		 * 
		 * List<WebElement> labList=ElementLab.labList;
		 * 
		 * List<WebElement> labCheckboxList=ElementLab.labCheckboxList;
		 * 
		 * 
		 * 
		 * for(WebElement labName:labList) { if(labName.getText().equals(lab)) { int
		 * i=labList.indexOf(labName);
		 * 
		 * String checkBoxStatus=labCheckboxList.get(i).getAttribute("checkboxselect");
		 * 
		 * System.out.println(checkBoxStatus);
		 * 
		 * if (checkBoxStatus.equals("1")==false) { labName.click(); }
		 * 
		 * 
		 * } }
		 

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}
		ElementLab.labEdit.click();

		WebElement alreadyDeleted = driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));

		WebElement alertClose = driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span"));

		if (alreadyDeleted.isDisplayed()) {
			System.out.println("Multi user edit working");

			alertClose.click();

		}

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}
		ElementLab.labRefresh.click();

	}

	public static void multiUserDeletet() throws InterruptedException {
		
		 * PageFactory.initElements(driver, ElementLab.class);
		 * 
		 * ElementLab.masterIcon.click();
		 * 
		 * ElementLab.organisationManagementIcon.click();
		 * 
		 * ElementLab.labIcon.click();
		 * 
		 * WebDriverWait wait1= new WebDriverWait(driver,100);
		 * 
		 * wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));
		 * 
		 * 
		 * 
		 * 
		 * List<WebElement> labList=ElementLab.labList;
		 * 
		 * List<WebElement> labCheckboxList=ElementLab.labCheckboxList;
		 * 
		 * 
		 * 
		 * for(WebElement labName:labList) { if(labName.getText().equals(lab)) { int
		 * i=labList.indexOf(labName);
		 * 
		 * String checkBoxStatus=labCheckboxList.get(i).getAttribute("checkboxselect");
		 * 
		 * System.out.println(checkBoxStatus);
		 * 
		 * if (checkBoxStatus.equals("1")==false) { labName.click(); }
		 * 
		 * 
		 * } }
		 
		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}
		ElementLab.labDelete.click();

		WebElement alreadyDeleted = driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));

		WebElement alertClose = driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span"));

		if (alreadyDeleted.isDisplayed()) {
			System.out.println("Multi user delete working");

			alertClose.click();

		}
		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

	}

	
	 * public static void unitSwitchToOldTab() throws IOException,
	 * InterruptedException { String old =
	 * MultiUserMethodUnit.unitSwitchToNewTabMultiUser();
	 * 
	 * driver.switchTo().window(old);
	 * 
	 * 
	 * 
	 * }
	 

	public static void labAdd(String labName, String labDescription)
			throws InterruptedException, IOException, HeadlessException, AWTException {

		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		BasicOperation.screenshot("Master.png");

		ElementLab.organisationManagementIcon.click();

		BasicOperation.screenshot("organisation.png");

		ElementLab.labIcon.click();

		BasicOperation.screenshot("Lab.png");

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		BasicOperation.screenshot("LabAction.png");

		ElementLab.labAdd.click();

		BasicOperation.screenshot("LabPopup.png");

		ElementLab.labNameField.sendKeys(labName);

		ElementLab.labDescription.sendKeys(labDescription);

		BasicOperation.screenshot("LabData.png");

		ElementLab.labAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		BasicOperation.screenshot("LabGrid.png");

		List<WebElement> labList = ElementLab.labList;

		String name = labList.get(0).getText();

		
		 * testCase=report.createTest("Check whether Lab Add is working or not");
		 * 
		 * testCase.log(Status.INFO, "Navigated to master by clicking the master icon");
		 * 
		 * testCase.log(Status.INFO,
		 * "Navigated to master by clicking the organisation icon");
		 * 
		 * testCase.log(Status.INFO, "Navigated to master by clicking the lab icon");
		 * 
		 * testCase.log(Status.INFO, "clicked thunder button in lab screen");
		 * 
		 * testCase.log(Status.INFO, "clicked add option");
		 * 
		 * testCase.log(Status.INFO, "Entered Lab name as "+ labName);
		 * 
		 * testCase.log(Status.INFO, "Entered Lab description as "+ labDescription);
		 * 
		 * testCase.log(Status.INFO, "Clicked the submit button");
		 * 
		 * testCase.log(Status.INFO, "Now lab added successfully");
		 

		if (labList.get(0).equals(labName)) {
			System.out.println("It accept more than 100 characters");
		} else {
			System.out.println("It not accept more than 100 characters");
		}

		
		 * if(name.equals(labName)) { testCase.log(Status.PASS, "Lab add working"); }
		 * else { testCase.log(Status.FAIL, "Lab add is not working"); }
		 * 
		 * String n="D.png";
		 * 
		 * BasicOperation.screenshot(n);
		 * 
		 * testCase.addScreenCaptureFromPath(n);
		 

		
		 * testCase.addScreenCaptureFromPath("Master.png");
		 * 
		 * testCase.addScreenCaptureFromPath("organisation.png");
		 * 
		 * testCase.addScreenCaptureFromPath("Lab.png");
		 * 
		 * testCase.addScreenCaptureFromPath("LabAction.png");
		 * 
		 * testCase.addScreenCaptureFromPath("LabPopup.png");
		 * 
		 * testCase.addScreenCaptureFromPath("LabData.png");
		 * 
		 * testCase.addScreenCaptureFromPath("LabGrid.png");
		 

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void labNameDuplicate() throws InterruptedException, IOException {

		// TestCoverageLab.labAdd(labNameDuplicate, labNameDuplicate);

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
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labAdd.click();

		// ElementLab.labNameField.sendKeys(labNameDuplicate);

		// ElementLab.labDescription.sendKeys(labDescription);

		ElementLab.labAddSubmit.click();

		WebElement alreadyExist = driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));

		WebElement alertClose = driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i"));

		if (alreadyExist.isDisplayed()) {
			System.out.println("Duplicate not allowed");

			try {

				alertClose.click();
				ElementLab.labAddCancel.click();

				System.out.println("Duplicate not accept");
			} catch (Exception e) {
				Thread.sleep(6000);
				ElementLab.labAddCancel.click();

				System.out.println("Duplicate accept");
			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void labNameEdit(String lab, String labNameEdit) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labList = ElementLab.labList;

		List<WebElement> labCheckboxList = ElementLab.labCheckboxList;

		for (WebElement labName : labList) {
			if (labName.getText().equals(lab)) {
				int i = labList.indexOf(labName);

				String checkBoxStatus = labCheckboxList.get(i).getAttribute("checkboxselect");

				System.out.println(checkBoxStatus);

				if (checkBoxStatus.equals("1") == false) {
					labName.click();
				}

			}
		}

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labEdit.click();

		try {
			ElementLab.labNameField.clear();

			ElementLab.labNameField.sendKeys(labNameEdit);
		} catch (Exception e) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			ElementLab.labNameField.sendKeys(labNameEdit);

		}

		
		 * ElementLab.labDescription.clear();
		 * 
		 * ElementLab.labDescription.sendKeys(descriptionEdit);
		 

		ElementLab.labEditSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		
		 * if(labList.get(0).getText().equals(labNameEdit)) { testCase.log(Status.PASS,
		 * "Lab Name Edit is working"); } else { testCase.log(Status.PASS,
		 * "Lab Name Edit is not working"); }
		 
		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void labDescriptionEdit(String labEdit, String labDescriptionEdit) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labListSelect = ElementLab.labList;

		List<WebElement> labCheckboxListSelect = ElementLab.labCheckboxList;

		for (WebElement labName : labListSelect) {
			if (labName.getText().equals(labEdit)) {
				int i = labListSelect.indexOf(labName);

				String checkBoxStatus = labCheckboxListSelect.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					labName.click();
				}

			}
		}

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labEdit.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (ElementLab.labNameField.isDisplayed()) {
			try {
				ElementLab.labDescription.clear();
			}

			catch (Exception e) {
				Thread.sleep(5000);

				ElementLab.labDescription.clear();

			}
		}

		ElementLab.labDescription.sendKeys(labDescriptionEdit);

		ElementLab.labEditSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void labDelete(String lab) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labListSelect = ElementLab.labList;

		List<WebElement> labCheckboxListSelect = ElementLab.labCheckboxList;

		for (WebElement labName : labListSelect) {
			if (labName.getText().equals(lab)) {
				int i = labListSelect.indexOf(labName);

				String checkBoxStatus = labCheckboxListSelect.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					labName.click();
				}

			}
		}

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labDelete.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	
	 * public static void labDeleteValidation(String labDeleteValidation, String
	 * loginID, String firstName, String lastName, String mail, String address,
	 * String designation, String country, String department,String section) throws
	 * InterruptedException, IOException { Lab.labAdd(labDeleteValidation,
	 * labDeleteValidation);
	 * 
	 * Designation.designationAddMandatory(designation);
	 * 
	 * country.countryAddMandatory(country);
	 * 
	 * Department.departmentAddMandatory(labDepartment);
	 * 
	 * Section.sectionAddMandatory(labSection);
	 * 
	 * User.userAddMandatory(loginID, firstName, lastName, mail, address,
	 * designation, country, department);
	 * 
	 * Organisation.organisationAddMandatory(department, section,
	 * labDeleteValidation);
	 * 
	 * 
	 * Lab.labDeleteValidationDelete(labDeleteValidation); }
	 * 
	 * 
	 

	public static void labDeleteValidationDelete(String lab) throws InterruptedException {
		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labListSelect = ElementLab.labList;

		List<WebElement> labCheckboxListSelect = ElementLab.labCheckboxList;

		for (WebElement labName : labListSelect) {
			if (labName.getText().equals(lab)) {
				int i = labListSelect.indexOf(labName);

				String checkBoxStatus = labCheckboxListSelect.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					labName.click();
				}

			}
		}

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labDelete.click();

		WebElement alert = driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));

		WebElement alertDeleteValidation = driver
				.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i"));

		if (alert.isDisplayed()) {
			alertDeleteValidation.click();

			String alertText = alertDeleteValidation.getText();

			String properAlert = "This Record is used in Organisation";

			if (alertText.equals(properAlert)) {

			}

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void labRefresh() throws InterruptedException {
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
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		try {

			driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

			ElementLab.labRefresh.click();

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		} catch (Exception e) {

			// TODO: handle exception
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void labSearch(String lab) throws InterruptedException {

		
		 * ElementLab.labSearchIcon.click();
		 * 
		 * if(ElementLab.labSearchField.isDisplayed()) {
		 * 
		 * ElementLab.labSearchField.sendKeys(lab);
		 * //System.out.println("search icon working properly"); }
		 * 
		 * 
		 * ElementLab.labSearchCloseIcon.click();
		 * 
		 * if(ElementLab.labSearchField.isDisplayed()==false) {
		 * System.out.println("search close icon working properly"); } else {
		 * System.out.println("not working close"); }
		 
		String labOne = "First Lab";

		String labTwo = "Second Lab";
		
		 * TestCoverage.labAdd(labTwo, "1");
		 * 
		 * TestCoverage.labAdd(labOne, "1");
		 

		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labListSelect = ElementLab.labList;

		ElementLab.labSearchIcon.click();

		ElementLab.labSearchField.sendKeys(labOne);

		WebElement two = labListSelect.get(1);

		System.out.println(two.getText());

		if (two.isDisplayed() == false) {
			System.out.println("search working");

		} else {
			System.out.println("Search Not Working");
		}

		ElementLab.labSearchCloseIcon.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			ElementLab.labSearchField.sendKeys("dd");
		} catch (Exception e) {
			System.out.println("search close working fine");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ElementLab.labSearchIcon.click();

		ElementLab.labSearchField.sendKeys(labOne);
		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labRefresh.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		try {
			ElementLab.labSearchField.click();
		} catch (Exception e) {
			System.out.println("search close working fine");
		}

	}

	// TestCoverage.

	public static void labWithoutSelectEdit() throws InterruptedException {
		// PageFactory.initElements(driver, ElementLab.class);

		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		// List<WebElement> labList=ElementLab.labList;

		List<WebElement> labList = ElementLab.labCheckboxList;

		for (WebElement l : labList) {
			String status = l.getAttribute("checkboxselect");

			if (status.equals("1")) {
				l.click();
			}
		}

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labEdit.click();

		WebElement alreadyExist = driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));

		WebElement alertClose = driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i"));

		if (alreadyExist.isDisplayed()) {
			System.out.println("done");

			alertClose.click();

		} else {
			System.out.println("fail");
		}

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void labWithoutSelectDelete() throws InterruptedException {
		// PageFactory.initElements(driver, ElementLab.class);

		PageFactory.initElements(driver, ElementLab.class);

		ElementLab.masterIcon.click();

		ElementLab.organisationManagementIcon.click();

		ElementLab.labIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		List<WebElement> labList = ElementLab.labCheckboxList;

		for (WebElement l : labList) {
			String status = l.getAttribute("checkboxselect");

			if (status.equals("1")) {
				l.click();
			}
		}

		try {
			ElementLab.labAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementLab.labAction.click();

		}

		ElementLab.labDelete.click();

		WebElement alreadyExist = driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));

		WebElement alertClose = driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i"));

		if (alreadyExist.isDisplayed()) {
			System.out.println("done");

		} else {
			System.out.println("fail");
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementLab.labAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementLab.labAction));

		ElementLab.organisationManagementIcon.click();

		ElementLab.masterIcon.click();

	}

	public static void controlRights(String userRole, String screenName) throws InterruptedException {
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

		List<WebElement> screenList = ElementControlRights.controlRightsScreenList;

		List<WebElement> screenCheckboxList = ElementControlRights.controlRightsScreenCheckboxList;

		for (WebElement labE : screenList) {
			if (labE.getText().equals(screenName)) {

				labE.click();

			}
		}

		try {
			ElementControlRights.controlRightsAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementControlRights.controlRightsAction.click();

		}

		ElementControlRights.controlRightsAddRights.click();

		try {

			if (ElementControlRights.controlRightsSearchControl.isEnabled()
					|| ElementControlRights.controlRightsSearchControl.isDisplayed()) {
				wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsSearchControl));

				wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsSearchControl));

				ElementControlRights.controlRightsSearchControl.click();

			}

		} catch (Exception e) {
			Thread.sleep(2000);
			ElementControlRights.controlRightsSearchControl.click();
		}

		List<WebElement> controlNameList = ElementControlRights.controlList;

		ArrayList<String> controls = new ArrayList();

		for (WebElement d : controlNameList) {
			String e = d.getText();

			controls.add(e);
		}

		int controlCount = controls.size();

		String controlCountString = controlCount + "";

		System.out.println(controlCount);

		System.out.println(controls.get(0));

		System.out.println(controls.get(1));

		System.out.println(controls.get(2));

		ElementControlRights.controlRightsSelectAll.click();

		ElementControlRights.controlRightsAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsAction));

		String sideCount = ElementControlRights.userManagementSideViewCount.getText();

		String sideCountString = sideCount.substring(2);

		if (controlCountString.equals(sideCountString)) {
			System.out.println("Count is correct");

		}

		wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsAction));

		ElementControlRights.controlRightsScreenControls.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsAction));

		List<WebElement> screenControlList = ElementControlRights.controlRightsScreenControlList;

		int screenControlCount = screenControlList.size();

		String screenControlCounts = screenControlCount + "";

		if (screenControlCounts.equals(controls)) {
			System.out.println("passed");

		}

	}
*/
}
