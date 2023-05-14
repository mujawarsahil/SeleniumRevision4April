package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example02_getNumericData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream file =new FileInputStream("S:\\JavaSeleniumR\\SeleniumRevision4April\\e\\data.xlsx");
		Workbook book = WorkbookFactory.create(file);	
		double numValue = book.getSheet("Sheet1").getRow(4).getCell(0).getNumericCellValue();
		System.out.println(numValue);
	}

}