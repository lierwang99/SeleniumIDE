package record;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

//import com.sun.glass.events.KeyEvent;

import depends.Base;
public class FullCapture {
	final static int CONTROL = KeyEvent.VK_CONTROL;
	final static int SHIFT = KeyEvent.VK_SHIFT;
	final static int ENTER = KeyEvent.VK_ENTER;
	final static int C = KeyEvent.VK_C;
	final static int F = KeyEvent.VK_F;
	final static int P = KeyEvent.VK_P;
	final static int Z = KeyEvent.VK_Z;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver("https://baike.baidu.com/item/%E6%A3%89%E7%B1%BD%E7%B2%95/16852884?fr=aladdin");
		Robot rb = new Robot();
		Thread.sleep(2000);
		
		rb.keyPress(CONTROL);
		rb.keyPress(SHIFT);
		rb.keyPress(C);
		
		Thread.sleep(2000);
		rb.keyRelease(CONTROL);
		rb.keyRelease(SHIFT);
		rb.keyRelease(C);

		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
//		Dimension   screensize   =   (Window.getWindows())[0].getToolkit().getScreenSize();
		int width = (int)screensize.getWidth();
		int height = (int)screensize.getHeight();
		
		int destWidth = 95/100 * width ;
		int destHeight = 50/100 * height ;
		System.out.println(width);
		System.out.println(height);
		
		rb.mouseMove(destWidth,destHeight);
		Thread.sleep(2000);
		
		rb.keyPress(CONTROL);
		rb.keyPress(SHIFT);
		rb.keyPress(P);
		
		Thread.sleep(2000);
		rb.keyRelease(CONTROL);
		rb.keyRelease(SHIFT);
		rb.keyRelease(P);
		
		Thread.sleep(2000);
		rb.keyPress(C);
		rb.keyPress(F);
		rb.keyPress(Z);
		Thread.sleep(2000);
		rb.keyPress(ENTER);
		Thread.sleep(2000);
		rb.keyPress(ENTER);
		
		
		
		FullCapture  fc = new FullCapture ();
		
		

	}
	
	
	
	
	

}
