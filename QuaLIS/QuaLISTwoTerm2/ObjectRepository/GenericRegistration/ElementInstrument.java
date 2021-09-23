package GenericRegistration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementInstrument extends ElementGenericRegistration {
	@FindBy(id = "iMenuID_2")
	public static WebElement transactionIcon;

	@FindBy(id = "iModuleID_10")
	public static WebElement registrationIcon;

	@FindBy(id = "iFormID_43")
	public static WebElement genericRegistrationIcon;

	@FindBy(id = "ID_SR_SampleTypeCombo1")
	public static WebElement advancedFilterSampleType;

	@FindBy(xpath = "//*[@id=\"ID_SampleRegistration_AdvancedView\"]/a")
	public static WebElement advancedFilterIcon;

	@FindBy(id = "ID_SRD_checkInput_00")
	public static WebElement checkList1;

	@FindBy(id = "ID_SRD_checkInput_01")
	public static WebElement checkList2;

	@FindBy(id = "ID_SR_Dynamic_6607")
	public static WebElement projectCode;

	

}
