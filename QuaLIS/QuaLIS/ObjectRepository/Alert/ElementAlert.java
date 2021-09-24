package Alert;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import Configuration.ElementApprovalConfiguration;

public class ElementAlert {

	// *[@id="ID_Lims_SuccessAlertDiv_0"]/div/span/i

	@FindBy(xpath = "//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]/div/span/i")
	public static WebElement alertOneClose;

	@FindBy(xpath = "//*[@id=\"ID_Lims_SuccessAlertDiv_0\"]")
	public static WebElement alertOne;

	@FindBy(xpath = "//*[@id=\"ID_Lims_AlertMsg_0\"]")
	public static WebElement alertTwo;
	
	@FindBy(id = "ID_Lims_AlertBindDiv")
	public static WebElement alertThree;
	
	@FindBy(xpath = "//*[@id=\"ID_Lims_AlertMsg_0\"]")
	public static WebElement withoutSelectEditAlert;
	
	@FindBy(xpath= "//*[contains(@id,'Alert')]")
	public static WebElement alert;
	
	@FindBy(xpath= "//*[contains(@id,'Alert')]/div/span/i")
	public static WebElement alertClose;
	                  //*[@id="ID_Lims_AlertMsg_0"]

	public static void main(String[] args) {
		String[] e = ElementAlert.edit("COUNTRY");

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);

		}
		
		
/*
		String[] d = ElementAlert.delete("UNIT");

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);

		}*/
	}

	public static String[] delete(String screen) {

		String one = "SELECT " + screen + " TO DELETE";

		String two = "SELECT " + screen;

		String three = "SELECT ANY " + screen;

		String four = "SELECT ANYONE " + screen;

		String five = "SELECT ANY ONE " + screen;

		String six = "SELECT ANY " + screen + " TO DELETE";

		String seven = "SELECT ANYONE " + screen + " TO DELETE";

		String eight = "SELECT ANY ONE " + screen + " TO DELETE";

		String nine = "SELECT RECORD TO DELETE";

		String ten = "SELECT A RECORD TO DELETE";

		String eleven = "SELECT A " + screen + " TO DELETE";

		String twelwe = "SELECT A " + screen;

		String thirteen = "SELECT A FILE TO DELETE";

		String fourteen = "SELECT FILE TO DELETE";

		String fifteen = "PLEASE SELECT RECORD TO DELETE";

		String sixteen = "PLEASE SELECT A RECORD TO DELETE";

		String seventeen = "PLEASE SELECT " + screen + " TO DELETE";

		String eighteen = "PLEASE SELECT A " + screen + " TO DELETE";

		String nineteen = "PLEASE SELECT ANYONE RECORD TO DELETE";

		String twenty = "PLEASE SELECT ANY ONE RECORD TO DELETE";

		String twentyOne = "PLEASE SELECT ANYONE " + screen + " TO DELETE";

		String twentyTwo = "PLEASE SELECT ANY ONE " + screen + " TO DELETE";

		String twentyThree = "SELECT A " + screen;

		String twentyFour = "PLEASE SELECT " + screen;

		String twentyFive = "PLEASE SELECT A" + screen;

		String[] delete = { one, two, three, four, five, six,seven, eight, nine, ten, eleven, twelwe, thirteen, fourteen,
				fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyOne, twentyTwo, twentyThree, twentyFour,
				twentyFive };

		return delete;
	}

	public static String[] edit(String screen) {

		String one = "SELECT " + screen + " TO EDIT";

		String two = "SELECT " + screen;

		String three = "SELECT ANY " + screen;

		String four = "SELECT ANYONE " + screen;

		String five = "SELECT ANY ONE " + screen;

		String six = "SELECT ANY " + screen + " TO EDIT";

		String seven = "SELECT ANYONE " + screen + " TO EDIT";

		String eight = "SELECT ANY ONE " + screen + " TO EDIT";

		String nine = "SELECT RECORD TO EDIT";

		String ten = "SELECT A RECORD TO EDIT";

		String eleven = "SELECT A " + screen + " TO EDIT";

		String twelwe = "SELECT A " + screen;

		String thirteen = "SELECT A FILE TO EDIT";

		String fourteen = "SELECT FILE TO EDIT";

		String fifteen = "PLEASE SELECT RECORD TO EDIT";

		String sixteen = "PLEASE SELECT A RECORD TO EDIT";

		String seventeen = "PLEASE SELECT " + screen + " TO EDIT";

		String eighteen = "PLEASE SELECT A " + screen + " TO EDIT";

		String nineteen = "PLEASE SELECT ANYONE RECORD TO EDIT";

		String twenty = "PLEASE SELECT ANY ONE RECORD TO EDIT";

		String twentyOne = "PLEASE SELECT ANYONE " + screen + " TO EDIT";

		String twentyTwo = "PLEASE SELECT ANY ONE " + screen + " TO EDIT";

		String twentyThree = "SELECT A " + screen;

		String twentyFour = "PLEASE SELECT " + screen;

		String twentyFive = "PLEASE SELECT A " + screen;

		String[] edit = { one, two, three, four, five,six, seven, eight, nine, ten, eleven, twelwe, thirteen, fourteen,
				fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyOne, twentyTwo, twentyThree, twentyFour,
				twentyFive };

		return edit;
	}

}
