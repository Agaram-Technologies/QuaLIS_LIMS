package ApprovalConfiguration;

import java.io.IOException;
import java.net.URISyntaxException;


import Configuration.TestCoverageApprovalConfiguration;
import Utility.BrowserOperation;

public class Domnica_ApprovalConfiguration_Manual
{
	public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException
	{
		BrowserOperation.launchLIMS();
		
		TestCoverageApprovalConfiguration.domnica(false);
	}
}
 