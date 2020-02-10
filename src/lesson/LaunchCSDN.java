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
		driver.findElement(By.xpath("//li[@class='userinfo']/a[1]")).click();// ��ҳ��¼
		Thread.sleep(1000);
		//�л�ҳ��
		switchHandle(driver,driver.getWindowHandle(),driver.getWindowHandles());
		//���˻���¼
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[4]/ul/li[2]/a")).click();
		
		//�û���Ϣ
		File userInfo = new File(".\\outFile\\userInfo.xlsx");
		
		//�ӱ��л�ȡ�û���
		String loginUser = ReadFile.readXLSX(userInfo, 2, 1);
		//�ӱ��л�ȡ��¼����
		String loginPassword = ReadFile.readXLSX(userInfo, 2, 2);;
		
		WebElement username = driver.findElement(By.id("all"));
		username.sendKeys(loginUser);
		
		//�ӱ���ɫ
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
		driver.findElement(By.linkText("�ҵĹ�ע")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div/ul/li[7]/a[2]")).click();
	
		//��ע���ˣ���outFileĿ¼�µ�careAbout.xlsx�ļ��ж�ȡ
		File careAbout = new File(".\\outFile\\careAbout.xlsx");
		
		String careAboutUser = ReadFile.readXLSX(careAbout, 2, 1);
		driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div[2]/div/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(careAboutUser)).click();
		
		switchHandle(driver, driver.getWindowHandle(), driver.getWindowHandles());
		//�����ԭ����
		driver.findElement(By.xpath("//div[@class='my_wrap']/div[@class='my_wrap_l']/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);
		switchHandle(driver, driver.getWindowHandle(), driver.getWindowHandles());
		
		// ��������ҳ
		exePage(driver, 20);
		
		// �����ҳ��ײ�����һҳ��Ԫ��
		WebElement element = driver.findElement(By.xpath("//*[@id='asideFooter']/div[2]/div/div/div[4]/p[3]/a[2]/span"));
	
		// ���������Ԫ��
		rollShaftToElement(driver,element);
		
		WebElement eleLast = driver.findElement(By.xpath("//div[@id='pageBox']/div/ul/li[@data-page=20]"));
		color(driver, eleLast, "red");

		// Ĭ�J׃ɫ
		WebElement defaultSS = driver.findElement(By.xpath("//div[@id='mainBox']/main/div[1]/dl/dd[1]/a"));
		color(driver, defaultSS, "green");
		Thread.sleep(10000);
		// driver.quit();
	}
	//�л����µ�table,�رյ�ǰ
	public static void switchHandle(WebDriver driver, String s, Set<String> ss) throws Exception {
		for (String newhandle : ss) {
			if (!newhandle.equals(s)) {
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(newhandle);
			}
		}
	}

	//��������ҳ
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
	//ΪԪ�����ӱ���ɫ
	public static void color(WebDriver driver, WebElement element, String color) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('style','background:" + color + ";border: 2px solid red')",
				element);
	}
	public static void rollShaftToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
  		
      	//ִ��js��䣬��ק�������������ֱ����Ԫ�ص��ײ������ϾͲ����Լ�
      	je.executeScript("arguments[0].scrollIntoView(true);",element);

	}
	

}
