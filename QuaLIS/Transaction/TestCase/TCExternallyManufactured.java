package TestCase;

import java.awt.AWTException;


import java.io.IOException;

import ExternallyManufactured.ExternallyManufactured;
import FlowMethod.MasterMethod;
import RegistrationType.TestDataHylands;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TCExternallyManufactured {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		BrowserOperation.launchLIMS();
		
	
		BasicOperation.time();
		
		String ARNumber;
		
//		ARNumber="BK-21-00002";
		
		ARNumber=ExternallyManufactured.preRegister();
		
		ExternallyManufactured.jobAllocation(ARNumber, "Fuel Instrument Category", "Murali R");
		
		BrowserOperation.refreshLoginAnalyst();
		
		ExternallyManufactured.myJob(ARNumber);
		
		ExternallyManufactured.resultEntry(ARNumber);
		
		BrowserOperation.refreshLoginReviewer();
		
		ExternallyManufactured.approvalReview(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		ExternallyManufactured.approvalApprove(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		ExternallyManufactured.approvalRelease(ARNumber);
		
		BasicOperation.time();
		
	}

}
