package factoryDemo;

import org.testng.annotations.Test;

public class DataTest {
	@Test(dataProvider = "First",dataProviderClass = factoryDemo.DataRender.class)
	public void a(int a,int b,int c) {
		System.out.println(a+" ："+b+" : "+c);
	}
	@Test(dataProvider = "Second",dataProviderClass = factoryDemo.DataRender.class,enabled = false)
	public void b(String b) {
		System.out.println(b);
	}
	@Test(dataProvider = "Third",dataProviderClass = factoryDemo.DataRender.class)
	public void c(String c) {
		System.out.println(c);
	}
	//stati
	@Test(dataProvider = "Third",dataProviderClass = factoryDemo.DataRender.class)
	public void cd(String c) {
		System.out.println(c);
	}
}
