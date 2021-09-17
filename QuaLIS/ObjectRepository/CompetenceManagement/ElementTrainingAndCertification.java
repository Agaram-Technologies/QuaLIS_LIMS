package CompetenceManagement;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementTrainingAndCertification {

	
	
	
	@FindBy(xpath="//*[@id=\"ID_TCRT_ADDPP_ScheduleData\"]/div/div[1]/div[1]/p")
	public static List<WebElement> trainingAndCertificationParticipantsList;

	
	@FindBy(xpath="//*[@id=\"ID_TCRT_ADDPP_ScheduleData\"]/div/div[2]")
	public static List<WebElement> trainingAndCertificationParticipantsCheckboxList;

	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_19")
	public static WebElement CompetenceManagementIcon;
	
	@FindBy(id = "iFormID_88")
	public static WebElement trainingAndCertificationIcon;

	@FindBy(id = "ID_TCRT_from_date")
	public static WebElement trainingAndCertificationFilterFrom ;

	@FindBy(id = "ID_TCRT_to_date")
	public static WebElement trainingAndCertificationFilterTo;
	
	@FindBy(id = "ID_TCRT_refresh")
	public static WebElement trainingAndCertificationFilterFind;

	@FindBy(xpath = "//*[@id='ID_TCRT_Filter']/div[1]/a")
	public static WebElement trainingAndCertificationFilterClose;

	@FindBy(id = "//*[@id='ID_TCRT_Filter']/div[1]/a")
	public static WebElement trainingAndCertificationFilterIcon;
	

	@FindBy(id = "ID_TCRT_ScheduleTraining")
	public static WebElement trainingAndCertificationScheduleIcon;
	
	@FindBy(id = "ID_TCRT_Participants")
	public static WebElement trainingAndCertificationParticipantsIcon;

	@FindBy(xpath = "//*[@id='ID_TCRT_ScheduleActionMenu']/a")
	public static WebElement trainingAndCertificationScheduleAction;
	
	@FindBy(xpath = "//*[@id='ID_TCRT_ScheduleActionMenu']/a")
	public static WebElement trainingAndCertificationParticipantsAction;

	@FindBy(id = "ID_TCRT_Addbutton")
	public static WebElement trainingAndCertificationScheduleAdd;


	@FindBy(id = "ID_TCRT_ReSchdulebutton")
	public static WebElement trainingAndCertificationScheduleReschedule;


	@FindBy(id = "ID_TCRT_Conductbutton")
	public static WebElement trainingAndCertificationScheduleConduct;


	@FindBy(id = "ID_TCRT_CancelSchedulebutton")
	public static WebElement trainingAndCertificationScheduleCancel;
	


	@FindBy(id = "ID_TCRT_STrainingCat")
	public static WebElement trainingAndCertificationScheduleTrainingCategory;
	
	
	@FindBy(id = "ID_TCRT_STrainingTechnique")
	public static WebElement trainingAndCertificationScheduleTechnique;


	@FindBy(id = "ID_TCRT_STrainingTopic")
	public static WebElement trainingAndCertificationScheduleTrainingTopic;


	@FindBy(id = "ID_TCRT_instTimezone")
	public static WebElement trainingAndCertificationScheduleTimeZone;


	@FindBy(id = "ID_TCRT_time")
	public static WebElement trainingAndCertificationScheduleTime;
	

	@FindBy(id = "ID_TCRT_Training_date")
	public static WebElement trainingAndCertificationScheduleDate;
	


	@FindBy(id = "ID_TCRT_STrainer")
	public static WebElement trainingAndCertificationScheduleTrainer;
	
	
	@FindBy(id = "ID_TCRT_STrainingVenue")
	public static WebElement trainingAndCertificationScheduleVenue;


	@FindBy(id = "ID_TCRT_comments")
	public static WebElement trainingAndCertificationScheduleComments;


	@FindBy(id = "ID_TCRT_AddSTSubmit")
	public static WebElement trainingAndCertificationScheduleAddSubmit;


	@FindBy(id = "ID_TCRT_STCancel")
	public static WebElement trainingAndCertificationScheduleAddCancel;
	


	@FindBy(id = "ID_TCRT_CancelSchedulebutton")
	public static WebElement trainingAndCertificationScheduleRescheduleSubmit;
	
	
	@FindBy(id = "ID_TRC_trainingAndCertificationDescription")
	public static WebElement trainingAndCertificationScheduleRescheduleCancel;
	
	@FindBy(id = "ID_TCRT_AddParticipantbutton")
	public static WebElement trainingAndCertificationParticipantAdd;
	

	@FindBy(id = "ID_TCRT_SendInvitation")
	public static WebElement trainingAndCertificationParticipantSendInvitation;
	
	@FindBy(id = "ID_TCRT_ParticipantCancelbutton")
	public static WebElement trainingAndCertificationParticipantCancel;

	@FindBy(id = "ID_TCRT_SectionName")
	public static WebElement trainingAndCertificationParticipantSection;
	
	
	
	@FindBy(xpath = "//*[@id='ID_TCRT_AvailListContainer']/button")
	public static WebElement trainingAndCertificationParticipantFind;
	

	@FindBy(xpath= "//*[@id='ID_TCRT_ParticipantPopUp']/span/div/input")
	public static WebElement trainingAndCertificationParticipantSearchField;
	
	@FindBy(xpath = "//*[@id='ID_TCRT_ParticipantPopUp']/li")
	public static WebElement trainingAndCertificationParticipantSearchResult;

	@FindBy(id = "ID_TCRT_ParticipantsSubmit")
	public static WebElement trainingAndCertificationParticipantAddSubmit;
	

	@FindBy(id = "ID_TCRT_ParticipantCancel")
	public static WebElement trainingAndCertificationParticipantAddCancel;
	

	@FindBy(id = "selectall")
	public static WebElement trainingAndCertificationParticipantSelectAll;
	
	
	
	
	
	
	
	
	
	
	
	
}