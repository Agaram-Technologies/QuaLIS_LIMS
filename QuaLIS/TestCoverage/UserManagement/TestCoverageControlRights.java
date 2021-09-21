package UserManagement;

import java.awt.AWTException;


import java.awt.HeadlessException;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configuration.ElementFTPConfiguration;
import FlowMethod.MasterMethod;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageControlRights extends ElementAuditTrail {

	static int beforeCount;

	static int screenGridCount;
	
	public static void controlRightsAddAll(String userRole, String screenName) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementControlRights.class);
		
		BasicOperation.screenExpand(ElementControlRights.element());
				
		BasicOperation.selectByVisibleText( ElementControlRights.controlRightsFilterUserRole, userRole);

		ElementControlRights.controlRightsFilterFind.click();
		
		BasicOperation.exception(ElementControlRights.controlRightsScreenIcon);
		
		
		BrowserOperation.implicitWait(3);
		
		List<WebElement> screenList = ElementControlRights.controlRightsScreenList;

		try {
			screenList.get(0).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for(WebElement screen:screenList)
		{
			if(screen.getText().equals(screenName))
			{
				screen.click();
			}
			else
			{
				System.out.println("screen is not available");
			}
		}
		
		BasicOperation.exception(ElementControlRights.controlRightsAction);
		
		ElementControlRights.controlRightsAddRights.click();
		
		BasicOperation.exception(ElementControlRights.controlRightsSearchControl);
	

			if (ElementControlRights.controlRightsSelectAll.isDisplayed()) {

				ElementControlRights.controlRightsSelectAll.click();

				ElementControlRights.controlRightsAddSubmit.click();
			} else {
				ElementControlRights.controlRightsAddCancel.click();
			}

			BasicOperation.wait(ElementControlRights.controlRightsAction);
			
			BasicOperation.screenCollapse(ElementControlRights.element());
	
	}

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {

		BrowserOperation.launchLIMS();
		
		//FlowMethod.screenRights("");
		
		PageFactory.initElements(driver, ElementControlRights.class);
		
		ElementControlRights.masterIcon.click();

		ElementControlRights.userManagementIcon.click();

		ElementControlRights.controlRightsIcon.click();

		WebElement userRoleFilter = ElementControlRights.controlRightsFilterUserRole;

		Select userRoleSelect = new Select(userRoleFilter);

		userRoleSelect.selectByVisibleText("IT Admin");

		ElementControlRights.controlRightsFilterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementControlRights.controlRightsAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsAction));

		

		// List<WebElement>
		// d=driver.findElements(By.xpath("//*[@id=\"ID_CTRL_CTRLRIGHTSData_129\"]/div/div[1]/p"));

	
	}

	

	public static void auditTrailAdd() throws IOException, InterruptedException, HeadlessException, AWTException {

		// BrowserOperation.launchLIMS();

		String userRole = BasicOperation.timeValue();

	//	FlowMethod.userRole("Approver", "des");

		// beforeCount=TestCoverageAuditTrail.auditTrailBeforeCount( screenRights);

		System.out.println(beforeCount);
		int screenList = 0;

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

		List<WebElement> screenGridList = ElementControlRights.controlRightsScreenList;

		List<WebElement> screenCheckboxList = ElementControlRights.controlRightsScreenCheckboxList;

		/*
		 * File file= new File("E:\\Control\\ControlRights.xlsx");
		 * 
		 * FileInputStream fis = new FileInputStream(file);
		 * 
		 * XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook
		 * 
		 * XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we
		 * can update / modify it.
		 * 
		 * List<WebElement> screenList = ElementControlRights.controlRightsScreenList;
		 * 
		 * List<WebElement> screenCheckboxList =
		 * ElementControlRights.controlRightsScreenCheckboxList;
		 * 
		 * 
		 * 
		 */
		screenGridList.get(0).click();

		int a = screenGridList.size();

		// WebDriverWait wait1= new WebDriverWait(driver,100);

		// int column=0;

		for (int i = 0; i < a; i++) {

			int j = i + 1;
			String screen = screenGridList.get(i).getText();

			screenGridList.get(i).click();

			System.out.println(j + ". " + screen);

			/*
			 * XSSFRow row = worksheet.createRow(i);
			 * 
			 * 
			 * 
			 * XSSFCell cell = row.createCell(column);
			 * 
			 * cell.setCellValue(screen);
			 * 
			 */

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

					wait1.until(
							ExpectedConditions.elementToBeClickable(ElementControlRights.controlRightsSearchControl));

					ElementControlRights.controlRightsSearchControl.click();

				}

			} catch (Exception e) {
				Thread.sleep(500);
				ElementControlRights.controlRightsSearchControl.click();
			}

			if (ElementControlRights.controlRightsSelectAll.isDisplayed()) {
				ElementControlRights.controlRightsSelectAll.click();

				List<WebElement> controlList = ElementControlRights.controlRightsControlList;

				int controlListCount = controlList.size();

				ArrayList<String> controlName = new ArrayList<String>();

				for (WebElement d : controlList) {
					System.out.println(controlName.add(d.getText()));

				}

				/*
				 * int k=controlName.size();
				 * 
				 * int c=1; for(String cdf:controlName) {
				 * 
				 * 
				 * XSSFCell cd = row.createCell(c);
				 * 
				 * cd.setCellValue(cdf); c++;
				 * 
				 * }
				 */

				ElementControlRights.controlRightsAddSubmit.click();
			}

			else {
				ElementControlRights.controlRightsAddCancel.click();
			}

		}

		/*
		 * 
		 * 
		 * 
		 * 
		 * PageFactory.initElements(driver, ElementScreenRights.class);
		 * 
		 * ElementScreenRights.masterIcon.click();
		 * 
		 * ElementScreenRights.userManagementIcon.click();
		 * 
		 * ElementScreenRights.screenRightsIcon.click();
		 * 
		 * WebElement
		 * screenRightsFilterUserRole=ElementScreenRights.screenRightsFilterUserRole;
		 * 
		 * Select screenRightsFilterUserRoleSelect=new
		 * Select(screenRightsFilterUserRole);
		 * 
		 * screenRightsFilterUserRoleSelect.selectByVisibleText(userRole);
		 * 
		 * ElementScreenRights.screenRightsFilterFind.click();
		 * 
		 * WebDriverWait wait11 = new WebDriverWait(driver, 100);
		 * 
		 * wait11.until(ExpectedConditions.visibilityOf(ElementScreenRights.
		 * screenRightsAction));
		 * 
		 * wait11.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.
		 * screenRightsAction));
		 * 
		 * try { ElementScreenRights.screenRightsAction.click(); } catch (Exception e) {
		 * Thread.sleep(3000); ElementScreenRights.screenRightsAction.click(); }
		 * ElementScreenRights.screenRightsAddRights.click();
		 * 
		 * 
		 * try { ElementScreenRights.screenRightsSearchScreen.click(); } catch
		 * (Exception e) { Thread.sleep(3000);
		 * ElementScreenRights.screenRightsSearchScreen.click(); }
		 * if(ElementScreenRights.screenRightsSelectAll.isDisplayed()) {
		 * 
		 * ElementScreenRights.screenRightsSelectAll.click();
		 * 
		 * screenList=ElementScreenRights.screenRightsList.size();
		 * 
		 * 
		 * 
		 * ElementScreenRights.screenRightsAddSubmit.click();
		 * 
		 * } else { ElementScreenRights.screenRightsAddCancel.click(); }
		 * 
		 * 
		 * 
		 * wait11.until(ExpectedConditions.visibilityOf(ElementScreenRights.
		 * screenRightsAction));
		 * 
		 * wait11.until(ExpectedConditions.elementToBeClickable(ElementScreenRights.
		 * screenRightsAction));
		 * 
		 * 
		 * screenGridCount=ElementScreenRights.screenList.size();
		 * 
		 * System.out.println(screenGridCount);
		 * 
		 * if(screenList==screenGridCount) {
		 * System.out.println("Screen count matched in grid");
		 * 
		 * } else { System.out.println("Screen count Not matched in grid"); }
		 * 
		 * 
		 * 
		 * 
		 * ElementScreenRights.userManagementIcon.click();
		 * 
		 * ElementScreenRights.masterIcon.click();
		 * 
		 * 
		 * 
		 * 
		 * TestCoverageAuditTrail.auditTrailAfterScreenRights(controlRights);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

	}

}