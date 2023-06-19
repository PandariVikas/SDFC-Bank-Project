package com.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.BankTemp;
import com.web.model.Bank_details;
import com.web.model.Transfer;
import com.web.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
    @Autowired
    private BankRepo repo;
	@Override
	public Bank_details saveBank(BankTemp bank) {
		Bank_details b= new Bank_details();
		b.setAccount_no(bank.getAccount_no());
		b.setName(bank.getName());
		if(bank.getPassword().equals(bank.getConfirm_password())) {
		b.setPassword(bank.getPassword());
		}
		b.setMobile_no(bank.getMobile_no());
		b.setAmount(bank.getAmount());
		b.setAddress(bank.getAddress());
		Bank_details obj=repo.save(b);
		return obj;
	}
	
	@Override
	public Bank_details checkBalance(long account_no, String name, String password) {
		Bank_details bank=repo.findById(account_no).get();
		if(bank.getAccount_no()==account_no && bank.getName().equalsIgnoreCase(name)&& bank.getPassword().equals(password)) {
			return bank;
		}
		else {
		return null;
	}
	}
	@Override
	public Bank_details deposit(long account_no, String name, String password, double amount) {
		Bank_details bank=repo.findById(account_no).get();
		if(bank.getAccount_no()==account_no && bank.getName().equalsIgnoreCase(name)&& bank.getPassword().equals(password)) {
			double am=bank.getAmount()+amount;
			bank.setAmount(am);
			repo.save(bank);
			return bank;
		}
		return null;
	}

	
	@Override
	public Bank_details Withdraw(Bank_details with) {
		Bank_details bank=repo.findById(with.getAccount_no()).get();
		double ornl=bank.getAmount();
		
		double wm=bank.getAmount();
		if(bank.getAccount_no()==with.getAccount_no() && bank.getName().equalsIgnoreCase(with.getName())&& bank.getPassword().equals(with.getPassword())) {
			wm=wm-with.getAmount();
			bank.setAmount(wm);
			repo.save(bank);
			return bank;
		}	
		return null;
	}


	@Override
	public List<Bank_details> transfer(Transfer trans) {
		Bank_details b1=repo.findById(trans.getAccount_no()).get();
		Bank_details b2=repo.findById(trans.getTarget_accountno()).get();
		if (trans.getAccount_no()==b1.getAccount_no()&& trans.getName().equals(b1.getName())&&trans.getPassword().equals(b1.getPassword())) {
			b1.setAmount(b1.getAmount()-trans.getAmount());
			b2.setAmount(b2.getAmount()+trans.getAmount());
			repo.save(b1);
			repo.save(b2);	
			List<Bank_details> list=List.of(b1,b2);
			return list;
	}
		return null;

	}

	@Override
	public void deleteAccount(Bank_details bank) {
		Bank_details b=repo.findById(bank.getAccount_no()).get();
		if(b.getAccount_no()==bank.getAccount_no()&& b.getName().equals(bank.getName())&& b.getPassword().equals(bank.getPassword()))
		{
			repo.deleteById(bank.getAccount_no());
		}
	}
}
