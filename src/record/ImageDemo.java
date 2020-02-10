package record;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageDemo {

	public static void main(String[] args) throws IOException {
		
//		String[] mimes = ImageIO.getReaderMIMETypes();
//		System.out.println(mimes.length);
//		for(String mime : mimes) {
//			System.out.println(mime);
//		}
//		System.out.println("----------------------------------------------------");
//		String[] fs = ImageIO.getReaderFileSuffixes();
//		System.out.println(fs.length);
//		for(String f: fs) {
//			System.out.println(f);
//		}
		System.out.println("----------------------------------------------------");
		String[] fns = ImageIO.getWriterFormatNames();
		System.out.println(fns.length);
		for(String fn: fns) {
			System.out.println(fn);
		}
		
		System.out.println("----------------------------------------------------");
		File file = new File("G:\\a.jpg");
		
		
		RenderedImage ri = new BufferedImage(100,200,BufferedImage.TYPE_INT_BGR);
		
		
		boolean flag = ImageIO.write(ri, "jpg", file);
		System.out.println(flag);
		
	}

}
