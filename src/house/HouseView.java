package house;

import java.util.Scanner;

/**
 * @author xuls
 * @date 2021/6/8 21:30
 * 显示界面
 * 接收用户的输入
 */
public class HouseView {
	private boolean loop = true;
	private Scanner scanner = new Scanner(System.in);
	private char key = ' ';
	private HouseService houseService = new HouseService();

	public void mainMenu() {
		do {
			System.out.println("\n--------------房屋出租系统--------------");
			System.out.println("\t\t\t1 新 增 房 源");
			System.out.println("\t\t\t2 查 找 房 源");
			System.out.println("\t\t\t3 删 除 房 源");
			System.out.println("\t\t\t4 修 改 房 屋 信 息");
			System.out.println("\t\t\t5 房 屋 列 表");
			System.out.println("\t\t\t6 退 出");
			System.out.print("请输入你的选择(1-6)：");
			key = scanner.next().charAt(0);
			switch (key) {
				case '1':
					addHouse();
					break;
				case '2':
					System.out.println("查 找");
					break;
				case '3':
					deleteHouse();
					break;
				case '4':
					System.out.println("修 改");
					break;
				case '5':
					listHouses();
					break;
				case '6':
					System.out.println("退 出");
					loop = false;
					break;
			}
		} while (loop);
	}

	private void listHouses() {
		System.out.println("===============房 屋 列 表===============");
		System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
		House[] list = houseService.list();
		for (House house : list) {
			System.out.println(house);
		}
		System.out.println("===============房屋列表显示完毕============");
	}

	private void addHouse() {
		System.out.println("===============添 加 房 屋===============");
		System.out.print("姓名：");
		String name = scanner.next();
		System.out.print("电话：");
		String tel = scanner.next();
		System.out.print("地址：");
		String address = scanner.next();
		System.out.print("月租：");
		String price = scanner.next();
		System.out.print("状态：");
		String state = scanner.next();
		House house = new House(0, name, tel, address, price, state);
		houseService.add(house);
		System.out.println("===============添加房屋完毕===============");
	}

	private void deleteHouse() {
		System.out.println("===============删 除 房 屋===============");
		System.out.print("请选择待删除房屋编号(-1退出):");
		int id = scanner.nextInt();
		if (id == -1) {
			System.out.println("放弃删除");
			return;
		}
		boolean exit = true;
		String e;
		while (exit) {
			System.out.println("确认是否删除(Y/N)，请小心选择:");
			System.out.print("请输入你的选择(Y/N)");
			e = scanner.next().toUpperCase();
			if (e.equals("Y")) {
				exit = false;
				if (houseService.delete(id)) {
					System.out.println("删除成功");
				} else {
					System.out.println("删除失败");
				}
			} else if (e.equals("N")) {
				System.out.println("放弃删除");
				exit = false;
			}
		}
	}

}
