package com.web.service;

import java.util.List;

import com.web.model.BankTemp;
import com.web.model.Bank_details;
import com.web.model.Transfer;

public interface BankService {
	public Bank_details saveBank(BankTemp bank);
	public Bank_details checkBalance(long account_no, String name, String password);
	public Bank_details deposit(long account_no, String name, String password, double amount);
	public Bank_details Withdraw(Bank_details with);
	public List<Bank_details> transfer(Transfer trans);
	public void deleteAccount(Bank_details bank);
}
