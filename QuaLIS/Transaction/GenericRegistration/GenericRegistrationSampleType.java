package GenericRegistration;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasicFunction.Bas;
import BasicFunction.Date;
import BasicFunction.PageFactoryMethod;
import BasicFunction.copy;
import Config.FieldGenericRegistration;
import Config.RegistrationDetail;
import Flow.TestDataJPDC;
import GenericRegistration.ElementGenericRegistration;
import GenericRegistration.ElementHylandsIntermediate;
import GenericRegistration.ElementJPDCClaimTest;
import GenericRegistration.MainGrid;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class GenericRegistrationSampleType extends TestDataJPDC {

	
	public static String preRegisterNumber="";
	
	public static String preRegister(String registrationType, String screenshot[])
			throws IOException, InterruptedException, AWTException {
		

		if (registrationType.equals(RegistrationTypeDetail.claimTestKorean)
				|| registrationType.equals(RegistrationDetail.claimTest))
		{
			preRegisterNumber=	RegistrationTypePreRegister.claimTest(screenshot);
			
		} else if (registrationType.equals(RegistrationDetail.requestTest)
				|| registrationType.equals(RegistrationDetail.requestTestKorean)) {
			preRegisterNumber=	RegistrationTypePreRegister.requestTest(screenshot);
		}

		else if (registrationType.equals(RegistrationDetail.specialTestKorean)
				|| registrationType.equals(RegistrationDetail.specialTest)) {
			preRegisterNumber=	RegistrationTypePreRegister.specialTest(screenshot);
		}

		return preRegisterNumber;
	}

	public static void preRegisterPreCondition(String registrationSubType, String[] fileLocation)
			throws InterruptedException, HeadlessException, IOException, AWTException {

		String registrationCategory = RegistrationDetail.registrationCategory(registrationSubType);

		String registrationType = RegistrationDetail.registrationType(registrationSubType);

		PageFactory.initElements(driver, ElementGenericRegistration.class);

		ElementGenericRegistration.transactionIcon.click();

		ElementGenericRegistration.registrationIcon.click();

		ElementGenericRegistration.genericRegistrationIcon.click();

		BasicOperation.screenshot(fileLocation[0]);

		ElementGenericRegistration.advancedFilterHomeIcon.click();

		BasicOperation.wait(ElementGenericRegistration.filterIcon);

		BasicOperation.screenshot(fileLocation[1]);

		ElementGenericRegistration.filterIcon.click();

		BasicOperation.select(ElementGenericRegistration.filterSampleType, registrationCategory);

		BasicOperation.select(ElementGenericRegistration.filterRegistrationType, registrationType);

		BasicOperation.select(ElementGenericRegistration.filterSubType, registrationSubType);

		BasicOperation.screenshot(fileLocation[2]);

		ElementGenericRegistration.filterFindRecord.click();

		BasicOperation.exception(ElementGenericRegistration.sampleTypeIcon);

		BasicOperation.screenshot(fileLocation[3]);

	}

	public static void mainGridFilter(String registrationSubType, String status, String fileLocation[])
			throws InterruptedException, HeadlessException, IOException, AWTException {
		String registrationCategory = RegistrationDetail.registrationCategory(registrationSubType);

		String registrationType = RegistrationDetail.registrationType(registrationSubType);

		PageFactory.initElements(driver, ElementGenericRegistration.class);

		BasicOperation.wait(ElementGenericRegistration.filterIcon);

		int beforeFilterSampleType;

		try {
			beforeFilterSampleType = ElementGenericRegistration.ARNumberList.size();

		} catch (Exception e) {
			beforeFilterSampleType = 0;
		}

		System.out.println("Before Main Grid Filter--> " + beforeFilterSampleType);

		ElementGenericRegistration.filterIcon.click();

		BasicOperation.select(ElementGenericRegistration.filterSampleType, registrationCategory);

		BasicOperation.select(ElementGenericRegistration.filterRegistrationType, registrationType);

		BasicOperation.select(ElementGenericRegistration.filterSubType, registrationSubType);

		ElementGenericRegistration.filterCheckbox.click();

		BasicOperation.select(ElementGenericRegistration.filterSampleStatus, status);

		// BasicOperation.screenshot(fileLocation[2]);

		ElementGenericRegistration.filterFindRecord.click();

		int afterFilterSampleType;

		try {
			BasicOperation.exception(ElementGenericRegistration.sampleTypeIcon);

			try {
				afterFilterSampleType = ElementGenericRegistration.ARNumberList.size();

			} catch (Exception ea) {
				afterFilterSampleType = 0;
			}

			System.out.println("After Filter in Main Grid with " + BasicOperation.statusEnglish(status) + " status-->"
					+ afterFilterSampleType);

			if (beforeFilterSampleType == afterFilterSampleType) {
				System.out.println("Duplicate after main grid filter--> Pass");
			} else {
				System.out.println("Some issue is there");
			}

		} catch (Exception e) {
			System.out.println("Screen Getting Loader issue");
		}

		// BasicOperation.screenshot(fileLocation[2]);

	}

	public static String register(String preRegisterNumber, String registrationSubType) throws InterruptedException {

		System.out.println(preRegisterNumber);
		
		PageFactory.initElements(driver, ElementGenericRegistration.class);

		BasicOperation.wait(ElementGenericRegistration.sampleTypeIcon);

		BasicOperation.exception(ElementGenericRegistration.sampleTypeIcon);

		List<WebElement> elements;

		if (registrationSubType.equals(RegistrationDetail.claimTestKorean)) {
			System.out.println("locked");

			PageFactory.initElements(driver, ElementJPDCClaimTest.class);

			elements = ElementJPDCClaimTest.preRegisterNumberList;

			try {
				elements.get(0).click();
			} catch (Exception e) {
				// TODO: handle exception
			}

			for (WebElement element : elements) {
				if (element.getText().equals(preRegisterNumber)) {
					element.click();
				}
			}
		}

		BasicOperation.exception(ElementGenericRegistration.genericRegistrationAction);

		ElementGenericRegistration.sampleTypeRegister.click();
		
		BasicOperation.exception(ElementGenericRegistration.sampleTypeSampleTypeIcon);

		String ARNumber = "";

		if (registrationSubType.equals(RegistrationDetail.claimTestKorean)||registrationSubType.equals(RegistrationDetail.claimTest)) {

			List<WebElement> ARNumberList = ElementJPDCClaimTest.ARNumberList;

			for (int i = 1; i > 0; i++)
			{
				ARNumber = ARNumberList.get(0).getText();

				Thread.sleep(100);

				if (ARNumber.equals("-") == false) {
					break;
				}

			}

		}
		
		BasicOperation.exception(ElementGenericRegistration.sampleTypeSampleTypeIcon);
		
		ElementGenericRegistration.registrationIcon.click();
		
		ElementGenericRegistration.transactionIcon.click();

		return ARNumber;

	}

	public static void sampledBy(String preRegisterNumber, String registrationSubType, HashMap<String, String> value)
			throws InterruptedException, AWTException {

		
		
		System.out.println(preRegisterNumber);
		
		PageFactory.initElements(driver, ElementGenericRegistration.class);

		BasicOperation.wait(ElementGenericRegistration.sampleTypeIcon);

		BasicOperation.exception(ElementGenericRegistration.sampleTypeIcon);

		List<WebElement> elements;

		if (registrationSubType.equals(RegistrationDetail.claimTestKorean)) {
			System.out.println("locked");

			PageFactory.initElements(driver, ElementJPDCClaimTest.class);

			elements = ElementJPDCClaimTest.preRegisterNumberList;

			try {
				elements.get(0).click();

				System.out.println("Un-selected");
			} catch (Exception e) {
				// TODO: handle exception
			}

			for (WebElement element : elements) {
				if (element.getText().equals(preRegisterNumber)) {
					element.click();
				} else {
					System.out.println("Not mated pre register");
				}
			}
		}

		BasicOperation.exception(ElementGenericRegistration.genericRegistrationAction);
		
	
		ElementGenericRegistration.sampleTypeSampledBy.click();

		BasicOperation.exception(ElementGenericRegistration.sampledByOfficialName);

		BrowserOperation.implicitWait(3);

		BasicOperation.sendKeys(ElementGenericRegistration.sampledByOfficialName,
				value.get(FieldGenericRegistration.sampledByOfficialName));

		try {

			BasicOperation.select(ElementGenericRegistration.sampledBySamplingMethod,
					value.get(FieldGenericRegistration.sampledBySamplingMethodSelfSamplingKorean));

		} catch (Exception e) {

			BasicOperation.select(ElementGenericRegistration.sampledBySamplingMethod,
					value.get(FieldGenericRegistration.sampledBySamplingMethodSelfSampling));

			// TODO: handle exception
		}

		BasicOperation.sendKeys(ElementGenericRegistration.sampledBySamplingLocationAddress,
				value.get(FieldGenericRegistration.sampledBySamplingLocationAddress));

		BasicOperation.sendKeys(ElementGenericRegistration.sampledBySamplingLocation,
				value.get(FieldGenericRegistration.sampledBySamplingLocation));

		BasicOperation.sendKeys(ElementGenericRegistration.sampledByPermitNumber,
				value.get(FieldGenericRegistration.sampledByPermitNumber));

		try 
		{

			BasicOperation.select(ElementGenericRegistration.sampledByOfficialSamplingCheck,
					value.get(FieldGenericRegistration.sampledByOfficialSamplingCheckYesKorean));

		} 
		catch (Exception e) 
		{

			BasicOperation.select(ElementGenericRegistration.sampledByOfficialSamplingCheck,
					value.get(FieldGenericRegistration.sampledByOfficialSamplingCheckYes));

			// TODO: handle exception
		}

		BasicOperation.sendKeys(ElementGenericRegistration.sampledBySamplingAmount,
				value.get(FieldGenericRegistration.sampledBySamplingAmount));
		
		/*
	Select a=new Select(driver.findElement(By.id("ID_SR_SampledbySamplingUnit")));
	
	a.selectByVisibleText("입력하며 cm");*/

	//	BasicOperation.select(ElementGenericRegistration.sampledBySamplingUnit,"입력하며 cm");
/*
		
		
		try 
		{

		BasicOperation.select(ElementGenericRegistration.sampledBySamplingUnit,"입력하며 cm");
		
		System.out.println("unit selected");
		} 
		catch (Exception e)
		{
			
			System.out.println("exce");
			BasicOperation.selectByIndex(ElementGenericRegistration.sampledBySamplingUnit, 3);
			
		}*/
/*	
		

		try {

			BasicOperation.select(ElementGenericRegistration.sampledBySamplingStatus,value.get(FieldGenericRegistration.sampledBySamplingStatusReSampledKorean));

		} catch (Exception e) {

			
			
			
			try {

				BasicOperation.select(ElementGenericRegistration.sampledBySamplingStatus,
						value.get(FieldGenericRegistration.sampledBySamplingStatusReSampled));
				


			} catch (Exception es) {

				BasicOperation.selectByIndex(ElementGenericRegistration.sampledBySamplingStatus,
						3);

				// TODO: handle exception
			}


			// TODO: handle exception
		}
*/
	
	/*	Robot aaa=new Robot();
		
		aaa.keyPress(KeyEvent.VK_PAGE_UP);
		
		aaa.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(100);

		
		aaa.keyPress(KeyEvent.VK_PAGE_UP);
		
		aaa.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(100);
		
		aaa.keyPress(KeyEvent.VK_PAGE_UP);
		
		aaa.keyRelease(KeyEvent.VK_PAGE_UP);
		
Thread.sleep(100);
		
		aaa.keyPress(KeyEvent.VK_PAGE_UP);
		
		aaa.keyRelease(KeyEvent.VK_PAGE_UP);
		
Thread.sleep(100);
		
		aaa.keyPress(KeyEvent.VK_PAGE_UP);
		
		aaa.keyRelease(KeyEvent.VK_PAGE_UP);
		
Thread.sleep(100);
		
		aaa.keyPress(KeyEvent.VK_PAGE_UP);
		
		aaa.keyRelease(KeyEvent.VK_PAGE_UP);
		
		*/
		
		JavascriptExecutor  a=(JavascriptExecutor)driver;
		
		
		a.executeScript("window.scroll(0,0)", "");
		
		Thread.sleep(30000000);
		
		BasicOperation.click(ElementGenericRegistration.sampleTypeSampledBySubmit);
		
		BrowserOperation.implicitWait(20);

	}

}
