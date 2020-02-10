package record;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Screent {

	public static void main(String[] args) throws Exception {
		Robot rb = new Robot();
		

		Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = defaultToolkit.getScreenSize();
		
		
//		方法一：
//		int height = (int)screenSize.getHeight();
//		int width = (int)screenSize.getWidth();
//		
//		
//		System.out.println("当前屏幕，宽："+width+",高："+height);
//		
//		Rectangle rectangle = new Rectangle(width,height);
//		BufferedImage createScreenCapture = rb.createScreenCapture(rectangle);
//		File file = new File("G:/c.png");
//		
//		boolean flag = ImageIO.write(createScreenCapture, "png", file);
//		System.out.println(flag);
		
//		方法二：
		
		Rectangle rectangle2 = new Rectangle(screenSize);
		BufferedImage createScreenCapture = rb.createScreenCapture(rectangle2);
		File file = new File("G:/d.png");
		boolean flag = ImageIO.write(createScreenCapture, "png", file);
		System.out.println(flag);
		
	}

}
