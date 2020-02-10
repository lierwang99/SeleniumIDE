
package commons.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class TestFileUtils {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		File file = new File("H:\\imgs\\abc.png");
		File dir = new File("D:\\ff.png");
		FileInputStream fileInputStream = new FileInputStream(file);
		FileOutputStream fileOutputStream = new FileOutputStream(dir);
		int i = 0;
		
		while((i = fileInputStream.read()) !=-1) {
			fileOutputStream.write(i);
		}
	
	
		
//		try {
//			FileUtils.copyFileToDirectory(file, dir);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
