package imgs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import javax.imageio.ImageIO;

public class Images {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		BufferedImage bufImg  = null;
		PrintStream ps = System.out;
		try {
			fileInputStream = new FileInputStream("H:\\Desktop\\imgs\\lz.jpg");
		}catch( FileNotFoundException fe) {
//			ps.println(fe.getCause());
//			ps.println(fe.getLocalizedMessage());
			ps.println(fe.getMessage());
//			fe.printStackTrace();
		}
		
		try {
			bufImg = ImageIO.read(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int width = bufImg.getWidth();
		int height = bufImg.getHeight();
		int type = bufImg.getType();

		System.out.println(width+" : "+height);
		
		System.out.println("类型："+ type);
		System.out.println(bufImg.getRGB(0,0));
		
		System.out.println("灰度数："+BufferedImage.TYPE_BYTE_GRAY);
		//空图片对象
		BufferedImage bufferedImage = new BufferedImage(width,height,1);

		for(int x=0;x<width;x++) {
			for(int y=0;y<height;y++) {
//				取得原先图片得（x,y）坐标的像素点的rgb值
				int rgb = (int) (bufImg.getRGB(x,y)*1);
//				对空图片每个像素点进行设置rgb的值
				bufferedImage.setRGB(x, y, rgb);
			}
		}
		
		File file = new File("H:\\Desktop\\imgs\\new8.jpg");
		boolean flag = ImageIO.write(bufferedImage,"jpg",file);
		
	}

}
