import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author xuls
 * @date 2021/5/31 19:58
 */
public class SmallChangeSys {
	public static void main(String[] args) {
		//化繁为简
		// 1.先完成零钱通菜单显示，并可以选择
		//2.完成零钱通明细
		//3收益入账
		//4消费

		//1
		String title = "\n----------------零钱通菜单----------------";
		String[] tabTitle = {"零钱通明细", "收益入账", "消费", "退   出"};
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		//2
		String detail = "----------------零钱通明细----------------";
		//3
		double money = 0;
		double balance = 0;
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm");
		//4
		String note = "";
		do {
			System.out.println(title);
			for (int i = 0; i < tabTitle.length; i++) {
				System.out.println("\t\t" + (i + 1) + "\t" + tabTitle[i]);
			}
			System.out.print("请选择(1-4):");
			choice = scanner.next();
			switch (choice) {
				case "1":
//					System.out.println(tabTitle[0]);
					System.out.println(detail);
					break;
				case "2":
//					System.out.println(tabTitle[1]);
					System.out.print("输入收益金额:");
					money = scanner.nextDouble();
					//先找出不正确的情况
					if (money <= 0) {
						System.out.println("收益金额必须要大于 0..");
						break;
					}
					balance += money;
					date = new Date();
					detail += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t余额:\t" + balance;
					break;
				case "3":
					System.out.print("请输入消费金额:");
					money = scanner.nextDouble();
					if (money <= 0 || money > balance) {
						System.out.println("您的消费金额应该在:0~" + balance);
						break;
					}
					System.out.print("请输入消费信息:");
					note = scanner.next();
					date = new Date();
					balance -= money;
					detail += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t余额:\t" + balance;
					break;
				case "4":
					String next = "";
					//尽量一段代码完成一个事情 不要混在一起
					do {
						System.out.print("你确定要退出吗?y/n");
						next = scanner.next();
					} while (!next.equals("y") && !next.equals("n"));

					if (next.equals("y")) {
						loop = false;
					}
					break;
				default:
					System.out.println("选择有误,请重新选择...");
			}
		} while (loop);
		System.out.println("退出了零钱通");
	}
}
