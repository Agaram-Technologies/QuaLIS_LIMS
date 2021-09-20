package TestCase;

import java.awt.AWTException;
import java.io.IOException;

import RawMaterial.RawMaterial;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TCRawMaterial {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		BrowserOperation.launchLIMS();
	
		BasicOperation.time();
		
		String ARNumber;
		
		//ARNumber="BK-21-00002";
		
		ARNumber=RawMaterial.preRegister();
		
		RawMaterial.jobAllocation(ARNumber, "Fuel Instrument Category", "Murali R");
		
		BrowserOperation.refreshLoginAnalyst();
		
		RawMaterial.myJob(ARNumber);
		
		RawMaterial.resultEntry(ARNumber);
		
		BrowserOperation.refreshLoginReviewer();
		
		RawMaterial.approvalReview(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		RawMaterial.approvalApprove(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		RawMaterial.approvalRelease(ARNumber);

		BasicOperation.time();
		
	}

}
