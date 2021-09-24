package GenericRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementHPCLRoutine extends ElementGenericRegistration{
	

	@FindBy(xpath="//*[@displaymember='sclientname']")
    public static WebElement client;
	
	@FindBy(xpath="//*[@displaymember='sprojectid']")
    public static WebElement projectID;
	

	@FindBy(xpath="//*[@displaymember='sstorageconditionname']")
    public static WebElement storageCondition;
	
	@FindBy(xpath="//*[@displaymember='squalitysystemcode']")
    public static WebElement disposition;
	

	
	@FindBy(xpath="//*[@displaymember='sreasonsampletesting']")
    public static WebElement reason	;
	

	
	@FindBy(xpath="//*[@displaymember='sspecialprecautions']")
    public static WebElement precautions;
	
	
	@FindBy(xpath="//*[@displaymember='spriorityname']")
    public static WebElement priority;
	
	
	@FindBy(xpath="//*[@displaymember='ssafetyremarks']")
    public static WebElement safetyRemarks;
	
	@FindBy(id="ID_SR_Dynamic_10011")
    public static WebElement numberOfContainer;
	

	@FindBy(id="ID_SR_Dynamic_10012")
    public static WebElement containerType;
	

}
