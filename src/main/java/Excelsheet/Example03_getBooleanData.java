package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example03_getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream file =new FileInputStream("S:\\JavaSeleniumR\\SeleniumRevision4April\\e\\data.xlsx");
		Workbook book=WorkbookFactory.create(file);
		
		Boolean res= book.getSheet("Sheet1").getRow(5).getCell(0).getBooleanCellValue();
		
		System.out.println("data at Row 5 cell 0 is "+res);
	}

}