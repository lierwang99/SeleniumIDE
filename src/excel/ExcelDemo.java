package excel;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelDemo {

	public static void main(String[] args) throws Exception {
			File file = new File("H:\\Desktop\\imgs\\ABC.xls");
			Workbook wk = Workbook.getWorkbook(file);
			Sheet[] sheets = wk.getSheets();
			for(Sheet sheet : sheets) {
				System.out.println(sheet+":"+sheet.getName());
			}
			String[] sheetNames = wk.getSheetNames();
			for(int i = 0 ; i< sheetNames.length ; i++) {
				System.out.println(sheetNames[i]);
			}
			Sheet sheet = wk.getSheet("工作");
//			String sName = wk.getSheet(0).getName();
			System.out.println(sheet);
//			Cell cell = new Cell();
			
			
			
			
	}

}
