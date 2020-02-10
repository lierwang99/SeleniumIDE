package record;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import depends.Base;
import jxl.common.Logger;

public class Youxiang {
	public static Logger log = Logger.getLogger(Youxiang.class);

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Base.getDriver("https://mail.qq.com");
//		log.info("切换到登录frame");
//		driver.switchTo().frame("login_frame");
		
		driver.findElement(By.xpath("//*[@id=\"switcher_plogin\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("输入账号");
		driver.findElement(By.cssSelector("#u")).sendKeys("1157299934@qq.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#p")).sendKeys("SHzengrong22.");	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		driver.findElement(By.cssSelector("#login_button")).click();
//		Thread.sleep(1000);
//		log.info("点击写信");
//		driver.findElement(By.cssSelector("#composebtn")).click();
//		Thread.sleep(3000);
//		log.info("切换mainFrame");
//		//*[@id="resize"]
//		driver = driver.switchTo().frame("mainFrame");
//		Thread.sleep(1000);
//		log.info("点击收件人");
//		Youxiang.sendKeys(driver, "//div[@id='toAreaCtrl']/div[2]/input", "1219838266@qq.com");
//		log.info("主题");
//		driver.findElement(By.cssSelector("#subject")).sendKeys("嗯嗯");
//		log.info("切到输入内容的iframe");
//		WebElement eleIf = driver.findElement(By.xpath("//iframe"));
//		driver = driver.switchTo().frame(eleIf);
//		log.info("正文");
//		driver.findElement(By.cssSelector("body")).sendKeys("asdfghj122");;
//		
//		log.info("切换mainFrame");
//		driver = driver.switchTo().parentFrame();
//		
//		log.info("点击发送按钮");
//		//*[@id="resize"]
//		driver.findElement(By.xpath("//a[text()='发送']")).click();
	}
	public static void sendKeys(WebDriver driver,String xpath,String context) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
		element.clear();
		element.sendKeys(context);
	}
}
