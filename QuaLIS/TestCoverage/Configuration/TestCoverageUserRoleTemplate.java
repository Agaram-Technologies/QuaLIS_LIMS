package Configuration;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.RegistrationDetail;
import Utility.BrowserOperation;

public class TestCoverageUserRoleTemplate extends BrowserOperation

{
	
	
	
	
	/*
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String[] userRole= {reviewer, approver};
		
		LaunchCloseBrowser.launchLIMS();
		
		TestCoverageUserRoleTemplate.TestGroupAdd(userRole[1]);
		
		TestCoverageUserRoleTemplate.forensicAdd(userRole);
		
		TestCoverageUserRoleTemplate.environmentalAdd(userRole);
		
		TestCoverageUserRoleTemplate.sampleRegistrationAdd(userRole);
		
		TestCoverageUserRoleTemplate.instrumentAdd(userRole);
		
		TestCoverageUserRoleTemplate.materialAdd(userRole);
		
		
	}*/
	
	public static void userRoleTemplatePhilipines(String[]userRole, String routine,String instrument, String material) throws InterruptedException
	{
		//String[] userRoles= userRole;//{reviewer, approver};
			
		TestCoverageUserRoleTemplate.TestGroupAdd();
		
		TestCoverageUserRoleTemplate.philipinesRoutineFlow(userRole,routine);
		
		TestCoverageUserRoleTemplate.philipinesInstrumentFlow(userRole,instrument);
		
		TestCoverageUserRoleTemplate.philipinesMaterialFlow(userRole,material);
		
		
	}
	
	public static void userRoleTemplateUganda(String[]userRole, String routine,String instrument, String material) throws InterruptedException
	{
		//String[] userRoles= userRole;//{reviewer, approver};
			
		TestCoverageUserRoleTemplate.TestGroupAdd();
		
		
		
		TestCoverageUserRoleTemplate.environmentalAdd(userRole);;
		
		TestCoverageUserRoleTemplate.sampleRegistrationAdd(userRole);
		

		TestCoverageUserRoleTemplate.philipinesInstrumentFlow(userRole,instrument);
		
		TestCoverageUserRoleTemplate.philipinesMaterialFlow(userRole,material);
		
		
		
	}
	
	
	
	public static void userRoleTemplateHYLANDS(String[]userRole, String routine,String instrument, String material) throws InterruptedException
	{
		String[] userRoles= userRole;//{reviewer, approver};
			
	//	TestCoverageUserRoleTemplate.TestGroupAdd();
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole,"Purified Water");
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole,"Purified Water");
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole,"Purified Water");
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole,"Purified Water");
		
	}
	
	
	
	
	
	
	
	
	

	public static void userRoleTemplateIrsha(String[]userRole, String instrument, String material) throws InterruptedException
	{
		//String[] userRoles= userRole;//{reviewer, approver};
			
		TestCoverageUserRoleTemplate.TestGroupAdd();
		
	//	TestCoverageUserRoleTemplate.philipinesRoutineFlow(userRole,routine);
		
		TestCoverageUserRoleTemplate.philipinesInstrumentFlow(userRole,instrument);
		
		TestCoverageUserRoleTemplate.philipinesMaterialFlow(userRole,material);
		
		
	}
	
	
	public static void TestGroupAdd() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementUserRoleTemplate.class);
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
		

		WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

		Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

		userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Test Group Approval");
		
		
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
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys("Test Group");
		
		/*
		WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

		Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

		userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole);*/
		
		ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();
	
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
		
	}
	
	
	
	
	
	public static void userRoleTemplate(String[]userRole, String registrationType) throws InterruptedException
	{
		
		String registrationSubType=RegistrationDetail.registrationType(registrationType);
		
		String dropValue="";
		
		if(registrationType.equals(RegistrationDetail.purifiedWater))
		{
			dropValue="20";
		}
		else if (registrationType.equals(RegistrationDetail.rawMaterial)) {
			dropValue="21";
		}
		
		else if (registrationType.equals(RegistrationDetail.intermediate)) {
			dropValue="22";
		}
		
		else if (registrationType.equals(RegistrationDetail.bulkProduct)) {
			dropValue="23";
		}
		
		else if (registrationType.equals(RegistrationDetail.finishedGoods)) {
			dropValue="24";
		}
		
		else if (registrationType.equals(RegistrationDetail.stabilityStudies)) {
			dropValue="25";
		}
		
		else if (registrationType.equals(RegistrationDetail.externallyManufactured)) {
			dropValue="26";
		}

		else if (registrationType.equals(RegistrationDetail.externallyManufactured)) {
			dropValue="31";
		}
		
		
		
		
		
		PageFactory.initElements(driver, ElementUserRoleTemplate.class);
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
		

		WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

		Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

		userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
		
	
		
		WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

		Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

		
		System.out.println();
		
		try {
			userRoleTemplateRegistrationTypeSelect.selectByVisibleText(registrationType);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			userRoleTemplateRegistrationTypeSelect.selectByValue(dropValue);
		}
		
		
	
		
		WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

		Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);
