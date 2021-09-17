package BaseMaster;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.ElementName;

public class ElementUnit extends ElementName {

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_1")
	public static WebElement baseMasterIcon;

	@FindBy(xpath = "//*[@id=\"ID_UM_UnitMasterHead\"]/div[2]/div")
	public static WebElement searchIcon;

	@FindBy(xpath = "//*[@id=\"ID_UM_UnitMasterHead\"]/div[2]/div/i")
	public static WebElement searchClose;

	@FindBy(id = "iFormID_33")
	public static WebElement unitIcon;

	@FindBy(xpath = "//*[@id=\"ID_UM_UnitMasterDataBind\"]/div/div[1]/div[1]/p")
	public static List<WebElement> unitList;

	@FindBy(xpath = "//*[@id=\"ID_UM_UnitMasterDataBind\"]/div/div[1]/div[2]/p")
	public static List<WebElement> unitDescritionList;

	@FindBy(xpath = "//*[@id=\"ID_UM_UnitMasterDataBind\"]/div/div[2]")
	public static List<WebElement> unitCheckboxList;

	@FindBy(xpath = "//*[@id='ID_UM_UnitActionMenu']/a")
	public static WebElement unitAction;

	@FindBy(id = "ID_UN_UnitAddbutton")
	public static WebElement unitAdd;

	@FindBy(id = "ID_UN_UnitEditbutton")
	public static WebElement unitEdit;

	@FindBy(id = "ID_UN_UnitDeletebutton")
	public static WebElement unitDelete;

	@FindBy(id = "ID_UN_UNRefreshbutton")
	public static WebElement unitRefresh;

	@FindBy(id = "ID_UN_UNImportbutton")
	public static WebElement unitImport;

	@FindBy(id = "ID_UN_UNExportbutton")
	public static WebElement unitExportPDF;

	@FindBy(id = "ID_UN_UNExportXLsbutton")
	public static WebElement unitExportExl;

	@FindBy(id = "ID_UN_UnitName")
	public static WebElement unit;

	@FindBy(id = "ID_UN_UnitDesc")
	public static WebElement unitDescription;

	@FindBy(id = "ID_UN_UnitSubmitAdd")
	public static WebElement unitAddSubmit;

	@FindBy(id = "ID_UN_UnitCancel")
	public static WebElement unitAddCancel;

	@FindBy(id = "ID_UN_UnitName")
	public static WebElement unitEditName;

	@FindBy(id = "ID_UN_UnitDesc")
	public static WebElement unitEditDescription;

	@FindBy(id = "ID_UN_UnitSubmitEDIT")
	public static WebElement unitEditSubmit;

	@FindBy(id = "ID_UN_UnitCancel")
	public static WebElement unitEditCancel;

	@FindBy(id = "ID_CF_browseImportMasterData")
	public static WebElement importFileClick;

	@FindBy(id = "submitbtnCFImportData")
	public static WebElement importFileSubmit;

	@FindBy(id = "cancelbtnCFImportData")
	public static WebElement importFileCancel;

	@FindBy(id = "ID_UM_UnitData")
	public static WebElement unitTabIcon;

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;

	public static HashMap<String, WebElement> element() {
		HashMap<String, WebElement> a = new HashMap<String, WebElement>();

		a.put(module, masterIcon);

		a.put(subModule, baseMasterIcon);

		a.put(screen, unitIcon);

		a.put(action, unitAction);

		a.put(add, unitAdd);

		a.put(edit, unitEdit);

		a.put(delete, unitDelete);

		a.put(nameValue, unit);

		a.put(descriptionValue, unitDescription);

		a.put(addSubmitButton, unitAddSubmit);

		a.put(editSubmitButton, unitEditSubmit);

		a.put(tabHeader, unitTabIcon);

		a.put(home, homeIcon);

		return a;
	}

	public static HashMap<String, List<WebElement>> list() {
		HashMap<String, List<WebElement>> elements = new HashMap<String, List<WebElement>>();

		elements.put(nameList, unitList);

		elements.put(descriptionList, unitDescritionList);

		elements.put(checkBoxList, unitCheckboxList);

		return elements;
	}

}
