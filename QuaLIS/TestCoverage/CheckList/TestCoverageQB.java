package CheckList;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.BrowserOperation;

public class TestCoverageQB extends BrowserOperation
{
	
	public static void 	QB(String QBCategory) throws InterruptedException, IOException
	{
		TestCoverageQB.QBCheckBox(QBCategory);
		
		TestCoverageQB.QBComboBox(QBCategory);
		
		TestCoverageQB.QBRadioButton(QBCategory);
		
		TestCoverageQB.QBTextInput(QBCategory);
		
	//	TestCoverageQB.QBTextArea(QBCategory);
	}
	
	
	public static void 	QBAuditTrail(String QBCategory) throws InterruptedException, IOException
	{
		TestCoverageQB.QBTextInput(QBCategory);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void QBTextInput(String QBCategory) throws InterruptedException, IOException {

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
		

		ElementQB.QB.sendKeys("What are the Fuels..?");
		

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
	
	
	
	public static void QBComboBox(String QBCategory) throws InterruptedException, IOException
	{

		PageFactory.initElements(driver, ElementQB.class);
		


		ElementQB.masterIcon.click();
		

		ElementQB.checkListManagementIcon.click();


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
		

		ElementQB.QB.sendKeys("What is the primary component of the Petrol..?");
		

		WebElement QBComponentElement =ElementQB.QBComponent;
		
		Select QBComponentElementSelect=new Select(QBComponentElement);
	
		QBComponentElementSelect.selectByVisibleText("ComboBox");
		
		
		ElementQB.QBDisplayValue.sendKeys("Sulfur,Carbon,Hydrogen");
		


		ElementQB.QBAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));		
		
		
		ElementQB.checkListManagementIcon.click();
		
		ElementQB.masterIcon.click();
		

	}
	
	
	public static void QBCheckBox(String QBCategory) throws InterruptedException, IOException
	{

		PageFactory.initElements(driver, ElementQB.class);
		


		ElementQB.masterIcon.click();
		

		ElementQB.checkListManagementIcon.click();


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
		

		ElementQB.QB.sendKeys("What are the content available in Petrol...?");
		

		WebElement QBComponentElement =ElementQB.QBComponent;
		
		Select QBComponentElementSelect=new Select(QBComponentElement);
	
		QBComponentElementSelect.selectByVisibleText("CheckBox");
		
		
		ElementQB.QBDisplayValue.sendKeys("Carbon,Hydrogen,Oxygen");
		


		ElementQB.QBAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));		
		
		
		ElementQB.checkListManagementIcon.click();
		
		ElementQB.masterIcon.click();
		

	}
	
	
	public static void QBRadioButton(String QBCategory) throws InterruptedException, IOException
	{

		PageFactory.initElements(driver, ElementQB.class);
		


		ElementQB.masterIcon.click();
		

		ElementQB.checkListManagementIcon.click();


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
		

		ElementQB.QB.sendKeys("What is the condition of petrol....?");
		

		WebElement QBComponentElement =ElementQB.QBComponent;
		
		Select QBComponentElementSelect=new Select(QBComponentElement);
	
		QBComponentElementSelect.selectByVisibleText("RadioButton");
		
		
		ElementQB.QBDisplayValue.sendKeys("Liquid,Solid");
		


		ElementQB.QBAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));		
		
		
		ElementQB.checkListManagementIcon.click();
		
		ElementQB.masterIcon.click();
		
	}
	
	
	public static void QBTextArea(int j,String QBCategory) throws InterruptedException, IOException
	{

		PageFactory.initElements(driver, ElementQB.class);
		


		ElementQB.masterIcon.click();
		

		ElementQB.checkListManagementIcon.click();


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
		

		ElementQB.QB.sendKeys("How did petrol prepared...?"+j);
		

		WebElement QBComponentElement =ElementQB.QBComponent;
		
		Select QBComponentElementSelect=new Select(QBComponentElement);
	
		QBComponentElementSelect.selectByVisibleText("TextArea");
		
		
	//	ElementQB.QBDisplayValue.sendKeys("Carbon,Hydrogen,Oxygen");
		


		ElementQB.QBAddSubmit.click();

	

		
		wait1.until(ExpectedConditions.visibilityOf(ElementQB.QBAction));
		
		wait1.until(ExpectedConditions.elementToBeClickable(ElementQB.QBAction));		
		
		
		ElementQB.checkListManagementIcon.click();
		
		ElementQB.masterIcon.click();
		

	}
	
	

	
	
}
