package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank_details {
	@Id
	private long account_no;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mobile_no;
	public Bank_details() {
		super();
	}
	public Bank_details(long account_no, String name, String password, double amount, String address, long mobile_no) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobile_no = mobile_no;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Bank_details [account_no=" + account_no + ", name=" + name + ", password=" + password + ", amount="
				+ amount + ", address=" + address + ", mobile_no=" + mobile_no + "]";
	}
}