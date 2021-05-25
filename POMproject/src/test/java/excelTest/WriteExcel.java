package excelTest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Golf_\\Desktop\\GitHubTestWorkSpace\\POMproject\\src\\test\\resources\\testData\\TestData3.xlsx";
		FileInputStream fs = new FileInputStream(path);
		

		// Creating a workbook
		
		Workbook wb = new XSSFWorkbook(fs);
		
		Sheet sheet1 = wb.getSheetAt(0);
		
		int lastRow = sheet1.getLastRowNum();
		
		System.out.println("last row number: " + lastRow);
		
		for(int i=0; i<=lastRow; i++) {
			Row row = sheet1.getRow(i);
			Cell cell = row.createCell(2);
			
			cell.setCellValue("Hi!! Golf");
		}
		
	
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
		wb.close();

	}

}