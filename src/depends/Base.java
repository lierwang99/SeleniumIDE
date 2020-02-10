package depends;


import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

//import myStudy.file.CSV;

public class Base {

	public static WebDriver getDriver(String urlPath) {
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver = null;
		// 以下三行代码是启动自己电脑上安装的带有插件的
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
//		chromeOptions.addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
//		chromeOptions = chromeOptions.setBinary("C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//		driver = new ChromeDriver(chromeOptions);
		
//		System.setProperty("webdriver.gecko.driver", ".\\tools\\geckodriver.exe");
//		File file = new File("C:\\Users\\Administrator\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\ev00fvmv.default");
//		FirefoxProfile fp = new FirefoxProfile(file);
//		FirefoxOptions fo = new FirefoxOptions();
//		fo = fo.setProfile(fp);
//		WebDriver driver  = new FirefoxDriver(fo);
		
		driver = new ChromeDriver();
		long start = System.currentTimeMillis();
		System.out.println("start:"+start);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		long end = System.currentTimeMillis();
		System.out.println("end  :"+end);
		System.out.println("total:"+(end-start));
		driver.get(urlPath);
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		System.out.println("当前打开页面的标题是： " + driver.getTitle());
		return driver;
	}

	public static void click(WebDriver driver, String elementXpath) {
		WebElement element = driver.findElement(By.xpath(elementXpath));
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));// 加入显式等待,默认20秒等待时间
        element.click();
	}

	public static void clickId(WebDriver driver, String elementId) {
		WebElement element = driver.findElement(By.id(elementId));
//		driver.findElement(By.id(elementId)).click();
		 new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));// 加入显式等待,默认20秒等待时间
		 element.click();
	}

	public static void sendKeys(WebDriver driver, String elementXpath, String keys) {
		driver.findElement(By.xpath(elementXpath)).sendKeys(keys);
	}

	public static void sendKeysId(WebDriver driver, String elementId, String keys) {
		driver.findElement(By.id(elementId)).sendKeys(keys);
	}

	public static void select(WebDriver driver, String elementId, String[] arr, int choose) {
		WebElement element = driver.findElement(By.id(elementId));
		Select select = new Select(element);
		String str = arr[choose];
		select.selectByValue(str);
	}

	public static void selectList(WebDriver driver, String selectXpath, int choose) {
		WebElement element = null;
		try {
			 element= driver.findElement(By.xpath(selectXpath));
		}catch(Exception e) {
			String message = e.getMessage();
			System.out.println("xpath路径错误！");
		}
		if (element != null) {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			if(choose>=0&&choose<options.size()) {
				String str = options.get(choose).getAttribute("value");
				select.selectByValue(str);
				System.out.println(str);
			}else {
				System.out.println("选择项不存在！");
			}
		}
	}
//	public static void read(WebDriver driver,int row,int colum,String elementId) throws Exception {
//		File file =new File("F:/cy.csv");
//		String readCSV = CSV.readCSV(file, row, colum);
//		sendKeysId(driver,elementId,readCSV);
//	}
//备注
	public static String bz(int len) {
		String str = "是中国人爱大熊猫不错华南虎也可以1234567890黄山最棒啊放假了快递费记录卡否建立监考老师的房间里时tuioqwertyuioasdfghjkzxcvbnm发件方减肥的说法理解附件丁磊撒福建省打飞机撒开发动机";
		String ss = "";
		int i = 0;
		while (i < len) {
			int c = new Random().nextInt(str.length());
			ss = ss + str.charAt(c);
			i++;
		}
		return ss;
	}

	// 处理表格 //*[@id="maincontent"]/div[9]/table/tbody/tr[1]/th[1]
	public static String getTableCellText(WebDriver driver, String tableXpath, String tag, int row, int column) {
		if (!("td".equals(tag) || "th".equals(tag))) {
			return "The tag can only be th or td";
		}
		String cellXpath = tableXpath + "/tbody/tr[" + row + "]/" + tag + "[" + column + "]";
		String text = driver.findElement(By.xpath(cellXpath)).getText();
		return text;
	}

	public static void scroll(WebDriver driver, int beginLocation, int endLocation) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollTo(" + beginLocation + "," + endLocation + ")");
	}

	public static void clickImg(String imgPath) {
		Pattern gb = new Pattern(imgPath);
		Screen sc = new Screen();
		try {
			sc.click(gb);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static WebDriver switchWindow(WebDriver driver, String chooseXpath) {
		Base.click(driver, chooseXpath);
		String wHa = driver.getWindowHandle();
		Set<String> wHS = driver.getWindowHandles();
		String wHb = null;
		for(String wHtemp :wHS) {
			if(wHtemp != wHa) {
				wHb = wHtemp;
			}
		}
		driver = driver.switchTo().window(wHb);
		return driver;
	}
	public static WebDriver switchFrame(WebDriver driver,String iframeXpath) {
		WebElement ele = driver.findElement(By.xpath(iframeXpath));
		org.openqa.selenium.WebDriver.TargetLocator switchTo = driver.switchTo();
		driver = switchTo.frame(ele);
		return driver;
	}
	public static String getElementText(WebDriver driver,String elementXpath) {
		WebElement ele = driver.findElement(By.xpath(elementXpath));
		String eleText = ele.getText();
		return eleText;
	}
}
