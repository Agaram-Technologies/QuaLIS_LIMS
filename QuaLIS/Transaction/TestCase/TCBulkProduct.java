package TestCase;

import java.awt.AWTException;

import java.io.IOException;

import BulkProduct.BulkProductGenericRegistration;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TCBulkProduct {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		BrowserOperation.launchLIMS();
	
		BasicOperation.time();
		
		String ARNumber;
		
//		ARNumber="BK-21-00002";
		
		ARNumber=BulkProductGenericRegistration.preRegister();
		
	//BulkProductGenericRegistration.jobAllocation(ARNumber, "Fuel Instrument Category", "Murali R");
		
	//	BrowserOperation.refreshLoginAnalyst();
		
	/*	BulkProductGenericRegistration.myJob(ARNumber);
		
		BulkProductGenericRegistration.resultEntry(ARNumber);
	*/	
		/*	BrowserOperation.refreshLoginReviewer();
		
		BulkProductGenericRegistration.approvalReview(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		BulkProductGenericRegistration.approvalApprove(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		BulkProductGenericRegistration.approvalRelease(ARNumber);
		
	*/	
		BasicOperation.time();
		
	}

}
