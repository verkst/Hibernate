package com.nt.proxy;

import com.nt.command.BankServiceImpl;
import com.nt.command.IBankService;

public class BankServiceProxy implements IBankService {
	
	IBankService real;
	
	public BankServiceProxy() {
		real= new BankServiceImpl();
	}

	@Override
	public String withDraw(long acno, double amt) {
		
		if(amt>4000)
			return real.withDraw(acno, 4000);
		else
			return real.withDraw(acno, amt);
		
	}

}
