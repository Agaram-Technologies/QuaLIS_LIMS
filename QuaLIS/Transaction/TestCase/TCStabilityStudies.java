package TestCase;

import java.awt.AWTException;

import java.io.IOException;

import StabilityStudies.StabilityStudies;
import Utility.BasicOperation;
	import Utility.BrowserOperation;

	public class TCStabilityStudies {
		
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			
			BrowserOperation.launchLIMS();
		
			BasicOperation.time();
			
			String ARNumber;
			
//			ARNumber="BK-21-00002";
			
			ARNumber=StabilityStudies.preRegister();
			
			StabilityStudies.jobAllocation(ARNumber, "Fuel Instrument Category", "Murali R");
			
			BrowserOperation.refreshLoginAnalyst();
			
			StabilityStudies.myJob(ARNumber);
			
			StabilityStudies.resultEntry(ARNumber);
			
			BrowserOperation.refreshLoginReviewer();
			
			StabilityStudies.approvalReview(ARNumber);
			
			BrowserOperation.refreshLoginApprover();
			
			StabilityStudies.approvalApprove(ARNumber);
			
			BrowserOperation.refreshLoginApprover();
			
			StabilityStudies.approvalRelease(ARNumber);
			
			BasicOperation.time();
			
		}

	}