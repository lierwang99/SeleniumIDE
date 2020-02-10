package record;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import depends.Base;

public class BeiAn {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
//    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBeiAn() throws Exception {
    driver.get("http://61.129.59.46/shportal/");
    Thread.sleep(1000);
    driver.findElement(By.linkText("登录")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品贮存、运输服务经营者备案'])[1]/following::span[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='企业名称'])[1]/following::span[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='受理机构'])[1]/following::i[1]")).click();
    Thread.sleep(2000);
 
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='嘉定区市场监管局'])[1]/following::li[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='上海市'])[1]/following::span[1]")).click();
    
    Thread.sleep(2000);
    
    Base.scroll(driver,0,500);
    Thread.sleep(3000);
//    平面图
    String cssPmt = "#app > div > section > main > div > div > div:nth-child(3) > form > div:nth-child(12) > div > div > div > div > div.el-col.el-col-9 > div:nth-child(1) > div";
    driver.findElement(By.cssSelector(cssPmt)).click();
    String imgPath = "H:\\Desktop\\abc.png";
    String cx ="D:\\AutoIt3\\liyan\\autoIt3UpLiyan.exe";
    Runtime.getRuntime().exec(cx+" "+imgPath);

    Thread.sleep(3000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='您企业的经营方式是什么？'])[1]/following::span[2]")).click();
    System.out.println("---------------------------");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品贮存'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='执法总队'])[1]/following::span[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品贮存'])[1]/following::span[4]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品运输'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='不含冷藏冷冻'])[2]/following::span[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='是否网络经营'])[1]/following::span[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='网址'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='网址'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='网址'])[1]/following::input[1]")).sendKeys("https://www.baidu.com");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='自有'])[1]/following::span[3]")).click();
    Thread.sleep(1000);    
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='房屋使用期限(年)'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='房屋使用期限(年)'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='房屋使用期限(年)'])[1]/following::input[1]")).sendKeys("30");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='经营场所面积'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='经营场所面积'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='经营场所面积'])[1]/following::input[1]")).sendKeys("300");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='运输车辆数量'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='运输车辆数量'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='运输车辆数量'])[1]/following::input[1]")).sendKeys("3");
    Base.scroll(driver,500,1000);
    Thread.sleep(1000);
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[1]")).sendKeys("王小");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[2]")).sendKeys("513436199704045090");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[2]")).sendKeys("51343619970404301X");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[2]")).sendKeys("513436199704042893");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[3]")).sendKeys("18511111111");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[3]")).sendKeys("18622222222");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[3]")).sendKeys("18733333333");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[1]")).sendKeys("李四");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::div[10]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[1]")).sendKeys("王五");
    Thread.sleep(1000);
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='暂存'])[1]/following::span[1]")).click();
    driver.findElement(By.cssSelector("#app > div > section > main > div > div > div.button_wrap > div > div > button:nth-child(3) > span")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='（如果您是委托代理人，请勾选委托代理人并填写您的信息）'])[1]/following::span[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='代理人'])[3]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='代理人'])[3]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='代理人'])[3]/following::input[1]")).sendKeys("张兵");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='委托人'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='委托人'])[1]/following::input[1]")).sendKeys("李委托");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='证件类型'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='中华人民共和国居民身份证'])[1]/following::span[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='证件号码'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='证件号码'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='证件号码'])[1]/following::input[1]")).sendKeys("SPW10221");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='证件号码'])[1]/following::div[4]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='固定电话'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='固定电话'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='固定电话'])[1]/following::input[1]")).sendKeys("45632178");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='移动电话'])[1]/following::input[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='移动电话'])[1]/following::input[1]")).clear();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='移动电话'])[1]/following::input[1]")).sendKeys("13218355660");
    Thread.sleep(1000);
    Base.scroll(driver,0,700);
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='委托权限'])[1]/following::span[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='不同意'])[1]/following::span[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='不同意'])[2]/following::span[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='不同意'])[3]/following::span[3]")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='其他委托事项（请详细注明)'])[1]/following::textarea[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='其他委托事项（请详细注明)'])[1]/following::textarea[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='其他委托事项（请详细注明)'])[1]/following::textarea[1]")).sendKeys("我是委托事项：与胸片2323233231ADASSD32@#$%&*(");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='自许可提出申请日起至'])[1]/following::span[5]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='暂存'])[1]/following::button[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
