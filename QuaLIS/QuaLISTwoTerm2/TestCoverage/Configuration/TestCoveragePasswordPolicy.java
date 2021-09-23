package Configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import Esign.ElementEsign;
import Utility.BrowserOperation;

public class TestCoveragePasswordPolicy extends BrowserOperation{
	

	public static void passwordPolicyCopy() throws InterruptedException {

		PageFactory.initElements(driver, ElementPasswordPolicy.class);

		ElementPasswordPolicy.masterIcon.click();

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.passwordPolicyIcon.click();

		WebElement passwordPolicyUserRole = ElementPasswordPolicy.passwordPolicyFilterUserRole;

		Select passwordPolicyUserRoleSelect = new Select(passwordPolicyUserRole);

		passwordPolicyUserRoleSelect.selectByIndex(0);

		ElementPasswordPolicy.passwordPolicyFilterFind.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		try {
			ElementPasswordPolicy.passwordPolicyAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementPasswordPolicy.passwordPolicyAction.click();
		}

		ElementPasswordPolicy.passwordPolicyCopy.click();

		try {
			ElementPasswordPolicy.passwordPolicyCopyRole.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementPasswordPolicy.passwordPolicyCopyRole.click();
		}

		ElementPasswordPolicy.passwordPolicyCopyRoleSelectAll.click();

		ElementPasswordPolicy.passwordPolicyCopySubmit.click();

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.masterIcon.click();

	}

	public static void passwordPolicyApproval(String userRole) throws InterruptedException {

		PageFactory.initElements(driver, ElementPasswordPolicy.class);

		ElementPasswordPolicy.masterIcon.click();

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.passwordPolicyFilterIcon.click();

		WebElement role = ElementPasswordPolicy.passwordPolicyFilterUserRole;

		Select roleSelect = new Select(role);

		roleSelect.selectByVisibleText(userRole);

		WebDriverWait wait1 = new WebDriverWait(driver, 100);

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.passwordPolicyFilterFind.click();

		try {
			ElementPasswordPolicy.passwordPolicyAction.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			ElementPasswordPolicy.passwordPolicyAction.click();
		}

		ElementPasswordPolicy.passwordPolicyApprove.click();

		PageFactory.initElements(driver, ElementEsign.class);

		/*
		 * ElementEsign.EsignPassword.sendKeys("123");
		 * 
		 * ElementEsign.EsignComments.sendKeys("123");
		 * 
		 * if(ElementEsign.EsignCheckbox.isSelected()==false) {
		 * ElementEsign.EsignCheckbox.click(); }
		 * 
		 * ElementEsign.EsignSubmit.click();
		 */

		wait1.until(ExpectedConditions.visibilityOf(ElementPasswordPolicy.passwordPolicyAction));

		wait1.until(ExpectedConditions.elementToBeClickable(ElementPasswordPolicy.passwordPolicyAction));

		ElementPasswordPolicy.configurationIcon.click();

		ElementPasswordPolicy.masterIcon.click();

	}

}
