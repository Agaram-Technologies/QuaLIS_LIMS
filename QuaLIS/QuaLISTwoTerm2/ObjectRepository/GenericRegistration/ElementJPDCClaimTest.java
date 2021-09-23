package GenericRegistration;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ElementJPDCClaimTest  extends ElementGenericRegistration{
	
	
	//@FindBy(xpath="//*[@id=\"ID_SR_SampleRegistrationgetdiv\"]/div/div[1]/div[2]/p")

	@FindBy(xpath="//*[@id=\"ID_SR_SampleRegistrationgetdiv\"]/div/div[1]/div[1]/p")
    public static List<WebElement> preRegisterNumberList;

		
		@FindBy(xpath="//*[@displaymember='sremarks']")
	    public static WebElement remark;
		
		@FindBy(xpath="//*[@displaymember='sclientname']")
	    public static WebElement clientName;
		
		@FindBy(xpath="//*[@displaymember='sclientsitename']")
	    public static WebElement clientSite;
		
		@FindBy(xpath="//*[@displaymember='stelephone']")
	    public static WebElement telephoneNumber;
		
		@FindBy(xpath="//*[@displaymember='dmanufactcode']")
	    public static WebElement manufacturerDate;
		
		@FindBy(xpath="//*[@displaymember='semail']")
	    public static WebElement email;
		
		@FindBy(xpath="//*[@displaymember='sdeptname']")
	    public static WebElement department;
		
		@FindBy(xpath="//*[@displaymember='smanufacturename']")
	    public static WebElement manufacturerLine;
		
		
		@FindBy(xpath="//*[@displaymember='smanufacapacityname']")
	    public static WebElement manufacturerCapacity;
		
		@FindBy(xpath="//*[@displaymember='ssampleopenname']")
	    public static WebElement sampleOpened;
		
		@FindBy(xpath="//*[@displaymember='sclaimtypename']")
	    public static WebElement claimType;
		
		@FindBy(xpath="//*[@valuemember='nissuecoa']")
	    public static WebElement issueCoa;
		
		@FindBy(xpath="//*[@displaymember='dduedate']")
	    public static WebElement dueDate;
		
		@FindBy(xpath="//*[@valuemember='nsecuritydata']")
	    public static WebElement securityData;
		
		@FindBy(xpath="//*[@displaymember='sproductcatname']")
	    public static WebElement sampleCategory;
		
		@FindBy(xpath="//*[@displaymember='sproductname']")
	    public static WebElement sample;
		
		
		
		
		
		
		


}
