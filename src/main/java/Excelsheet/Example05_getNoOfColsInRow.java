package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example05_getNoOfColsInRow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		
		FileInputStream file =new FileInputStream("S:\\JavaSeleniumR\\SeleniumRevision4April\\e\\data.xlsx");
		Workbook book=WorkbookFactory.create(file);
		
		//To check no. of cols in row  we use gwetLastCellNum(); method it will return int value i.e size
		int LastColNo = book.getSheet("Sheet1").getRow(0).getLastCellNum();
		
		System.out.println("No. of Coloumns in  Rows 0   :"+LastColNo);
		  
	}

}