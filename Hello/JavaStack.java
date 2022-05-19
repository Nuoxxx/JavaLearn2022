public class JavaStack{
	public static void main(String[] args) {
		int i = 3;
		int b = i;
		System.out.println(b==i);

		String str1 = "Hello";
		String str2 = "Hello";


		System.out.println("str1 == str2 ?-->"+ str1==str2);

		String newStr3 = new String("Hello");
		String newStr4 = new String("Hello");

		System.out.println("newStr3 == newStr4 ?-->"+ newStr3==newStr4);
	}
}

class Person{
	public static final double PI = 3.14;
	private String name = "dotgua";

	public static void main(String[] args) {
		int i = 5;
		double d = 0.2;
		Person p = new Person();
		String str = new String("hello");
		String str2 = "world";
	}
}