package record;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;

import depends.Base;

public class RegexDemo2 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		String src = "<a  class='ab'>123<a name='bc'>123<aa id='cd'>123<a id='de'>123<a>";
		List<String> list = new ArrayList<String>();
		int indexOf = src.indexOf("<a");
//		System.out.println(indexOf);

//			System.out.println("进入循环");
		src = src.substring(indexOf);
//		System.out.println(src);
		int count = 1 ;
		start: for (int x = 0; x < src.length(); x++) {
			if (">".equals(String.valueOf(src.charAt(x)))) {
				String substring = src.substring(0, x + 1);
				System.out.println("sub :     "+substring);
				list.add(substring);
				System.out.println("集合第"+ count++ +"次加入值："+substring);
				src = src.substring(x+1);
				System.out.println("src :   " + src);
				indexOf = src.indexOf("<a");
				System.out.println("indexOf:  " + indexOf);
				
				if (indexOf != -1) {
					x = 0;
					src = src.substring(indexOf);
					System.out.println("src2 :   " + src);
					continue start;
				} else {
					break;
				}
			}
		}

		System.out.println("集合长度：  "+list.size());
		count = 0;
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(++count +"--->  "+next );
		}
	}

}
