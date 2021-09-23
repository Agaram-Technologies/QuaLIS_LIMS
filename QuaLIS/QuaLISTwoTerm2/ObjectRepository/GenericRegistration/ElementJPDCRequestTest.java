package GenericRegistration;


import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementJPDCRequestTest extends ElementGenericRegistration
{
	@FindBy(xpath = "//*[@displaymember='sclientname']")
	public static WebElement client;
	
	@FindBy(xpath = "//*[@displaymember='sclientid']")
	public static WebElement clientRegistration;
	
	@FindBy(xpath = "//*[@displaymember='sclientsitename']")
	public static WebElement clientSite;
	
	@FindBy(xpath = "//*[@displaymember='saddress']")
	public static WebElement clientAddress;
	
	@FindBy(xpath = "//*[@displaymember='scoaaddress']")
	public static WebElement coaAddress;
	
	@FindBy(xpath = "//*[@displaymember='sclientcontactname']")
	public static WebElement clientContact;
	
	@FindBy(xpath = "//*[@displaymember='stelephone']")
	public static WebElement telephone;
	
	@FindBy(xpath = "//*[@displaymember='semail']")
	public static WebElement email;
	
	@FindBy(xpath = "//*[@displaymember='stransfername']")
	public static WebElement transferCoa;
	
	@FindBy(xpath = "//*[@displaymember='spurposetypename']")
	public static WebElement testPurpose;
	
	@FindBy(xpath = "//*[@displaymember='spurifiedtypename']")
	public static WebElement purified;
	
	@FindBy(xpath = "//*[@displaymember='spaymentypename']")
	public static WebElement paymentMethod;
	
	@FindBy(xpath = "//*[@displaymember='spaidtypename']")
	public static WebElement paid;
	
	@FindBy(xpath = "//*[@displaymember='scoalangtypename']")
	public static WebElement coaLanguageType;
	
	@FindBy(xpath = "//*[@displaymember='ncoaquantitycode']")
	public static WebElement coaQuantity;
	
	@FindBy(xpath = "//*[@displaymember='dduedate']")
	public static WebElement dueDate;
	
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
