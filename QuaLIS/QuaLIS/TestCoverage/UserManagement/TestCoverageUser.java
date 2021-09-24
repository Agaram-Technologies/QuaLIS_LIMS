package UserManagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseMaster.ElementUnit;
import Config.TestDataName;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageUser  extends BrowserOperation{

	public static void userUserRoleAdd(String user, String userRole) throws InterruptedException {
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
		
		boolean element=false;
		
		for(int i=0; i<1000; i++)
		{
			if(element==true)
			{
				break;
			}
			
			try 
			{
				ElementUsers.usersUserRoleAction.click();
				
				element=true;
				
				if(element==true)
				{
					break;
				}
				
				
			} 
			catch 
			(Exception e)
			{
				Thread.sleep(100);
				try
				{
					ElementUsers.usersUserRoleAction.click();
					
					
					element=true;
					
					if(element==true)
					{
						break;
					}
					
				}
				catch (Exception e1) {
					// TODO: handle exception
				}
			
			
			}
		}

	/*	try {
			ElementUsers.usersUserRoleAction.click();

		} catch (Exception e) {
			Thread.sleep(3000);
			
			

			ElementUsers.usersUserRoleAction.click();
		}*/

		ElementUsers.usersUserRoleAdd.click();
		WebElement userRoleElement = ElementUsers.usersUserRole;

		Select userRoleSelect = new Select(userRoleElement);

		userRoleSelect.selectByVisibleText(userRole);

		ElementUsers.usersUserRoleAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersUserRoleAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersUserRoleAction));
		
		PageFactory.initElements(driver, ElementUserRole.class);
		
		ElementUserRole.userRoleIcon.click();

		ElementUsers.userManagementIcon.click();

		ElementUsers.masterIcon.click();

	}

	public static void userAdd(String loginID, String firstName, String lastName,String signature, String email, String qualification,
			String bloodGroup, String address, String designation, String department, String country)
			throws InterruptedException, AWTException {
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
		
		BasicOperation.exception(ElementUsers.usersloginID);
		
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
			
			
			
			ElementUsers.usersMobileNumber.click();
			
		/*	
			Robot rob=new Robot();
			
			rob.keyPress(KeyEvent.VK_TAB);
			
			rob.keyRelease(KeyEvent.VK_TAB);

			rob.keyPress(KeyEvent.VK_TAB);

			rob.keyRelease(KeyEvent.VK_TAB);

			rob.keyPress(KeyEvent.VK_ENTER);

			rob.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);

			
			StringSelection fileLocationString=new StringSelection(signature);
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocationString, null);
			
				
			rob.keyPress(KeyEvent.VK_CONTROL);
			
			rob.keyPress(KeyEvent.VK_V);
			
			rob.keyRelease(KeyEvent.VK_V);
			
			rob.keyRelease(KeyEvent.VK_CONTROL);
			
			
		rob.keyPress(KeyEvent.VK_ENTER);
			
			rob.keyRelease(KeyEvent.VK_ENTER);
			
			

			if (ElementUsers.usersActive.isSelected() == false) {
				ElementUsers.usersActive.click();
			}

			if (ElementUsers.usersUnlock.isSelected() == false) {
				ElementUsers.usersUnlock.click();
			}*/

			ElementUsers.usersAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementUsers.usersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementUsers.usersAction));

		ElementUsers.userManagementIcon.click();

		ElementUsers.masterIcon.click();

	}
	
	
	public static void userAddAllField()
	{
		
	}
	
	public static void userAddMandatoryField()
	{
		
	}
	
	public static void userDeleteAllField()
	{
		
	}
	
	public static void userDeleteMandatoryField()
	{
		
	}
	
	public static void userEditLoginID()
	{
		
	}
	
	public static void userEditFirstName()
	{
		
	}
	
	public static void userEditSecondName()
	{
		
	}
	
	public static void userEditEmpID()
	{
		
	}
	
	public static void userEditDateOfJoin()
	{
		
	}
	
	public static void userEditDesignation()
	{
		
	}
	
	public static void userEditDepartment()
	{
		
	}
	
	public static void userEditQualification()
	{
		
	}
	
	public static void userEditBloodGroup()
	{
		
	}
	
	public static void userEditJobDescription()
	{
		
	}
	
	public static void userEditAddressOne()
	{
		
	}
	
	public static void userEditAddressTwo()
	{
		
	}
	
	public static void userEditAddressThree()
	{
		
	}
	
	public static void userEditCountry()
	{
		
	}
	
	public static void userEditEmail()
	{
		
	}
	
	public static void userEditPhoneNumber()
	{
		
	}
	
	public static void userEditMobileNumber()
	{
		
	}
	
	public static void userEditSignatureFile()
	{
		
	}
	
	public static void userEditUserFile()
	{
		
	}
	
	public static void userEditIsActive(HashMap<String, String> user) throws InterruptedException
	{
		String loginID=user.get(TestDataName.loginIDAdd);
		
		PageFactory.initElements(driver, ElementUsers.class);

		ElementUsers.masterIcon.click();

		ElementUsers.userManagementIcon.click();

		ElementUsers.usersIcon.click();
		
		BasicOperation.exception(ElementUsers.usersTab);
		

		List<WebElement> usersList = ElementUsers.usersList;

		List<WebElement> usersCheckboxList = ElementUsers.usersCheckboxList;

		for (WebElement users : usersList) {
			if (users.getText().equals(loginID)) {
				int i = usersList.indexOf(users);

				String checkBoxStatus = usersCheckboxList.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					users.click();
				}

			}
		}
		
			
		BasicOperation.exception(ElementUsers.usersAction);
		
		ElementUsers.usersEdit.click();
			
		BasicOperation.exception(ElementUsers.usersloginID);
		
	}
	
	public static void userEditIsActiveYesToNo(HashMap<String, String> user) throws InterruptedException
	{
		
		String loginID=user.get(TestDataName.loginIDAdd);
		
		PageFactory.initElements(driver, ElementUsers.class);

		ElementUsers.masterIcon.click();

		ElementUsers.userManagementIcon.click();

		ElementUsers.usersIcon.click();
		
		BasicOperation.exception(ElementUsers.usersTab);
		

		List<WebElement> usersList = ElementUsers.usersList;

		List<WebElement> usersCheckboxList = ElementUsers.usersCheckboxList;

		for (WebElement users : usersList) {
			if (users.getText().equals(loginID)) {
				int i = usersList.indexOf(users);

				String checkBoxStatus = usersCheckboxList.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					users.click();
				}

			}
		}
		
			
		BasicOperation.exception(ElementUsers.usersAction);
		
		ElementUsers.usersEdit.click();
			
		BasicOperation.exception(ElementUsers.usersloginID);
		
		ElementUsers.usersActive.click();
		
		ElementUsers.usersEditSubmit.click();
		
		BasicOperation.wait(ElementUsers.usersAction);
		
		ElementUsers.homeIcon.click();
		
		ElementUsers.userManagementIcon.click();
		
		ElementUsers.masterIcon.click();
		
	}
	
	
	
	public static void userEditIsActiveNoToYes(HashMap<String, String> user) throws InterruptedException
	{
		String loginID=TestDataName.loginIDAdd;
		
		PageFactory.initElements(driver, ElementUsers.class);

		ElementUsers.masterIcon.click();

		ElementUsers.userManagementIcon.click();

		ElementUsers.usersIcon.click();
		
		BasicOperation.exception(ElementUsers.usersTab);
		

		List<WebElement> usersList = ElementUsers.usersList;

		List<WebElement> usersCheckboxList = ElementUsers.usersCheckboxList;

		for (WebElement users : usersList) {
			if (users.getText().equals(loginID)) {
				int i = usersList.indexOf(users);

				String checkBoxStatus = usersCheckboxList.get(i).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					users.click();
				}

			}
		}
		
			
		BasicOperation.exception(ElementUsers.usersAction);
		
		ElementUsers.usersEdit.click();
			
		BasicOperation.exception(ElementUsers.usersloginID);
		
		ElementUsers.usersActive.click();
		
		ElementUsers.usersEditSubmit.click();
		
		BasicOperation.wait(ElementUsers.usersAction);
		
		ElementUsers.homeIcon.click();
		
		ElementUsers.userManagementIcon.click();
		
		ElementUsers.masterIcon.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
