package org.tnsif.bankapplication;

public interface Bank {
	int DEPOSIT_LIMIT=25000;                  //By default static and final
									     	 //Initialize at the time of declaration or throw the static block
	
	static final int MINIMUM_BALANCE=1000;
	
	void deposit(int ammount) throws DepositLimitExceedsException;
	
	public abstract void withdraw(int ammount)throws InsufficientBalanceException;
}
