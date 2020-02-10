package practice;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PracticeFactory {
	private String s ;
	public PracticeFactory(String s) {
		this.s = s;
		System.out.println("我是kong构造--->"+ s);
	}
	
	@Test
	public void a555() {
		System.out.println("a->");
	}
	@Test
	public void b555() {
		System.out.println("b");		
	}
	
	@Factory
	public Object[] createFor() {
		Object[] result = new Object[5];
		for(int i = 0; i < result.length; i++) {
			result[i] = new PracticeFactory(String.valueOf(i+1));
		}
		return result;
	}

}
