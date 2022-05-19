// String API的各种使用方式
public class StringAPIDemo01{
	public static void main(String[] args) {
		String str1 = "hello";

		char c[] = str1.toCharArray();
		for (int i = 0 ; i < c.length ; i++ ) {
			System.out.print(c[i] + "\t");
		}
		System.out.println("");
		String str2 = new String(c); //将全部字符数组变成String
		String str3 = new String(c,0,3); //将部分字符数组变成String
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1.charAt(3));// 去除指定位置的字符
		System.out.println(str1.toUpperCase());// 字符串大小写转换
		System.out.println(str1.equalsIgnoreCase("Hello"));// 不区分大小写进行字符串比较
		System.out.println(str1.replaceAll("l","x"));// 将一个指定的字符串替换成其他的字符串

	}
}