/*
	
		
		try {
			userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText(registrationSubType);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			userRoleTemplateRegistrationSubTypeSelect.selectByValue(dropValue);
		}
		*/
		
		
		
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
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys(registrationType);
		
		
		WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

		Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

		userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[1]);
		
		
		
		ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
		
		
		WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

		Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

		userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[0]);
		
	
		
		ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();
		
		
	
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
	}
	
	

	public static void environmentalAdd(String[]userRole) throws InterruptedException
	{
PageFactory.initElements(driver, ElementUserRoleTemplate.class);
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
		

		WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

		Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

		userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
		
	
		
		WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

		Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

		userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Environmental");
		
	
		
		WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

		Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

		userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Environmental");
		
	
		
		
		
		
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
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys("Environmental");
		
		
		
		WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

		Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

		userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[1]);
		
		
		
		ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
		
		
		WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

		Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

		userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[0]);
		
	
		
	
		
		ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();
	
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
	}

	public static void sampleRegistrationAdd(String[]userRole) throws InterruptedException
	{
PageFactory.initElements(driver, ElementUserRoleTemplate.class);
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
		

		WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

		Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

		userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
		
	
		
		WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

		Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

		userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Sample Registration");
		
	
		
		WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

		Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

		userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Sample Registration");
		
	
		
		
		
		
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
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys("Sample Registration");
		
		
		
		WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

		Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

		userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[1]);
		
		
		
		ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
		
		
		WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

		Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

		userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[0]);
		
	
	
		
		ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();
	
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
	}

	public static void philipinesInstrumentFlow(String[]userRole,String instrument) throws InterruptedException
	{
PageFactory.initElements(driver, ElementUserRoleTemplate.class);
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
		

		WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

		Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

		userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
		
	
		
		WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

		Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

		userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Instrument Samples");
		
	
		
		WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

		Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

		userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Instrument");
		
	
		
		
		
		
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
		


		try {
			ElementUserRoleTemplate.userRoleTemplate.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUserRoleTemplate.userRoleTemplate.click();

		}
		
		
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys(instrument);
		
		
		
		WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

		Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

		userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[2]);
		
		
		
		ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
		
		
		WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

		Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

		userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[1]);
		

		
		ElementUserRoleTemplate.userRoleTemplateAddRoleTwo.click();
		
		
		WebElement userRoleTemplateRole = ElementUserRoleTemplate.userRoleTemplateThirdRole;

		Select userRoleTemplateThirdRoleSelect = new Select(userRoleTemplateRole);

		userRoleTemplateThirdRoleSelect.selectByVisibleText(userRole[0]);
		

		
		ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
	}

	public static void philipinesMaterialFlow(String[]userRole,String material) throws InterruptedException
	{
PageFactory.initElements(driver, ElementUserRoleTemplate.class);
		
		PageFactory.initElements(driver, ElementApprovalConfiguration.class);
		
		ElementUserRoleTemplate.masterIcon.click();
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementApprovalConfiguration.approvalConfigurationIcon.click();
		
		ElementUserRoleTemplate.userRoleTemplateIcon.click();
		

		WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

		Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

		userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
		
	
		
		WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

		Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

		userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Material");
		
	
		
		WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

		Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

		userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Material");
		
	
		
		
		
		
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
		


		try {
			ElementUserRoleTemplate.userRoleTemplate.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementUserRoleTemplate.userRoleTemplate.click();

		}
		
		
		
		ElementUserRoleTemplate.userRoleTemplate.sendKeys(material);
		
		
		
		WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

		Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

		userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[2]);
		
		
		
		ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
		
		
		WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

		Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

		userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[1]);
		

		
		ElementUserRoleTemplate.userRoleTemplateAddRoleTwo.click();
		
		
		WebElement userRoleTemplateRole = ElementUserRoleTemplate.userRoleTemplateThirdRole;

		Select userRoleTemplateThirdRoleSelect = new Select(userRoleTemplateRole);

		userRoleTemplateThirdRoleSelect.selectByVisibleText(userRole[0]);
		

		
		ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
		
		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.userRoleTemplateAction.click();
		
		ElementUserRoleTemplate.userRoleTemplateApprove.click();

		wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
		
		wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
		
		ElementUserRoleTemplate.configurationIcon.click();
		
		ElementUserRoleTemplate.masterIcon.click();
	}


