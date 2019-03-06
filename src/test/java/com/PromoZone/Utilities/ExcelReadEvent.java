package com.PromoZone.Utilities;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEvent {

	private String PromotionName;
	private String PromotionDescription;
	private String PromotionAdvertisers;
	private String ConstanValue;
	
	public String getPromotionName() {
		return PromotionName;
	}

	public void setPromotionName(String promotionName) {
		PromotionName = promotionName;
	}

	public String getPromotionDescription() {
		return PromotionDescription;
	}

	public void setPromotionDescription(String promotionDescription) {
		PromotionDescription = promotionDescription;
	}
	
	public String getAdvertisers() {
		return PromotionAdvertisers;
	}

	public void setAdvertisers(String promotionAdvertisers) {
		PromotionAdvertisers = promotionAdvertisers;
	}
	
	public String getConstanValue() {
		return ConstanValue;
	}

	public void setConstanValue(String constanValue) {
		ConstanValue = constanValue;
	}
	
	
	public boolean readFromExcelxlsx(int sheet, int row,ExcelTypes excelType) throws Exception {
		
		
	
			boolean noFound = false;
			String FilePath="";
			if(excelType==ExcelTypes.Excel1) {
			FilePath = System.getProperty("user.dir") + "\\src\\Resources\\PromoZone.xlsx";
			}
			else if(excelType==ExcelTypes.Excel2) {
				FilePath = System.getProperty("user.dir") + "";	
			}
			else if(excelType==ExcelTypes.Excel3) {
				FilePath = System.getProperty("user.dir") + "";	
			}
			else {
				return false;
			}
			
			InputStream fs = new FileInputStream(FilePath);
			
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			
	
			// TO get the access to the sheet
		
			XSSFSheet sh=wb.getSheetAt(sheet);
			
			
			
			// To get the number of rows present in sheet
			//int totalNoOfRows = sh.getRow(0).getPhysicalNumberOfCells();
			
			// To get the number of columns present in sheet
			
			int totalNoOfCols = sh.getRow(0).getLastCellNum();
			String[] singlerow = new String[totalNoOfCols];
			XSSFCell strcellvalue = null;
			DataFormatter df = new DataFormatter();
			for (int col = 0; col < totalNoOfCols; col++) {
				strcellvalue = sh.getRow(row).getCell(col); 
				singlerow[col] = df.formatCellValue(strcellvalue);
				
			}
			/*
			if(singlerow[2].contains("abc")){
				noFound=true;
			}
			
			if(singlerow[2].contains("no")){
				noFound=true;
			}
	*/
			if(excelType==ExcelTypes.Excel1) {
			return excel1Work(sheet, noFound, singlerow);
			}
		/*	else if(excelType==ExcelTypes.Excel2) {
				return excel2Work(sheet, noFound, singlerow);
				}
			else if(excelType==ExcelTypes.Excel3) {
				return excel3Work(sheet, noFound, singlerow);
				}
				*/
			else {
				return false;
			}
			
		}
		
	private boolean excel1Work(int sheet, boolean noFound, String[] singlerow) {
		switch (sheet) {
		case 0:
			setPromotionName(singlerow[0]);
			setPromotionDescription(singlerow[1]);
			setAdvertisers(singlerow[2]);;
			setConstanValue(singlerow[3]);
			break;
		default:
			break;
	
		}
		return noFound;
	}
		
	
	}
