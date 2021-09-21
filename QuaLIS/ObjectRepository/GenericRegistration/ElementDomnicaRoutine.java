package GenericRegistration;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ElementDomnicaRoutine extends ElementGenericRegistration

{
 
	@FindBy(xpath="//*[@id=\"ID_SR_SampleRegistrationgetdiv\"]/div/div[1]/div[1]/p")
    public static List<WebElement> preRegisterNumberList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_SR_SampleRegistrationgetdiv\"]/div/div[1]/div[2]/p")
	public static List<WebElement> ARNumberList;
	
	@FindBy(xpath="//*[@displaymember='sclientgroupname']")
    public static WebElement clientCategory;
	
	@FindBy(xpath="//*[@displaymember='sclientname']")
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
	
	@FindBy(xpath="//*[@displaymember='stotalquantity']")
    public static WebElement totalQuantity;
	
	@FindBy(xpath="//*[@displaymember='sunitname']")
    public static WebElement totalQuantityUnit;
	
	@FindBy(xpath="//*[@displaymember='spriorityname']")
    public static WebElement priority;
	
	@FindBy(xpath="//*[@displaymember='sbatchno']")
    public static WebElement batchNumber;
	
	@FindBy(xpath="//*[@displaymember='sslotno']")
    public static WebElement lotNumber;
	
	@FindBy(xpath="//*[@displaymember='sdeadline']")
    public static WebElement deadline;
	
	@FindBy(xpath="//*[@displaymember='speriodname']")
    public static WebElement deadlinePeriod;
	
	@FindBy(xpath="//*[@displaymember='sremarks']")
    public static WebElement remarks;
	
	@FindBy(xpath="//*[@displaymember='sreportremarks']")
    public static WebElement reportRemarks;

}
