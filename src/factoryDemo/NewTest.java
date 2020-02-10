package factoryDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("输出前的一套测试：beforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("输出测试之前的测试：BeforeTest");
	}

	// 只对group1有效，即test1和test11
	@BeforeGroups(groups = "group1")
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test(groups = "group1")
	public void test1() {
		System.out.println("输出测试：1，测试组一。");
		Assert.assertTrue(true);
	}

	@Test(groups = "group1")
	public void test11() {
		System.out.println("打印测试：1.1，测试组一。");
		Assert.assertTrue(true);
	}

	@Test(groups = "group2")
	public void test2() {
		System.out.println("输出测试组二：2.");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	// 只对group1有效，即test1和test11
	@AfterGroups(groups = "group1")
	public void afterGroups() {
		System.out.println("afterGroups");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("打印测试之后的测试：AfterTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("输出后的一套测试：afterSuite");
	}
}
