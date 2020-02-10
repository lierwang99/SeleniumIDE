package factoryDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Classes {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod(enabled = false)
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test()
	public void test1() {
		System.out.println("A");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("B");
		Assert.assertTrue(true);
	}

	@Test
	public void test3() {
		System.out.println("C");
		Assert.assertTrue(true);
	}
	
	@AfterClass(enabled = false)
	public void afterClass() {
		System.out.println("afterClass");
	}

}
