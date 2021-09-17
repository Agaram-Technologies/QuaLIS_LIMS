package ProjectManagement;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementProjectType extends ElementName {

	// Master
	@FindBy(id = "iMenuID_1")
	public static WebElement Master;

	// Project SubModule
	@FindBy(id = "iModuleID_49")
	public static WebElement Project;

	// ProjectType
	@FindBy(id = "iFormID_220")
	public static WebElement ProjectTyp;

	@FindBy(className = "TM_StaticActionIcon")
	public static WebElement Action;

	// Add
	@FindBy(id = "ID_PT_ProjectTypeAddbutton")
	public static WebElement AddProjectTyp;

	@FindBy(id = "ID_PT_ProjectTypeName")
	public static WebElement ProjectTypNme;

	@FindBy(id = "ID_PT_ProjectTypeShortCode")
	public static WebElement ProjectTypShrtCde;

	@FindBy(id = "ID_PT_ProjectTypeADDSubmit")
	public static WebElement SbmtProjectTyp;

	@FindBy(xpath = "//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;

	@FindBy(id = "ID_TRC_TrainingCategory")
	public static WebElement QBCategoryTabIcon;
/*
	public static HashMap<String, WebElement> element() {
		HashMap<String, WebElement> element = new HashMap<String, WebElement>();

		element.put(module, masterIcon);

		element.put(subModule, checkListManagementIcon);

		element.put(screen, QBCategoryIcon);

		element.put(action, QBCategoryAction);

		element.put(add, QBCategoryAdd);

		element.put(nameValue, QBCategory);

		element.put(descriptionValue, QBCategoryDescription);

		element.put(addSubmitButton, QBCategoryAddSubmit);

		element.put(editSubmitButton, QBCategoryEditSubmit);

		element.put(tabHeader, QBCategoryTabIcon);

		element.put(home, homeIcon);

		return element;
	}*/

}
