package com.bank.domain;

import java.util.Date;
import java.util.List;

public class Account extends Address{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accountId;
	private String accountNumber;
	private Date createdDate;
	private double balanceAmount;
	private AccountType accountType;
	private Customer customer;
	private Contact contact;
	List<Contact> contacts;	

	public Account() {
	}

	public Account(int accountId, String accountNumber, Date createdDate, double balanceAmount, AccountType accountType,
			Customer customer, Contact contact, List<Contact> contacts) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.createdDate = createdDate;
		this.balanceAmount = balanceAmount;
		this.accountType = accountType;
		this.customer = customer;
		this.contact = contact;
		this.contacts = contacts;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + ", createdDate=" + createdDate
				+ ", balanceAmount=" + balanceAmount + ", accountType=" + accountType + ", customer=" + customer
				+ ", contact=" + contact + ", contacts=" + contacts + ", getAddressId()=" + getAddressId()
				+ ", getAddressLine1()=" + getAddressLine1() + ", getAddressLine2()=" + getAddressLine2()
				+ ", getAddressLine3()=" + getAddressLine3() + ", getCity()=" + getCity() + ", getState()=" + getState()
				+ ", getPinCode()=" + getPinCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
