package TestExecution;

import javax.swing.*;


import org.apache.commons.collections4.map.HashedMap;


import BaseMaster.TestCoverageUnit;
import Config.TestDataName;
import Config.TwoTermOutput;
import TestMethod.TestCoverageTwoFieldScreen;
import Utility.BrowserOperation;


import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Scanner;


public class TestRun
{

	public static void main(String args[])
	{
		new MyFrame().setVisible(true);
	}
}

class MyFrame extends JFrame implements ActionListener
{
	private JButton launchBrowser;

	private JButton launchLIMS;
	
	private JButton unit;

	private JButton testCoverage;
	
	private JButton flow;

 
	MyFrame()
	{

		new JFrame("QuaLIS");

		setSize(500, 8000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		launchBrowser = new JButton("launch Browser"); 
		
		launchBrowser.addActionListener(this);
		
		add(launchBrowser);
		
		
		launchLIMS = new JButton("launch LIMS");
		
		add(launchLIMS);
		
		launchLIMS.addActionListener(this);

 
		testCoverage = new JButton("Test Coverage"); 
		
		testCoverage.addActionListener(this);
		
		add(testCoverage);
	

		 
		unit = new JButton("Unit"); 
		
		unit.addActionListener(this);
		
		add(unit);
	

		flow = new JButton("Flow"); 
		
		flow.addActionListener(this);
		
		add(flow);
	
		
		pack();

	}

	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource() == launchBrowser)
		{
			try
			{
				BrowserOperation.launchBrowser();
			}
			catch (IOException | URISyntaxException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else if (e.getSource() == launchLIMS)
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
		
		else if (e.getSource() == testCoverage)
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
	 

	}
}
