package Transaction_AutoJobAllocation;

import java.awt.AWTException;


import java.io.IOException;
import java.net.URISyntaxException;

import Flow.TestDataDomnicaRoutine;
import Flow.TestDataFlow;/*
import GenericRegistration.GenericRegistrationSample;
import GenericRegistration.GenericRegistrationSampleType;
import GenericRegistration.GenericRegistrationTest; */
import Settings.RegistrationTypeDetail;
import Utility.BrowserOperation;

public class Domnica_A_Complete_Review_Approve 
{/*
	public static String routine;
	
	public static String instrument;
	
	public static String material;

	public static String ARNumber;
	
	public static String preRegisterNumber;
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, URISyntaxException
	{
		
		complete_Review_Approve_Release(RegistrationTypeDetail.registrationSubTypeDomnicaRoutine);
	}
	
	public static void complete_Review_Approve_Release(String registrationSubType) throws InterruptedException, IOException, AWTException, URISyntaxException
	{
	 
		String test[]= {TestDataFlow.testNumericCheckListNA};
		
		String[] a= {"a"};
		
		BrowserOperation.launchLIMS();
		
	 	preRegisterNumber = GenericRegistrationSampleType.preRegister(registrationSubType, a);
		
		GenericRegistrationSample.sampleAddWithoutTest(preRegisterNumber, registrationSubType, "s001", "100", TestDataDomnicaRoutine.unit, false, "rem");
		
		GenericRegistrationTest.testAdd(null);
		
		
		ARNumber = "IM-21-00001";

		BrowserOperation.refreshLoginAnalyst();

		MyJobs.accept(registrationSubType, ARNumber);

		ResultEntry.resultEntry(registrationSubType, ARNumber);

			BrowserOperation.refreshLoginReviewer();

		
		TestReview.approval(registrationSubType, ARNumber, ApprovalStatus.review);
		
		BrowserOperation.refreshLoginApprover();
		
		TestReview.approval(registrationSubType, ARNumber, ApprovalStatus.approve);
		
		BrowserOperation.refreshLoginApprover();

		TestReview.approvalRelease(registrationSubType, ARNumber);
		
	}

*/}
