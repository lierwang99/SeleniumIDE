package lesson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	public static String readCSV(File file, int row, int column) {
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = "";
			List<String> list = new ArrayList<String>();
			while ((line = br.readLine()) != null) {
				list.add(line);// 这一行不为空就加入list集合
			}
			// System.out.println("文件中所有行数为：" + list.size());
			String arr[] = new String[list.size()];
			list.toArray(arr);
			row--;
			column--;
			if (row < arr.length && row >= 0) {
				String single[] = arr[row].split(",");
				if (column < single.length && column >= 0) {
					//single[column].length()!=0 这样判断也可以，0长度的String也不等于null
					if(!(single[column].equals(""))) {//这里不能直接以single[column]!=null来判断
						return single[column];
					}
					return "第 "+(row+1)+" 行第 "+(column+1)+" 列无数据";
					
					
				} else {
					System.out.println("第 " + (row + 1) + " 行数据最大列数为：" + single.length);
				}
			} else {
				System.out.println("文件最大行数为：" + list.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "超越数据区域边界";
	}

	public static String readXLSX(File file, int row, int column) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		try {
				if (row > 0 && column > 0) {
					XSSFCell scell = sh1.getRow(row - 1).getCell(column - 1);
					if (scell != null) 
						return sh1.getRow(row - 1).getCell(column - 1).toString();
				}
		} catch (Exception e) {
				return "第 "+row+" 行无数据";
		}
		return "第 "+row+" 行第 "+column+" 列无数据";
	}
}

