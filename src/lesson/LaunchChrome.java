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
		//通过配置参数禁止data;的出现
		options.addArguments("--user-data-dir=C:/Users/Administrator/AppData/Local/Google/Chrome/User Data/Default");
		//通过配置参数删除“您使用的是不受支持的命令行标记：--ignore-certificate-errors。稳定性和安全性会有所下降。”提示
		options.addArguments("--start-maximized","allow-running-insecure-content", "--test-type");
			*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.get("https://www.baidu.com");
		java.util.Set<Cookie> cookie= driver.manage().getCookies();
		//获取cookie
		System.out.println(cookie);
		Thread.sleep(5000);
		driver.quit();
		
	}
}
