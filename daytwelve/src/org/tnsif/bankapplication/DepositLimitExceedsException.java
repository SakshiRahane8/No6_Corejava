package org.tnsif.bankapplication;

@SuppressWarnings("serial")
public class DepositLimitExceedsException extends Exception{

	public DepositLimitExceedsException()
	{
		super("Can't Deposite...Limit is exceeded");
	}
	
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}
