package com.nt.factory;

import com.nt.command.BankServiceImpl;
import com.nt.command.IBankService;
import com.nt.proxy.BankServiceProxy;

public class BankServiceFactory {

	public static IBankService getInstance(boolean demonitization) {
		
		IBankService service =null;
		
		if(demonitization)
			service = new BankServiceProxy();
		else
			service = new BankServiceImpl();
			
		return service;
	}
}
