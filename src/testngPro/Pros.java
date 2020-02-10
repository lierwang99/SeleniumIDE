package testngPro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Pros {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("./files/first.yaml");
		Yaml yaml = new Yaml();
		Map mp = (Map) yaml.load(fileInputStream);
		int size = mp.size();
		System.out.println(size);
		Object o = mp.get("dog");
		System.out.println(o);
		//得到类的集合
		Class<? extends Yaml> cl = yaml.getClass();
		   
		Method[] methods = cl.getMethods();
		System.out.println("总方法数："+methods.length);
		for(Method m:methods) {
			System.out.println(m.getName());
		}
		
		
//		int[] arrInt = {1,2,3};
//		System.out.println(arrInt.length);
//		
//		String[] arrString = {"1","2","3"};
//		System.out.println(arrString.length);
		

	}

}
