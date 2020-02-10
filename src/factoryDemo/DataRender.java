package factoryDemo;

import org.testng.annotations.DataProvider;

public class DataRender {
	@DataProvider(name = "First")
	public static Object[][] renderA() {
		Object objA[] = new Object[] { 1, 2, 3 };
		Object objB[] = new Object[] { 4, 5, 6 };
		Object objC[] = new Object[] { 7, 8, 9 };
		Object[][] obj = new Object[][] { objA, objB, objC };
		return obj;
	}
//5-134790.5/5，0-345678.100，
	@DataProvider(name = "Second")
	public static Object[][] renderB() {
		return new Object[][] { new Object[] { "a" }, new Object[] { "b" } ,new Object[] {"C"},new String []{"d"},{"Z"}};
	}
	//static 不加的时候只能调一次，加上后可以多次使用
	@DataProvider(name = "Third")
	public static Object[][] renderC() {
		return new Object[][] { new Object[] { "S" }, new Object[] { "Y" } };
	}
}
