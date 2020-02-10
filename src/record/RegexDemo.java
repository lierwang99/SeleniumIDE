package record;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;

import depends.Base;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(5^3);
//		String src = "<a  class='ab'>123<a asdfasdf name='bc'>123<aa id='cd'>123<a id='de'>123<a>";

//		int number = sc.nextInt();
	
		String reg = "1[0-9]{10}";
		boolean flag = true ;
		while(flag) {
			System.out.println("请输入电话号码：");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String num = sc.next();
			flag = num.matches(reg);
			if(flag) {
				System.out.println("恭喜你，您输入的电话号码正确！");
				break ;
			}else {
				flag = true;
			}
					
		}
		System.out.println("输入结束 ！");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriver driver = Base.getDriver("https://www.baidu.com");
//		String str = driver.getPageSource();
//		13218355447
//		String reg = "<a[^<>]*name[^<>]*>";
//		String reg = "<a[^<>]*>";
		//编译正则---》得到模具[0-9]
//		Pattern pat = Pattern.compile(reg);
//		int c = Pattern.CANON_EQ;
//		System.out.println("pattern的属性："+c);
//		//利用模具--》匹配目标
//		Matcher mat = pat.matcher(src);
//		List<String> list = new ArrayList<String>();
//		
//		
//		while(mat.find()) {
//			String group = mat.group();
//			boolean flag = list.add(group);
//
//		}
//		
//		System.out.println(list.size());
//		Iterator<String> iteList= list.iterator();
//		int i = 1 ;
//		while(iteList.hasNext()) {
//			String ite = iteList.next();
//			System.out.println(i + " : "+ite);
//			i++;
//		}
		
//		driver.close();
		
	}

}
