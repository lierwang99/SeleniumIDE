package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First {
	@Test
	public static String test1() {
		return "你好！！";
	}
	

    @BeforeClass
    public void setUp(){
        System.out.println("启动测试的前提条件准备，一般放这个方法中");
    }
 
    @AfterClass
    public void tearDown(){
        System.out.println("测试运行结束后的步骤，一般是恢复环境到测试开始之前的状态");
    }
    @Test
    public void test2(){
        System.out.println("Hello");
    }
    @Test
    public void test3(){
    	
        System.out.println(First.test1()+":"+"TestNG");
    }
}
