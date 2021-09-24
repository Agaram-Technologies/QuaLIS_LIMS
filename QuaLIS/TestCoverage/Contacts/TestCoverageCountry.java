package Contacts;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.BrowserOperation;
public class TestCoverageCountry extends BrowserOperation
{
	

	public static void countryAdd(String name, String abbreviation, String twoCharacter, String threeCharacter) throws InterruptedException, IOException
	
	{
		
	//	testCase=report.createTest("Check whether country add working or not");
		
		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();
		
		//testCase.info("Clicking the master icon");
		
		ElementCountry.contactsIcon.click();
		
		//testCase.info("Clicking the contacts icon");

		ElementCountry.countryIcon.click();
		
	//	testCase.info("Clicking the country icon");

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementCountry.countryAction.click();
		}

	//	testCase.info("Clicking the thunder Button");
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAdd));
		
	//	testCase.info("Clicking the country add Button");

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
		
	//	testCase.info("Giving the country name as "+ name);

		ElementCountry.country.sendKeys(name);
		
		//testCase.info("Giving the country abbreviation as "+ abbreviation);

		ElementCountry.countryAbbreviation.sendKeys(abbreviation);
		
//		testCase.info("Giving the country two character codeas "+ twoCharacter);

		ElementCountry.countryTwoCharCode.sendKeys(twoCharacter);
		
		//testCase.info("Giving the country three Character as "+ threeCharacter);

		ElementCountry.countryThreeCharCode.sendKeys(threeCharacter);

		ElementCountry.countryAddSubmit.click();
		
	//	testCase.info("Clicking the submit button");

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		List<WebElement> countryList=ElementCountry.countryList;
		
		String country=countryList.get(0).getText();
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();
	}
	
	
	
	
}
	
	/*public static void main(String[] args) throws InterruptedException, IOException
	{
		
		
		LaunchCloseBrowser.launchLIMS();

		TestCoverageCountry.countryPreCondition();

		TestCoverageCountry.countryAdd(countryNameAdd, countryAbbreviationAdd, countryTwoCharacterAdd,
				countryThreeCharacterAdd);

		TestCoverageCountry.countryNameEdit(countryNameAdd, countryNameEdit);

		TestCoverageCountry.countryAbbreviationEdit(countryNameEdit, countryAbbreviationEdit);

		TestCoverageCountry.countryTwoCharacterEdit(countryNameEdit, countryTwoCharacterEdit);

		TestCoverageCountry.countryThreeCharacterEdit(countryNameEdit, countryThreeCharacterEdit);

		TestCoverageCountry.countryDelete(countryNameEdit);

		TestCoverageCountry.countryRefresh(countryRefresh);

		TestCoverageCountry.countryEditWithoutSelect();

		TestCoverageCountry.countryDeletetWithoutSelect();

		TestCoverageCountry.countryNameDuplicate(countryNameDuplicateSameCase, countryAbbreviationAdd,
				countryTwoCharacterAdd, countryThreeCharacterAdd);

		TestCoverageCountry.countryExcelPostCondition();

		TestCoverageCountry.countryPostCondition();
	}
	
	
	
	public static void countryNameDuplicate(String country, String abbreviation, String twoCharacter, String threeCharacter) throws InterruptedException, IOException
	{
		TestCoverageCountry.countryAdd(countryNameDuplicateSameCase, abbreviation, twoCharacter, threeCharacter);
		
		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
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
				LaunchCloseBrowser.refreshLims();

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
		
		

		ElementCountry.countryTwoCharCode.sendKeys(twoCharacter);

		ElementCountry.countryThreeCharCode.sendKeys(threeCharacter);

		ElementCountry.countryAddSubmit.click();
		
		WebElement d=driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));
		
		WebElement dd=driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i"));
		
		if(d.isDisplayed())
		{
			dd.click();
			
			System.out.println("Working");
		}
		else
		{
			System.out.println("not working");
		}
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void countryAdd(String name, String abbreviation, String twoCharacter, String threeCharacter) throws InterruptedException, IOException
	
	{
		
		testCase=report.createTest("Check whether country add working or not");
		
		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();
		
		testCase.info("Clicking the master icon");
		
		ElementCountry.contactsIcon.click();
		
		testCase.info("Clicking the contacts icon");

		ElementCountry.countryIcon.click();
		
		testCase.info("Clicking the country icon");

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementCountry.countryAction.click();
		}

		testCase.info("Clicking the thunder Button");
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAdd));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAdd));
		
		testCase.info("Clicking the country add Button");

		ElementCountry.countryAdd.click();

		for (int i = 0; i < 5; i++) {
			if (ElementCountry.countryAddSubmit.isDisplayed()) {
				break;
			} else {
				LaunchCloseBrowser.refreshLims();

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
		
		testCase.info("Giving the country name as "+ name);

		ElementCountry.country.sendKeys(name);
		
		testCase.info("Giving the country abbreviation as "+ abbreviation);

		ElementCountry.countryAbbreviation.sendKeys(abbreviation);
		
		testCase.info("Giving the country two character codeas "+ twoCharacter);

		ElementCountry.countryTwoCharCode.sendKeys(twoCharacter);
		
		testCase.info("Giving the country three Character as "+ threeCharacter);

		ElementCountry.countryThreeCharCode.sendKeys(threeCharacter);

		ElementCountry.countryAddSubmit.click();
		
		testCase.info("Clicking the submit button");

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		List<WebElement> countryList=ElementCountry.countryList;
		
		String country=countryList.get(0).getText();
		
		
		
		if(country.equals(name))
		{
			testCase.log(Status.PASS, "Country Add Working Properly");
			
			TestCaseContacts.countryResult(1, "PASS");

		}
		else
		{
			testCase.log(Status.FAIL, "Country Add Not Working");
			
			TestCaseContacts.countryResult(1, "FAIL");
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void countryAddMandatory(String country) throws IOException, InterruptedException
	{
		
			PageFactory.initElements(driver, ElementCountry.class);

			ElementCountry.masterIcon.click();

			ElementCountry.contactsIcon.click();

			ElementCountry.countryIcon.click();

			WebDriverWait wait1 = new WebDriverWait(driver, 100);

			wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

			try {
				ElementCountry.countryAction.click();
			} catch (Exception e) {
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
					LaunchCloseBrowser.refreshLims();

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

			ElementCountry.countryAbbreviation.sendKeys("1");
			
			

			ElementCountry.countryTwoCharCode.sendKeys("1");

			ElementCountry.countryThreeCharCode.sendKeys("1");

			ElementCountry.countryAddSubmit.click();

			wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

			FileInputStream s = new FileInputStream("flow.properties");

			Properties properties = new Properties();

			properties.load(s);

			String countryScreenshot = properties.getProperty("country");

			// BasicOperation.screenshot(countryScreenshot);

			wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

			ElementCountry.contactsIcon.click();

			ElementCountry.masterIcon.click();

		}
	
	public static void countryUserDeleteValidation(String country) throws InterruptedException, IOException
	{
		
		
		
		
		PageFactory.initElements(driver, ElementCountry.class);
		
		
		ElementCountry.masterIcon.click();
		
		ElementCountry.contactsIcon.click();
		
		ElementCountry.countryIcon.click();
		
		testCase=report.createTest("Check Whether Country Delete Validation Working Which is used in user or Not");
		

		WebDriverWait wait1= new WebDriverWait(driver,100);
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));	
		

		List<WebElement> countryListSelect=ElementCountry.countryList;
		
		List<WebElement> countryCheckboxList=ElementCountry.countryCheckboxList;
		
		

		for(WebElement countryName:countryListSelect)
		{
			if(countryName.getText().equals(country))
			{
				int i=countryListSelect.indexOf(countryName);
				
				String checkBoxStatus=countryCheckboxList.get(i).getAttribute("checkboxselect");
				
				if (checkBoxStatus.equals("0")) {
					countryName.click();
				}
				
				
			}
		}
		


		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
	
		
		ElementCountry.countryDelete.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		String firstTest=countryListSelect.get(0).getText();
		
		
		
		
		if(firstTest.equals(country))
		{
			testCase.log(Status.PASS, "Delete Validation is working for Country Which is used in User");
		}
		else
		{
			testCase.log(Status.FAIL, "Delete Validation is not working for Country Which is used in User");
		}
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try
		{
			WebElement alert=driver.findElement(By.xpath("//*[@id=\"ID_Lims_AlertMsg_0\"]"));
			
			WebElement alertDeleteValidation= driver.findElement(By.xpath("//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i"));
		
			if(alert.isDisplayed())
			{
				alertDeleteValidation.click();
				
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("delete validation not working");
		}
		
		
		
	
		
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
	
		ElementCountry.contactsIcon.click();
		
		ElementCountry.masterIcon.click();
		
		
		
		
	}
	
	
	public static void countryNameEdit(String countryNameAdd, String countryNameEdit) throws InterruptedException
	{
		
		testCase=report.createTest("Check whether country Name edit working or not");

		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		

		List<WebElement> countryList=ElementCountry.countryList;
		
		List<WebElement> countryCheckboxList=ElementCountry.countryCheckboxList;
		
		
		
	

		for(WebElement labName:countryList)
		{
			if(labName.getText().equals(countryNameAdd))
			{
				int i=countryList.indexOf(labName);
				
				String checkBoxStatus=countryCheckboxList.get(i).getAttribute("checkboxselect");
				
				System.out.println(checkBoxStatus);
				
				if (checkBoxStatus.equals("1")==false) 
				{
					labName.click();
				}
				
				
			}
		}
		


		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryEdit.click();
		
		

		try {
			ElementCountry.country.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.country.click();

		}
		
		ElementCountry.country.clear();
		
		ElementCountry.country.sendKeys(countryNameEdit);
		
		ElementCountry.countryEditSubmit.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		String dd=countryList.get(0).getText();
		
		
		
if(dd.equals(countryNameEdit))
{
	testCase.log(Status.PASS, "Country Name Edit is Working");
	
	TestCaseContacts.countryResult(2, "PASS");
}
else
{
	testCase.log(Status.FAIL, "Country Name Edit is Working");
	
	TestCaseContacts.countryResult(2, "FAIL");
}

wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));

		
		
		ElementCountry.contactsIcon.click();
		
		ElementCountry.masterIcon.click();

		

	}
	
	public static void countryAbbreviationEdit(String countryNameEdit, String countryAbbreviationEdit) throws InterruptedException
	{
		
		testCase=report.createTest("Check whether Country Abbreviation Edit working or not");

		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		

		List<WebElement> countryList=ElementCountry.countryList;
		
		List<WebElement> countryAbbreviationList=ElementCountry.countryAbbreviationList;
		
		List<WebElement> countryCheckboxList=ElementCountry.countryCheckboxList;
		
	

		for(WebElement labName:countryList)
		{
			if(labName.getText().equals(countryNameEdit))
			{
				int i=countryList.indexOf(labName);
				
				String checkBoxStatus=countryCheckboxList.get(i).getAttribute("checkboxselect");
				
				System.out.println(checkBoxStatus);
				
				if (checkBoxStatus.equals("1")==false) 
				{
					labName.click();
				}
				
				
			}
		}
		


		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryEdit.click();
		
		

		try {
			ElementCountry.countryAbbreviation.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAbbreviation.click();

		}
		
		ElementCountry.countryAbbreviation.clear();
		
		ElementCountry.countryAbbreviation.sendKeys(countryAbbreviationEdit);
		
		ElementCountry.countryEditSubmit.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		String abb=countryAbbreviationList.get(0).getText();
		

		if(abb.equals(countryAbbreviationEdit))
		{
			testCase.log(Status.PASS, "Country Abbreviation Edit is Working");
			
			TestCaseContacts.countryResult(3, "PASS");
		}
		else
		{
			testCase.log(Status.FAIL, "Country Abbreviation Edit is Working");
			
			TestCaseContacts.countryResult(3, "FAIL");
		}

wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();

		

	}
	
	
	public static void countryTwoCharacterEdit(String countryNameEdit, String countryTwoCharacterEdit) throws InterruptedException
	{
		testCase=report.createTest("Check whether Country Two Character Code Edit working or not");
		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		

		List<WebElement> countryList=ElementCountry.countryList;
		
		List<WebElement> countryTwoCharList=ElementCountry.countryTwoCharacterCodeList;
		
		List<WebElement> labCheckboxList=ElementCountry.countryCheckboxList;
		
	

		for(WebElement labName:countryList)
		{
			if(labName.getText().equals(countryNameEdit))
			{
				int i=countryList.indexOf(labName);
				
				String checkBoxStatus=labCheckboxList.get(i).getAttribute("checkboxselect");
				
				System.out.println(checkBoxStatus);
				
				if (checkBoxStatus.equals("1")==false) 
				{
					labName.click();
				}
				
				
			}
		}
		


		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryEdit.click();
		
		

		try {
			ElementCountry.countryTwoCharCode.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryTwoCharCode.click();

		}
		
		ElementCountry.countryTwoCharCode.clear();
		
		ElementCountry.countryTwoCharCode.sendKeys(countryTwoCharacterEdit);
		
		ElementCountry.countryEditSubmit.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		String character=countryTwoCharList.get(0).getText();
		
		
		
		
		if(character.equals(countryTwoCharacterEdit))
		{
			testCase.log(Status.PASS, "Country Two Character Code Edit is Working");
			
			TestCaseContacts.countryResult(4, "PASS");
		}
		else
		{
			testCase.log(Status.FAIL, "Country Two Character Code Edit is Working");
			
			TestCaseContacts.countryResult(4, "FAIL");
		}
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		
		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();
		

	}
	
	
	
	

	public static void countryThreeCharacterEdit(String countryNameEdit, String countryThreeCharacterEdit) throws InterruptedException
	{
		testCase=report.createTest("Check whether Country Three Character Code Edit working or not");

		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		

		List<WebElement> labList=ElementCountry.countryList;
		
		List<WebElement> labCheckboxList=ElementCountry.countryCheckboxList;
		
	

		for(WebElement labName:labList)
		{
			if(labName.getText().equals(countryNameEdit))
			{
				int i=labList.indexOf(labName);
				
				String checkBoxStatus=labCheckboxList.get(i).getAttribute("checkboxselect");
				
				System.out.println(checkBoxStatus);
				
				if (checkBoxStatus.equals("1")==false) 
				{
					labName.click();
				}
				
				
			}
		}
		


		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryEdit.click();
		
		

		try {
			ElementCountry.countryThreeCharCode.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryThreeCharCode.click();

		}
		
		ElementCountry.countryThreeCharCode.clear();
		
		ElementCountry.countryThreeCharCode.sendKeys(countryThreeCharacterEdit);
		
		ElementCountry.countryEditSubmit.click();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		List<WebElement> countryThreeCharacterList=ElementCountry.countryThreeCharacterCodeList;
		
		String character=countryThreeCharacterList.get(0).getText();
		
		
		if(character.equals(countryThreeCharacterEdit))
		{
			testCase.log(Status.PASS, "Country Three Character Code Edit is Working");
			
			TestCaseContacts.countryResult(5, "PASS");
		}
		else
		{
			testCase.log(Status.FAIL, "Country Three Character Code Edit is Working");
			
			TestCaseContacts.countryResult(5, "FAIL");
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();
		
		

		

	}
	
	public static void countryEditWithoutSelect() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		

		List<WebElement> labList=ElementCountry.countryList;
		
		List<WebElement> labCheckboxList=ElementCountry.countryCheckboxList;
		
	

		for(WebElement l:labCheckboxList)
		{
			String status=	l.getAttribute("checkboxselect");
			
			if(status.equals("1"))
			{
				l.click();
			}
		}
		
		

		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryEdit.click();
		
		Thread.sleep(5000);

		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();
		
	}
	
	public static void countryDeletetWithoutSelect() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		

		List<WebElement> labList=ElementCountry.countryList;
		
		List<WebElement> labCheckboxList=ElementCountry.countryCheckboxList;
		
	

		for(WebElement l:labCheckboxList)
		{
			String status=	l.getAttribute("checkboxselect");
			
			if(status.equals("1"))
			{
				l.click();
			}
		}
		
		
		

		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryDelete.click();
		
		Thread.sleep(5000);

		ElementCountry.contactsIcon.click();

		ElementCountry.masterIcon.click();
	}
	
	
	public static void countryDelete(String country) throws InterruptedException
	{
		testCase=report.createTest("Check Whether country Delete is working or not");

		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		

		List<WebElement> countryList=ElementCountry.countryList;
		
		List<WebElement> countryCheckboxList=ElementCountry.countryCheckboxList;
		
		int ii=countryList.size();
		
	

		for(WebElement labName:countryList)
		{
			if(labName.getText().equals(country))
			{
				int i=countryList.indexOf(labName);
				
				String checkBoxStatus=countryCheckboxList.get(i).getAttribute("checkboxselect");
				
				System.out.println(checkBoxStatus);
				
				if (checkBoxStatus.equals("1")==false) 
				{
					labName.click();
				}
				
				
			}
		}
		


		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryDelete.click();
		
		

	
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
	
		String dd=countryList.get(0).getText();
		
		
		

		
		if(dd.equals(country))
		{
			testCase.log(Status.FAIL, "Country Delete Working Properly");
			
			TestCaseContacts.countryResult(6, "FAIL");

		}
		else
		{
			testCase.log(Status.PASS, "Country Delete Not Working");
			
			TestCaseContacts.countryResult(6, "PASS");
		}
		

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		ElementCountry.contactsIcon.click();
		
		ElementCountry.masterIcon.click();

		

	}
	
	public static String countrySwitchToNewTab()
	{
		String l = driver.getWindowHandle();

		((JavascriptExecutor) driver).executeScript("window.open('about:blank', '-blank')");
		// To switch to the new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String old = tabs.get(0);
		
		return old;
	}
	
	
	public static void countrySwitchToOldTab()
	{
		String old=TestCoverageCountry.countrySwitchToNewTab();
		
		driver.switchTo().window(old);
	}
	public static int countryRefreshOne() throws InterruptedException
	{

		PageFactory.initElements(driver, ElementCountry.class);

		ElementCountry.masterIcon.click();

		ElementCountry.contactsIcon.click();

		ElementCountry.countryIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
	
		
		List<WebElement> countryList=ElementCountry.countryList;
		
		int i=countryList.size();
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		
		
	return i;

		

	}
	
	public static void countryRefreshTwo(String country) throws IOException, InterruptedException
	{
		TestCoverageCountry.countrySwitchToNewTab();
		
		LaunchCloseBrowser.newTabLims();
		
		TestCoverageCountry.countryAddMandatory(country);
		
		TestCoverageCountry.countrySwitchToOldTab();
		
		
	}
	
	public static void countryRefreshThree() throws InterruptedException
	{
		testCase=report.createTest("Check Whether Country Refresh is working or not");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
	
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		try {
			ElementCountry.countryAction.click();
		} catch (Exception e) {
			Thread.sleep(5000);

			ElementCountry.countryAction.click();

		}
		
		
		ElementCountry.countryRefresh.click();
		
		
		
	
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		int ii=TestCoverageCountry.countryRefreshOne();
		
		List<WebElement> countryList=ElementCountry.countryList;

		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
	
		int ij=countryList.size();
		
			if(ii==ij)
			{
				testCase.log(Status.FAIL, "Country Refresh is Working");
				
				TestCaseContacts.countryResult(7, "FAIL");
			}
			else
			{
				testCase.log(Status.PASS, "Country Refresh is Working");
				
				TestCaseContacts.countryResult(7, "PASS");
			}
			
			
		
		wait1.until(ExpectedConditions.visibilityOf(ElementCountry.countryAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementCountry.countryAction));
		
		
		ElementCountry.contactsIcon.click();
		
		ElementCountry.masterIcon.click();
	}
	
	public static void countryRefresh(String country) throws InterruptedException, IOException
	{
		TestCoverageCountry.countryRefreshOne();
		
		TestCoverageCountry.countryRefreshTwo(country);
		
		TestCoverageCountry.countryRefreshThree();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/