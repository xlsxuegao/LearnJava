package homeWork;

/**
 * @author xuls
 * @date 2021/6/1 21:24
 */
public class HomeWork04 {
}

class Staff {
	private String name;
	private double salary;
	private int workDay;

	public Staff(String name, double salary, int workDay) {
		this.name = name;
		this.salary = salary;
		this.workDay = workDay;
	}

	public void printSalary() {
		System.out.println("姓名：" + getName() + ", 工作时间：" + getWorkDay() + ",工资:" + getSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}
}

class Manager extends Staff {

	public Manager(String name, double salary, int workDay) {
		super(name, salary, workDay);
	}

	@Override
	public void printSalary() {
		System.out.println("姓名：" + getName() + ", 工作时间：" + getWorkDay() + ",工资:" + getSalary() * getWorkDay() * 1.2 + 1000);
	}
}

class Employee extends Staff {

	public Employee(String name, double salary, int workDay) {
		super(name, salary, workDay);
	}

	@Override
	public void printSalary() {
		System.out.println("姓名：" + getName() + ", 工作时间：" + getWorkDay() + ",工资:" + getSalary() * getWorkDay() * 1.0);
	}
}