package CompetenceManagement;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ElementTrainingUpdate {

	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_19")
	public static WebElement CompetenceManagementIcon;
	
	@FindBy(id = "iFormID_89")
	public static WebElement trainingUpdateIcon;
	
	@FindBy(id = "ID_TU_from_date")
	public static WebElement trainingUpdateFilterFrom ;

	@FindBy(id = "ID_TCRT_to_date")
	public static WebElement trainingUpdateFilterTo;
	

	@FindBy(id = "ID_TU_TechniqueFilter")
	public static WebElement trainingUpdateFilterTechnique;

	
	@FindBy(id = "ID_TU_refresh")
	public static WebElement trainingUpdateFilterFind;

	@FindBy(xpath = "//@a[class='RE_closebtn']")  
	public static WebElement trainingUpdateFilterClose;

	@FindBy(id = "ID_TU_Main_Filter")
	public static WebElement trainingUpdateFilterIcon;
	

	@FindBy(id = "ID_TU_TrainingUpdate")
	public static WebElement trainingUpdateTrainingUpdateIcon;

	@FindBy(id= "ID_TU_TrainingDocument")
	public static WebElement trainingUpdateTrainingDocumentIcon;
	
	@FindBy(id = "ID_TU_ParticipantsUpdate")
	public static WebElement trainingUpdateParticipantDetailIcon;
	
	
	

	@FindBy(xpath = "//*[@id=\"ID_TU_ADDPP_ScheduleData\"]/div/div[2]")
	public static List<WebElement> trainingUpdateTrainingUpdateParticipantsCheckboxList;
	

	@FindBy(xpath = "//*[@id=\"ID_TU_ScheduleActionMenu\"]/a")
	public static WebElement trainingUpdateTrainingUpdateAction;


	@FindBy(id = "ID_TU_PP_Participants")
	public static WebElement trainingUpdateParticipantDetailParticipantIcon;

	
	@FindBy(id = "ID_TU_TraineeDocument")
	public static WebElement trainingUpdateParticipantDetailTraineeDocumentIcon;

	@FindBy(xpath = "//*[@id='ID_TU_PP_ScheduleActionMenu']/a")  
	public static WebElement trainingUpdateParticipantDetailParticipantAction;

	@FindBy(id = "ID_TU_Main_Filter")
	public static WebElement trainingUpdateParticipantDetailTraineeDocumentAction;
	

	@FindBy(id = "ID_TU_PP_Subcontent")
	public static WebElement trainingUpdateParticipantDetailBackButton;
	
	@FindBy(id = "ID_TU_ATTENDANCE")
	public static WebElement trainingUpdateParticipantDetailParticipantAttended;

	@FindBy(id = "ID_TU_CERTIFIED")
	public static WebElement trainingUpdateParticipantDetailParticipantCertified;
	

	@FindBy(id = "ID_TU_COMPETENT")
	public static WebElement trainingUpdateParticipantDetailParticipantCompleted;
	


	@FindBy(id = "ID_TU_COMPLETETRAINING")
	public static WebElement trainingUpdateCompletedTraining;
}

	