public static void philipinesRoutineFlow(String[]userRole, String routine) throws InterruptedException
{
	PageFactory.initElements(driver, ElementUserRoleTemplate.class);
	
	PageFactory.initElements(driver, ElementApprovalConfiguration.class);
	
	ElementUserRoleTemplate.masterIcon.click();
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementApprovalConfiguration.approvalConfigurationIcon.click();
	
	ElementUserRoleTemplate.userRoleTemplateIcon.click();
	

	WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

	Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

	userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
	

	
	WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

	Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

	userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Routine");
	

	
	WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

	Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

	userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Routine");
	

	
	
	
	
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
	
	
	

	try {
		ElementUserRoleTemplate.userRoleTemplate.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ElementUserRoleTemplate.userRoleTemplate.click();

	}
	
	
	
	ElementUserRoleTemplate.userRoleTemplate.sendKeys(routine);
	
	
	
	WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

	Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

	userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[2]);
	
	
	
	ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
	
	
	WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

	Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

	userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[1]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddRoleTwo.click();
	
	
	WebElement userRoleTemplateRole = ElementUserRoleTemplate.userRoleTemplateThirdRole;

	Select userRoleTemplateThirdRoleSelect = new Select(userRoleTemplateRole);

	userRoleTemplateThirdRoleSelect.selectByVisibleText(userRole[0]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.userRoleTemplateAction.click();
	
	ElementUserRoleTemplate.userRoleTemplateApprove.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementUserRoleTemplate.masterIcon.click();
}

public static void ugandaForensic(String[]userRole, String routine) throws InterruptedException
{
	PageFactory.initElements(driver, ElementUserRoleTemplate.class);
	
	PageFactory.initElements(driver, ElementApprovalConfiguration.class);
	
	ElementUserRoleTemplate.masterIcon.click();
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementApprovalConfiguration.approvalConfigurationIcon.click();
	
	ElementUserRoleTemplate.userRoleTemplateIcon.click();
	

	WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

	Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

	userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
	

	
	WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

	Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

	userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Forensics");
	

	
	WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

	Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

	userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Forensics");
	

	
	
	
	
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
	
	
	

	try {
		ElementUserRoleTemplate.userRoleTemplate.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ElementUserRoleTemplate.userRoleTemplate.click();

	}
	
	
	
	ElementUserRoleTemplate.userRoleTemplate.sendKeys(routine);
	
	
	
	WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

	Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

	userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[2]);
	
	
	
	ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
	
	
	WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

	Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

	userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[1]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddRoleTwo.click();
	
	
	WebElement userRoleTemplateRole = ElementUserRoleTemplate.userRoleTemplateThirdRole;

	Select userRoleTemplateThirdRoleSelect = new Select(userRoleTemplateRole);

	userRoleTemplateThirdRoleSelect.selectByVisibleText(userRole[0]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.userRoleTemplateAction.click();
	
	ElementUserRoleTemplate.userRoleTemplateApprove.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementUserRoleTemplate.masterIcon.click();
}

