package factoryDemo;

import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FactoryTest extends Object {
//	@Parameters({ "A", "B", "C" })
//	@Test
//	public void a(String strA,String strB,String strC) {
//		System.out.println(strA);
//		System.out.println(strB);
//		System.out.println(strC);
//	}

	private String s ;


//	@Parameters({ "C"})
	public FactoryTest(String s) {
		this.s = s;
		System.out.println("我是fei空构造--->"+ s);
	}


	@Test
	public void b555() {
		System.out.println("b");		
	}

	@Test
	public void a555() {
		System.out.println("a->"+s);
	}


	@Factory
	public Object[] fac() {
//		FactoryTest ft1 = new FactoryTest("1");
//		FactoryTest ft2 = new FactoryTest("2");
//		FactoryTest ft3 = new FactoryTest("3");
//		FactoryTest ft4 = new FactoryTest("4");
//		Object[] obj = new Object[] {ft1,ft2,ft3,ft4};
		Object[] obj = new Object[5]; //定义了一个长度为100的空数组，每个元素为null
		for(int x = 0; x < obj.length;x++) {
			obj[x] = new FactoryTest(String.valueOf(x+1));
		}
		return obj ;
	}

}
