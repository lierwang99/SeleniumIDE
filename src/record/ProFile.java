package record;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream in = new FileInputStream(".\\src\\log4j.properties");
		prop.load(in);
		
		
		String str = prop.getProperty("log4j.appender.E.Threshold");
		System.out.println(str);
	}

}