public static void uganda(String[]userRole, String routine) throws InterruptedException
{
	PageFactory.initElements(driver, ElementUserRoleTemplate.class);
	
	PageFactory.initElements(driver, ElementApprovalConfiguration.class);
	
	ElementUserRoleTemplate.masterIcon.click();
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementApprovalConfiguration.approvalConfigurationIcon.click();
	
	ElementUserRoleTemplate.userRoleTemplateIcon.click();
	

	WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

	Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

	userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
	

	
	WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

	Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

	userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Environmental");
	

	
	WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

	Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

	userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Environmental");
	

	
	
	
	
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
	
	
	

	try {
		ElementUserRoleTemplate.userRoleTemplate.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ElementUserRoleTemplate.userRoleTemplate.click();

	}
	
	
	
	ElementUserRoleTemplate.userRoleTemplate.sendKeys(routine);
	
	
	
	WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

	Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

	userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[2]);
	
	
	
	ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
	
	
	WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

	Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

	userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[1]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddRoleTwo.click();
	
	
	WebElement userRoleTemplateRole = ElementUserRoleTemplate.userRoleTemplateThirdRole;

	Select userRoleTemplateThirdRoleSelect = new Select(userRoleTemplateRole);

	userRoleTemplateThirdRoleSelect.selectByVisibleText(userRole[0]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.userRoleTemplateAction.click();
	
	ElementUserRoleTemplate.userRoleTemplateApprove.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementUserRoleTemplate.masterIcon.click();
}

public static void ugandaSampleRegistration(String[]userRole, String routine) throws InterruptedException
{
	PageFactory.initElements(driver, ElementUserRoleTemplate.class);
	
	PageFactory.initElements(driver, ElementApprovalConfiguration.class);
	
	ElementUserRoleTemplate.masterIcon.click();
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementApprovalConfiguration.approvalConfigurationIcon.click();
	
	ElementUserRoleTemplate.userRoleTemplateIcon.click();
	

	WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

	Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

	userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
	

	
	WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

	Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

	userRoleTemplateRegistrationTypeSelect.selectByVisibleText("Sample Registration");
	

	
	WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

	Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

	userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText("Sample Registration");
	

	
	
	
	
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
	
	
	

	try {
		ElementUserRoleTemplate.userRoleTemplate.click();
	} catch (Exception e) {
		Thread.sleep(2000);

		ElementUserRoleTemplate.userRoleTemplate.click();

	}
	
	
	
	ElementUserRoleTemplate.userRoleTemplate.sendKeys(routine);
	
	
	
	WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

	Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

	userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[2]);
	
	
	
	ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
	
	
	WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

	Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

	userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[1]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddRoleTwo.click();
	
	
	WebElement userRoleTemplateRole = ElementUserRoleTemplate.userRoleTemplateThirdRole;

	Select userRoleTemplateThirdRoleSelect = new Select(userRoleTemplateRole);

	userRoleTemplateThirdRoleSelect.selectByVisibleText(userRole[0]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.userRoleTemplateAction.click();
	
	ElementUserRoleTemplate.userRoleTemplateApprove.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementUserRoleTemplate.masterIcon.click();
}




public static void bulkProduct(String[]userRole, String registrationType) throws InterruptedException
{
	PageFactory.initElements(driver, ElementUserRoleTemplate.class);
	
	PageFactory.initElements(driver, ElementApprovalConfiguration.class);
	
	ElementUserRoleTemplate.masterIcon.click();
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementApprovalConfiguration.approvalConfigurationIcon.click();
	
	ElementUserRoleTemplate.userRoleTemplateIcon.click();
	

	WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

	Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

	userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
	

	
	WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

	Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

	userRoleTemplateRegistrationTypeSelect.selectByVisibleText(registrationType);
	

	
	WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

	Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

	userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText(registrationType);
	
	
	
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
	
	ElementUserRoleTemplate.userRoleTemplate.sendKeys(registrationType);
	
	
	WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

	Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

	userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[1]);
	
	
	
	ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
	
	
	WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

	Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

	userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[0]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.userRoleTemplateAction.click();
	
	ElementUserRoleTemplate.userRoleTemplateApprove.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementUserRoleTemplate.masterIcon.click();
}


