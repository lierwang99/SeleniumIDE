package stringBuilder;

public class BuilderDemo {

	public static void main(String[] args) {
//		StringBuffer sBuffer = new StringBuffer("the People's Republic of China：");
//	    sBuffer.append("曾容 ");
//	    sBuffer.append("湖南 ");
//	    sBuffer.append("年龄:23");
//	    System.out.println(sBuffer); 
	    
// 第二：
//		long time1 = System.currentTimeMillis();//系统的当前时间
//		System.out.println("系统的当前时间：" + time1);//输出系统的当前时间
//		String s1 = "";//创建一个空字符串
//		for (int i=0; i<10000; ++i)
//		{
//			s1 += i;//执行字符串的连接操作
//		}
//		
//		//stringbuilder运行速度更快
//		long time2 = System.currentTimeMillis();//再次获取系统的当前时间
//		System.out.println("执行String操作结束的时间：" + time2);
//		System.out.println("时间之差：" + (time2 - time1));
//		time1 = System.currentTimeMillis();
//		System.out.println("系统的当前时间：" + time1);
//		StringBuilder s2 = new StringBuilder();//创建StringBuilder对象s2
//		for (int i=0; i<10000; ++i)
//		{
//			s2.append(i);//追加字符串
//		}
//		time2 = System.currentTimeMillis();
//		System.out.println("执行StringBuilder操作结束的时间：" + time2);
//		System.out.println("时间之差：" + (time2 - time1));
		
// 第三：
//		StringBuilder stringBuilder = new StringBuilder("中国湖南怀化市");
//		stringBuilder.append("曾容");
//		stringBuilder.append("23");
//		System.out.println("字符串长度"+"来自哪里？： " + stringBuilder.length());
//		System.out.println("插入前"+"姓名：" + stringBuilder);
//		
//		stringBuilder.insert(9, "-------");
//		String str = stringBuilder.toString();
//		System.out.println("插入后："+ str);
		
// 第四：
		StringBuilder sb=new StringBuilder("abc");
		sb.delete(1,2);//删除指定开始索引到结束索引处的字符。
		sb.reverse();//反转一下
		System.out.println(sb);
		
		

		
	}

	    
}
