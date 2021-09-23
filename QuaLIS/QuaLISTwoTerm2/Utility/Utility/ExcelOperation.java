package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {
	/*
	public static void excelTestCaseResult(String fileName,String sheet, int testCaseRow,int actualResultCellNo, int resultCellNo, String actualResult, String result, String stTime,String edTime,int stTimeCell,int edTimeCell) throws IOException
	{
		File file= new File(fileName);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook

		XSSFSheet worksheet = wb.getSheet(sheet); // Access the worksheet, so that we can update / modify it.
		
		XSSFRow row = worksheet.getRow(testCaseRow);
		
				
		XSSFCell startTime = row.getCell(stTimeCell);  	
		
		XSSFCell endTime = row.getCell(edTimeCell);  	
		
		
		XSSFCell actualResultCell = row.getCell(actualResultCellNo);  
		
		
			
		
		CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setColor(HSSFColor.HSSFColorPredefined.GREEN.getIndex());
        style.setFont(font);
        
        CellStyle styleFAIL = wb.createCellStyle();
        
        
        font.setColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
        styleFAIL.setFont(font);
		
        
        
		CellStyle cellStyle = actualResultCell.getCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
			

		actualResultCell.setCellValue(actualResult);
		
		if(result.equals("PASS"))
		{
			actualResultCell.setCellStyle(style);
		}
		else
		{
			actualResultCell.setCellStyle(styleFAIL);
		}
		

		XSSFCell resultCell = row.getCell(resultCellNo);
		
		CellStyle cellStyle1 = resultCell.getCellStyle();
		cellStyle1.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
		
		CellStyle cellStylestartTime = startTime.getCellStyle();
		cellStyle1.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
		
		CellStyle cellStyleEndTime = endTime.getCellStyle();
		cellStyle1.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
		
		startTime.setCellValue(stTime);
		
		endTime.setCellValue(edTime);

		resultCell.setCellValue(result);
		
		

		fis.close();

		FileOutputStream fos = new FileOutputStream(file);

		wb.write(fos);

		wb.close();

		
		

	}
	
	public static void excelTestCaseResult(String fileName,String sheet, String testCase,int actualResultCellNo, int resultCellNo, String actualResult, String result, String stTime,String edTime,int stTimeCell,int edTimeCell) throws IOException
	{
		File file= new File(fileName);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis); // Access the workbook

		XSSFSheet worksheet = wb.getSheet(sheet); // Access the worksheet, so that we can update / modify it.
		
		
		int aaa=worksheet.getLastRowNum();
		
		System.out.println();
		
		int testCaseRowNumber;
		
		
				
		XSSFCell startTime = row.getCell(stTimeCell);  	
		
		XSSFCell endTime = row.getCell(edTimeCell);  	
		
		
		XSSFCell actualResultCell = row.getCell(actualResultCellNo);  
		
		
			
		
		CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setColor(HSSFColor.HSSFColorPredefined.GREEN.getIndex());
        style.setFont(font);
        
        CellStyle styleFAIL = wb.createCellStyle();
        
        
        font.setColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
        styleFAIL.setFont(font);
		
        
        
		CellStyle cellStyle = actualResultCell.getCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
			

		actualResultCell.setCellValue(actualResult);
		
		if(result.equals("PASS"))
		{
			actualResultCell.setCellStyle(style);
		}
		else
		{
			actualResultCell.setCellStyle(styleFAIL);
		}
		

		XSSFCell resultCell = row.getCell(resultCellNo);
		
		CellStyle cellStyle1 = resultCell.getCellStyle();
		cellStyle1.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
		
		CellStyle cellStylestartTime = startTime.getCellStyle();
		cellStyle1.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
		
		CellStyle cellStyleEndTime = endTime.getCellStyle();
		cellStyle1.setAlignment(HorizontalAlignment.CENTER);
		actualResultCell.setCellStyle(cellStyle);
		
		startTime.setCellValue(stTime);
		
		endTime.setCellValue(edTime);

		resultCell.setCellValue(result);
		
		

		fis.close();

		FileOutputStream fos = new FileOutputStream(file);

		wb.write(fos);

		wb.close();

		
		

	}

*/}
