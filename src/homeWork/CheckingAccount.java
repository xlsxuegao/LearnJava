package homeWork;

/**
 * @author xuls
 * @date 2021/6/1 21:51
 */
public class CheckingAccount extends BankAccount {
	public CheckingAccount(int balance) {
		super(balance);
	}

	@Override
	public void deposit(double account) {
		super.deposit(account - 1);
	}

	@Override
	public void withdraw(double account) {
		super.withdraw(account + 1);
	}
}
