package record;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BeiAny {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBeiAn() throws Exception {
    driver.get("http://61.129.59.46/shportal/");
    driver.findElement(By.linkText("登录")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品贮存、运输服务经营者备案'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='企业名称'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='受理机构'])[1]/following::i[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='嘉定区市场监管局'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='上海市'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='您企业的经营方式是什么？'])[1]/following::span[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品贮存'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='执法总队'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品贮存'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品运输'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='不含冷藏冷冻'])[2]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='是否网络经营'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='网址'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='网址'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='网址'])[1]/following::input[1]")).sendKeys("https://www.baidu.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='自有'])[1]/following::span[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='房屋使用期限(年)'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='房屋使用期限(年)'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='房屋使用期限(年)'])[1]/following::input[1]")).sendKeys("30");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='经营场所面积'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='经营场所面积'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='经营场所面积'])[1]/following::input[1]")).sendKeys("300");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='运输车辆数量'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='运输车辆数量'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='运输车辆数量'])[1]/following::input[1]")).sendKeys("3");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[1]")).sendKeys("王小");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[2]")).sendKeys("513436199704045090");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[2]")).sendKeys("51343619970404301X");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[2]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[2]")).sendKeys("513436199704042893");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='负责人'])[1]/following::input[3]")).sendKeys("18511111111");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[3]")).sendKeys("18622222222");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[3]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[3]")).sendKeys("18733333333");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::input[1]")).sendKeys("李四");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='食品安全管理员'])[1]/following::div[10]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='联系人'])[1]/following::input[1]")).sendKeys("王五");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='暂存'])[1]/following::span[1]")).click();
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
