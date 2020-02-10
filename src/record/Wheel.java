package record;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.IOUtils;

public class Wheel {

	public static void main(String[] args) throws Exception {
//		WebDriver  driver = Base.getDriver("https://www.baidu.com");
		Robot robot = new Robot();
		robot.delay(2000);
	    Rectangle rectangle = new Rectangle(1000,1000);
	    robot.delay(2000);
		BufferedImage img  = robot.createScreenCapture(rectangle);
		
		//bufferedimage 转换成 inputstream
		ByteArrayOutputStream bs = new ByteArrayOutputStream(); 
		ImageOutputStream imOut = ImageIO.createImageOutputStream(bs); 
		ImageIO.write(img, "jpg", imOut); 
		InputStream inputStream = new ByteArrayInputStream(bs.toByteArray());

		OutputStream outStream = new FileOutputStream("./imgs/captcha3.jpg");
		IOUtils.copy(inputStream, outStream);
		inputStream.close();
		outStream.close();	
		
//		第一步：要把资源读进来
//		InputStream is = new FileInputStream("H:\\money.jpg");
//		OutputStream os = new FileOutputStream("H:\\money2.jpg");
//
//		int i = 0;
//		byte by[] = new byte[1024];
//		long start = System.currentTimeMillis();
//		
//		
//		while((i = is.read()) != -1 ) {
//			os.write(i);
////			os.write(by, 0, by.length);
//			
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("用时："+(end-start)+ "毫秒");
		
//        System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://www.baidu.com");
		
		//selenium 截图
//        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //讲截取的图片以文件的形式返回
//        try {
//            org.apache.commons.io.FileUtils.copyFile(srcFile, new File("./imgs/screenshot.png")); //使用copyFile()方法保存获取到的截图文件
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }


	
	}
}
