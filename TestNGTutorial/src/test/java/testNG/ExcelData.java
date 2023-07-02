package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	
	@DataProvider(name="getData")
	public String[][] getData() throws IOException {
		
		File excelFile=new File("./src/main/java/ResourcesNew/newUser.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("testSheet");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		//System.out.println("No of rows: "+rows+"\n"+"No of columns: "+cols);
		
		String[][] data= new String[rows-1][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
				
			}
		}
		
		workbook.close();
		fis.close();
		return data;
		
		
	}

}
