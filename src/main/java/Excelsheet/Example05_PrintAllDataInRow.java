package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example05_PrintAllDataInRow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		
		FileInputStream file =new FileInputStream("S:\\JavaSeleniumR\\SeleniumRevision4April\\e\\data.xlsx");
		Workbook book=WorkbookFactory.create(file);
		
		Sheet sheet=book.getSheet("Sheet2");
	
		//printing all the data in Row 0
		Row row =sheet.getRow(0);
		
		int colSize=row.getLastCellNum();
		for(int i=0;i<colSize;i++)
		{
			String data=row.getCell(i).getStringCellValue();
			System.out.print(data+ " ");
		}
		
	}

}