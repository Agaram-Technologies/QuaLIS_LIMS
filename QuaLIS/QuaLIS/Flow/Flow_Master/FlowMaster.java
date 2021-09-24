package Flow_Master;

import java.awt.AWTException;
import java.io.IOException;
import java.net.URISyntaxException;

import Settings.ProjectDetail;
import Utility.BrowserOperation;

public class FlowMaster extends BrowserOperation 
{
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException, URISyntaxException
	{
		flow();
	}
	
	public static void flow()  throws IOException, InterruptedException, AWTException, URISyntaxException
	{
		BrowserOperation.configProperties();
		
		System.out.println(project);
		
		if(project.equals(ProjectDetail.hylands)||project.equals("hyland")||project.contains("hyland"))
		{
			
		}
		else if(project.equals(ProjectDetail.domnica)||project.equals("domnica")||project.contains("dom"))
		{
			FlowMaster_Domnica.domnica();
		}
	}
}
