package longDe;

public class Builder {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("ADB");
		stringBuilder = stringBuilder.append("123");
		System.out.println(stringBuilder);
		
		System.out.println(stringBuilder.reverse());
		
		
		String str = "123456789a";
		char[] charArray = str.toCharArray();
		String sd = "";
//		for(int x= charArray.length-1;x>=0;x--) {
//			sd = sd+ charArray[x];
//		}
		int len = charArray.length;
		System.out.println(len);
		while( len > 0) {
			sd += charArray[len-1];
			len -- ;
		}
		System.out.println(sd);
	}

}
