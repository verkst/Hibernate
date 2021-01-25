package com.nt.test;

import com.nt.command.IBankService;
import com.nt.factory.BankServiceFactory;

public class BankCustomer {

	public static void main(String[] args) {

		IBankService ser = BankServiceFactory.getInstance(true);
		System.out.println(ser.withDraw(15691049, 10000));

		System.out.println("==================================");
		
		IBankService ser2 = BankServiceFactory.getInstance(false);
		System.out.println(ser2.withDraw(15691049, 3000));
		System.out.println(ser2.withDraw(15691049, 10000));
	}

}
