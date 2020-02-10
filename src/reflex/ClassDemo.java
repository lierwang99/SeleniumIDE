package reflex;

import org.apache.poi.ss.formula.functions.T;

public class ClassDemo {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<reflex.TestClass> c = (Class<TestClass>) Class.forName("reflex.TestClass");
//		TestClass testClass = new TestClass();
//		testClass.b("输出B");
		
		TestClass newInstance = c.newInstance();
		
		newInstance.b("123");
	}
}
