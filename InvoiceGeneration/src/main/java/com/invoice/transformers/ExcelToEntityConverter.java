package com.invoice.transformers;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.invoice.models.CustomerModel;

public class ExcelToEntityConverter {

public List<CustomerModel> excelToCustomerModelList(InputStream fileInputStream){
	
	List<CustomerModel> userModelList = new ArrayList<>();
	
	try {
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		
		XSSFSheet sheet = workbook.getSheet("Customer Database Spreadsheet");
		
		Integer lastRow = sheet.getLastRowNum();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return null;	
}
	
}
