package UserManagement;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementProfile
{

	@FindBy(id="idEmail")
	public static WebElement userName;
	
	@FindBy(id="idpassword")
	public static WebElement passWord;
	
	@FindBy(id="sysLang")
	public static WebElement language;
	
	@FindBy(xpath="//*[@id='sysLang']/option")
	public static List< WebElement> languageList;
	
	@FindBy(xpath="//*[@id='idRole']/option")
	public static List< WebElement> userRoleList;
	
	
	
	
	@FindBy(id="idRole")
	public static WebElement role;
	
	@FindBy(id="idLogin")
	public static WebElement loginIcon;
	
	

	@FindBy(id="idwelcometext")
	public static WebElement welcomeText;
	
	@FindBy(id="idlimsinfo")
	public static WebElement welcomeSubText;
	
	@FindBy(id="idLoginlabel")
	public static WebElement loginIdPlaceHolder;
	
	@FindBy(id="password")
	public static WebElement passwordPlaceHolder;
	
	
	@FindBy(id="role")
	public static WebElement rolePlaceHolder;
	
	@FindBy(id="idLogin")
	public static WebElement loginPlaceHolder;
	
	
	

	@FindBy(id="rightheadertitle")
	public static WebElement howQualisLimsHelpHead;
	
	@FindBy(id="idsmheader")
	public static WebElement sampleManagementHead;
	
	@FindBy(id="idsminfo")
	public static WebElement sampleManagementSubText;
	
	@FindBy(id="idwsheader")
	public static WebElement WorkScheduleHead;
	
	@FindBy(id="idwsinfo")
	public static WebElement WorkScheduleSubText;
	
	
	@FindBy(id="idrepheader")
	public static WebElement reportHead;
	
	@FindBy(id="idrepinfo")
	public static WebElement reportSubText;
	
	@FindBy(id="idadheader")
	public static WebElement alertHead;
	


	@FindBy(id="idadinfo")
	public static WebElement alertSubText;
	
	
		@FindBy(id="idoldPwd")
	public static WebElement NewUserNewPassword;

	@FindBy(id="idnewPwd")
	public static WebElement NewUserConfirmPassword;
	
	@FindBy(id="idchangeLogin")
	public static WebElement NewUserSubmit;
	
	@FindBy(id="idchangeCancel")
	public static WebElement NewUserCancel;
	
	@FindBy(xpath="//*[@id='MenuTree']/li[1]/a")
	public static WebElement homeIcon;
	
	@FindBy(xpath="//*[@id='userbox']/a/div[2]")
	public static WebElement profile;
	
	
	@FindBy(id="manualScreenLock")
	public static WebElement lock;
	
	@FindBy(id="pwdScreenLockLogin")
	public static WebElement password;
	
	@FindBy(id="btnScreenLockLogin")
	public static WebElement submit;
	
	
	
	@FindBy(xpath="//*[@id='LogOutBtn']")
	public static WebElement logoutIcon;

}

