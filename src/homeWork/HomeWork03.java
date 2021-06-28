package homeWork;

/**
 * @author xuls
 * @date 2021/5/31 22:37
 */
public class HomeWork03 {
}

class Teacher {
	private String name;
	private int age;
	private String post;
	private double salary;

	public Teacher(String name, int age, String post, double salary) {
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void introduce() {
		System.out.println("教师名字:" + getName() + ",年龄:" + getAge() + ",职称:" + getPost() + ",基本工资:" + getSalary());
	}
}

class Professor extends Teacher {

	public Professor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	@Override
	public double getSalary() {
		return super.getSalary() * 1.3;
	}
}

class AssociateProfessor extends Teacher {

	public AssociateProfessor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	@Override
	public double getSalary() {
		return super.getSalary() * 1.2;
	}
}

class Lecturer extends Teacher {

	public Lecturer(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	@Override
	public double getSalary() {
		return super.getSalary() * 1.1;
	}
}
