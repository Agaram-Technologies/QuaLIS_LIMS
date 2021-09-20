package GenericRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Attachment.GenericRegistration;

public class ElementDomnica extends GenericRegistration

{
 
	@FindBy(xpath="//*[@displaymember='sclientgroupname']")
    public static WebElement clientCategory;
	
	@FindBy(xpath="//*[@displaymember='sclientsitename']")
    public static WebElement client ;
	
	@FindBy(xpath="//*[@displaymember='sproductcatname']")
    public static WebElement sampleCategory;
	
	@FindBy(xpath="//*[@displaymember='sproductname']")
    public static WebElement sample;
		
	@FindBy(xpath="//*[@displaymember='smanufname']")
    public static WebElement manufacturer ;
	
	@FindBy(xpath="//*[@displaymember='ssuppliername']")
    public static WebElement supplier;
	
	@FindBy(xpath="//*[@displaymember='scontainertype']")
    public static WebElement containerType;
	
	@FindBy(xpath="//*[@displaymember='sstorageconditionname']")
    public static WebElement storageCondition;
	
	@FindBy(xpath="//*[@displaymember='srelativehumidity']")
    public static WebElement relativeHumanity;
	
	@FindBy(xpath="//*[@displaymember='sourfilecode']")
    public static WebElement ourFileCode;
	
	@FindBy(xpath="//*[@displaymember='squalitysystemcode']")
    public static WebElement disposition;
	
	@FindBy(xpath="//*[@valuemember='stotalquantity']")
    public static WebElement totalQuantity;
	
	@FindBy(xpath="//*[@displaymember='sunitname']")
    public static WebElement totalQuantityUnit;
	
	@FindBy(xpath="//*[@valuemember='spriorityname']")
    public static WebElement priority;
	
	@FindBy(xpath="//*[@displaymember='sbatchno']")
    public static WebElement batchNumber;
	
	@FindBy(xpath="//*[@displaymember='sslotno']")
    public static WebElement lotNumber;
	
	@FindBy(xpath="//*[@valuemember='sdeadline']")
    public static WebElement deadline;
	
	@FindBy(xpath="//*[@displaymember='speriodname']")
    public static WebElement deadlinePeriod;
	
	@FindBy(xpath="//*[@valuemember='sremarks']")
    public static WebElement remarks;
	
	@FindBy(xpath="//*[@valuemember='sreportremarks']")
    public static WebElement reportRemarks;

}
