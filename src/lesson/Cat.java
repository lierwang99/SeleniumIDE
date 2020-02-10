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
		String js = "document.getElementById('createTime').removeAttribute('readonly')";     // 原生js，移除属性

	    ((JavascriptExecutor)driver).executeScript(js);    //将driver强制转换为JavascriptExecutor类型
	    driver.findElement(By.id("createTime")).sendKeys("2016-08-24");    //输入日期
	}

}
