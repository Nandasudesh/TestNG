package project_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DatafromExcel {
	//./src/main/java/Resources/testdata.xlsx
	//public static void main (String args[]) throws IOException {
	@DataProvider(name="getData")
	public String [][] getData() throws IOException{
		
		File excelFile=new File("./src/main/java/Resources/testdata.xlsx"); //DataType-File
		//to fetch data
		FileInputStream fis=new FileInputStream(excelFile);
		//converting to workbook
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("testSheet"); //sheet name given
		
		int rows=sheet.getPhysicalNumberOfRows();//returns the rows with data
		int cols=sheet.getRow(0).getLastCellNum();//from 0 to cell with last data
		//System.out.println(rows);
		
		String[][] data=new String[rows-1][cols];
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cols;j++) {
				
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
			}
		}
		
		
		

		
		workbook.close();
		fis.close();
		return data;
}
}
