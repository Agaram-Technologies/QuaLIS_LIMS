package TestCase;

import java.awt.AWTException;
import java.io.IOException;

import Intermediate.Intermediate;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TCIntermediate {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		BrowserOperation.launchLIMS();
	
		BasicOperation.time();
		
		String ARNumber;
		
	//	ARNumber="BK-21-00002";
		
		ARNumber=Intermediate.preRegister();
		
		Intermediate.jobAllocation(ARNumber, "Fuel Instrument Category", "Murali R");
		
		BrowserOperation.refreshLoginAnalyst();
		
		Intermediate.myJob(ARNumber);
		
		Intermediate.resultEntry(ARNumber);
		
		BrowserOperation.refreshLoginReviewer();
		
		Intermediate.approvalReview(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		Intermediate.approvalApprove(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		Intermediate.approvalRelease(ARNumber);
		
		
		BasicOperation.time();
		
	}

}
