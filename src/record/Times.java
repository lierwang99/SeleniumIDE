package record;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Times {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("H:\\Desktop\\css.html");
		WebDriverWait wait = new WebDriverWait(driver,3);//显示等待
		WebElement ele = driver.findElement(By.xpath("//input"));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println(ele.getAttribute("placeholder"));
		System.out.println(until.getAttribute("placeholder"));
	}

}
