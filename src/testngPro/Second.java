package testngPro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Map;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.yaml.snakeyaml.Yaml;

public class Second {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, FindFailed, InterruptedException, AWTException {
//		FileInputStream fileInputStream = new FileInputStream("./files/second.yaml");
//		Yaml yaml = new Yaml();
//		System.out.println(yaml);
//		Map mp = (Map) yaml.load(fileInputStream);
//		Object o = mp.get("defaults");
//		System.out.println(o);

//		Class<org.yaml.snakeyaml.Yaml> cy = (Class<Yaml>) Class.forName("org.yaml.snakeyaml.Yaml");
//		Method[] methods = cy.getMethods();
//		int len = methods.length ;
//		while( len-- > 0) {
//			System.out.println(len+": "+methods[len]);
//		}
//		System.out.println(methods.length);
//		Yaml ya = cy.newInstance();
//		
//		第一种方法
//		Screen screen = new Screen();
//		第二种方法
//		int primaryId = Screen.getPrimaryId();
//		Screen screen = Screen.getScreen(primaryId);
//		System.out.println(primaryId);

//		第三种方法
//		Screen primaryScreen = Screen.getPrimaryScreen();
//		int id = primaryScreen.getID();
//		System.out.println(id);
//		
//		primaryScreen.click("");
//		
//		
//		
//		Pattern pattern = new Pattern("");
//		primaryScreen.click(pattern);
//	
		String zr = "曾容";
		byte[] bytes = zr.getBytes();
		String str = null ;
		
		try {
			str = new String(bytes,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doubleClickImg(1, "./imgs/firefox.png");
		Thread.sleep(3000);
		typeImg(0, "./imgs/baidu.png",str) ;
		Robot robot = new Robot();
		int ENTER = KeyEvent.VK_ENTER ;
		robot.keyPress(ENTER);
	}

	public static void clickImg(String imgPath) {
		Pattern gb = new Pattern(imgPath);
		Screen sc = new Screen();
		try {
			sc.click(gb);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickImg(int ScreenID, String imgPath) {
		Pattern gb = new Pattern(imgPath);
		Screen sc = Screen.getScreen(ScreenID);
		try {
			sc.click(gb);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickImgB(int ScreenID, String imgPath) {
		Screen sc = Screen.getScreen(ScreenID);
		try {
			sc.click(imgPath);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void doubleClickImg(int ScreenID, String imgPath) {
		Screen sc = Screen.getScreen(ScreenID);
		try {
			sc.doubleClick(imgPath);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void typeImg(int ScreenID, String imgPath,String content) {
		Screen sc = Screen.getScreen(ScreenID);
		sc.type(imgPath,content);
		
	}

}
