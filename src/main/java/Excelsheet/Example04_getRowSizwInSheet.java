package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example04_getRowSizwInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		
		FileInputStream file =new FileInputStream("S:\\JavaSeleniumR\\SeleniumRevision4April\\e\\data.xlsx");
		Workbook book=WorkbookFactory.create(file);
		
		//To check no. of rows in the sheet we use gwetLastRowNum(); method it will return int value i.e size
		int rowSize = book.getSheet("Sheet1").getLastRowNum()+1;
		
		System.out.println("No. of Rows in the :"+rowSize);
		  
	}

}