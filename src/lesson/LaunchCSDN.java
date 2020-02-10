package lesson;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchCSDN {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\tools\\new_chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.csdn.net/");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='userinfo']/a[1]")).click();// 首页登录
		Thread.sleep(1000);
		//切换页面
		switchHandle(driver,driver.getWindowHandle(),driver.getWindowHandles());
		//点账户登录
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[4]/ul/li[2]/a")).click();
		
		//用户信息
		File userInfo = new File(".\\outFile\\userInfo.xlsx");
		
		//从表中获取用户名
		String loginUser = ReadFile.readXLSX(userInfo, 2, 1);
		//从表中获取登录密码
		String loginPassword = ReadFile.readXLSX(userInfo, 2, 2);;
		
		WebElement username = driver.findElement(By.id("all"));
		username.sendKeys(loginUser);
		
		//加背景色
		Thread.sleep(1000);
		color(driver, username, "yellow");
		Thread.sleep(1000);
		driver.findElement(By.id("password-number")).sendKeys(loginPassword);
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("rememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-type='account']")).click();
		driver.findElement(By.xpath("//img[@class='login_img']")).click();
		Thread.sleep(2000);
		switchHandle(driver, driver.getWindowHandle(), driver.getWindowHandles());
		driver.findElement(By.linkText("我的关注")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div/ul/li[7]/a[2]")).click();
	
		//关注的人，从outFile目录下的careAbout.xlsx文件中读取
		File careAbout = new File(".\\outFile\\careAbout.xlsx");
		
		String careAboutUser = ReadFile.readXLSX(careAbout, 2, 1);
		driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div[2]/div/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(careAboutUser)).click();
		
		switchHandle(driver, driver.getWindowHandle(), driver.getWindowHandles());
		//点击“原创”
		driver.findElement(By.xpath("//div[@class='my_wrap']/div[@class='my_wrap_l']/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);
		switchHandle(driver, driver.getWindowHandle(), driver.getWindowHandles());
		
		// 翻到多少页
		exePage(driver, 20);
		
		// 这个是页面底部“下一页”元素
		WebElement element = driver.findElement(By.xpath("//*[@id='asideFooter']/div[2]/div/div/div[4]/p[3]/a[2]/span"));
	
		// 滚动至这个元素
		rollShaftToElement(driver,element);
		
		WebElement eleLast = driver.findElement(By.xpath("//div[@id='pageBox']/div/ul/li[@data-page=20]"));
		color(driver, eleLast, "red");

		// 默認變色
		WebElement defaultSS = driver.findElement(By.xpath("//div[@id='mainBox']/main/div[1]/dl/dd[1]/a"));
		color(driver, defaultSS, "green");
		Thread.sleep(10000);
		// driver.quit();
	}
	//切换到新的table,关闭当前
	public static void switchHandle(WebDriver driver, String s, Set<String> ss) throws Exception {
		for (String newhandle : ss) {
			if (!newhandle.equals(s)) {
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(newhandle);
			}
		}
	}

	//翻到多少页
	public static void exePage(WebDriver driver, int x) throws Exception {
		if (x > 3) {
			driver.findElement(By.xpath("//div[@id='pageBox']/div/ul/li[5]")).click();
			driver.findElement(By.xpath("//div[@id='pageBox']/div/ul/li[6]")).click();
			if (x > 4) {
				for (int j = 5; j <= x; j++) {
					driver.findElement(By.xpath("//div[@id='pageBox']/div/ul/li[@data-page=" + j + "]")).click();
					Thread.sleep(500);
				}
			}
		} else {
			driver.findElement(By.xpath("//div[@id='pageBox']/div/ul/li[@data-page=" + x + "]")).click();
			Thread.sleep(500);
		}
	}
	//为元素增加背景色
	public static void color(WebDriver driver, WebElement element, String color) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('style','background:" + color + ";border: 2px solid red')",
				element);
	}
	public static void rollShaftToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
  		
      	//执行js语句，拖拽浏览器滚动条，直到该元素到底部，马上就不可以见
      	je.executeScript("arguments[0].scrollIntoView(true);",element);

	}
	

}
