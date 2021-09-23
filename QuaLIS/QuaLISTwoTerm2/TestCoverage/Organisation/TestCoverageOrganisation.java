package Organisation;

import java.util.List;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.BrowserOperation;

public class TestCoverageOrganisation extends BrowserOperation
{
	public static void organisationAddMandatory(String department, String lab, String section) throws InterruptedException
	{
		PageFactory.initElements(driver, ElementOrganisation.class);

		ElementOrganisation.masterIcon.click();

		ElementOrganisation.organisationManagementIcon.click();

		ElementOrganisation.organisationIcon.click();

		WebElement site = ElementOrganisation.organisationFilterSite;

		Select siteSelect = new Select(site);

		siteSelect.selectByIndex(0);

		ElementOrganisation.organisationFilterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationDepartmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationDepartmentAction));

		try {
			ElementOrganisation.organisationDepartmentAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationDepartmentAction.click();
		}

		ElementOrganisation.organisationDepartmentAdd.click();

		ElementOrganisation.organisationDepartmentSearch.click();

		List<WebElement> departmentList = ElementOrganisation.departmentList;

		for (WebElement departmentElement : departmentList) {

			if (departmentElement.getText().equals(department)) {
				departmentElement.click();

			}

		}

		ElementOrganisation.organisationDepartmentAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationDepartmentAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationDepartmentAction));

		List<WebElement> organisationDepartments = ElementOrganisation.departments;

		List<WebElement> organisationDepartmentCheckBox = ElementOrganisation.departmentCheckBox;

		for (WebElement dept : organisationDepartments) {
			if (dept.getText().equals(department)) {
				int index = organisationDepartments.indexOf(dept);

				String checkBoxStatus = organisationDepartmentCheckBox.get(index).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					dept.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationLabIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationLabIcon));

		ElementOrganisation.organisationLabIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationLabAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationLabAction));

		try {
			ElementOrganisation.organisationLabAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationLabAction.click();
		}

		ElementOrganisation.organisationLabAdd.click();

		ElementOrganisation.organisationLabSearch.click();

		List<WebElement> labList = ElementOrganisation.labsLIst;

		for (WebElement labElement : labList) {
			if (labElement.getText().equals(lab)) {
				labElement.click();
			}
		}

		ElementOrganisation.organisationLabAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationLabAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationLabAction));

		List<WebElement> organisationLabs = ElementOrganisation.labs;

		List<WebElement> organisationLabCheckBox = ElementOrganisation.labCheckBox;

		for (WebElement labE : organisationLabs) {
			if (labE.getText().equals(lab)) {
				int index = organisationLabs.indexOf(labE);

				String checkBoxStatus = organisationLabCheckBox.get(index).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					labE.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionIcon));

		ElementOrganisation.organisationSectionIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionAction));

		try {
			ElementOrganisation.organisationSectionAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationSectionAction.click();
		}

		ElementOrganisation.organisationSectionAdd.click();

		ElementOrganisation.organisationSectionSearch.click();

		List<WebElement> sectionList = ElementOrganisation.sectionList;

		for (WebElement sectionElement : sectionList) {
			if (sectionElement.getText().equals(section)) {
				sectionElement.click();
			}
		}

		ElementOrganisation.organisationSectionAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionAction));

		// ElementOrganisation.organisationSectionAction.click();

		List<WebElement> organisationSections = ElementOrganisation.sections;

		List<WebElement> organisationSectionsCheckBox = ElementOrganisation.sectionsCheckBox;

		for (WebElement sectionS : organisationSections) {
			if (sectionS.getText().equals(section)) {
				int index = organisationSections.indexOf(sectionS);

				String checkBoxStatus = organisationSectionsCheckBox.get(index).getAttribute("checkboxselect");

				if (checkBoxStatus.equals("0")) {
					sectionS.click();
				}

			}
		}

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationSectionAction));

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationUsersIcon));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationUsersIcon));

		ElementOrganisation.organisationUsersIcon.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationUsersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationUsersAction));

		try {
			ElementOrganisation.organisationUsersAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementOrganisation.organisationUsersAction.click();
		}

		ElementOrganisation.organisationUsersAdd.click();

		ElementOrganisation.organisationUsersSearch.click();

		List<WebElement> usersList = ElementOrganisation.usersList;

		for (WebElement user : usersList) {
			user.click();
		}

		ElementOrganisation.organisationUsersAddSubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementOrganisation.organisationUsersAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementOrganisation.organisationUsersAction));

		ElementOrganisation.organisationManagementIcon.click();

		ElementOrganisation.masterIcon.click();
		
	}

}
