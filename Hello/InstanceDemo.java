class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("父类中的构造器");
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
}

class Student extends Person{
	private String school;
	public Student(){
		System.out.println("子类中的构造器");
	}

	public String getSchool(){
		return school;
	}

	public void setSchool(String school){
		this.school = school;
	}
}

public class InstanceDemo{
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("张三");
		stu.setAge(20);
		stu.setSchool("清华大学");

		System.out.println("姓名：" + stu.getName() +"，年龄：" + stu.getAge() +  "，学校：" + stu.getSchool());
	}
}