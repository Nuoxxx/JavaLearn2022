class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("�����еĹ�����");
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
		System.out.println("�����еĹ�����");
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
		stu.setName("����");
		stu.setAge(20);
		stu.setSchool("�廪��ѧ");

		System.out.println("������" + stu.getName() +"�����䣺" + stu.getAge() +  "��ѧУ��" + stu.getSchool());
	}
}