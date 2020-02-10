package factoryDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test()
	public void test1() {
		System.out.println("A");
		Assert.assertTrue(true);
	}

	@Test
	public void test11() {
		System.out.println("B");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("C");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
