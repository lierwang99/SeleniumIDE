package lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base;

public class DelimitField {
	public static void main(String[] args) throws InterruptedException {
		 
        WebDriver driver = Base.getDriver("https://www.baidu.com/duty/");
	
		//定义第一段文字
		WebElement Sting_Sected = driver.findElement(By.cssSelector("#aboutToShow > main > ul > li:nth-child(1)"));
		
		
		//定义第二段文字
		WebElement String_Second = driver.findElement(By.xpath("//*[@id=\"aboutToShow\"]/main/ul/li[2]"));
		
		Actions action = new Actions(driver);
//		action.clickAndHold(Sting_Sected).moveToElement(String_Second).perform();
		action.clickAndHold(Sting_Sected).moveToElement(String_Second,1,2).build().perform();
		action.release();
	}
}
