package Flow_Master;

import java.awt.AWTException;


import java.io.IOException;
import java.net.URISyntaxException;

import BaseMaster.TestCoverageContainerType;
import CheckList.TestCoverageQB;
import Config.ParameterType;
import Configuration.TestCoverageApprovalConfiguration;
import Configuration.TestCoverageFTPConfiguration;
import Configuration.TestCoverageTemplateMaster;
import Configuration.TestCoverageUserRoleTemplate;
import Flow.TestDataFlow;
import Flow.TestDataHylands;
import FlowMethod.MasterMethod;
import Organisation.TestCoverageNestedFlowMapping;
import UserManagement.TestCoverageUser;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class FlowMaster extends TestDataFlow
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException, URISyntaxException {

		BrowserOperation.configProperties();
		
		BrowserOperation.launchLIMS();
		
		TestCoverageFTPConfiguration.FTP();	

		MasterMethod.designation(designation, description);

		MasterMethod.department(department, description);

		MasterMethod.country(country, countryAbbreviation, countryTwoChar, countryThreeChar);

		MasterMethod.section(section, description);

		MasterMethod.lab(lab, description);

		MasterMethod.userRole(analyst, description);

		MasterMethod.userRole(reviewer, description);
		
		MasterMethod.userRole(approver, description);
		
		MasterMethod.userRoleApprovalFlow(reviewer);
		
		MasterMethod.userRoleApprovalFlow(approver);
		
		MasterMethod.userRoleResultEntry(analyst);
		
		MasterMethod.passwordPolicy();

		MasterMethod.passwordPolicyApproval(analyst);

		MasterMethod.passwordPolicyApproval(reviewer);
		
		MasterMethod.passwordPolicyApproval(approver);

		TestCoverageUser.userAdd(analystLoginID, analystFirstName, lastName, analystSignature,mail, qualification,
				bloodGroup, address, designation, department, country);

		TestCoverageUser.userUserRoleAdd(reviewerLoginID, analyst);
 
		 TestCoverageUser.userAdd(reviewerLoginID, reviewerFirstName, lastName, reviewerSignature, mail,
				 qualification, bloodGroup, address, designation, department, country);

		TestCoverageUser.userUserRoleAdd(reviewerLoginID, reviewer);

		TestCoverageUser.userAdd(approverLoginID, approverFirstName, lastName, approverSignature, mail,
				qualification, bloodGroup, address, designation, department, country);

		TestCoverageUser.userUserRoleAdd(approverLoginID, approver);

		MasterMethod.organisation(department, lab, section);
		
		TestCoverageContainerType.containerType(containerType, containerTypeDescription);	
		
		MasterMethod.unitOfMeasurement(unit, unitDescription);

		MasterMethod.storageCondition(storageCondition, description);

		MasterMethod.storageLocation(storageLocation, description);
			
		MasterMethod.sampleCategory(sampleCategory, description);

		MasterMethod.sampleType(sampleCategory, sample, description);

		MasterMethod.technique(technique, description);

		MasterMethod.trainingCategory(trainingCategory, description);
		
		MasterMethod.trainingAndCertification(trainingName, technique, trainingCategory, trainingTopic, time, trainerName,
				trainingVenue, description, section);

		MasterMethod.trainingUpdate(technique);

		MasterMethod.clientGroup(clientGroup, description);

		MasterMethod.supplierCategory(supplierCategory, description);

		MasterMethod.client(clientGroup, client, description, clientSite);
		

		MasterMethod.manufacture(manufacture, description, manufactureSite);
		
	
		MasterMethod.materialCategory(materialCategory, description, analyst, barCode);

		MasterMethod.supplier(supplier, description, supplierCategory, materialCategory);

		MasterMethod.materialGrade(materialGrade, description);
	 	
		MasterMethod.material(materialCategory, material+1, materialGrade, unit, reOrderLevel, supplier, storageLocation,
				manufacture, section);

		MasterMethod.instrumentCategory(instrumentCategory, technique, description);

		MasterMethod.instrument(instrument, instrumentCategory, description, supplier, windowPeriodUnit,
				instrumentIncharge, instrumentStatusActive, section, manufacture,true);
		
		MasterMethod.QBCategory(QBCategory, description);

		TestCoverageQB.QB(QBCategory);

		MasterMethod.checkList(checkList, description, QBCategory);
		
		MasterMethod.testCategory(testCategory, description);
	
		
		

	}

}
