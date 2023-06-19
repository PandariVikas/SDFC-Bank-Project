package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.BankTemp;
import com.web.model.Bank_details;
import com.web.model.Transfer;
import com.web.service.BankServiceImp;

@Controller
public class BankController {
	@Autowired 
	private BankServiceImp service;
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/add")
	public String accountFrom(Model model) {
		BankTemp bank= new BankTemp();
		model.addAttribute("bank", bank);
		return "account";
	}
	@RequestMapping("/register")
	public String createAccont(@ModelAttribute BankTemp bank, ModelMap model) {
		service.saveBank(bank);
		return "success";
	}
	@RequestMapping("/bal")
	public String balanceFrom(ModelMap model, Bank_details bank) {
		model.put("command", bank);
		return "balance";
	}
	@RequestMapping("/checkbal")
	public String balanceEnquiry(@RequestParam long account_no, @RequestParam String name, @RequestParam String password, ModelMap model) {
		Bank_details b=service.checkBalance(account_no, name, password);
		model.put("bank", b);
		return "viewbalance";
	}
	@RequestMapping("/deposit")
	public String depositFrom(ModelMap model, Bank_details bank) {
		model.put("command", bank);
		return "deposit";
	}
	@RequestMapping("/depositbal")
	public String updateBalance(@RequestParam long account_no, @RequestParam String name, @RequestParam String password,@RequestParam  double amount, ModelMap model) {
		Bank_details bd=service.deposit(account_no, name, password, amount);
		model.put("bank", bd);
		model.put("amount", amount);
		model.put("ornal", bd.getAmount()-amount);
		return "updatedBalance";	
	}
	@RequestMapping("/withdraw")
	public String withdrawFrom(ModelMap model, Bank_details bank) {
		Bank_details with = new Bank_details();
		model.addAttribute("with", with);
		return "withdraw";	
	}
	@RequestMapping("/withdrawbal")
	public String withdrawBalance(@ModelAttribute Bank_details with, ModelMap model) {
		Bank_details b=service.Withdraw(with);
		model.put("bank", b);
		model.put("amount", with.getAmount());
		model.put("after", b.getAmount());
		model.put("ornl", b.getAmount()+with.getAmount());
		return "withbalance";	
	}
	@RequestMapping("/transfer")
	public String transferPage(ModelMap model,Bank_details bank){
		Transfer trans= new Transfer();
		model.addAttribute("trans", trans);
		return "transfer";
	}
	
	@RequestMapping("/transferamt")
	public String transferAmt(@ModelAttribute Transfer trans, ModelMap model)
	{
		List<Bank_details>lists=service.transfer(trans);
		  
		  model.put("orbl",lists.get(0).getAmount()+trans.getAmount());
		  model.put("afbl",lists.get(0).getAmount());
		  
		  model.put("torbl",lists.get(1).getAmount());
		  model.put("tafbl",lists.get(1).getAmount()-trans.getAmount());
		
		return "viewtransfer";
	}
	@RequestMapping("/closeacnt")
	public String closeForm(ModelMap model,Bank_details bank)
	{	model.addAttribute("bank", bank);
		return "delete";
	}
	@RequestMapping("/closeact")
	public String closePage(@ModelAttribute Bank_details bank,ModelMap model)
	{	service.deleteAccount(bank);
		return "closesuccess";
	}
	@RequestMapping("/aboutus")
	public String aboutPage() {
		return "about";
	
	}
	}
