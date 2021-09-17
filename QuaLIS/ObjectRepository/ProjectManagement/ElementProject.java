package ProjectManagement;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ElementProject {
	

	//Master
		@FindBy(id="iMenuID_1")
		public static WebElement masterIcon;
	    	
	//Project SubModule	
			@FindBy(id="iModuleID_49")
			public static WebElement projectManagementIcon;
			
	//Project		
			@FindBy(id="iFormID_204")
			public static WebElement projectIcon;
			
			@FindBy(xpath="//*[@id=\"ID_PM_rightmenu\"]/a")
			public static WebElement projectAction;
			
			@FindBy(xpath="//*[@id=\"ID_PM_ProjectMasterDataBind\"]/div/div[1]/div[2]/p")
			public static List<WebElement> projectNameList;
			
			@FindBy(xpath="//*[@id=\"ID_PM_ProjectMasterDataBind\"]/div/div[2]")
			public static List<WebElement> projectCheckboxList;
			
			
			
			
	//Add		
			@FindBy(id="ID_PM_ProjectMaster_add")
			public static WebElement projectAdd;
			
			@FindBy(id="ID_PM_ProjectMaster_Edit")
			public static WebElement projectEdit;
			
			@FindBy(id="ID_PM_ProjectMaster_delete")
			public static WebElement projectDelete;
			
			@FindBy(id="ID_ApproveProject")
			public static WebElement projectApprove;
			
			@FindBy(id="ID_ClosureProject")
			public static WebElement projectProjectClosure;
			
			@FindBy(id="ID_RetireProject")
			public static WebElement projectRetire;
			
			@FindBy(id="ID_RefreshProject")
			public static WebElement projectRefresh;
			
			@FindBy(id="ID_PM_ProjectEditSubmit")
			public static WebElement projectEditSubmit;
			
				
			@FindBy(id="ID_PM_ProjectCancel")
			public static WebElement projectEditCancel;
			
			@FindBy(id="ID_PMC_uploadBtn")
			public static WebElement projectClosureFileIcon;
			
			@FindBy(id="ID_PMC_Sreason")
			public static WebElement projectClosureReason;
			
			@FindBy(id="ID_PM_ProjectclosureFileAddSubmit")
			public static WebElement projectClosureSubmit;
			
			@FindBy(id="ID_PM_ProjectclosureFileCancel")
			public static WebElement projectClosureCancel;
			
			@FindBy(id="ID_PM_ProjectDesc")
			public static WebElement projectRetireRemarks;
			
			@FindBy(id="ID_PM_ProjectRetireSubmit")
			public static WebElement projectRetireSubmit;
			
			@FindBy(id="ID_PM_ProjectretireCancel")
			public static WebElement projectRetireCancel;
		
			@FindBy(id="ID_PM_File")
			public static WebElement projectAttachmentIcon;
			
			@FindBy(id="ID_PMF_uploadBtn")
			public static WebElement projectFileIcon;
			
			@FindBy(xpath="//*[@id=\"ID_PM_rightmenu\"]/a")
			public static WebElement projectFileAction;
		
			
			
			
			@FindBy(id="ID_PMF_Description")
			public static WebElement projectFileDescription;
			
			@FindBy(id="ID_PM_ProjectFileAddSubmit")
			public static WebElement projectFileAddSubmit;
			
			@FindBy(id="ID_PM_ProjectFileCancel")
			public static WebElement projectFileAddCancel;
			
			@FindBy(id="ID_PM_ProjectFileEditSubmit")
			public static WebElement projectFileEditSubmit;
			
			@FindBy(id="ID_PM_ProjectFileCancel")
			public static WebElement projectFileEditCancel;
			

			
			@FindBy(id="ID_PM_ProjectFileMaster_add")
			public static WebElement projectFileAdd;
			

			
			@FindBy(id="ID_ProjectFileEdit")
			public static WebElement projectFileEdit;
			

			
			@FindBy(id="ID_ProjectFileDelete")
			public static WebElement projectFileDelete;
			
		
			
			
			
			@FindBy(id="ID_PM_ProjectCombo")
			public static WebElement projectType;
			
			@FindBy(xpath="//*[@id=\"ID_PM_ProjectCombo\"]/option")
			public static List<WebElement> projectTypeList;
			
			
			
			@FindBy(id="ID_PM_ProjectName")
			public static WebElement project;
			
			@FindBy(id="ID_PM_ProjectDescription")
			public static WebElement projectDescription;
			
			@FindBy(id="ID_PM_StartDate")
			public static WebElement projectStartDate;
			
			
			@FindBy(id="ID_PM_ProjectDuration")
			public static WebElement projectDuration;
			
			@FindBy(id="ID_PM_ProjectPeriod")
			public static WebElement projectPeriod;
			
			@FindBy(id="ID_PM_ProjectSubmit")
			public static WebElement projectAddSubmit;
			
			@FindBy(id="ID_PM_ProjectCancel")
			public static WebElement projectAddCancel;
			
			@FindBy(id="ID_PM_Project")
			public static WebElement projectProjectIcon;
			
			
			
			
			
			
			
			
			

	//Project Members
			@FindBy(id="ID_PM_Users")
			public static WebElement projectProjectMemberIcon;
			
	//Add		
			@FindBy(xpath="//*[@id=\"ID_PM_rightmenu\"]/a")
			public static WebElement projectMemberAction;

			@FindBy(id="ID_PM_ProjectUserMaster_add")
			public static WebElement projectMemberAdd;
			
			@FindBy(id="ID_PM_ProjectMemberdelete")
			public static WebElement projectMemberDelete;
			
			@FindBy(xpath="//*[@id=\"ID_PMU_AvailListContents\"]/button")
			public static WebElement projectViewProjectMember;
			

			@FindBy(xpath="//*[@id=\"ID_PM_ProjectMemberData\"]/div/div[1]/div[1]/p")
			public static List<WebElement> projectViewProjectMemberLoginIdList;
			
			@FindBy(xpath="//*[@id=\"ID_PM_ProjectMemberData\"]/div/div[1]/div[2]/p")
			public static List<WebElement> projectViewProjectMemberNameList;
			
			
			@FindBy(xpath="//*[@id=\"ID_PM_ProjectMemberData\"]/div/div[2]")
			public static List<WebElement> projectViewProjectMemberCheckboxList;
			
			
			

			@FindBy(xpath="//*[@id=\"selectall\"]/p")
				public static WebElement projectMemberSelectAll;
			

			@FindBy(id="ID_PM_ProjectMemberSubmit")
				public static WebElement projectMemberAddSubmit;
		
		@FindBy(id="ID_PMU_ProjectMember_cancel")
			public static WebElement projectMemberAddCancel;
			
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[1]/dd/span")
			public static WebElement projectProjectSideViewProjectType;
		
	@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[2]/dd/span ")
			public static WebElement projectProjectSideViewProjectName;
		
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[3]/dd/span")
			public static WebElement projectProjectSideViewProjectDescription;
		
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[4]/dd/span")
			public static WebElement projectProjectSideViewProjectStartDate;
		
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[5]/dd/span")
			public static WebElement projectProjectSideViewProjectDuration;
		
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[6]/dd/span")
			public static WebElement projectProjectSideViewProjectStatus;
		
			@FindBy(id="ID_TotalData_702_702")
			public static WebElement projectProjectSideViewProjectMembersCount;
		/*
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[1]/dd/span")
			public static WebElement projectProjectSideViewProjectMemberProjectName;
		
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[1]/dd/span")
			public static WebElement projectProjectSideViewProjectMemberProjectName;
		
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_701_701_0\"]/dl[1]/dd/span")
			public static WebElement projectProjectSideViewProjectMemberProjectName;
		*/
			
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_703_703_0\"]/dl[1]/dd/span")
			public static WebElement projectProjectSideViewProjectFileProjectName;
		

			
			@FindBy(xpath="//*[@id=\"ID_InsideDiv_703_703_0\"]/dl[2]/dd/span")
			public static WebElement projectProjectSideViewProjectFileName;
		
			
			
			
			

			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}


