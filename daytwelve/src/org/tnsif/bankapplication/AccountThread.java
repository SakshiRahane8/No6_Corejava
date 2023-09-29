package org.tnsif.bankapplication;

public class AccountThread extends Thread{
	
	private String type;
	private Account acc;
	private int amount;
	
	//Non-Parameterized constructor
	public AccountThread()
	{
		
	}
	
	//Parameterized constructor
	public AccountThread(Account acc)
	{
		this.acc = acc;
	}
	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public void run()
	{
		try {
			if(type.equals("deposite"))
				acc.deposit(amount);
			else if(type.equals("Withdraw"))
				acc.withdraw(amount);
				
			} catch (DepositLimitExceedsException  | InsufficientBalanceException e) {
				
				System.out.println(e.getMessage());
			}
	}

}
