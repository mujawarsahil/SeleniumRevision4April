package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example06_PrintAllDataInCol
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		
		FileInputStream file =new FileInputStream("S:\\JavaSeleniumR\\SeleniumRevision4April\\e\\data.xlsx");
		Workbook book=WorkbookFactory.create(file);
		
		Sheet sh=book.getSheet("Sheet2");
		int lastRowIndex=sh.getLastRowNum();
	
		//printing all the data in Row 0
		//Row row =sheet.getRow(0);
		
		System.out.println(lastRowIndex);
		for(int i=0;i<=lastRowIndex;i++)
		{
			
			//(i) (0) imp
			String data=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		
	}

}