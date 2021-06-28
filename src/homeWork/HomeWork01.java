package homeWork;

import java.util.List;

/**
 * @author xuls
 * @date 2021/5/31 22:16
 */
public class HomeWork01 {
	private static final int a = 100;
	String s = "xuls";

	public static void main(String[] args) {
//		HomeWork01 homeWork01 = new HomeWork01();
//		System.out.println(homeWork01.s.hashCode());
//		homeWork01.change(homeWork01.s);
//		System.out.println(homeWork01.s);
//		System.out.println(homeWork01.s.hashCode());
//		Hashtable<String, String> stringStringHashtable = new Hashtable<>();
//		stringStringHashtable.put(null,"1");
//		HashMap<String, String> stringStringHashMap = new HashMap<>();
//		stringStringHashMap.put(null,"1");
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime.getYear());
//		System.out.println(dateTime.getMonthValue());
//		System.out.println(dateTime.getDayOfMonth());
//		System.out.println(dateTime.getHour());
//		System.out.println(dateTime.getMinute());
//		System.out.println(dateTime.getSecond());
//		ArrayList<String> arrayList = new ArrayList<>();
//		a1(arrayList);
//		a2(arrayList);
		System.out.println(testTry1());
		System.out.println("qqqwwe");
		System.out.println("llusshw");
	}

	public static void testTry() {
		String s = null;
		try {
			s.length();
		} catch (Exception e) {
			System.out.println(1);
			s.length();
		} finally {
			System.out.println(2);
		}
	}

	public static int testTry1() {
		int i = 0;
		String s = null;
		try {
			s.length();
		} catch (Exception e) {
			i = i + 1;
			return i;
		} finally {
			i = i + 1;
			System.out.println("finally : " + i);
		}
		return i;
	}

	public static void a1(List c) {

	}

	public static void a2(List<?> c) {

	}

	public void change(String str) {
		System.out.println(str.hashCode());
//		str = "java";
		System.out.println(str.hashCode());
	}

	public static void maoPao(Person[] peoples) {
		if (peoples == null || peoples.length == 0) {
			System.out.println("排序数组不能为null 且 数组长度大于0");
			return;
		}
		//从大到小排序
		boolean change;
		for (int i = 0; i < peoples.length; i++) {
			change = false;
			for (int j = 0; j < peoples.length - i - 1; j++) {
				//每次找出最小的数
				if (peoples[j].age < peoples[j + 1].age) {
					Person people = peoples[j];
					peoples[j] = peoples[j + 1];
					peoples[j + 1] = people;
					change = true;
				}
			}
			if (!change) {
				break;
			}
		}
	}

}

class Person {
	String name;
	int age;
	String job;

	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", job='" + job + '\'' +
				'}';
	}

	public void getI(Object o) throws Exception {
		System.out.println(1);
	}
}

