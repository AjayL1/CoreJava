package pkg2;

import pkg1.Student;

public class Test {

	public static void main(String[] args) {
		Student std1 = new Student();
		System.out.println(std1.getStdId());
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		
		
		std1.setStdId(2001);
		std1.setName("Kavita");
		std1.setAge(25);
		std1.setContactNo("5555511111");
		
		System.out.println(std1.getStdId());
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		System.out.println(std1.getContactNo());
		
		System.out.println(std1);
	}
}