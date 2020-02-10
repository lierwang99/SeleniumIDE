package lesson;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LaunchFirefox {
	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", ".\\tools\\geckodriver.exe");
//		File pathToBinary = new File("D:\\firefox\\Mozilla Firefox\\firefox.exe");
//		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//		FirefoxProfile firefoxProfile = new FirefoxProfile(pathToBinary);
		FirefoxOptions option  = new FirefoxOptions();
		String firePath = "D:\\firefox\\Mozilla Firefox\\firefox.exe";
		option.setBinary(firePath);	
//		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
//		ProfilesIni pi = new ProfilesIni();
//		FirefoxProfile profile = pi.getProfile("default");//这个是打开自己设置的带插件的火狐
		//System.setProperty("webdriver.firefox.marionette","D:\\tools\\geckodriver.exe");//适用于更老的版本48之前
		
//		System.setProperty("webdriver.firefox.bin","D:\\firefox\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com");
		System.out.println("当前打开的页面标题是："+driver.getTitle());
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
}
}
