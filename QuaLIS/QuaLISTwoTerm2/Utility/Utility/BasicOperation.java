package Utility;

import java.awt.AWTException;
import java.net.URISyntaxException;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Alert.ElementAlert;
import BaseMaster.ElementComponent;
import BaseMaster.ElementContainerType;
import BaseMaster.ElementSampleTestComments;
import BaseMaster.ElementStorageCondition;
import BaseMaster.ElementStorageLocation;
import BaseMaster.ElementUnit;
import Config.ElementName;
import Config.SampleStatus;
import Contacts.ElementCountry;
import Esign.ElementEsign;
import GenericRegistration.ElementGenericRegistration;
import Organisation.ElementOrganisation;
import SampleManagement.ElementSamplingPoint;
import UserManagement.ElementProfile;

public class BasicOperation extends BrowserOperation{

	public static void selectTextFromList(List<WebElement>list,String text)
	{
		for(WebElement element:list)
		{
			if(element.getText().equals(text))
			{
				element.click();
			}
			else
			{
				System.out.println("Test value is not matched in the Grid");
			}
		}
	}
	
	public static void screenExpand(HashMap<String, WebElement>element)
	{
		element.get(ElementName.module).click();
		 
		element.get(ElementName.subModule).click();		 		 
	}
	
	public static void screenCollapse(HashMap<String, WebElement>element)
	{
		element.get(ElementName.subModule).click();
		 
		element.get(ElementName.module).click();
		 
		element.get(ElementName.home).click();
	}
	
	public static String jarPath(String className) throws URISyntaxException, ClassNotFoundException
	{
		Class c=Class.forName(className);  
		
		
	    String jarPath = c.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
	    
	    System.out.println(jarPath);
		
		return jarPath;
	}
	
		
		public static void scrollUp() throws AWTException, InterruptedException
		{
			Robot a=new Robot();
			
			for(int i=0;i<20;i++)
			{
				Thread.sleep(150);
				
				a.keyPress(KeyEvent.VK_PAGE_UP);
				
				a.keyRelease(KeyEvent.VK_PAGE_UP);
			}
			
			
		}

		
		public static String statusEnglish(String status)
		{
			String statusEnglish="";
			
			if(status.equals(SampleStatus.cancelledKorean))
			{
				statusEnglish=SampleStatus.cancelled;
			}
			else if(status.equals(SampleStatus.registerKorean))
			{
				statusEnglish=SampleStatus.register;
			}
			else if(status.equals(SampleStatus.preRegisterKorean))
			{
				statusEnglish=SampleStatus.preRegister;
			}
			
			else if(status.equals(SampleStatus.rejectedKorean))
			{
				statusEnglish=SampleStatus.rejected;
			}
			
			else if(status.equals(SampleStatus.cancelledKorean))
			{
				statusEnglish=SampleStatus.cancelled;
			}
			
			else if(status.equals(SampleStatus.cancelledKorean))
			{
				statusEnglish=SampleStatus.cancelled;
			}
			
			else 
			{
				statusEnglish=status;
			}
			
			
			
			
			return statusEnglish;
		}

		
		
		
		public static void pageUpException(WebElement element) throws AWTException, InterruptedException
		{
			Robot a=new Robot();
			
		
			
			
			
			boolean b=false;
			
			for(int i=1; i>0; i++)
			{
				
				try {
					
					b=true;
					
					if(b==true)
					{
						break;
					}
					
					element.click();
					
				} catch (Exception e) {
					
					a.keyPress(KeyEvent.VK_PAGE_UP);
					
					a.keyRelease(KeyEvent.VK_PAGE_UP);
					Thread.sleep(100);
					
					try
					{
						element.click();
						b=true;
					}catch (Exception ea) {
						// TODO: handle exception
					}
					
					
					if(b==true)
					{
						break;
					}
					// TODO: handle exception
				}
				
				
			
				
			}
			
			
		}
		

		public static boolean waitSubmit(WebElement el) {
			boolean loaderIssue = false;

			try {

				WebDriverWait wait1 = new WebDriverWait(driver, 10);

				wait1.until(ExpectedConditions.visibilityOf(el));
				wait1.until(ExpectedConditions.elementToBeClickable(el));

				loaderIssue = false;

			} catch (Exception e) {
				loaderIssue = true;
			}

			return loaderIssue;

		}
		
