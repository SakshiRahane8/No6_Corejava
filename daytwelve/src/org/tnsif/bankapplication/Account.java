package org.tnsif.bankapplication;

public class Account implements Bank{
	
	private int accNo;
	private String Name;
	private int Balance;
	
	//toString()
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", Balance=" + Balance + "]";
	}
	
	//Parameterized constructor
	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		Name = name;
		Balance = balance;
	}
	
	//Non-Parameterized constructor
	public Account() {
		super();
		
	}
	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	
	
	@Override
	public synchronized void deposit(int amount) throws DepositLimitExceedsException {
		if(amount>Bank.DEPOSIT_LIMIT)
			throw new DepositLimitExceedsException("Can't deposite,"+amount+" as deposite limit excedded...");
		
		Balance+=amount;
		
	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
		if(amount>Balance-Bank.MINIMUM_BALANCE)
			throw new InsufficientBalanceException("Can't withdrow, Insufficient balance: "+Balance);
		
			Balance-=amount;
		
	}

}
