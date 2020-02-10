package testngPro;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	@Test(dataProvider = "E")
	public void a(Object objA, Object objB) {
//		System.out.println("我是A！！");
		System.out.println(objA);
		System.out.println(objB);
	}

//	@Test(priority=2)
//	public void b() {
//		System.out.println("我是B！！");
//	}
//
//
//	@Test(description = "ABCD这个属性")
//	public void c() {
//		System.out.println("我是c！！");
//	}
//	
//	@Test()
//	public void d() {
//		System.out.println("我是d！！");
//	}
	@DataProvider(name = "E")
	public Object[][] e() {
		System.out.println("我是e！！");
//		Integer arrInt[] = new Integer[]{1,2,3,4};
		Integer arrInt[] = { 1, 2,7,8 };
		String arrString[] = { "a", "b" };
		String arrString2[] = { "a", "b" };

		Object objArr[][] = new Object[][] { arrInt, arrString, arrString2 };
		System.out.println("取一个一维数组："+objArr[0]);
		
		for (int x = 0; x < objArr.length; x++) {
			for (int y = 0; y < objArr[x].length; y++) {
				System.out.println("arrInt Int数组和String数组:" + objArr[x][y]);
			}
		}
		return objArr;
	}

}
