package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("./Data/Samplesheet.xlsx");

		XSSFSheet worksheet = workbook.getSheet("CreateLead");

		int rows = worksheet.getLastRowNum();
		System.out.println(rows);

		int allrows = worksheet.getPhysicalNumberOfRows();
		System.out.println(allrows);

		short cells = worksheet.getRow(0).getLastCellNum();
		System.out.println(cells);

		for (int i = 1; i <= rows; i++) {
			XSSFRow row = worksheet.getRow(i);
			for (int j = 0; j < cells; j++) {
				XSSFCell cell = row.getCell(j);

				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		workbook.close();

	}

}
