package TestCase;


import java.awt.AWTException;

import java.io.IOException;

import FinishedGoods.FinishedGoods;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TCFinishedGoods {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		BrowserOperation.launchLIMS();
	
		BasicOperation.time();
		
		String ARNumber;
		
//		ARNumber="BK-21-00002";
		
		ARNumber=FinishedGoods.preRegister();
		
		FinishedGoods.jobAllocation(ARNumber, "Fuel Instrument Category", "Murali R");
		
		BrowserOperation.refreshLoginAnalyst();
		
		FinishedGoods.myJob(ARNumber);
		
		FinishedGoods.resultEntry(ARNumber);
		
		BrowserOperation.refreshLoginReviewer();
		
		FinishedGoods.approvalReview(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		FinishedGoods.approvalApprove(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		FinishedGoods.approvalRelease(ARNumber);
		
		BasicOperation.time();
		
	}

}
