package lesson;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Base;

public class Cat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Administrator\\Desktop\\ZR.xlsx");
		String str = ReadFile.readXLSX(file, 4,3);
		System.out.println(str);
		WebDriver driver =Base.getDriver("");
		String js = "document.getElementById('createTime').removeAttribute('readonly')";     // ԭ��js���Ƴ�����

	    ((JavascriptExecutor)driver).executeScript(js);    //��driverǿ��ת��ΪJavascriptExecutor����
	    driver.findElement(By.id("createTime")).sendKeys("2016-08-24");    //��������
	}

}
