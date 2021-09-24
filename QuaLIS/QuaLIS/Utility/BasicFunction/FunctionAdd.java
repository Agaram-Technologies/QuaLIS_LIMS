package BasicFunction;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BaseMaster.ElementUnit;
import Config.ElementName;
import Config.TestCaseResultFlag;
import Config.TestDataName;
import Config.TwoTermOutput;
import Organisation.ElementDepartment;
import UserManagement.ElementDesignation;
import Utility.BasicOperation;
import Utility.BrowserOperation;
import Utility.QuaLISLog;

public class FunctionAdd extends ElementName {
	

	
	public static HashMap<String, String> addAllField(HashMap <String, String> value,HashMap <String, String> menu, HashMap< String, WebElement> element,HashMap< String, List<WebElement>> list) throws InterruptedException, URISyntaxException, IOException
	{
		
		HashMap <String, String> output=new HashMap <String, String> ();
		
		int beforeCount=0;
		
		int afterCount=0;
		
		List<WebElement> nameList=list.get(ElementName.nameList);
		
		List<WebElement> descriptionList=list.get(ElementName.descriptionList);
		
		String name = value.get(TestDataName.nameAdd);

		String description = value.get(TestDataName.descriptionAdd);
		
		String module=menu.get(ElementName.moduleName);
		
		String subModule=menu.get(ElementName.subModuleName);
	
		String screen=menu.get(ElementName.screenName);

		String className=FunctionAdd.class.getName(); 
		
		boolean conditionOneGridSizeIncrease=false;
		
		boolean conditionTwoNameDisplayInGrid=false;
		
		boolean conditionThreeDescriptionDisplayInGrid=false;
		
		boolean conditionFourFirstIndexName=false;
		
		boolean conditionFiveFirstIndexDescription=false;
 		
		try
		{
			element.get(ElementName.module).click();
					
			String resultModuleClick="1. Clicked the "+module+" Icon";
			
			BasicOperation.screenshot(resultModuleClick);

			System.out.println(resultModuleClick);
				
			QuaLISLog.info(className, resultModuleClick);
			
			output.put(TwoTermOutput.moduleClick, resultModuleClick);
			
			try
			{
				
				BasicOperation.smallImplicitWaitClick(element.get(ElementName.subModule));
						
				String resultSubModuleClick="2. Clicked the "+subModule+" Icon";
				
				BasicOperation.screenshot(resultSubModuleClick);

				System.out.println(resultSubModuleClick);
					
				QuaLISLog.info(className, resultSubModuleClick);
				
				try
				{
					BasicOperation.smallImplicitWaitClick(element.get(ElementName.screen));
									 
					String resultScreenClick="3. Clicked the "+screen+" Icon";
					
					BasicOperation.screenshot(resultScreenClick);

					System.out.println(resultScreenClick);
						
					QuaLISLog.info(className, resultScreenClick);
					
					try
					{
						BasicOperation.exception(element.get(ElementName.tabHeader));
 								
						String resultScreenVisibilty="4. Opened the "+screen+" Screen";
						
						BasicOperation.screenshot(resultScreenVisibilty);

						System.out.println(resultScreenVisibilty);
							
						QuaLISLog.info(className, resultScreenVisibilty);
						
						try
						{
													
							try
							{
								beforeCount=BasicOperation.smallImplicitWaitListCount(nameList);
								
								String resultBeforeAddGrid="5. It shows "+beforeCount+" "+ screen +" in Grid before Add";
								
								BasicOperation.screenshot(resultBeforeAddGrid);

								System.out.println(resultBeforeAddGrid);
									
								QuaLISLog.info(className, resultBeforeAddGrid);
							}
							catch (Exception e)
							{
								String resultBeforeAddGrid="5. It shows "+beforeCount+" "+ screen +" in Grid before Add";
								
								BasicOperation.screenshot(resultBeforeAddGrid);

								System.out.println(resultBeforeAddGrid);
									
								QuaLISLog.info(className, resultBeforeAddGrid);
							}						
														
							BasicOperation.wait(element.get(ElementName.action));
							
							BasicOperation.exception(element.get(ElementName.action));
	 								
							String resultActionButtonClick="6. Clicked the "+action+" Button";
							
							BasicOperation.screenshot(resultActionButtonClick);

							System.out.println(resultActionButtonClick);
								
							QuaLISLog.info(className, resultActionButtonClick);
							
							try
							{
								element.get(ElementName.add).click();
										
								String resultAddButtonClick="7. Clicked the Add Button";
								
								BasicOperation.screenshot(resultAddButtonClick);

								System.out.println(resultAddButtonClick);
									
								QuaLISLog.info(className, resultAddButtonClick);
								
								try
								{
									
									BasicOperation.exception(element.get(ElementName.nameValue));
									
									String resultAddPopupVisible="8. Add popup is opened";
									
									BasicOperation.screenshot(resultAddPopupVisible);

									System.out.println(resultAddPopupVisible);
										
									QuaLISLog.info(className, resultAddPopupVisible);
	 									
									try
									{
										
										BrowserOperation.smallImplicitWaitSendKeys(element.get(ElementName.nameValue), name);
																				
										String resultEnteredName="9. Entered the name as "+name;
										
										BasicOperation.screenshot(resultEnteredName);

										System.out.println(resultEnteredName);
											
										QuaLISLog.info(className, resultEnteredName);
 										
										try
										{
											
											BrowserOperation.smallImplicitWaitSendKeys(element.get(ElementName.descriptionValue), description);
											
											String resultEnteredDescription="10. Entered the description as "+description;
											
											BasicOperation.screenshot(resultEnteredDescription);

											System.out.println(resultEnteredDescription);
												
											QuaLISLog.info(className, resultEnteredDescription);
											
											
											try
											{
												BrowserOperation.smallImplicitWaitClick(element.get(ElementName.addSubmitButton));								
												
												String resultAddSubmitClick="11. Clicked the Add submit Button";
												
												BasicOperation.screenshot(resultAddSubmitClick);

												System.out.println(resultAddSubmitClick);
													
												QuaLISLog.info(className, resultAddSubmitClick);
													
												boolean visible=BasicOperation.wait(element.get(ElementName.action), 10);
												
												String resultPopupClose="";
												
												if(visible)
												{
													resultPopupClose="12. Add Popup is closed";
													
													BasicOperation.screenshot(resultPopupClose);

													System.out.println(resultPopupClose);
														
													QuaLISLog.info(className, resultPopupClose);
													
													
													BasicOperation.exception(element.get(ElementName.tabHeader));
													
													afterCount=nameList.size();
													int difference=afterCount-beforeCount;
													
													String resultConditionOneGridSizeIncrease="";
													
													if(difference==1)
													{
														conditionOneGridSizeIncrease=true;
														
														resultConditionOneGridSizeIncrease="Grid detail is Increased by "+difference+" times";
														
														BasicOperation.screenshot(resultConditionOneGridSizeIncrease);

														System.out.println(resultConditionOneGridSizeIncrease);
															
														QuaLISLog.info(className, resultConditionOneGridSizeIncrease);

													}
													else if(difference>1)
													{
														resultConditionOneGridSizeIncrease="Grid detail is Increased by "+difference+" times";
														
														
														BasicOperation.screenshot(resultConditionOneGridSizeIncrease);

														System.out.println(resultConditionOneGridSizeIncrease);
															
														QuaLISLog.error(className, resultConditionOneGridSizeIncrease);

													}
													else
													{
														resultConditionOneGridSizeIncrease="undefined";
														
														BasicOperation.screenshot(resultConditionOneGridSizeIncrease);

														System.out.println(resultConditionOneGridSizeIncrease);
															
														QuaLISLog.error(className, resultConditionOneGridSizeIncrease);

													}
													
													String resultNameInGrid="";
													
													String resultDescriptionInGrid="";
													
													String resultNameGridFirstIndex="";
													
													String resultDescriptionGridFirstIndex="";
 													
													for(WebElement nameGrid:nameList)
													{
														String nameGridText=nameGrid.getText();
																									
														if(nameGridText.equals(name))
														{
															conditionTwoNameDisplayInGrid=true;
															
															System.out.println();
															
															resultNameInGrid="Entered name detail that "+name+" is displayed in Grid";
															
															BasicOperation.screenshot(resultNameInGrid);

															System.out.println(resultNameInGrid);
																
															QuaLISLog.info(className, resultNameInGrid);
															
															
															String firstName=nameList.get(0).getText();
															
															if(firstName.equals(name))
															{
																conditionFourFirstIndexName=true;
																																
																resultNameGridFirstIndex="Entered name detail tha t"+name+" is displayed in First Index";
															 	 
																BasicOperation.screenshot(resultNameGridFirstIndex);

																System.out.println(resultNameGridFirstIndex);
																	
																QuaLISLog.info(className, resultNameGridFirstIndex);
																
																break;
														
															}
															else
															{
																resultNameGridFirstIndex="Entered name detail that "+name+" is not is displayed in First Index";
															 	 
																BasicOperation.screenshot(resultNameGridFirstIndex);

																System.out.println(resultNameGridFirstIndex);
																	
																QuaLISLog.error(className, resultNameGridFirstIndex);
	
															}
															
														
														}
														else
														{
															resultNameInGrid="Entered name detail that "+name+ " is not displayed in Grid";
															
															BasicOperation.screenshot(resultNameInGrid);

															System.out.println(resultNameInGrid);
																
															QuaLISLog.error(className, resultNameInGrid);

		
														}
													}
													
													for(WebElement descriptionGrid:descriptionList)
													{
														String descriptioneGridText=descriptionGrid.getText();
														
														if(descriptioneGridText.equals(description))
														{
															conditionThreeDescriptionDisplayInGrid=true;
															
															resultDescriptionInGrid="Entered description detail that "+description+ " is displayed in Grid ";
															
															BasicOperation.screenshot(resultDescriptionInGrid);

															System.out.println(resultDescriptionInGrid);
																
															QuaLISLog.info(className, resultDescriptionInGrid);
															
															String firstDescription=descriptionList.get(0).getText();
															
															if(firstDescription.equals(description))
															{
																conditionFiveFirstIndexDescription=true;
																
																resultDescriptionGridFirstIndex="Entered description detail that "+description+ " displayed in First Index";
														 	 
																BasicOperation.screenshot(resultDescriptionGridFirstIndex);

																System.out.println(resultDescriptionGridFirstIndex);
																	
																QuaLISLog.info(className, resultDescriptionGridFirstIndex);
																
																
																if(conditionOneGridSizeIncrease)
																{
																	System.out.println("conditionOneGridSizeIncrease--> Passed");
																}
																else
																{
																	System.out.println("conditionOneGridSizeIncrease--> Failed");
																}
																
																if(conditionTwoNameDisplayInGrid)
																{
																	System.out.println("conditionTwoNameDisplayInGrid--> Passed");
																}
																else
																{
																	System.out.println("conditionTwoNameDisplayInGrid--> Failed");
																}
																
																if(conditionThreeDescriptionDisplayInGrid)
																{
																	System.out.println("conditionThreeDescriptionDisplayInGrid--> Passed");
																}
																else
																{
																	System.out.println("conditionThreeDescriptionDisplayInGrid--> Failed");
																}
																
																if(conditionFourFirstIndexName)
																{
																	System.out.println("conditionFourFirstIndexName--> Passed");
																}
																else
																{
																	System.out.println("conditionFourFirstIndexName--> Failed");
																}
																
																if(conditionFiveFirstIndexDescription)
																{
																	System.out.println("conditionFiveFirstIndexDescription--> Passed");
																}
																else
																{
																	System.out.println("conditionFiveFirstIndexDescription--> Failed");
																}
																
																BasicOperation.screenCollapse(element);
																
																break;
															}
															
															
															
															else
															{
																resultDescriptionGridFirstIndex="Entered description detail that "+description+ " displayed in First Index, something issue";
															 	 
																BasicOperation.screenshot(resultDescriptionGridFirstIndex);

																System.out.println(resultDescriptionGridFirstIndex);
																	
																QuaLISLog.error(className, resultDescriptionGridFirstIndex);
														
															}
															
														}
														else
														{
															resultDescriptionInGrid="Entered description detail that "+description+ " displayed in Grid, something issues";
															
															BasicOperation.screenshot(resultDescriptionInGrid);

															System.out.println(resultDescriptionInGrid);
																
															QuaLISLog.error(className, resultDescriptionInGrid);

														}
													}
													
													
													

												}
												else
												{
													resultPopupClose="12. Add Popup is not closed, It getting issue something";
												
 	 												
													BasicOperation.screenshot(resultPopupClose);

													System.out.println(resultPopupClose);
														
													QuaLISLog.error(className, resultPopupClose);
													
													BasicOperation.screenCollapse(element);
											
												}
												
																							
											}
											catch (ElementNotInteractableException e)
											{
												String resultAddSubmitClick="11. Unable to click the Submit button, It not displays"+e.getClass().getName();
 												
												BasicOperation.screenshot(resultAddSubmitClick);

												System.out.println(resultAddSubmitClick);
													
												QuaLISLog.error(className, resultAddSubmitClick);
												
												BasicOperation.screenCollapse(element);

											}
											catch (NoSuchElementException e) 
											{
												String resultAddSubmitClick="11. Unable to click the Add Submit button, It's Address() is not correct, It Causes "+""+e.getClass().getName();
												

												BasicOperation.screenshot(resultAddSubmitClick);

												System.out.println(resultAddSubmitClick);
														
												QuaLISLog.error(className, resultAddSubmitClick);	
												
												BasicOperation.screenCollapse(element);
												 
											}
											catch (Exception e)
											{
												String resultAddSubmitClick="11. Unable to click the Add submit button, It causes "+e.getClass().getName();

												BasicOperation.screenshot(resultAddSubmitClick);

												System.out.println(resultAddSubmitClick);
														
												QuaLISLog.error(className, resultAddSubmitClick);	
												
												BasicOperation.screenCollapse(element);
												 												
											}
											
											
											
										}
										catch (Exception e)
										{
											
											String resultEnteredDescription="9. Unable to Enter the description, It causes exception";
											
											e.printStackTrace();
											
											BasicOperation.screenshot(resultEnteredDescription);

											System.out.println(resultEnteredDescription);
												
											QuaLISLog.error(className, resultEnteredDescription);
											
											BasicOperation.screenCollapse(element);
										}
									}
									catch (Exception e)
									{
										String resultEnteredName="8. Unable to enter the name value, It caused Exception";
										
										e.printStackTrace();
										
										BasicOperation.screenshot(resultEnteredName);

										System.out.println(resultEnteredName);
											
										QuaLISLog.error(className, resultEnteredName);
										
										BasicOperation.screenCollapse(element);
									}
									
									
									
								}
								catch (Exception e)
								{
									String resultAddPopupVisible="7. Add popup is not opened";
									
									BasicOperation.screenshot(resultAddPopupVisible);

									System.out.println(resultAddPopupVisible);
										
									QuaLISLog.error(className, resultAddPopupVisible);
									
									BasicOperation.screenCollapse(element);
								}
							 
							}
							catch (Exception e)
							{
								String resultAddButtonClick="6. Unable to Click the Add Button, It is not displays";
								
								BasicOperation.screenshot(resultAddButtonClick);

								System.out.println(resultAddButtonClick);
									
								QuaLISLog.error(className, resultAddButtonClick);
								
								output.put(TwoTermOutput.addClick, resultAddButtonClick);

								
								BasicOperation.screenCollapse(element);
								
							}
						}
						catch (Exception e)
						{
							String resultActionButtonClick="5. Unable to click the"+action+" Button, It is not displays";
							
							BasicOperation.screenshot(resultActionButtonClick);
							
							System.out.println(resultActionButtonClick);
							
							QuaLISLog.error(className, resultActionButtonClick);
							
							output.put(TwoTermOutput.actionClick, resultActionButtonClick);

							
							BasicOperation.screenCollapse(element);
							
						}
					}
					catch (Exception e)
					{
						String resultScreenVisibilty="4. "+screen+" is not visible, It getting loader issue";
						
						BasicOperation.screenshot(resultScreenVisibilty);

						System.out.println(resultScreenVisibilty);
							
						QuaLISLog.error(className, resultScreenVisibilty);
						
						output.put(TwoTermOutput.screenVisible, resultScreenVisibilty);

						
						BasicOperation.screenCollapse(element);
						
					}
				}
				catch (Exception e)
				{ 	
					String resultScreenClick= "3. "+screen+" Icon is not available";
					
					BasicOperation.screenshot(resultScreenClick);

					System.out.println(resultScreenClick);
						
					QuaLISLog.error(className, resultScreenClick); 
					
					output.put(TwoTermOutput.screenClick, resultScreenClick);
					
					BasicOperation.screenCollapse(element);
				}
			}
			catch (Exception e)
			{
				 
				String resultSubModuleClick="2. "+subModule+" Icon is not displays";
				
				BasicOperation.screenshot(resultSubModuleClick);
				
				System.out.println(resultSubModuleClick);
				
				QuaLISLog.error(className, resultSubModuleClick);
				
				output.put(TwoTermOutput.subModuleClick, resultModuleClick);
				
				element.get(ElementName.module).click();
				
			}
			
		}
		catch (Exception e)
		{
			String resultModuleClick="1. "+module+" Icon is not displays";
			
			BasicOperation.screenshot(resultModuleClick);
			
			System.out.println(resultModuleClick);
			
			QuaLISLog.error(className, resultModuleClick);
			
			output.put(TwoTermOutput.moduleClick, resultModuleClick);
			
		}
		
		
		if(conditionOneGridSizeIncrease==conditionTwoNameDisplayInGrid==conditionThreeDescriptionDisplayInGrid==conditionFourFirstIndexName==conditionFiveFirstIndexDescription)			
		{
			output.put(TwoTermOutput.resultFlag, TestCaseResultFlag.pass);
		}
		else
		{
			output.put(TwoTermOutput.resultFlag, TestCaseResultFlag.fail);

		}
		
		
		
		return output;

	}
	
	public static void addMandatoryField(HashMap <String, String> value, HashMap< String, WebElement> element) throws InterruptedException
	{
		String name=value.get(TestDataName.nameAddMandatory);
	
		element.get(module).click();
		
		element.get(ElementName.subModule).click();
		
		element.get(ElementName.screen).click();
		
		element.get(ElementName.tabHeader).click();
		
		BasicOperation.exception(element.get(ElementName.action));
		
		element.get(ElementName.add).click();
		
		BasicOperation.exception(element.get(ElementName.nameValue));
		
		element.get(ElementName.nameValue).sendKeys(name);
				
		element.get(ElementName.addSubmitButton).click();
		
		BasicOperation.wait(element.get(ElementName.action));
		
		element.get(ElementName.home).click();
		
		element.get(ElementName.subModule).click();

		element.get(ElementName.module).click();
	}


	
}