		public static void select(List<WebElement> data,List<WebElement> checkbox,String value)
		{
			List<WebElement> data1 = data;

			List<WebElement> checkbox1 = checkbox;

			for (WebElement dept : data1) {
				if (dept.getText().equals(value)) {
					int index = data1.indexOf(dept);

					String checkBoxStatus = checkbox1.get(index).getAttribute("checkboxselect");

					if (checkBoxStatus.equals("0")) {
						dept.click();
					}

				}
			}
		}
		
		public static void exceptionAction(WebElement action, WebElement function) throws InterruptedException
		{
			
			boolean display=false;
			for(int i=0; i<100; i++)
			{
				try
				{
					action.click();
					
					if(function.isDisplayed())
					{
						break;
					}
				} 
				catch (Exception e)
				{
					Thread.sleep(100);
					
					action.click();
					
					if(function.isDisplayed())
					{
						break;
						
						
					}
					// TODO: handle exception
				}
			}
		}
		
		public static void sendKeys(WebElement element,String value)
		{
			Actions a = new Actions(driver);
		      a.moveToElement(element);
		      a.perform();
		      
		      element.sendKeys(value);
		}
		
		
		public static void click(WebElement element) throws InterruptedException, AWTException
		{
			Actions a = new Actions(driver);
		      a.moveToElement(element);
		      a.perform();
		      
		      
		      Robot aa=new Robot();
		   
		      try {
		    	  
		    	  element.click();
				
			} catch (Exception e) {
				

				System.out.println("aa");
				 try {   
					 
			      Thread.sleep(100);
			      
			      aa.keyPress(KeyEvent.VK_PAGE_UP);
			      
			      aa.keyRelease(KeyEvent.VK_PAGE_UP);
			      
			      element.click();
			      
				
						
					} 
				 catch (Exception ea) 
				 {
						
						
					 try 
					 {
							  Thread.sleep(100);
						      
						      aa.keyPress(KeyEvent.VK_PAGE_UP);
						      
						      aa.keyRelease(KeyEvent.VK_PAGE_UP);
						      
						      element.click();
								
							
					 } 
					 catch (Exception eaa)
					 {
								
								
						 try 
						 {
									  Thread.sleep(100);
								      
								      aa.keyPress(KeyEvent.VK_PAGE_UP);
								      
								      aa.keyRelease(KeyEvent.VK_PAGE_UP);
								      
								      element.click();
									
						 }
						 catch 
						 (Exception eaaa) 
						 {
										
										 
							 try
									
							 {
											  Thread.sleep(100);
										      
										      aa.keyPress(KeyEvent.VK_PAGE_UP);
										      
										      aa.keyRelease(KeyEvent.VK_PAGE_UP);
										      
										      element.click();
											
										
							 } catch (Exception eadaa) 
							 
							 {
												  Thread.sleep(100);
											      
											      aa.keyPress(KeyEvent.VK_PAGE_UP);
											      
											      aa.keyRelease(KeyEvent.VK_PAGE_UP);
											      
											      element.click();
												// TODO: handle exception
											
							 }
										// TODO: handle exception
									
						 }
								// TODO: handle exception
							
					 }
						// TODO: handle exception
				
				 }
				// 
				 
			}
		     
		}
		
		public static void select(WebElement element, String value)
		{	
	   
			Select aa=new Select(element);
			
			aa.selectByVisibleText(value);
		}
		
		public static String duration(String startTime, String endTime) throws ParseException
		{
			  // to parse time in the format HH:MM:SS
		    SimpleDateFormat simpleDateFormat
		        = new SimpleDateFormat("HH:mm:ss");

		    // Parsing the Time Period
		    Date date1 = simpleDateFormat.parse(startTime);
		    Date date2 = simpleDateFormat.parse(endTime);

		    // Calculating the difference in milliseconds
		    long differenceInMilliSeconds
		        = Math.abs(date2.getTime() - date1.getTime());

		    // Calculating the difference in Hours
		    long differenceInHours
		        = (differenceInMilliSeconds / (60 * 60 * 1000))
		          % 24;

		    // Calculating the difference in Minutes
		    long differenceInMinutes
		        = (differenceInMilliSeconds / (60 * 1000)) % 60;

		    // Calculating the difference in Seconds
		    long differenceInSeconds
		        = (differenceInMilliSeconds / 1000) % 60;

		    // Printing the answe
		    
		    return differenceInSeconds+" sec";
		}
		
		
		public static void exception(WebElement element) throws InterruptedException
		{
			boolean exception=true;
			
			for(int i=0; i<1000; i++)
			{
				if(exception==false)
				{
					break;
				}
				
				try 
				{
					
					element.click();
					
					exception=false;
					
					if(exception==false)
					{
						break;
					}
					
				}
				catch (Exception e)
				{
					
					Thread.sleep(100);
					
					
					
					try 
					{
		
						
						element.click();
						
						exception=false;
						
						if(exception==false)
						{
							break;
						}
						
					} 
					catch (Exception e2) 
					{
						
						
						
					}
					
					
				}
			}
		}
		
		

