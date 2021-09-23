package CheckList;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ElementCheckList {
	

	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	// CheckList
	@FindBy(id = "iModuleID_13")
	public static WebElement checkListManagementIcon;

	// Checklist
	@FindBy(id = "iFormID_66")
	public static WebElement checklistIcon;

	@FindBy(className = "TM_StaticActionIcon")
	public static WebElement checkListAction;
	
	

@FindBy(xpath = "//*[@id=\"ID_CHL_ChecklistMastergetdiv\"]/div/div[1]/div[1]/p")
public static List<WebElement> checkListList;


@FindBy(xpath = "//*[@id=\"ID_CHL_ChecklistMastergetdiv\"]/div/div[1]/div[2]/p")
public static List<WebElement> checkListDescriptionList;



@FindBy(xpath = "//*[@id=\"ID_CHL_ChecklistMastergetdiv\"]/div/div[2]")
public static List<WebElement> checkListCheckboxList;


	@FindBy(id = "ID_CHL_ChecklistAddbutton")
	public static WebElement checkListAdd;

	@FindBy(id = "ID_CHL_ChecklistDeletebutton")
	public static WebElement checkListDelete;
	

	@FindBy(id = "ID_CHL_ChecklistEditbutton")
	public static WebElement checkListEdit;

	@FindBy(id = "ID_CHL_ChecklistAddbutton")
	public static WebElement checkListCreateVersion;

	

	@FindBy(id = "ID_CHL_ChecklistApprove")
	public static WebElement checkListApproveVersion;

	@FindBy(id = "ID_CHL_ChecklistVersionDeletebutton")
	public static WebElement checkListDeleteVersion;


	@FindBy(id = "ID_CHL_ChecklistRefresh")
	public static WebElement checkListRefresh;
	
	@FindBy(id = "ID_CHL_ChecklistView")
	public static WebElement checkListView;


	@FindBy(id = "ID_CHL_ChecklistName")
	public static WebElement checkList;

	@FindBy(id = "ID_CHL_ChecklistDescription")
	public static WebElement checkListDesciption;

	@FindBy(id = "ID_CHL_ChecklistADDSubmit")
	public static WebElement checkListAddSubmit;

	@FindBy(id = "ID_CHL_ChecklistData")
	public static WebElement checkListCheckListIcon;

	@FindBy(id = "ID_CHL_ChecklistQBData")
	public static WebElement checkListQBIcon;

	@FindBy(xpath = "//*[@id='ID_CHL_ChecklistTabs']/div[2]/a")
	public static WebElement checkListQBAction;

	@FindBy(id = "ID_CHL_ChecklistQBDeletebutton")
	public static WebElement checkListQBDelete;

	@FindBy(id = "ID_CHL_ChecklistQBAddbutton")
	public static WebElement checkListQBAdd;

	@FindBy(id = "ID_CHL_ChecklistQBEditbutton")
	public static WebElement checkListQBEdit;

	@FindBy(id = "ID_CVQ_QBCATEGORY")
	public static WebElement checkListQBCategory;

	@FindBy(xpath = "//*[@id=\"ID_CVQ_CheckListQbContainer\"]/button")
	public static WebElement checkListSelectQB;

	@FindAll(@FindBy(xpath = "//*[@id=\"ID_CVQ_ALLCHECKLISTQB\"]/li"))
	public static List<WebElement> questionList;

	@FindBy(id = "ID_CVQ_VersionQBADDSubmit")
	public static WebElement checkListQBAddSubmit;

	@FindBy(id = "ID_CVQ_VersionQBCancel")
	public static WebElement checkListQBAddCancel;
	

	@FindBy(id = "selectall")
	public static WebElement checkListQBSelectAll;
	


	@FindBy(id = "selectall")
	public static WebElement checkListEditSubmit;

	
	public static List list()
	{
		 List<WebElement> aa=new ArrayList<WebElement>();
		 
		 aa.add(masterIcon);
		 
		 aa.add(checkListManagementIcon);
		 
		 aa.add(checklistIcon);
		 
		 aa.add(checkListAction);
		 
		 aa.add(checkListAdd);
		 
		 aa.add(checkListEdit);
		 
		 aa.add(checkListDelete);
		 
		 aa.add(checkListRefresh);
		 
		 aa.add(checkListAddSubmit);
		 
		 aa.add(checkListEditSubmit);
		 
		 return aa;
	}
	
	//*[@id=""]/p

}
