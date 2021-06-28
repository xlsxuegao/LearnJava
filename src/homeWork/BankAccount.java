package homeWork;

/**
 * @author xuls
 * @date 2021/6/1 21:49
 */
public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void deposit(double account) {
		balance += account;
	}

	public void withdraw(double account) {
		balance -= account;
	}

	public int getBalance() {
		return balance;
	}
}
