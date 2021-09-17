package Flow_Master;

import java.awt.AWTException;


import java.io.IOException;
import java.net.URISyntaxException;

import Flow.TestDataFlow;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class FlowMaster extends TestDataFlow
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException, URISyntaxException {

		BrowserOperation.configProperties();
		
		BrowserOperation.launchLIMS();
		
//		TestCoverageFTPConfiguration.FTP();	
		
/*			
	//	TestCoverageUserRoleTemplate.userRoleTemplateCOMNICA(userRole);
		
		TestCoverageApprovalConfiguration.domnica(true);
		
		TestCoverageNestedFlowMapping.DOMNICA(approver, reviewer, analyst);
	
		BasicOperation.timeValue();
		
		
		
		MasterMethod.test(testCategory, unit, approvalApprovalTest, section, method, instrumentCategory, parameterType, checklist, price, parameter, roundingDigits);
		
		TestCoverageUserRoleTemplate.userRoleTemplateHYLANDS(userRole);
		
		TestCoverageApprovalConfiguration.hylands(true);
		
		TestCoverageNestedFlowMapping.HYLANDS(approver, reviewer, analyst);
	
		
		TestCoverageFTPConfiguration.FTP(ProjectDetail.hylands);		
		
	
		MasterMethod.designation(designation, description);

		MasterMethod.department(department, description);

		MasterMethod.country(country, "1", "1", "1");

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

		TestCoverageUser.userAdd(analystLoginID, analystFirstName, lastName, analystSignature, "email@gmail.com", "B.E",
				"AB", address, designation, department, country);

		TestCoverageUser.userUserRoleAdd(reviewerLoginID, analyst);
 
		 TestCoverageUser.userAdd(reviewerLoginID, reviewerFirstName, lastName, reviewerSignature, "email@gmail.com",
				"B.E", "AB", address, designation, department, country);

		TestCoverageUser.userUserRoleAdd(reviewerLoginID, reviewer);

		TestCoverageUser.userAdd(approverLoginID, approverFirstName, lastName, approverSignature, "email@gmail.com",
				"B.E", "AB", address, designation, department, country);

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
		
		MasterMethod.test(testCategory, unit, approvalApprovalTest, section, method, instrumentCategory, ParameterType.numeric, "NA", price, parameter, roundingDigits);

		TestCoverageTemplateMaster.templateMasterInstrument(instrumentCategory, firstField);
		
		TestCoverageUserRoleTemplate.userRoleTemplateHYLANDS(userRole);
		
		TestCoverageApprovalConfiguration.hylands(true);
		
		TestCoverageNestedFlowMapping.HYLANDS(approver, reviewer, analyst);
		
		TestCoverageApprovalConfiguration.hylands(false);
		
		TestCoverageApprovalConfiguration.testGroup();
			
		TestCoverageUserRoleTemplate.userRoleTemplateHYLANDS(userRole);
		
		TestCoverageApprovalConfiguration.hylands(true);
		
		TestCoverageNestedFlowMapping.HYLANDS(approver, reviewer, analyst);
	 		
	
			MasterMethod.instrumentCategory(instrumentCategory, technique, description);
			
		
				MasterMethod.instrument(instrument+i+1, "Serology", description, "Coolpoint", windowPeriodUnit,
						"Pravin Kore", instrumentStatusActive, "Sample Registration", "Tarson", false);
			
			 


				
		//
		
		MasterMethod.testGroup(sample, sampleCategory, sampleCategory, sampleCategory, "ic001", testCategory);
		
*/
	}

}
