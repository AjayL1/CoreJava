package pkg1;

public class Test {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		System.out.println(std1.getStdId());
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		
		std1.setStdId(1000);
		std1.setName("Ram");
		std1.setAge(21);
		
		System.out.println(std1.getStdId());
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		
		
		std2.setStdId(1001);
		std2.setName("Sam");
		std2.setAge(21);
		
		System.out.println();
		System.out.println(std2.getStdId());
		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		
		Student std3 = new Student(1003, "Ravi", 21);
		
		System.out.println();
		System.out.println(std3.getStdId());
		System.out.println(std3.getName());
		System.out.println(std3.getAge());
		
		std3.setContactNo("2222211111");
		System.out.println(std3.getContactNo());
		
			

	}

}
