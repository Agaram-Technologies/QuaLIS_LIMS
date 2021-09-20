package TestCase;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import PurifiedWater.PurifiedWater;
import Utility.BasicOperation;
import Utility.BrowserOperation;

public class TCPurifiedWater {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException, ParseException {
		
		BrowserOperation.launchLIMS();
	
	 String startTime=	BasicOperation.timeValue();
	
	
		
	String ARNumber;
		
		//ARNumber="BK-21-00002";
		
		ARNumber=PurifiedWater.preRegister();
		
		
		PurifiedWater.jobAllocation(ARNumber, "Fuel Instrument Category", "Murali R");
		
	//	Thread.sleep(10000);
		
		BrowserOperation.refreshLoginAnalyst();	
		
		PurifiedWater.myJob(ARNumber);
		
			
		PurifiedWater.resultEntry(ARNumber);
		
	
		BrowserOperation.refreshLoginReviewer();
		
		PurifiedWater.approvalReview(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		PurifiedWater.approvalApprove(ARNumber);
		
		BrowserOperation.refreshLoginApprover();
		
		PurifiedWater.approvalRelease(ARNumber);
		
		
	String endTime=	BasicOperation.timeValue();
	
	System.out.println(endTime);
	
	BasicOperation.duration(startTime, endTime);
  
}
	


		
	}


