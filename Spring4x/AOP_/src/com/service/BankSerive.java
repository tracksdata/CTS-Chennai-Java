package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.dao.BankDAO;
import com.bank.model.Account;
import com.myanotations.Loggable;

public class BankSerive {

	// State
	@Autowired
	private BankDAO bankDAO; // Dependency..

	public void setBankDAO(BankDAO bankDAO) {
		this.bankDAO = bankDAO;
	}

	// Behavior
	public void transfer(Account account) {
		// Joinpoint
		System.out.println("1. ----------");
		bankDAO.findByID(account);

		//System.out.println("-----------");
		System.out.println("BankService: transfer"); // B.L
	}

	public void deposit(Account account) {
		System.out.println("deposit"); // B.L

	}

	public double withdraw(Account account) {
		System.out.println("withdraw-1"); // B.L
		return 100.00;
	}

	@Loggable
	public double withdraw2(Account account, String param) {
		System.out.println("withdraw-2"); // B.L
		if (param.equals("val"))
			throw new RuntimeException();
		return Double.parseDouble(param);
	}

}
