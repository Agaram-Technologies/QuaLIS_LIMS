package TestExecution;
 
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import Configuration.TestCoverageFTPConfiguration;
import Flow_Master.FlowMaster;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation;

public class TestExecute
{

	public static void main(String[] args)
	{
		new Button();
		 
	}
}
 
class Button 
{
	Button()
	{ 

		JFrame frame=new JFrame("QuaLIS");
		
		JLabel label=new JLabel("QuaLIS v1.0.8");
		
		frame.add(label);
		
		label.setBounds(190, 0, 500, 50);
		
		frame.setSize(500,600);
		
		frame.setLayout(null);
		
		frame.setVisible(true);
	
		// Used to close stop the running of programe
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Used to Open the UI in centre
		frame.setLocationRelativeTo(null);
		
		int width=140;
   		
		JButton launchBrowser=new JButton("Launch Browser");
  	
		launchBrowser.setBounds(170, 100,width,50); 	
		
		frame.add(launchBrowser);	
		
		
		JButton launchLIMS=new JButton("Launch LIMS");
			  	
		launchLIMS.setBounds(170, 150,width,50);
			
		frame.add(launchLIMS);		
				
		JButton ftp=new JButton("FTP");
			  	
		ftp.setBounds(170, 200,width,50);
			
		frame.add(ftp);		
 		
 		
		JButton master=new JButton("Master");
			  	
		master.setBounds(170, 250,width,50);
			
		frame.add(master);		
				
		JButton twoTerm=new JButton("Two Term Masser");
			  	
		twoTerm.setBounds(170, 300,width,50);
			
		frame.add(twoTerm);		
 		

		
		launchLIMS.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					BrowserOperation.launchLIMS();
				}
				catch (URISyntaxException | IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	
		
		launchBrowser.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					BrowserOperation.launchBrowser();
				}
				catch (URISyntaxException | IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	
		
		ftp.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					BrowserOperation.launchLIMS();
					
					TestCoverageFTPConfiguration.FTP();
				}
				catch (URISyntaxException | IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch (InterruptedException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch (AWTException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		master.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{ 
					FlowMaster.flow();
				}
				catch (URISyntaxException | IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch (InterruptedException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch (AWTException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		twoTerm.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{ 
					TestCoverageTwoFieldScreen.twoFieldScreen();
				}
				catch (URISyntaxException | IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch (InterruptedException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 
			}
		});
		
		
	 }
}