public static void userRoleTemplateAdd(String registrationSubType,String[]userRole) throws InterruptedException
{
	PageFactory.initElements(driver, ElementUserRoleTemplate.class);
	
	PageFactory.initElements(driver, ElementApprovalConfiguration.class);
	
	ElementUserRoleTemplate.masterIcon.click();
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementApprovalConfiguration.approvalConfigurationIcon.click();
	
	ElementUserRoleTemplate.userRoleTemplateIcon.click();
	
	String registrationType="";
	

	WebElement userRoleTemplateFilterApprovalType = ElementUserRoleTemplate.userRoleTemplateFilterApprovalType;

	Select userRoleTemplateFilterApprovalTypeSelect = new Select(userRoleTemplateFilterApprovalType);

	userRoleTemplateFilterApprovalTypeSelect.selectByVisibleText("Registration Approval");
	

	
	WebElement userRoleTemplateRegistrationType = ElementUserRoleTemplate.userRoleTemplateRegistrationType;

	Select userRoleTemplateRegistrationTypeSelect = new Select(userRoleTemplateRegistrationType);

	userRoleTemplateRegistrationTypeSelect.selectByVisibleText(registrationType);
	

	
	WebElement userRoleTemplateRegistrationSubType = ElementUserRoleTemplate.userRoleTemplateRegistrationSubType;

	Select userRoleTemplateRegistrationSubTypeSelect = new Select(userRoleTemplateRegistrationSubType);

	userRoleTemplateRegistrationSubTypeSelect.selectByVisibleText(registrationSubType);
	

	
	
	
	
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
	
	ElementUserRoleTemplate.userRoleTemplate.sendKeys(registrationSubType);
	
	
	WebElement userRoleTemplateFirstRole = ElementUserRoleTemplate.userRoleTemplateFirstRole;

	Select userRoleTemplateFirstRoleSelect = new Select(userRoleTemplateFirstRole);

	userRoleTemplateFirstRoleSelect.selectByVisibleText(userRole[1]);
	
	
	
	ElementUserRoleTemplate.userRoleTemplateAddRoleOne.click();
	
	
	WebElement userRoleTemplateSecondRole = ElementUserRoleTemplate.userRoleTemplateSecondRole;

	Select userRoleTemplateSecondRoleSelect = new Select(userRoleTemplateSecondRole);

	userRoleTemplateSecondRoleSelect.selectByVisibleText(userRole[0]);
	

	
	ElementUserRoleTemplate.userRoleTemplateAddSubmit.click();
	
	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.userRoleTemplateAction.click();
	
	ElementUserRoleTemplate.userRoleTemplateApprove.click();

	wait11.until(ExpectedConditions.visibilityOf(ElementUserRoleTemplate.userRoleTemplateAction));
	
	wait11.until(ExpectedConditions.elementToBeClickable(ElementUserRoleTemplate.userRoleTemplateAction));		
	
	ElementUserRoleTemplate.configurationIcon.click();
	
	ElementUserRoleTemplate.masterIcon.click();
}


	public static void userRoleTemplateHYLANDS(String[]userRole) throws InterruptedException
	{
	//	TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.bulkProduct);
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.intermediate);
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.rawMaterial);
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.purifiedWater);
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.finishedGoods);
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.externallyManufactured);
		
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.stabilityStudies);
	}

/*
	public static void userRoleTemplateDOMNICA(String[]userRole) throws InterruptedException
	{	
		TestCoverageUserRoleTemplate.userRoleTemplate(userRole, RegistrationDetail.dominica);
	}

*/


}