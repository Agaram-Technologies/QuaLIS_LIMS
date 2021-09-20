package GenericRegistration;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.auto.common.BasicAnnotationProcessor;

import BasicFunction.Date;
import Flow.TestDataJPDC;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class RegistrationTypePreRegister extends BrowserOperation {
	public static String claimTest(String[] screenshot) throws IOException, InterruptedException, AWTException {

		
		System.out.println("Registration Type ---> Claim Test");
		
		PageFactory.initElements(driver, ElementJPDCClaimTest.class);
		
		int beforePreRegister=ElementJPDCClaimTest.ARNumberList.size();
		
		System.out.println("Before Pre Register in Grid --> "+beforePreRegister);

		BasicOperation.screenshot(screenshot[0]);

		BasicOperation.wait(ElementJPDCClaimTest.genericRegistrationAction);

		BasicOperation.exception(ElementJPDCClaimTest.genericRegistrationAction);

		ElementGenericRegistration.sampleTypePreRegister.click();

		try {
			BasicOperation.exception(ElementJPDCClaimTest.remark);
			
			System.out.println(" Pre Register Popup is Displayed");
			
		} catch (Exception e) {
			System.out.println(" Pre Register Popup is not Displayed");
		}
		

		BasicOperation.screenshot(screenshot[1]);

		BrowserOperation.implicitWait(1);

		BasicOperation.select(ElementJPDCClaimTest.clientName, TestDataJPDC.client);

		BasicOperation.select(ElementJPDCClaimTest.clientSite, TestDataJPDC.clientSite);

		BasicOperation.sendKeys(ElementJPDCClaimTest.telephoneNumber, TestDataJPDC.telephoneNumber);

		BasicOperation.sendKeys(ElementJPDCClaimTest.email, TestDataJPDC.email);

		BasicOperation.select(ElementJPDCClaimTest.department, TestDataJPDC.department);

	//	Date.dateEnter(ElementJPDCClaimTest.manufacturerDate);

		BasicOperation.select(ElementJPDCClaimTest.manufacturerLine, TestDataJPDC.manufacturerLineOthers);

		BasicOperation.select(ElementJPDCClaimTest.manufacturerCapacity, TestDataJPDC.manufacturerCapacityOthers);

		BasicOperation.select(ElementJPDCClaimTest.sampleOpened, TestDataJPDC.sampleOPenedOpenKorean);

		
		try {
			BasicOperation.select(ElementJPDCClaimTest.claimType, TestDataJPDC.claimTypeMatter);
			
		} catch (Exception e) {
			BasicOperation.select(ElementJPDCClaimTest.claimType, TestDataJPDC.claimTypeMatterKorean);
			// TODO: handle exception
		}
		
	

		// Date.dateEnter(ElementJPDCClaimTest.dueDate);

		BasicOperation.sendKeys(ElementJPDCClaimTest.remark, TestDataJPDC.remarks);
		
		try {
			BasicOperation.select(ElementJPDCClaimTest.securityData, TestDataJPDC.securityDataYes);
			
		} catch (Exception e) {
			BasicOperation.select(ElementJPDCClaimTest.securityData, TestDataJPDC.securityDataYesKorean);
			// TODO: handle exception
		}
		
		

		BasicOperation.select(ElementJPDCClaimTest.sampleCategory, TestDataJPDC.sampleCategory);

		BasicOperation.select(ElementJPDCClaimTest.sample, TestDataJPDC.sample);

		BasicOperation.screenshot(screenshot[2]);

		BasicOperation.click(ElementJPDCClaimTest.preRegisterSubmit);

		BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);
		
		int afterPreRegister=ElementJPDCClaimTest.ARNumberList.size();
		
		System.out.println("After Pre Register in Grid --> "+afterPreRegister);
		
		
		String preRegisterNumber="";
		
		if(afterPreRegister==beforePreRegister+1)
		{
			System.out.println("Duplicate After Pre Register-----> Pass");
			
					
			preRegisterNumber=ElementJPDCClaimTest.preRegisterNumberList.get(0).getText();
					
			System.out.println(preRegisterNumber+"aaaaaaa");
		}
		else if(afterPreRegister>beforePreRegister+1)
		{
			int a=afterPreRegister-beforePreRegister ;
			
			System.out.println("It displays "+a + "times in Grid" );
		}
		
		
		

		BasicOperation.screenshot(screenshot[3]);
		
		
		System.out.println("Pre Register Number is-->"+preRegisterNumber);
		
		
		return preRegisterNumber;

	}

	public static String requestTest(String[] screenshot) throws IOException, InterruptedException, HeadlessException, AWTException {

		
		System.out.println("Registration Type ---> Claim Test");
		
		PageFactory.initElements(driver, ElementJPDCRequestTest.class);
		
		int beforePreRegister=ElementJPDCRequestTest.ARNumberList.size();
		
		System.out.println("Before Pre Register in Grid --> "+beforePreRegister);

		BasicOperation.screenshot(screenshot[0]);

		BasicOperation.wait(ElementJPDCRequestTest.genericRegistrationAction);

		BasicOperation.exception(ElementJPDCRequestTest.genericRegistrationAction);

		ElementGenericRegistration.sampleTypePreRegister.click();

		try {
			BasicOperation.exception(ElementJPDCRequestTest.remarks);
			
			System.out.println(" Pre Register Popup is Displayed");
			
		} catch (Exception e) {
			System.out.println(" Pre Register Popup is not Displayed");
		}
		

	//	BasicOperation.screenshot(screenshot[1]);

		BrowserOperation.implicitWait(1);

		BasicOperation.select(ElementJPDCRequestTest.client, TestDataJPDC.client);

//		BasicOperation.select(ElementJPDCRequestTest.clientSite, TestDataJPDC.clientSite);

//		BasicOperation.sendKeys(ElementJPDCRequestTest.telephoneNumber, TestDataJPDC.telephoneNumber);

//		BasicOperation.sendKeys(ElementJPDCRequestTest.email, TestDataJPDC.email);

//		BasicOperation.select(ElementJPDCRequestTest.department, TestDataJPDC.department);

	//	Date.dateEnter(ElementJPDCRequestTest.manufacturerDate);

/*		BasicOperation.select(ElementJPDCRequestTest.manufacturerLine, TestDataJPDC.manufacturerLineOthers);

		BasicOperation.select(ElementJPDCRequestTest.manufacturerCapacity, TestDataJPDC.manufacturerCapacityOthers);

		BasicOperation.select(ElementJPDCRequestTest.sampleOpened, TestDataJPDC.sampleOPenedOpenKorean);

		
		try {
			BasicOperation.select(ElementJPDCRequestTest.claimType, TestDataJPDC.claimTypeMatter);
			
		} catch (Exception e) {
			BasicOperation.select(ElementJPDCRequestTest.claimType, TestDataJPDC.claimTypeMatterKorean);
			// TODO: handle exception
		}
		
	*/

		// Date.dateEnter(ElementJPDCRequestTest.dueDate);

	/*	BasicOperation.sendKeys(ElementJPDCRequestTest.remark, TestDataJPDC.remarks);
		
		try {
			BasicOperation.select(ElementJPDCRequestTest.securityData, TestDataJPDC.securityDataYes);
			
		} catch (Exception e) {
			BasicOperation.select(ElementJPDCRequestTest.securityData, TestDataJPDC.securityDataYesKorean);
			// TODO: handle exception
		}
*/		
		

		BasicOperation.select(ElementJPDCRequestTest.sampleCategory, TestDataJPDC.sampleCategory);

		BasicOperation.select(ElementJPDCRequestTest.sampleType, TestDataJPDC.sample);

		BasicOperation.screenshot(screenshot[2]);

		BasicOperation.click(ElementJPDCRequestTest.preRegisterSubmit);

		BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);
		
		int afterPreRegister=ElementJPDCRequestTest.ARNumberList.size();
		
		System.out.println("After Pre Register in Grid --> "+afterPreRegister);
		
		
		String preRegisterNumber="";
		
		if(afterPreRegister==beforePreRegister+1)
		{
			System.out.println("Duplicate After Pre Register-----> Pass");
			
					
			preRegisterNumber=ElementJPDCRequestTest.preRegisterNumberList.get(0).getText();
					
			
		}
		else if(afterPreRegister>beforePreRegister+1)
		{
			int a=afterPreRegister-beforePreRegister ;
			
			System.out.println("It displays "+a + "times in Grid" );
		}
		
		

		BasicOperation.screenshot(screenshot[3]);
		
		
		System.out.println("Pre Register Number is-->"+preRegisterNumber);

		BasicOperation.wait(ElementJPDCRequestTest.genericRegistrationAction);
	
		
		return preRegisterNumber;
	}

	public static String specialTest(String[] screenshot) throws IOException, InterruptedException, HeadlessException, AWTException {

	System.out.println("Registration Type ---> Special Test");
		
		PageFactory.initElements(driver, ElementJPDCSpecialTest.class);
		
		BrowserOperation.implicitWait(1);
			
		int beforePreRegister = 0;
		
		try {
			beforePreRegister =ElementJPDCSpecialTest.ARNumberList.size();
			
		} catch (Exception e) {
			
			beforePreRegister=0;
			// TODO: handle exception
		}
		
		
		BrowserOperation.implicitWait(20);
		System.out.println("Before Pre Register in Grid --> "+beforePreRegister);

		BasicOperation.screenshot(screenshot[0]);

		BasicOperation.wait(ElementJPDCSpecialTest.genericRegistrationAction);

		BasicOperation.exception(ElementJPDCSpecialTest.genericRegistrationAction);

		ElementGenericRegistration.sampleTypePreRegister.click();

		try {
			BasicOperation.exception(ElementJPDCSpecialTest.remarks);
			
			System.out.println(" Pre Register Popup is Displayed");
			
		} catch (Exception e) {
			System.out.println(" Pre Register Popup is not Displayed");
		}
		

	//	BasicOperation.screenshot(screenshot[1]);

		BrowserOperation.implicitWait(1);

		BasicOperation.select(ElementJPDCSpecialTest.client, TestDataJPDC.client);
		
		try {
			
			BasicOperation.select(ElementJPDCSpecialTest.department, TestDataJPDC.department);

			
		} catch (Exception e) {
			
			BasicOperation.selectByIndex(ElementJPDCSpecialTest.department, 0);
			// TODO: handle exception
		}

		BasicOperation.sendKeys(ElementJPDCSpecialTest.remarks, TestDataJPDC.remarks);
		
		BasicOperation.select(ElementJPDCSpecialTest.manufacturedLine, TestDataJPDC.manufacturerLineOthers);

		BasicOperation.select(ElementJPDCSpecialTest.manufacturerCapacity, TestDataJPDC.manufacturerCapacityOthers);

	
		BasicOperation.select(ElementJPDCSpecialTest.sampleCategory, TestDataJPDC.sampleCategory);

		BasicOperation.select(ElementJPDCSpecialTest.sampleType, TestDataJPDC.sample);

		BasicOperation.screenshot(screenshot[2]);

		BasicOperation.click(ElementJPDCSpecialTest.preRegisterSubmit);

		BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);
		
		int afterPreRegister=ElementJPDCSpecialTest.ARNumberList.size();
		
		System.out.println("After Pre Register in Grid --> "+afterPreRegister);
		
		
		String preRegisterNumber="";
		
		if(afterPreRegister==beforePreRegister+1)
		{
			System.out.println("Duplicate After Pre Register-----> Pass");
			
					
			preRegisterNumber=ElementJPDCSpecialTest.preRegisterNumberList.get(0).getText();
					
			
		}
		else if(afterPreRegister>beforePreRegister+1)
		{
			int a=afterPreRegister-beforePreRegister ;
			
			System.out.println("It displays "+a + "times in Grid" );
		}
		
		
		
	
		
		

		BasicOperation.screenshot(screenshot[3]);
		
		
		System.out.println("Pre Register Number is-->"+preRegisterNumber);

		BasicOperation.wait(ElementJPDCSpecialTest.genericRegistrationAction);
	
		
		return preRegisterNumber;
	}

	
	public static String domnicaRoutine(String[] screenshot) throws IOException, InterruptedException, HeadlessException, AWTException {
		
		System.out.println("Registration Type ---> Claim Test");
		
		
		Elem
		
		PageFactory.initElements(driver, ElementDomnica.class);
		
		int beforePreRegister=ElementJPDCRequestTest.ARNumberList.size();
		
		System.out.println("Before Pre Register in Grid --> "+beforePreRegister);

		BasicOperation.screenshot(screenshot[0]);

		BasicOperation.wait(ElementJPDCRequestTest.genericRegistrationAction);

		BasicOperation.exception(ElementJPDCRequestTest.genericRegistrationAction);

		ElementGenericRegistration.sampleTypePreRegister.click();

		try {
			BasicOperation.exception(ElementJPDCRequestTest.remarks);
			
			System.out.println(" Pre Register Popup is Displayed");
			
		} catch (Exception e) {
			System.out.println(" Pre Register Popup is not Displayed");
		}
		

	//	BasicOperation.screenshot(screenshot[1]);

		BrowserOperation.implicitWait(1);

		BasicOperation.select(ElementJPDCRequestTest.client, TestDataJPDC.client);

//		BasicOperation.select(ElementJPDCRequestTest.clientSite, TestDataJPDC.clientSite);

//		BasicOperation.sendKeys(ElementJPDCRequestTest.telephoneNumber, TestDataJPDC.telephoneNumber);

//		BasicOperation.sendKeys(ElementJPDCRequestTest.email, TestDataJPDC.email);

//		BasicOperation.select(ElementJPDCRequestTest.department, TestDataJPDC.department);

	//	Date.dateEnter(ElementJPDCRequestTest.manufacturerDate);

/*		BasicOperation.select(ElementJPDCRequestTest.manufacturerLine, TestDataJPDC.manufacturerLineOthers);

		BasicOperation.select(ElementJPDCRequestTest.manufacturerCapacity, TestDataJPDC.manufacturerCapacityOthers);

		BasicOperation.select(ElementJPDCRequestTest.sampleOpened, TestDataJPDC.sampleOPenedOpenKorean);

		
		try {
			BasicOperation.select(ElementJPDCRequestTest.claimType, TestDataJPDC.claimTypeMatter);
			
		} catch (Exception e) {
			BasicOperation.select(ElementJPDCRequestTest.claimType, TestDataJPDC.claimTypeMatterKorean);
			// TODO: handle exception
		}
		
	*/

		// Date.dateEnter(ElementJPDCRequestTest.dueDate);

	/*	BasicOperation.sendKeys(ElementJPDCRequestTest.remark, TestDataJPDC.remarks);
		
		try {
			BasicOperation.select(ElementJPDCRequestTest.securityData, TestDataJPDC.securityDataYes);
			
		} catch (Exception e) {
			BasicOperation.select(ElementJPDCRequestTest.securityData, TestDataJPDC.securityDataYesKorean);
			// TODO: handle exception
		}
*/		
		

		BasicOperation.select(ElementJPDCRequestTest.sampleCategory, TestDataJPDC.sampleCategory);

		BasicOperation.select(ElementJPDCRequestTest.sampleType, TestDataJPDC.sample);

		BasicOperation.screenshot(screenshot[2]);

		BasicOperation.click(ElementJPDCRequestTest.preRegisterSubmit);

		BasicOperation.wait(ElementGenericRegistration.genericRegistrationAction);
		
		int afterPreRegister=ElementJPDCRequestTest.ARNumberList.size();
		
		System.out.println("After Pre Register in Grid --> "+afterPreRegister);
		
		
		String preRegisterNumber="";
		
		if(afterPreRegister==beforePreRegister+1)
		{
			System.out.println("Duplicate After Pre Register-----> Pass");
			
					
			preRegisterNumber=ElementJPDCRequestTest.preRegisterNumberList.get(0).getText();
					
			
		}
		else if(afterPreRegister>beforePreRegister+1)
		{
			int a=afterPreRegister-beforePreRegister ;
			
			System.out.println("It displays "+a + "times in Grid" );
		}
		
		

		BasicOperation.screenshot(screenshot[3]);
		
		
		System.out.println("Pre Register Number is-->"+preRegisterNumber);

		BasicOperation.wait(ElementJPDCRequestTest.genericRegistrationAction);
	
		
		return preRegisterNumber;
	}
}
