import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author xuls
 * @date 2021/5/31 21:31
 */
public class SmallChangeSysOOP {
	private boolean loop = true;
	private String detail = "----------------零钱通明细----------------";
	private Scanner scanner = new Scanner(System.in);
	private Date date = null;
	private double balance = 0;
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm");
	private String title = "\n----------------零钱通菜单----------------";
	private String[] tabTitle = {"零钱通明细", "收益入账", "消费", "退   出"};

	public SmallChangeSysOOP() {
		do {
			System.out.println(title);
			for (int i = 0; i < tabTitle.length; i++) {
				System.out.println("\t\t" + (i + 1) + "\t" + tabTitle[i]);
			}
			System.out.print("请选择(1-4):");
			String choice = scanner.next();
			switch (choice) {
				case "1":
					showDetail();
					break;
				case "2":
					addMoney();
					break;
				case "3":
					subMoney();
					break;
				case "4":
					exit();
					break;
				default:
					System.out.println("选择有误,请重新选择...");
			}
		} while (isExit());
	}

	public void addMoney() {
		System.out.print("输入收益金额:");
		double money = scanner.nextDouble();
		if (money <= 0) {
			System.out.println("收益金额必须要大于 0..");
			return;
		}
		date = new Date();
		balance += money;
		detail += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t余额:\t" + balance;
	}

	public void subMoney() {
		System.out.print("请输入消费金额:");
		double money = scanner.nextDouble();
		if (money <= 0 || money > balance) {
			System.out.println("您的消费金额应该在:0~" + balance);
		}
		System.out.print("请输入消费信息:");
		String note = scanner.next();
		date = new Date();
		balance -= money;
		detail += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t余额:\t" + balance;
	}

	public void showDetail() {
		System.out.println(detail);
	}

	public void exit() {
		String next = "";
		do {
			System.out.print("你确定要退出吗?y/n");
			next = scanner.next();
		} while (!next.equals("y") && !next.equals("n"));
		loop = !next.equals("y");
	}

	public boolean isExit() {
		return loop;
	}

}
