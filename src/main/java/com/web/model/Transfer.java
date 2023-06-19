package com.web.model;

public class Transfer {
	private long account_no;
	private String name;
	private String password;
	private long target_accountno;
	private double amount;
	public Transfer() {
		super();
	}
	public Transfer(long account_no, String name, String password, long target_accountno, double amount) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.password = password;
		this.target_accountno = target_accountno;
		this.amount = amount;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getTarget_accountno() {
		return target_accountno;
	}
	public void setTarget_accountno(long target_accountno) {
		this.target_accountno = target_accountno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transfer [account_no=" + account_no + ", name=" + name + ", password=" + password
				+ ", target_accountno=" + target_accountno + ", amount=" + amount + "]";
	}
	
}
