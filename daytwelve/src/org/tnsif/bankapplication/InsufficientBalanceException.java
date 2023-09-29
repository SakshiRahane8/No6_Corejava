package org.tnsif.bankapplication;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException()
	{
		super("Cant't withdraw...Insufficient balance");
	}
	
	public InsufficientBalanceException(String message)
	{
		super(message);
	}

}
