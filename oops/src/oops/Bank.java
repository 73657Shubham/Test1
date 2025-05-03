package oops;

class Bank {
	{
		double account_no;
		String name;
		double realAmount;
	

	public void insert(double acc, String n, int amt) {
		account_no = acc;
		name = n;
		realAmount = amt;
	}

	// deposit method
	public void deposit(float amt, int realAmount) {
		realAmount = (int) (realAmount + amt);
		System.out.println(amt + "Deposite");
	}

	// withdraw method
	public void withdraw(float amt, int realAmount) {
		if (realAmount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			realAmount = (int) (realAmount - amt);
			System.out.println(amt + "withdraw");
		}
	}

	// Method to check balance of account
	public void checkBalance(int realAmount) {
		System.out.println("Balance :" + realAmount);
	}

	public void display() {
	
		System.out.println(account_no + "  " + name + "  " + realAmount);
	}
}
