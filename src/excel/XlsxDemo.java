package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		String excelPath = "E:\\test.xlsx";

		File file = new File(excelPath);
		System.out.println(file);
		if (file.isFile() && file.exists()) {
			String[] split = file.getName().split("\\.");
			Workbook wb;
			if ("xls".equals(split[1])) {
				FileInputStream fs = new FileInputStream(file);
				wb = new HSSFWorkbook(fs);
			} else if ("xlsx".equals(split[1])) {
				wb = new XSSFWorkbook(file);
			} else {
				System.out.println("文件类型错误!");
				return;
			}
			Sheet sheet = wb.getSheetAt(0);
			int firstRowIndex = sheet.getFirstRowNum() + 1; // 第一行是列名，所以不读
			int lastRowIndex = sheet.getLastRowNum();
			System.out.println("firstRowIndex: " + firstRowIndex);
			System.out.println("输出没？——————————————————————————————————————————————————");
			System.out.println("lastRowIndex: " + lastRowIndex);

			for (int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) { // 遍历行
				System.out.println("rIndex: " + rIndex);
				Row row = sheet.getRow(rIndex);
				if (row != null) {
					int firstCellIndex = row.getFirstCellNum();
					int lastCellIndex = row.getLastCellNum();
					for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) { // 遍历列
						Cell cell = row.getCell(cIndex);
						if (cell != null) {
							System.out.println(cell.toString());
						}
					}
				}
			}
		} else {
			System.out.println("找不到指定的文件");
		}

	}

}
