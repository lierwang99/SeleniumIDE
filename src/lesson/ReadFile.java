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
				list.add(line);// ��һ�в�Ϊ�վͼ���list����
			}
			// System.out.println("�ļ�����������Ϊ��" + list.size());
			String arr[] = new String[list.size()];
			list.toArray(arr);
			row--;
			column--;
			if (row < arr.length && row >= 0) {
				String single[] = arr[row].split(",");
				if (column < single.length && column >= 0) {
					//single[column].length()!=0 �����ж�Ҳ���ԣ�0���ȵ�StringҲ������null
					if(!(single[column].equals(""))) {//���ﲻ��ֱ����single[column]!=null���ж�
						return single[column];
					}
					return "�� "+(row+1)+" �е� "+(column+1)+" ��������";
					
					
				} else {
					System.out.println("�� " + (row + 1) + " �������������Ϊ��" + single.length);
				}
			} else {
				System.out.println("�ļ��������Ϊ��" + list.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "��Խ��������߽�";
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
				return "�� "+row+" ��������";
		}
		return "�� "+row+" �е� "+column+" ��������";
	}
}

