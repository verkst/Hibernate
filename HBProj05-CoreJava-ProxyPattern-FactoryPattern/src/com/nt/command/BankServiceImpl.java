package com.nt.command;

public class BankServiceImpl implements IBankService {

	@Override
	public String withDraw(long acno, double amt) {
	
		return amt+" withdrawn from "+acno;
	}

}
