package autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base;

public class Autoit {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = Base.getDriver("https://www.baidu.com");
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"lg\"]/img[1]"));
		Actions actions = new Actions(driver);
		actions.contextClick(findElement).perform();
		Robot robot = new Robot();
		for (int x = 0; x < 7; x++) {
			// 点击向下箭头
			robot.keyPress(KeyEvent.VK_DOWN);
			// 间接调用Three.sleep
			robot.delay(500);
		}
		// 放开向下箭头
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(5000);
		// 按住回车
		robot.keyPress(KeyEvent.VK_ENTER);
		// 自定义图片存放路径及名称
		String filePath = "E:\\baidu33.jpg";
		try {
			// 调用指定位置的程序“autoIt3Dload.exe”,这是自己制作的程序，这里exe后面有一个空格很重要
			Runtime.getRuntime().exec("D:\\AutoIt3\\liyan\\autoIt3DloadLiyan.exe " + filePath);
			System.out.println("保存成功 ！");
		} catch (IOException e) {
			System.out.println("保存失败 ！");
			System.err.println(e.getMessage());
		}
		// 延迟
		robot.delay(8000);
		driver.close();
	}
}