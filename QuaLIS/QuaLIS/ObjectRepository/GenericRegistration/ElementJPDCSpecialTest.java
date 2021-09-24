package GenericRegistration;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementJPDCSpecialTest extends ElementGenericRegistration{
	
	
	@FindBy(xpath = "//*[@displaymember='sclientname']")
	public static WebElement client;
	
	@FindBy(xpath = "//*[@displaymember='sclientsitename']")
	public static WebElement clientSiteName;
	
	@FindBy(xpath = "//*[@displaymember='stelephone']")
	public static WebElement telephoneNo;
	
	@FindBy(xpath = "//*[@displaymember='semail']")
	public static WebElement email;
	
	@FindBy(xpath = "//*[@displaymember='sdeptname']")
	public static WebElement department;
	
	@FindBy(xpath = "//*[@displaymember='dmanufactcode']")
	public static WebElement manufacturDate;
	
	@FindBy(xpath = "//*[@displaymember='smanufacturename']")
	public static WebElement manufacturedLine;
	
	@FindBy(xpath = "//*[@displaymember='smanufacapacityname']")
	public static WebElement manufacturerCapacity;
	
	@FindBy(xpath = "//*[@displaymember='dduedate']")
	public static WebElement duedate;
	
	@FindBy(xpath = "//*[@displaymember='sremarks']")
	public static WebElement remarks;
	
	@FindBy(xpath = "//*[@displaymember='sproductcatname']")
	public static WebElement sampleCategory;
	
	@FindBy(xpath = "//*[@displaymember='sproductname']")
	public static WebElement sampleType;
	
	@FindBy(xpath = "//*[@displaymember='sspecname']")
	public static WebElement specification;
	
	
	
	@FindBy(xpath="//*[@id=\"ID_SR_SampleRegistrationgetdiv\"]/div/div[1]/div[1]/p")
    public static List<WebElement> preRegisterNumberList;
	

}
