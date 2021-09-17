package UserManagement;

import java.awt.AWTException;



import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageAuditTrail extends ElementAuditTrail {
	/*
	 * public static String moduleName=null;
	 * 
	 * public static String screenName=null;
	 * 
	 * public static String gridScreenName=null;
	 * 
	 * public static String gridAuditAction=null;
	 * 
	 * public static String gridText=null;
	 * 
	 * public static String screenName=null;
	 * 
	 * public static String moduleName=null;
	 * 
	 * public static String screenName=null;
	 * 
	 * public static String moduleName=null;
	 * 
	 * public static String screenName=null;
	 * 
	 * public static String moduleName=null;
	 * 
	 * public static String screenName=null;
	 * 
	 *
	 *
	 */
	
	public static String multipleRecord="";
	
	public static int beforeCount;
	
	public static int afterCount;
	
	public static int beforeCountAuditTrail;
	
	public static int afterCountAuditTrail;

	
	public static void grid(String screen, int a, String all, String ids) throws InterruptedException, HeadlessException, IOException, AWTException
	{
		PageFactory.initElements(driver, ElementAuditTrail.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();


		ElementAuditTrail.auditTrailIcon.click();

		String module = TestCoverageAuditTrail.auditTrailModule(screen);

	
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();
		
		BasicOperation.exception(ElementAuditTrail.auditTrailTabHeader);
		
		List<WebElement> d = ElementAuditTrail.auditActionList;
		
		List<WebElement> t = ElementAuditTrail.termsList;
		
		List<WebElement> des = ElementAuditTrail.descriptionList;
		
		BrowserOperation.implicitWait(1);
		
		boolean f=false;
		
		try {
			
			d.get(0).click();
			
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		BrowserOperation.implicitWait(1);
		
		
		
		if(f==true)
		{
			for(int i=0; i<a; i++)
			{
				d.get(i).click();
				
				BasicOperation.screenshot(all+i+1);
				
				for(int j=0; j<des.size(); j++)
				{
					String description=descriptionList.get(j).getText();
					
					if(description.contains("ids")||description.contains("IDS"))
					{
						BasicOperation.screenshot(ids+j+1);
					}
				}
				
			}
		}
		
		
		ElementAuditTrail.homeIcon.click();
	
		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();
		
		
	}
	
	
	
	public static String auditTrailModule(String screen) {

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}

		else {
			System.out.println(screen);
		}

		return module;

	}

	public static int auditTrailCount(String screen,String file) throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();


		ElementAuditTrail.auditTrailIcon.click();

		String module = TestCoverageAuditTrail.auditTrailModule(screen);

	
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();
		
		System.out.println("find");
		
		
		try {
			
			BasicOperation.exception(ElementAuditTrail.auditTrailTabHeader);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		System.out.println("tab he");
	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> d = ElementAuditTrail.auditActionList;

		int i=0;
		
		try {
			
			i = d.size();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("list");
		
		
	//	BasicOperation.screenshot(file);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		BasicOperation.wait(ElementAuditTrail.auditTrailIcon);
		
		ElementAuditTrail.homeIcon.click();
	
		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

		return i;

	}

	public static String auditTrailBeforeCoun(String screen) throws IOException, HeadlessException, AWTException {
		
		PageFactory.initElements(driver, ElementAuditTrail.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}

		else {
			System.out.println(screen);
		}

		
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();
		
		
		try {
			
			BasicOperation.exception(ElementAuditTrail.auditTrailTabHeader);
			
		} catch (Exception e) {
			
			System.out.println("Loader issue after clicked the ");
			// TODO: handle exception
		}

		List<WebElement> list = ElementAuditTrail.auditActionList;

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

		return list.get(0).getText();

	}

	public static void auditTrailDetail(String screen) {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}

		else {
			System.out.println(screen);
		}

		/*
		 * else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * }
		 * 
		 */
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		List<WebElement> screenList = ElementAuditTrail.screenList;

		String[] arr = {};

	}

	public static void auditTrail(String screen) throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}

		else {
			System.out.println(screen);
		}

		/*
		 * else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * }
		 * 
		 */
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		String file = "D:\\QuaLIS\\AuditTrail\\Flow\\" + screen + ".png";

		BasicOperation.screenshot(file);

		List<WebElement> descriptionList = ElementAuditTrail.descriptionList;

		// moduleName=descriptionList.get(0).getText();

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

	}

	public static void auditTrailFull(String screen, int i) throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String moduleName = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			moduleName = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			moduleName = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			moduleName = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			moduleName = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			moduleName = sampleManagement;
		}

		else if (screen.equals(country)) {
			moduleName = contacts;
		}

		else {
			System.out.println(screen);
		}

		/*
		 * else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * }
		 * 
		 */
		Select module = new Select(ElementAuditTrail.filterModule);

		module.selectByVisibleText(moduleName);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		int j = i + 1;

		String file = "D:\\QuaLIS\\AuditTrail\\Flow\\" + j + "." + screen + ".png";

		BasicOperation.screenshot(file);

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

	}

	public static void auditTrailExcel(String moduleName, String screenName) throws IOException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		Select module = new Select(ElementAuditTrail.filterModule);

		module.selectByVisibleText(moduleName);

		Select screen = new Select(ElementAuditTrail.filterScreen);

		screen.selectByVisibleText(screenName);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		///////////
		File file = new File("D:\\QuaLIS\\AuditTrail\\AuditTrail.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook

		XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.

		//////
		List<WebElement> screenList = ElementAuditTrail.screenList;

		List<WebElement> ActionList = ElementAuditTrail.auditActionList;

		List<WebElement> termsList = ElementAuditTrail.termsList;

		List<WebElement> descriptionList = ElementAuditTrail.descriptionList;

		int screenSize = screenList.size();

		int termsSize = termsList.size();

		int descriptionSize = descriptionList.size();

		for (int i = 0; i < screenSize; i++) {
			if (i == 0) {
				// int a=i+1;

				Row row = worksheet.createRow(1);

				// Row row1 = worksheet.createRow(arg0)

				Row row2 = worksheet.createRow(2);
				Cell cell1 = row.createCell(1);

				cell1.setCellValue(moduleName);

				Cell cell2 = row.createCell(2);

				cell2.setCellValue(screenName);

				Cell cell3 = row.createCell(3);

				cell3.setCellValue(screenList.get(i).getText());

				Cell cell4 = row.createCell(4);

				cell4.setCellValue(ActionList.get(i).getText());

				/*
				 * System.out.println();
				 * 
				 * System.out.println();
				 */

				for (int j = 0; j < termsSize; j++) {

					int a = j + 5;

					Cell cell5 = row.createCell(a);

					cell5.setCellValue(termsList.get(j).getText());

					// System.out.println(descriptionList.get(j).getText());

				}

				for (int j = 0; j < descriptionSize; j++) {

					int a = j + 5;

					Cell cell6 = row2.createCell(a);

					cell6.setCellValue(descriptionList.get(j).getText());

					// System.out.println(descriptionList.get(j).getText());

				}

			}

		}

		fis.close();

		FileOutputStream fos = new FileOutputStream(file);

		wb.write(fos);

		wb.close();

	}

	public static void auditTrailExcelConsole(String moduleName, String screenName) {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		Select module = new Select(ElementAuditTrail.filterModule);

		module.selectByVisibleText(moduleName);

		Select screen = new Select(ElementAuditTrail.filterScreen);

		screen.selectByVisibleText(screenName);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		List<WebElement> screenList = ElementAuditTrail.screenList;

		List<WebElement> ActionList = ElementAuditTrail.auditActionList;

		List<WebElement> termsList = ElementAuditTrail.termsList;

		List<WebElement> descriptionList = ElementAuditTrail.descriptionList;

		// screenList.get(0).click();

		int screenSize = screenList.size();

		int termsSize = termsList.size();

		int descriptionSize = descriptionList.size();

		for (int i = 0; i < screenSize; i++) {
			if (i == 0) {
				System.out.println(screenList.get(i).getText());

				System.out.println(ActionList.get(i).getText());

				for (int j = 0; j < termsSize; j++) {

					System.out.println(termsList.get(j).getText());

					System.out.println(descriptionList.get(j).getText());

				}

			}

		}

	}

	void d() throws IOException {
		File file = new File("C:\\Users\\ate186\\Desktop\\Base Master\\TestCase.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook

		XSSFSheet worksheet = wb.getSheetAt(0); // Access the worksheet, so that we can update / modify it.

		Row row = worksheet.getRow(1);

		Cell cell = row.createCell(3);

		cell.setCellValue("FAIL");

		fis.close();

		FileOutputStream fos = new FileOutputStream(file);

		wb.write(fos);

		wb.close();
	}

	public static void auditTrailScreenshot(String moduleName, String screenName, String screenshot)
			throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		Select module = new Select(ElementAuditTrail.filterModule);

		module.selectByVisibleText(moduleName);

		Select screen = new Select(ElementAuditTrail.filterScreen);

		screen.selectByVisibleText(screenName);

		ElementAuditTrail.filterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		BasicOperation.screenshot(screenshot);

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

	}

	public static void auditTrailScreenshot(String screen, String file)
			throws IOException, HeadlessException, AWTException, InterruptedException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}

		else {
			System.out.println(screen);
		}

		
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		try {
			ElementAuditTrail.searchIcon.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementAuditTrail.searchIcon.click();
		}

		ElementAuditTrail.searchClose.click();

		BasicOperation.screenshot(file);
		
		System.out.println("screenshot done");

		List<WebElement> auditTrailList = ElementAuditTrail.auditTrailList;
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	
		
		int i=auditTrailList.size();
		
		System.out.println(i);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();
		
		System.out.println(i);
		
		BasicOperation.time();
		
		//System.out.println(descriptionList.size());
		
		beforeCount=i;

	}
	
	
	public static void auditTrailScreenshotAfter(String screen, String file)
			throws IOException, HeadlessException, AWTException, InterruptedException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}

		else {
			System.out.println(screen);
		}

		/*
		 * else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * }
		 * 
		 */
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		try {
			ElementAuditTrail.searchIcon.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementAuditTrail.searchIcon.click();
		}

		ElementAuditTrail.searchClose.click();

		BasicOperation.screenshot(file);

		List<WebElement> descriptionList = ElementAuditTrail.auditTrailList;
		
		
		
		afterCount= descriptionList.size();
		
		
		ElementAuditTrail.userManagementIcon.click();
		
		ElementAuditTrail.masterIcon.click();

	}


	public static void auditTrailScreenshot(String screenshot)
			throws IOException, HeadlessException, AWTException, InterruptedException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		try {
			ElementAuditTrail.searchIcon.click();
		} catch (Exception e) {
			Thread.sleep(2000);

			ElementAuditTrail.searchIcon.click();
		}

		ElementAuditTrail.searchClose.click();

		BasicOperation.screenshot(screenshot);

	//	List<WebElement> descriptionList = ElementAuditTrail.descriptionList;

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

	}
	
	
	
	
	
	public static int auditTrailGeneral(String fileLocation) throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();
	
		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> d = ElementAuditTrail.auditActionList;

		int i = d.size();
		
		
		BasicOperation.screenshot(fileLocation);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

		return i;

	}
	
	public static void auditTrailScreen()
	{
			PageFactory.initElements(driver, ElementAuditTrail.class);

			
			ElementAuditTrail.masterIcon.click();

			ElementAuditTrail.userManagementIcon.click();

			ElementAuditTrail.auditTrailIcon.click();

	}
	
	
	public static int auditTrailFind(String fileLocation) throws IOException, HeadlessException, AWTException {
		
		
		PageFactory.initElements(driver, ElementAuditTrail.class);

		
		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.auditTrailIcon.click();
		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> d = ElementAuditTrail.auditActionList;

		int i = d.size();
		
		
		BasicOperation.screenshot(fileLocation);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

		return i;

	}
	
	
	public static void a(String screen) throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}

		else {
			System.out.println(screen);
		}

	
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		String file = "D:\\QuaLIS\\AuditTrail\\Flow\\" + screen + ".png";

		BasicOperation.screenshot(file);

		List<WebElement> descriptionList = ElementAuditTrail.descriptionList;

		// moduleName=descriptionList.get(0).getText();

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();

	}


	
	public static int auditTrailBeforeCount(String screen) throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)||screen.equals(sampleTestComments)) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}
		else if (screen.equals(materialCategory) || screen.equals(material) ) {
			module = materialManagement;
		}
		else {
			System.out.println(screen);
		}

		
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> d = ElementAuditTrail.auditActionList;
		
		int i ;
		try
		{
			i= d.size();
		}
		
		catch (Exception e) {
			
			i=d.size();
			
			// TODO: handle exception
		}

			
		//BasicOperation.screenshot(file);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.masterIcon.click();
		
		beforeCountAuditTrail=i;

		return i;

	}

	

	public static void auditTrailAfterScreenRights(String screen, int i) throws IOException, HeadlessException, AWTException, InterruptedException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		ElementAuditTrail.homeIcon.click();

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = auditTrailModule(screen);

		
		
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		BasicOperation.exception(ElementAuditTrail.auditTrailTabHeader);
		

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> d = ElementAuditTrail.auditActionList;
				
		//BasicOperation.screenshot(file);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		BasicOperation.exception(ElementAuditTrail.auditTrailTabHeader);
		
			
		ElementAuditTrail.screenList.get(0).click();
		
		System.out.println("audit Trail "+ i);
		
		for(int a=0; a<i;a++)
		{
			
			int b=a+1;
			
		/*	if(a==2)
			{
				break;
			}
			*/
			ElementAuditTrail.screenList.get(a).click();
			
			String gridText=ElementAuditTrail.screenList.get(a).getText().toUpperCase();
			
			if(gridText.contains("IDS"))
			{
				System.out.println("Grid has IDS");
				
				System.out.println(gridText);
			}
			else
			{
				
			}
			
			String terms="";
			
			for(WebElement t:ElementAuditTrail.termsList)
			{
				terms=terms+t.getText().toUpperCase()+" ";
			}
			
			String description="";
			
			for(WebElement t:ElementAuditTrail.descriptionList)
			{
				description=description+t.getText().toUpperCase()+" ";
			}
			
			if(terms.contains("IDS"))
			{
				System.out.println(terms);
			}
			else
			{
				
			}
			
			if(description.contains("IDS"))
			{
				System.out.println(description);
			}
			else
			{
				
			}
			
			for(WebElement t:ElementAuditTrail.termsList)
			{
				if(t.getText().toUpperCase().contains("COMMEN"))
				{
					int des=ElementAuditTrail.termsList.indexOf(t);
					
					System.out.println(b+"----------");
					
					System.out.println(ElementAuditTrail.descriptionList.get(des).getText());
					
					
				}
			}
			
			
			
		}
		
		
		
		

	}


	public static int auditTrailAfterWithoutEdit(String screen) throws IOException, HeadlessException, AWTException {
		PageFactory.initElements(driver, ElementAuditTrail.class);

		PageFactory.initElements(driver, ElementUsers.class);

		ElementAuditTrail.masterIcon.click();

		ElementAuditTrail.userManagementIcon.click();

		ElementUsers.usersIcon.click();

		ElementAuditTrail.auditTrailIcon.click();

		String module = null;

		if (screen.equals(users) || screen.equals(userRole) || screen.equals(screenRights)
				|| screen.equals(controlRights) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = userManagement;
		} else if (screen.equals(unit) || screen.equals(component) || screen.equals(storageCondition)
				|| screen.equals(storageLocation)
				|| screen.equals(containerType)||screen.equals(sampleTestComments)/*
												 * ||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(
												 * auditTrail)
												 */) {
			module = baseMaster;

		} else if (screen.equals(ftpConfiguration) || screen.equals(passwordPolicy) || screen.equals(userRoleTemplate)
				|| screen.equals(approvalConfiguration) || screen.equals(designation) || screen.equals(hideScreenRights)
				|| screen.equals(hideControlRights) || screen.equals(auditTrail)) {
			module = configuration;
		} else if (screen.equals(department) || screen.equals(lab) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = organisationManagement;
		}

		else if (screen.equals(sampleCategory) || screen.equals(sample) || screen.equals(section)
				|| screen.equals(organisation) || screen.equals(nestedFlowMapping)) {
			module = sampleManagement;
		}

		else if (screen.equals(country)) {
			module = contacts;
		}
		else if (screen.equals(materialCategory) || screen.equals(material) ) {
			module = materialManagement;
		}

		else {
			System.out.println(screen);
		}

		
		Select modulen = new Select(ElementAuditTrail.filterModule);

		modulen.selectByVisibleText(module);

		Select screenName = new Select(ElementAuditTrail.filterScreen);

		screenName.selectByVisibleText(screen);

		ElementAuditTrail.filterFind.click();

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);

			wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		} catch (Exception e) {
			System.out.println("Getting Loader Issue");
		}

		ElementAuditTrail.searchIcon.click();

		ElementAuditTrail.searchClose.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> d = ElementAuditTrail.auditActionList;
		
		int i ;
		try
		{
			i= d.size();
		}
		
		catch (Exception e) {
			i= d.size();
			
			// TODO: handle exception
		}

		afterCountAuditTrail=i;
		
		//BasicOperation.screenshot(file);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait1 = new WebDriverWait(driver, 20);

		wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));

		
		afterCountAuditTrail=i;
		
	
		
		if(screen.contains(unit))
		{
		//	BaseMasterUnit.afterCount=afterCount;
		}
		else if(screen.contains(materialCategory))
		{
		//	MaterialManagementMaterialCategory.afterCount=afterCount;
		}
		
		 
		/*
		
		int diff=afterCount-BaseMasterUnit.beforeCount;*/
		
	/*	
		System.out.println(BaseMasterUnit.beforeCount);
		
		
		System.out.println(afterCount);
		
		System.out.println("It captured "+diff+" times");
		
	*/	
		
		int aa=beforeCountAuditTrail;
		
		int bb=afterCountAuditTrail;
		
		
		System.out.println(beforeCountAuditTrail);

		System.out.println(afterCountAuditTrail);
		
		int noOfCapture=afterCountAuditTrail-beforeCountAuditTrail;
		
		int capture=beforeCountAuditTrail+1;
		
		
		
		
		
		
		
		
		
		
		if(aa==bb)
		{
			System.out.println("Edit is not captured");
		}
		else if(bb==capture)
		{
			System.out.println("Edit is captured in Audit Trail");
		}
		else if(capture<bb)
		{
			ElementAuditTrail.screenList.get(0).click();
			
			multipleRecord="It captured "+ noOfCapture+" times";
			
			System.out.println("It captured "+noOfCapture+" times");
			
			
			for(int z=0; z<noOfCapture; z++)
			{
				ElementAuditTrail.screenList.get(z).click();
				
				
				
				for(WebElement t:ElementAuditTrail.termsList)
				{
					if(t.getText().toUpperCase().contains("COMMEN"))
					{
						int des=ElementAuditTrail.termsList.indexOf(t);
						
						
						
						System.out.println(ElementAuditTrail.descriptionList.get(des).getText());
					}
				}
				
			}
		}
		else
		{
			System.out.println("a");
		}
		
				
		return afterCountAuditTrail;
		
	}
	
	
	
	
	
}
		
	