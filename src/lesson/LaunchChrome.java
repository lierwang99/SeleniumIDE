package lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;



public class LaunchChrome {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\tools\\new_chromedriver.exe");
		/*
		ChromeOptions options = new ChromeOptions();
		//ͨ�����ò�����ֹdata;�ĳ���
		options.addArguments("--user-data-dir=C:/Users/Administrator/AppData/Local/Google/Chrome/User Data/Default");
		//ͨ�����ò���ɾ������ʹ�õ��ǲ���֧�ֵ������б�ǣ�--ignore-certificate-errors���ȶ��ԺͰ�ȫ�Ի������½�������ʾ
		options.addArguments("--start-maximized","allow-running-insecure-content", "--test-type");
			*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.get("https://www.baidu.com");
		java.util.Set<Cookie> cookie= driver.manage().getCookies();
		//��ȡcookie
		System.out.println(cookie);
		Thread.sleep(5000);
		driver.quit();
		
	}
}