		public static void wait(WebElement element) 	
		{
			WebDriverWait wait1 = new WebDriverWait(driver, 10);

			wait1.until(ExpectedConditions.visibilityOf(element));

			wait1.until(ExpectedConditions.elementToBeClickable(element));

		}
		

		public static Boolean wait(WebElement element, int time) 	
		{
			WebDriverWait wait = new WebDriverWait(driver, time);

			boolean visible=false;
			
			try
			{
				wait.until(ExpectedConditions.visibilityOf(element));

				wait.until(ExpectedConditions.elementToBeClickable(element));
				
				visible=true;
				
			} catch (Exception e) 
			{
				// TODO: handle exception
			}
		
			
			return visible;

		}
		

		public static void exceptionInputHandling(WebElement input) throws InterruptedException {

			boolean display = false;
			for (int k = 0; k < 100; k++) {
				try {
					input.click();

					display = true;

					if (display == true) {
						System.out.println(k);

						break;
					}

				} catch (Exception e) {
					Thread.sleep(100);

					input.click();
				}

			}
		}

	/*	public static void alertEdit(String screen, String fileLocation)
				throws HeadlessException, IOException, AWTException, InterruptedException {
			PageFactory.initElements(driver, ElementAlert.class);

			PageFactory.initElements(driver, ElementUnit.class);

			PageFactory.initElements(driver, ElementComponent.class);

			PageFactory.initElements(driver, ElementStorageCondition.class);

			PageFactory.initElements(driver, ElementStorageLocation.class);

			PageFactory.initElements(driver, ElementContainerType.class);

			PageFactory.initElements(driver, ElementSampleTestComments.class);

			PageFactory.initElements(driver, ElementAlert.class);

			PageFactory.initElements(driver, ElementAlert.class);

			PageFactory.initElements(driver, ElementAlert.class);

			PageFactory.initElements(driver, ElementAlert.class);

			PageFactory.initElements(driver, ElementAlert.class);

			PageFactory.initElements(driver, ElementAlert.class);

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			for (int i = 0; i < 5; i++) {
				if (ElementAlert.alert.isDisplayed() || ElementAlert.alert.isDisplayed()) {
					BasicOperation.screenshot(FileLocationAlert.componentWithoutSelectEdit);

					Thread.sleep(600);

					ElementAlert.alertClose.click();

					break;

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

				else if (screen.contains("storageCondition")) {
					ElementStorageCondition.storageConditionAction.click();

					ElementStorageCondition.storageConditionEdit.click();

				}

				else if (screen.contains("storage location")) {
					ElementStorageLocation.storageLocationAction.click();

					ElementStorageLocation.storageLocationEdit.click();

				}

				else if (screen.contains("sample Test comments")) {
					ElementSampleTestComments.sampleTestCommentsAction.click();

					ElementSampleTestComments.sampleTestCommentsEdit.click();

				}

				else if (screen.contains("containerType")) {
					ElementContainerType.containerTypeAction.click();

					ElementContainerType.containerTypeEdit.click();

				}

				else if (screen.contains("unit")) {
					ElementUnit.unitAction.click();

					ElementUnit.unitEdit.click();

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

				else if (screen.contains("component")) {
					ElementComponent.componentAction.click();

					ElementComponent.componentEdit.click();

				}

			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
*/
		public static void esignAuditTrail(String comments, String esign, String toDo) {
			PageFactory.initElements(driver, ElementEsign.class);

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			try {
				ElementEsign.EsignPassword.click();

				ElementEsign.EsignPassword.sendKeys("123");

				ElementEsign.EsignComments.sendKeys(comments);

				if (ElementEsign.EsignCheckbox.isSelected() == false) {
					ElementEsign.EsignCheckbox.click();
				}

			
				ElementEsign.EsignSubmit.click();

			} catch (Exception e) {

				// TODO: handle exception
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		public static boolean esign(String comments) 
		{
			boolean a=false;
			
			PageFactory.initElements(driver, ElementEsign.class);

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			try {
				ElementEsign.EsignPassword.click();

				ElementEsign.EsignPassword.sendKeys("123");

				ElementEsign.EsignComments.sendKeys(comments);

				if (ElementEsign.EsignCheckbox.isSelected() == false) {
					ElementEsign.EsignCheckbox.click();
				}

				ElementEsign.EsignSubmit.click();
				
				a=true;

			} catch (Exception e) {
				
				a=false;

				// TODO: handle exception
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			return a;

		}
		
		
		public static void scrollToElement(WebElement element) throws InterruptedException {
			
		 
			for(int i=0; i<1000;)
			{
				
			}
			try 
			{
				element.click();
			} catch (Exception e) {

				// TODO: handle exception
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			BasicOperation.exception(element);

		}


		public static void gridAlert(String screenshot)
				throws HeadlessException, IOException, AWTException, InterruptedException {
			PageFactory.initElements(driver, ElementEsign.class);

			PageFactory.initElements(driver, ElementAlert.class);

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			if (ElementAlert.alert.isDisplayed() || ElementAlert.alert.isDisplayed()) {
			//	BasicOperation.screenshot(screenshot);

				Thread.sleep(600);

				ElementAlert.alertClose.click();

			} else {
				System.out.println("one");
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		public static void unselect(List<WebElement> list) {

			List<WebElement> unit = list;

			int size = unit.size();

			if (size > 0) {
				unit.get(0).click();
			}
		}
		
		
		public static void select(List<WebElement> list, String name) {

			List<WebElement> unit = list;
			
			
			for(WebElement a:unit)
			{
				if(a.getText().equals(name))
				{
					a.click();
					
				}
			}

			/*int size = unit.size();

			if (size > 0) {
				unit.get(0).click();
			}*/
		}

		public static void time() {
			LocalTime time = LocalTime.now();
			System.out.println(time);
		}

		public static String date() {
			LocalDateTime current = LocalDateTime.now();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String formatted = current.format(formatter);

			return formatted;
		}

		public static String timeValue() {
			LocalTime time = LocalTime.now();
			String t = time + "";

			return t;
		}

		public static String timeValueDescription() throws InterruptedException {
			Thread.sleep(1000);
			LocalTime time = LocalTime.now();

			String t = time + "";

			return t;
		}
		
		public static void datePicker(String a) throws AWTException
		{
			StringSelection fileLocationString = new StringSelection(a);

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocationString, null);
			
			Robot rob = new Robot();
			
			

			rob.keyPress(KeyEvent.VK_CONTROL);

			rob.keyPress(KeyEvent.VK_V);

			rob.keyRelease(KeyEvent.VK_V);

			rob.keyRelease(KeyEvent.VK_CONTROL);
		}

		public static void uploadFile(String fileLocation) throws AWTException, InterruptedException {
			
			Thread.sleep(2000);
			
			StringSelection fileLocationString = new StringSelection(fileLocation);

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocationString, null);

			Robot rob = new Robot();
			
			Thread.sleep(2000);

			rob.keyPress(KeyEvent.VK_CONTROL);

			rob.keyPress(KeyEvent.VK_V);

			rob.keyRelease(KeyEvent.VK_V);

			rob.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(500);

			rob.keyPress(KeyEvent.VK_ENTER);

			rob.keyRelease(KeyEvent.VK_ENTER);

		}
		
	public static void uploadFile(String fileLocation, List<WebElement>element) throws AWTException, InterruptedException {
			
			Thread.sleep(2000);
			
			StringSelection fileLocationString = new StringSelection(fileLocation);

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileLocationString, null);

			Robot rob = new Robot();
			
			Thread.sleep(2000);

			rob.keyPress(KeyEvent.VK_CONTROL);

			rob.keyPress(KeyEvent.VK_V);

			rob.keyRelease(KeyEvent.VK_V);

			rob.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(500);

			rob.keyPress(KeyEvent.VK_ENTER);

			rob.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
			element.get(2).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			if(element.get(0).isDisplayed()==false)
			{

				element.get(1).click();
				
				uploadFile(fileLocation);
				
				element.get(2).click();
				
			
			}
			else
			{
				
			
			}
			

		/*	
			element.get(2).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			try 
			{
				WebDriverWait wait11 = new WebDriverWait(driver, 10);

				wait11.until(ExpectedConditions.visibilityOf(element.get(0)));

				wait11.until(ExpectedConditions.elementToBeClickable(element.get(1)));
				
			} 
			catch (Exception e) 
			{
				element.get(2).click();
				
				uploadFile(fileLocation);
				
				element.get(3).click();
				
			}*/
			
			
		}

		public static void mail(/* String[] to,String cc, String subject, String description, String [] file */)
				throws InterruptedException, AWTException {
			String url = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

			String email = "murali.r@gmail.com";

			String passWord = "Agarammurali@123.";

			String[] toMail;

			String[] ccMail;
			/*
			 * String subjectMail=subject;
			 * 
			 * String descriptionMail=description;
			 * 
			 * String [] attachment=file;
			 */

			System.setProperty("webdriver.chrome.driver", "C:\\Murali\\Eclipse Workspace\\chromedriver.exe");
			WebDriver dd = new ChromeDriver();

			dd.manage().window().maximize();

			dd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			dd.get(url);

			dd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("iammurali1096@gmail.com");

			Thread.sleep(5000);

			dd.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

			Thread.sleep(5000);

			dd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Agarammurali@123.");

			Thread.sleep(5000);

			dd.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();

			dd.findElement(By.xpath("//*[@id=\":zc\"]/div/div")).click();

			dd.findElement(By.xpath("//*[@id=\":13a\"]")).sendKeys("iammurali1096@gmail.com");

			dd.findElement(By.id(":14f")).sendKeys("email");

			dd.findElement(By.xpath("//*[@id=\":16r\"]")).click();

			Thread.sleep(5000);

			BasicOperation.uploadFile("C:\\Users\\ate186\\Desktop\\Base Master\\Report\\BaseMaster.html");

			dd.findElement(By.xpath("//*[@id=\":132\"]")).click();

			/*
			 * WebElement mailID=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			 * 
			 * WebElement password=driver.findElement(By.xpath(
			 * "//*[@id=\"password\"]/div[1]/div/div[1]/input"));
			 * 
			 * WebElement idNext=driver.findElement(By.xpath(
			 * "//*[@id=\"identifierNext\"]/div/button/span"));
			 * 
			 * WebElement pwdNext=driver.findElement(By.xpath(
			 * "//*[@id=\"passwordNext\"]/div/button/span"));
			 * 
			 * mailID.sendKeys("murali.r@gmail.com");
			 * 
			 * idNext.click();
			 * 
			 * password.sendKeys("Agarammurali@123.");
			 * 
			 * pwdNext.click();
			 */

		}
 

		public static void selectCheckBox(List<WebElement> name, List<WebElement> checkbox, WebElement waitCondition) {
			WebDriverWait wait = new WebDriverWait(driver, 300);

			wait.until(ExpectedConditions.visibilityOf(waitCondition));

			List<WebElement> nameList = name;

			List<WebElement> checkboxList = checkbox;

			for (WebElement name1 : nameList) {
				if (name1.getText().equals(nameList)) {
					int i = nameList.indexOf(name1);

					String checkBoxStatus = checkboxList.get(i).getAttribute("checkboxselect");

					if (checkBoxStatus.equals("0")) {
						name1.click();
					}

				}
			}
		}
		
		
		
		public static void updateExcel(String fileLocation, int testCase, int actualResultCell, String actualResult, String result) throws IOException
		{
			File file=new File(fileLocation);
			
			FileInputStream fis=new FileInputStream(file);
		/*			
			 XSSFWorkbook wb = new XSSFWorkbook(fis); //Access the workbook
	         
	         XSSFSheet worksheet = wb.getSheet("Sampling Point"); //Access the worksheet, so that we can update / modify it.
	         
	         XSSFRow row=worksheet.getRow(testCase);
	         
	         XSSFCell actualResults=row.getCell(actualResultCell);
	         
	         int resultCell=actualResultCell++;
	         
	         actualResults.setCellValue(actualResult);
	         
	         XSSFCell results=row.getCell(resultCell);
	         
	         results.setCellValue(result);
	         
	       */
	         
	         fis.close();
	         
	         FileOutputStream fos=new FileOutputStream(file);
	         
	    /*     wb.write(fos);
	         
	         wb.close();
	         
	    */
			
		}
		
		
		public static int dataList(List<WebElement> list)
		{
			
			
			int gridList=0;
			
			try 
			{
				gridList=list.size();
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			
			
			return gridList;
		}
		
		
		
	 	
		
		public static String module(String screen)
		{
			
			String module=null;
			if(screen.equals("designation"))
			{
				module="User Management";
			}
			
			return module;
		}
		
		
		public static void selectByVisibleText(WebElement element, String text)
		{
			Select a= new Select(element);
			
			a.selectByVisibleText(text);
					
		}
		
		public static void selectByIndex(WebElement element, int text)
		{
			Select a= new Select(element);
			
			a.selectByIndex(text);
			
		}
		
		public static void selectByValue(WebElement element, String text)
		{
			Select a= new Select(element);
			
			a.selectByValue(text);
		}


		public static void screenshot(String string) {
			System.out.println("screenshot");
			
		}


	
		
		



		
		
		
		
	
}

