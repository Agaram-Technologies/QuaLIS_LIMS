package UserManagement;

import java.awt.AWTException;


import java.awt.HeadlessException;
import java.awt.font.LineBreakMeasurer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
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

import BasicFunction.Function;
import BasicFunction.FunctionAdd;
import BasicFunction.FunctionDelete;
import BasicFunction.FunctionEdit;
import Flow.TestDataFlowAuditTrail;
import Flow.TestDataHylands;


public class TestCoverageDesignation extends TestDataFlowAuditTrail
{
	/*public static String designationRefreshStatus=null;

	public static boolean designationAddEsign=false;
	
	public static boolean designationEditNameEsign=false;
	
	public static boolean designationEditDescriptionEsign=false;
	
	public static boolean designationDeleteEsign=false;
	
	public static String designationAddEsignComments="Added";
	
	public static String designationEditNameEsignComments="Edited Name";
	
	public static String designationEditDescriptionEsignComments="Edited Description";
	
	public static String designationDeleteEsignComments="Deleted";
	

	public static void twoFieldTestCase() throws InterruptedException
	{
	
	TestCoverageDesignation.designationAddAllField(TestDataHylands.designation());
	
	TestCoverageDesignation.designationDeleteAllField(TestDataHylands.designation());		
	
	TestCoverageDesignation.designationAddMandatoryField(TestDataHylands.designation());
	
	TestCoverageDesignation.designationDeleteMandatoryField(TestDataHylands.designation());
	
	TestCoverageDesignation.designationAddAllField(TestDataHylands.designation());
	
	TestCoverageDesignation.designationEditName(TestDataHylands.designation());
	
	// Description value to value
	TestCoverageDesignation.designationEditDescription(TestDataHylands.designation());
	
	// Description value to null
	TestCoverageDesignation.designationEditDescriptionValueToNull(TestDataHylands.designation());
			
	// Description null to value
	TestCoverageDesignation.designationEditDescriptionNullToValue(TestDataHylands.designation());
		
	
//	TestCoverageDesignation.designationDeleteAll(TestDataHylands.designation());	
	}
	
	public static boolean preCondition() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		 boolean screen=Function.preCondition( ElementDesignation.element());
		
		return screen;
	}
	
	
	public static void designationAddAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
			
		FunctionAdd.addAllField(value, ElementDesignation.element());
	}
	
	public static void designationAddMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionAdd.addMandatoryField(value, ElementDesignation.element());
	}
	
	public static void designationEditName(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editName(value, ElementDesignation.element(), ElementDesignation.list());
	
		
		
	}
	
	public static void designationEditDescription(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editDescription(value, ElementDesignation.element(), ElementDesignation.list());
	}
	
	public static void designationEditDescriptionValueToNull(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editDescriptionValueToNull(value, ElementDesignation.element(), ElementDesignation.list());
	}
	
	public static void designationEditDescriptionNullToValue(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionEdit.editDescriptionNullToValue(value, ElementDesignation.element(), ElementDesignation.list());
	}
	
	
	
	public static void designationDeleteAllField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionDelete.delete(value, ElementDesignation.element(), ElementDesignation.list());		
	}
	
	public static void designationDeleteAll(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionDelete.deleteAll(value, ElementDesignation.element(), ElementDesignation.list());		
	}
	
	public static void designationDeleteMandatoryField(HashMap <String, String> value) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);
		
		FunctionDelete.deleteMandatory(value, ElementDesignation.element(), ElementDesignation.list());		
	}
	

	
	
	public static void designationAddAudit(String designationName,String designationDescription) throws InterruptedException, IOException, HeadlessException, AWTException
	{
		//TestCoverageDesignation.designationAddAuditOne(designation, designation);
		
		TestCoverageDesignation.designationAddAuditTwo(designationName,designationDescription);
	}
	
	
	
	public static void designationRefreshAudit() throws HeadlessException, IOException, AWTException, InterruptedException
	{
		int i=TestCoverageAuditTrail.auditTrailCount(designation);
		
		boolean a=TestCoverageDesignation.designationRefreshAuditOne();
		
		int j=TestCoverageAuditTrail.auditTrailCount(designation);
		
		if(a==true)
		{
			if(i==j)
			{
				designationRefreshStatus="PASS";
			}
			
			else
			{
				designationRefreshStatus="FAIL";
			}
		}
		
		
		
		
		
		
		File file = new File("D:\\QuaLIS\\AuditTrail\\UserManagement.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook

		XSSFSheet worksheet = wb.getSheet("Designation"); // Access the worksheet, so that we can update / modify it.

	
			int c=4;

				Row row = worksheet.getRow(85);
				
			//	
				Cell cell2 = row.createCell(c);

				cell2.setCellValue(designationRefreshStatus);
				
			


		fis.close();
		

		FileOutputStream fos = new FileOutputStream(file);

		wb.write(fos);

		wb.close();
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	public static boolean designationRefreshAuditOne() throws InterruptedException
	{
		PageFactory.initElements(driver, ElementDesignation.class);

			ElementDesignation.masterIcon.click();

			ElementDesignation.userManagementIcon.click();

			ElementDesignation.designationIcon.click();

			WebDriverWait wait1 = new WebDriverWait(driver, 10);

			wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

			boolean display=false;
		
			for(int i=0; i<100; i++)
			{	
				if(display==true)
				{
					break;
				}
				
				try 
				{
					ElementDesignation.designationAction.click();
					
					driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					
					if(ElementDesignation.designationAdd.isDisplayed())
					{
						display=true;
					}
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				} 
				catch (Exception e) 
				{
					Thread.sleep(100);
					ElementDesignation.designationAction.click();
				}
			}
			
			
			wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationsRefresh));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationsRefresh));
			
			
			boolean desig=false;
			
			try {
				
				ElementDesignation.designationsRefresh.click();
				
				desig=true;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			

			
			wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

			wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));
			
			
			ElementDesignation.userManagementIcon.click();
			
			ElementDesignation.masterIcon.click();
			
			
			
			
			
			
			
			
			
			
			return desig;

	}
	
	
	public static void designationAddAuditTwo(String designationName, String description)throws InterruptedException, IOException, HeadlessException, AWTException
	
	{
		
			
			
			String recordStatus=null;
			
			String countStatus=null;
			
			String gridScreenNameStatus=null;
			
			String gridActionTypeStatus=null;
			
			String gridIDSStatus=null;
			
			String sideViewTermsIDSStatus=null;
			
			String sideViewDescriptionIDSStatus=null;
			
			String sideViewNumberOfRecordsStatus=null;
			
			String sideViewModuleNameStatus=null;
			
			String sideViewScreenNameStatus=null;
			
			String sideViewAuditActionStatus=null;
			
			String sideViewActionTypeStatus=null;
			
			String sideViewUserNameStatus=null;
			
			String sideViewAuditDateStatus=null;
			
			String sideViewCommentsDesignationNameStatus=null;
			
			String sideViewCommentsDesignationDescriptionStatus=null;
			
			String sideViewColonStatus=null;
			
			String sideViewSemicolenStatus=null;
			
			String sideViewSemicolonEndStatus=null;
			
			String sideViewDesignationDuplicateStatus=null;
			
			String sideViewDescriptionDuplicateStatus=null;
			
			String sideViewCommentStatus=null;
			
			
			
			
		
			String moduleActual=ElementAuditTrail.userManagement;
			
			String screen=ElementAuditTrail.designation;
			
			
			//boolean esign=false;
			
			
			
			int beforeCount=TestCoverageAuditTrail.auditTrailCount(screen);
			
			boolean esign=TestCoverageDesignation.designationAddAuditOne(designationName, description);
			
			int afterCount=TestCoverageAuditTrail.auditTrailCount(screen);
			
			boolean caseOne=false;
			
			int a=beforeCount+1;
			
			boolean one=true;
			
			if(afterCount>a)
			{
				countStatus="FAIL";
			}
			else
			{
				countStatus="PASS";
			}
			
			if(afterCount>=beforeCount)
			{
				caseOne=true;
			}
			
			
			boolean caseTwo=false;
			
			String add="add";
			
			String addGrid=TestCoverageAuditTrail.auditTrailAction(screen).toLowerCase();
				
			if(addGrid.contains(add))
			{
				caseTwo=true;
				
				
				
			}
			
			
			if(caseOne==true && caseTwo==true)
			{
				recordStatus="PASS";
			}
			else
			{
				recordStatus="FAIL";
			}
			
			
			
			//String actualScreenName=ElementAuditTrail.designation;
			
			PageFactory.initElements(driver, ElementAuditTrail.class);
			
			PageFactory.initElements(driver, ElementUsers.class);
			
			ElementAuditTrail.masterIcon.click();
			
			ElementAuditTrail.userManagementIcon.click();
			
			ElementUsers.usersIcon.click();
			
			ElementAuditTrail.auditTrailIcon.click();
			
			String module=null;
			
			if(screen.equals(users)||screen.equals(userRole)||screen.equals(screenRights)||screen.equals(controlRights)||screen.equals(designation)||screen.equals(hideScreenRights)||screen.equals(hideControlRights)||screen.equals(auditTrail))
			{
				module=userManagement;
			}
			else if(screen.equals(unit)||screen.equals(component)||screen.equals(storageCondition)||screen.equals(storageLocation)||screen.equals(containerType)||screen.equals(s)||screen.equals(hideControlRights)||screen.equals(auditTrail))
			{
				module=baseMaster;
				
			}
			else if(screen.equals(ftpConfiguration)||screen.equals(passwordPolicy)||screen.equals(userRoleTemplate)||screen.equals(approvalConfiguration)||screen.equals(designation)||screen.equals(hideScreenRights)||screen.equals(hideControlRights)||screen.equals(auditTrail))
			{
				module=configuration;
			}
			else if(screen.equals(department)||screen.equals(lab)||screen.equals(section)||screen.equals(organisation)||screen.equals(nestedFlowMapping))
			{
				module=organisationManagement;
			}
			
			else if(screen.equals(sampleCategory)||screen.equals(sample)||screen.equals(section)||screen.equals(organisation)||screen.equals(nestedFlowMapping))
			{
				module=sampleManagement;
			}
			
			else if(screen.equals(country))
			{
				module=contacts;
			}
			
			else
			{
				System.out.println(screen);
			}
			
			Select modulen=new Select(ElementAuditTrail.filterModule);
			
			modulen.selectByVisibleText(module);
			
			Select screenName=new Select(ElementAuditTrail.filterScreen);
			
			screenName.selectByVisibleText(screen);
			
			ElementAuditTrail.filterFind.click();
			
			
			
			try
			{
				WebDriverWait wait1= new WebDriverWait(driver,20);

				wait1.until(ExpectedConditions.visibilityOf(ElementAuditTrail.filterIcon));
				
				wait1.until(ExpectedConditions.elementToBeClickable(ElementAuditTrail.filterIcon));	
				
				
				
			}
			catch (Exception e) {
				System.out.println("Getting Loader Issue");
			}
			
			ElementAuditTrail.searchIcon.click();
			
			ElementAuditTrail.searchClose.click();
			
		
			
			
			List<WebElement>screenList=ElementAuditTrail.screenList;
			
			String screenNameGridActual=screenList.get(0).getText();
			
			if(designation.equals(screenNameGridActual))
			{
				gridScreenNameStatus="PASS";
			}
			else
			{
				gridScreenNameStatus="FAIL";
			}
			
			List<WebElement>actionList=ElementAuditTrail.auditActionList;
			
			String actionNameGrid=actionList.get(0).getText();
			
			String action="ADD";
			
			String expectedAction=action+" "+designation.toUpperCase();
			
			if(expectedAction.equals(actionNameGrid))
			{
				gridActionTypeStatus="PASS";
			}
			else
			{
				gridActionTypeStatus="FAIL";
			}
			
			List<WebElement>dataList=ElementAuditTrail.dataList;
			
			String gridText=dataList.get(0).getText().toUpperCase();
			
			String ids="IDS";
			
			
			if(gridText.contains(ids))
			{
				gridIDSStatus="FAIL";
			}
			else
			{
				gridIDSStatus="PASS";
			}
			
			
			
			List<WebElement>termList=ElementAuditTrail.termsList;
			
			for(int i=0; i<termList.size(); i++)
			{
				String termText=termList.get(i).getText().toUpperCase();
				
				if(termText.contains(ids))
				{
					sideViewTermsIDSStatus="FAIL";
				}
				else
				{
					sideViewTermsIDSStatus="PASS";
				}
				
			}
			
			
			List<WebElement>descriptionList=ElementAuditTrail.descriptionList;
			
			for(int i=0; i<descriptionList.size(); i++)
			{
				String termText=descriptionList.get(i).getText().toUpperCase();
				
				if(termText.contains(ids))
				{
					sideViewDescriptionIDSStatus="FAIL";
					
					break;
				}
				else
				{
					sideViewDescriptionIDSStatus="PASS";
					
					
				}
				
			}
			
			
			
			
			String expectedActionType=null;
			
			if(esign==false)
			{
				expectedActionType="SYSTEM";
			}
			else
			{
				expectedActionType="MANUAL";
			}
			
			System.out.println(expectedActionType);
			
			List<WebElement>actionTypeList=ElementAuditTrail.descriptionList;
			
			String actualActionType=actionTypeList.get(3).getText();
			
			
			if(actualActionType.equals(actualActionType))
			{
				sideViewActionTypeStatus="PASS";
			}
			else
				
		
			{
				sideViewActionTypeStatus="FAIL";
			}
			
			System.out.println(termList.size());
			if(expectedActionType.equalsIgnoreCase("SYSTEM") && termsList.size()==7)
			{
				
				sideViewNumberOfRecordsStatus="PASS";
			}
			else
			{
				
				sideViewNumberOfRecordsStatus="FAIL";
			}
			
			
			
			String actualUserName=descriptionList.get(4).getText();
			
			String expectedUserName=limsUserName;
			
			System.out.println(expectedUserName);
			
			if(actualUserName.equals(expectedUserName))
			{
				
				sideViewUserNameStatus="PASS";
			}
			else
			{
				
				sideViewUserNameStatus="FAIL";
			}
			
			String actualDate=descriptionList.get(5).getText();
			
			String expectedDate=BasicOperation.date();
			
			if(actualDate.contains(expectedDate))
			{
				sideViewAuditDateStatus="PASS";
				
			}
			else
			{
				sideViewAuditDateStatus="FAIL";
			}
			
			
			TestCoverageAuditTrail.auditTrailModule(screen);
			
			String actualModuleName=descriptionList.get(0).getText();
			
			String expectedModuleName=TestCoverageAuditTrail.auditTrailModule(screen);
			
			if(actualModuleName.equals(expectedModuleName))
			{
				sideViewModuleNameStatus="PASS";
			}
			else
			{
				sideViewModuleNameStatus="FAIL";
			}
			
			
			String actualScreenName=descriptionList.get(1).getText();
				
			if(actualModuleName.equals(expectedModuleName))
			{
				sideViewScreenNameStatus="PASS";
			}
			else
			{
				sideViewScreenNameStatus="FAIL";
			}
			
			String actualAuditAction=descriptionList.get(2).getText();
			
			if(expectedAction.equals(actualAuditAction))
			{
				sideViewAuditActionStatus="PASS";
			}
			else
			{
				sideViewAuditActionStatus="FAIL";
			}
			
			String expectedCommentsDesignationName=unitNameAdd;
			
			String expectedCommentsDesignationDescription=unitDescriptionAdd;
			
			boolean commentsCaseOne=false;  // Name
			
			boolean commentsCaseTwo=false;   // Description
			
			boolean commentsCaseThree=false;  // Double semiColon
			
			boolean commentsCaseFour=false;   // Double Colon
			
			boolean commentsCaseFive=false;    // End with semi colon
			
			boolean commentsCaseSix=false;     // Seperate by semi colon
			
			boolean commentsCaseSeven=false;   // duplicate
			
			
			
			String actualComment=descriptionList.get(6).getText();
			
			if(actualComment.contains(expectedCommentsDesignationName))
			{
				commentsCaseOne=true;
			}
			
			if(actualComment.contains(expectedCommentsDesignationDescription))
			{
				commentsCaseTwo=true;
			}
			
			int semiColon=0;
			
			char [] comment=actualComment.toCharArray();
			
			for(int i=0; i<comment.length; i++)
			{
				if(comment[i]==';')
				{
					semiColon++;
				}
			}
			
			int colon=0;
			
			
			
			for(int i=0; i<comment.length; i++)
			{
				if(comment[i]==';')
				{
					colon++;
				}
			}
			
			
			
			if(comment[comment.length-1]==';')
			{
				commentsCaseFive=true;
			}
			
			if(semiColon==2)
			{
				commentsCaseThree=true;
			}
			
			if(colon==2)
			{
				commentsCaseFour=true;
			}
			
			
			String [] designation=actualComment.split(designationName);
			
			String [] designationDescription=actualComment.split(description);
			
			if(commentsCaseOne==true)
			{
				sideViewCommentsDesignationNameStatus="PASS";
			}
			else
			{
				sideViewCommentsDesignationNameStatus="FAIL";
			}
			
			if(commentsCaseTwo==true)
			{
				sideViewCommentsDesignationDescriptionStatus="PASS";
			}
			else
			{
				sideViewCommentsDesignationDescriptionStatus="FAIL";
			}
			
			if(commentsCaseThree==true)
			{
				sideViewSemicolenStatus="PASS";
				
			}
			else
			{
				sideViewSemicolenStatus="FAIL";
			}
			
			if(commentsCaseFour==true)
			{
				sideViewColonStatus="PASS";
				
			}
			else
			{
				sideViewColonStatus="FAIL";
			}
			
			if(commentsCaseFive==true)
			{
				sideViewSemicolonEndStatus="PASS";
				
			}
			else
			{
				sideViewSemicolonEndStatus="FAIL";
			}
			
			if(commentsCaseOne==true&&commentsCaseTwo==true&&commentsCaseThree==true&&commentsCaseFour==true&&commentsCaseFive==true)
			{
				
				
				if(designation.length>2)
				{
					sideViewDesignationDuplicateStatus="FAIL";
				}
				else
				{
					sideViewDesignationDuplicateStatus="PASS";
				}
				
				if(designationDescription.length>2)
				{
					sideViewDescriptionDuplicateStatus="FAIL";
				}
				else
				{
					sideViewDescriptionDuplicateStatus="PASS";
				}
				
				if(sideViewDesignationDuplicateStatus=="PASS" && sideViewDescriptionDuplicateStatus=="FAIL")
				{
					sideViewCommentStatus="PASS";
				}
				
				
			}
			{
				sideViewCommentStatus="FAIL";
				
			}
			
			
			
			
			File file = new File("D:\\QuaLIS\\AuditTrail\\UserManagement.xlsx");

			FileInputStream fis = new FileInputStream(file);

			XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook

			XSSFSheet worksheet = wb.getSheet("Designation"); // Access the worksheet, so that we can update / modify it.

		
			int c=4;

					Row row = worksheet.getRow(1);
					
				//	
					Cell cell2 = row.createCell(c);

					cell2.setCellValue(recordStatus);
					
					Row row2 = worksheet.getRow(2);
					Cell cell3 = row2.createCell(c);

					cell3.setCellValue(countStatus);
					Row row3 = worksheet.getRow(3);
					
					Cell cell4 = row3.createCell(c);

					cell4.setCellValue(gridScreenNameStatus);
					
					Row row4 = worksheet.getRow(4);
					
					Cell cell5 = row4.createCell(c);

					cell5.setCellValue(gridActionTypeStatus);
					
					Row row5 = worksheet.getRow(5);
					Cell cell6 = row5.createCell(c);

					cell6.setCellValue(gridIDSStatus);
					
					Row row6 = worksheet.getRow(6);
					
					Cell cell7 = row6.createCell(c);

					cell7.setCellValue(sideViewTermsIDSStatus);
					
					Row row7 = worksheet.getRow(7);
					Cell cell8 = row7.createCell(c);

					cell8.setCellValue(sideViewDescriptionIDSStatus);
					
					Row row8 = worksheet.getRow(11);
					Cell cell9 = row8.createCell(c);

					cell9.setCellValue(sideViewActionTypeStatus);
					

					Row row9 = worksheet.getRow(8);
					Cell cell10 = row9.createCell(c);

					cell10.setCellValue(sideViewNumberOfRecordsStatus);
					
					
					Row row10 = worksheet.getRow(9);
					Cell cell11 = row10.createCell(c);

					cell11.setCellValue(sideViewModuleNameStatus);
					
					Row row11 = worksheet.getRow(10);
					Cell cell12 = row11.createCell(c);

					cell12.setCellValue(sideViewScreenNameStatus);
					

					Row row12 = worksheet.getRow(12);
					Cell cell13 = row12.createCell(c);

					cell13.setCellValue(sideViewAuditActionStatus);
					

					Row row13 = worksheet.getRow(13);
					Cell cell14 = row13.createCell(c);

					cell14.setCellValue(sideViewUserNameStatus);
					
					Row row14 = worksheet.getRow(14);
					Cell cell15 = row14.createCell(c);

					cell15.setCellValue(sideViewAuditDateStatus);
					

					Row row15 = worksheet.getRow(11);
					Cell cell13 = row12.createCell(c);

					cell13.setCellValue(sideViewAuditActionStatus);
					
					
					
					
					
					
					
				
			fis.close();
			

			FileOutputStream fos = new FileOutputStream(file);

			wb.write(fos);

			wb.close();
			
			ElementDesignation.userManagementIcon.click();
		
			
			
			ElementDesignation.masterIcon.click();

			

			
		}

	
	
	
	public static boolean designationAddAuditOne(String designation, String description) throws InterruptedException, IOException {
		PageFactory.initElements(driver, ElementDesignation.class);

		ElementDesignation.masterIcon.click();

		ElementDesignation.userManagementIcon.click();

		ElementDesignation.designationIcon.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 10);

		wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

		boolean display=false;
	
		for(int i=0; i<100; i++)
		{	
			if(display==true)
			{
				break;
			}
			
			try 
			{
				ElementDesignation.designationAction.click();
				
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				
				if(ElementDesignation.designationAdd.isDisplayed())
				{
					display=true;
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} 
			catch (Exception e) 
			{
				Thread.sleep(100);
				ElementDesignation.designationAction.click();
			}
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
		
		
		
		boolean display1=false;
		for(int k=0; k<100;k++)
		{
			try
			{
				ElementDesignation.designation.click();
				
				display1=true;
				
				if(display1==true)
				{
					
					
					break;
				}
				
			} 
			catch (Exception e) 
			{
				Thread.sleep(100);
				
				ElementDesignation.designation.click();
			}
			
			
			
			
		}

		ElementDesignation.designation.sendKeys(designation);

		ElementDesignation.designationDescription.sendKeys(description);

		ElementDesignation.designationAddSubmit.click();
		
		try {
			
			
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			PageFactory.initElements(driver, ElementEsign.class);
			
			ElementEsign.EsignPassword.sendKeys("123");
			
			designationAddEsign=true;
		
			ElementEsign.EsignComments.sendKeys(designationAddEsignComments);
			
			if(ElementEsign.EsignCheckbox.isSelected()==false)
			{
				ElementEsign.EsignCheckbox.click();
			}
			
			ElementEsign.EsignSubmit.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
		catch (Exception e)
		{
			
			
			// TODO: handle exception
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

		ElementDesignation.userManagementIcon.click();

		ElementDesignation.masterIcon.click();
		
		
		return designationAddEsign;

	
}





	
	public static void designationFlow(String designation, String description) throws InterruptedException, IOException
	{
		
			
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
					} 
					else
					{
						TestCoverageDesignation.refreshLoginAdmin();

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

				ElementDesignation.designationDescription.sendKeys(description);

				ElementDesignation.designationAddSubmit.click();

				wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

				wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

				FileInputStream s = new FileInputStream("flow.properties");

				Properties properties = new Properties();

				properties.load(s);

				String designationScreenshot = properties.getProperty("designation");

				BasicOperation.screenshot(designationScreenshot);

				wait1.until(ExpectedConditions.visibilityOf(ElementDesignation.designationAction));

				wait1.until(ExpectedConditions.elementToBeClickable(ElementDesignation.designationAction));

				ElementDesignation.userManagementIcon.click();

				ElementDesignation.masterIcon.click();

			}
	

*/}
