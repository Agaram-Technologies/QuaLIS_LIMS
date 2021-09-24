package TestMethod;

import java.io.IOException;


import java.net.URISyntaxException;
import java.util.HashMap;


import BaseMaster.TestCoverageContainerType;
import Config.TwoTermOutput;
import UserManagement.TestCoverageUserRole;
import Utility.BrowserOperation;
import Utility.QuaLISLog;


import java.awt.AWTException;


import java.awt.HeadlessException;
import java.io.IOException;
import java.util.HashMap;


import org.openqa.selenium.support.PageFactory;


import BaseMaster.ElementContainerType;
import BaseMaster.ElementUnit;
import BaseMaster.TestCoverageContainerType;
import BaseMaster.TestCoverageSampleTestComments;
import BaseMaster.TestCoverageStorageCondition;
import BaseMaster.TestCoverageStorageLocation;
import BaseMaster.TestCoverageUnit;
import BasicFunction.FunctionAdd;
import CheckList.TestCoverageQBCategory;
import CompetenceManagement.TestCoverageTechnique;
import CompetenceManagement.TestCoverageTrainingCategory;
import Contacts.TestCoverageClientGroup;
import Contacts.TestCoverageSupplierCategory;
import MaterialManagement.TestCoverageMaterialGrade;
import Organisation.ElementDepartment;
import Organisation.TestCoverageDepartment;
import Organisation.TestCoverageLab;
import Organisation.TestCoverageSection;
import SampleManagement.TestCoverageSampleCategory;
import UserManagement.TestCoverageDesignation;
import UserManagement.TestCoverageUserRole;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TestCoverageTwoFieldScreen
{
	public static boolean addAllField = true;

	public static boolean addMandatoryField = false;

	public static boolean deleteAllField = false;

	public static boolean deleteMandatoryField = false;

	public static boolean editName = false;

	public static boolean editNameDescription = false;

	public static boolean editDescriptionValueToValue = false;

	public static boolean editDescriptionValueToNull = false;

	public static boolean editDescriptionNullToValue = false;
	
	public static void main(String[] args)throws InterruptedException, URISyntaxException, IOException
	{
		twoFieldScreen();
	}
	
	public static void twoFieldScreen()  throws InterruptedException, URISyntaxException, IOException
	{
		BrowserOperation.launchLIMS();
		
		TestCoverageContainerType.twoFieldTestCase();
		
		TestCoverageQBCategory.twoFieldTestCase();
		
		TestCoverageDepartment.twoFieldTestCase();
		
		TestCoverageSection.twoFieldTestCase();

		TestCoverageLab.twoFieldTestCase();
 
		TestCoverageClientGroup.twoFieldTestCase();

		TestCoverageSupplierCategory.twoFieldTestCase();

		TestCoverageTrainingCategory.twoFieldTestCase();
	 
		TestCoverageTechnique.twoFieldTestCase();

		TestCoverageSampleCategory.twoFieldTestCase();

		TestCoverageUnit.twoFieldTestCase();

		TestCoverageStorageLocation.twoFieldTestCase();

		TestCoverageStorageCondition.twoFieldTestCase();
		
		TestCoverageSampleTestComments.twoFieldTestCase();

		TestCoverageDesignation.twoFieldTestCase();

		TestCoverageUserRole.twoFieldTestCase();
	
		
	}

	 
}
