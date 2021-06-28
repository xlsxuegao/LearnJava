package homeWork;

/**
 * @author xuls
 * @date 2021/6/1 21:55
 */
public class SavingsAccount extends BankAccount {
	private double liLv;
	private int time;

	public SavingsAccount(int balance, double liLv) {
		super(balance);
		this.liLv = liLv;
		time = 0;
	}

	@Override
	public void deposit(double account) {
		if (time <= 3) {
			super.deposit(account);
			time++;
		} else {
			super.deposit(account - 1);
		}
	}

	@Override
	public void withdraw(double account) {
		if (time <= 3) {
			super.withdraw(account);
			time++;
		} else {
			super.withdraw(account + 1);
		}
	}

	public void earnMonthlyInterest() {
		time = 0;
		super.deposit(getBalance() * liLv);
	}
}
