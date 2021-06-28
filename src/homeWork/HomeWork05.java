package homeWork;

/**
 * @author xuls
 * @date 2021/6/1 21:33
 */
public class HomeWork05 {
}

class GStaff {
	private double salary;

	public GStaff(double salary) {
		this.salary = salary;
	}

	public void printYearSalary() {
		System.out.println("年工资是:" + getSalary() * 12);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Worker extends GStaff {

	public Worker(double salary) {
		super(salary);
	}
}

class Farmer extends GStaff {

	public Farmer(double salary) {
		super(salary);
	}
}

class Server extends GStaff {

	public Server(double salary) {
		super(salary);
	}
}

class GTeacher extends GStaff {
	private double classSalary;
	private int workDay;

	public GTeacher(double salary, int workDay, double classSalary) {
		super(salary);
		this.workDay = workDay;
		this.classSalary = classSalary;
	}

	@Override
	public void printYearSalary() {
		System.out.println("年工资是:" + getSalary() * 12 + classSalary * workDay);
	}
}

class Scientist extends GStaff {

	private double yearSalary;

	public Scientist(double salary, double yearSalary) {
		super(salary);
		this.yearSalary = yearSalary;
	}

	@Override
	public void printYearSalary() {
		System.out.println("年工资是:" + getSalary() * 12 + yearSalary);
	}
}